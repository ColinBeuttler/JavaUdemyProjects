package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;
    
    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        else if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null or blank");
        }
        else if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Enter a real phone number");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }
    
    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return name;
    };

    public String getPhoneNumber() {
        return phoneNumber;
    };

    public String getBirthDate() {
        return birthDate;
    };

    public int getAge() {
        return age;

    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null or blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("Enter a real phone number");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public void setBirthDate(String birthDate) throws ParseException{
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
        return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }


    public String toString() {
       return "Name: " + this.name + "\n" +
        "Phone number: " + this.phoneNumber + "\n" +
        "Birth Date: " + this.birthDate + "\n" +
        "Age: " + this.age + " year old\n";
    }

}
