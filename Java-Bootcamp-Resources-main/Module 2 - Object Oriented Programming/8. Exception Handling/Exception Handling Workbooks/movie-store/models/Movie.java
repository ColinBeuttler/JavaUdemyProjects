package models;

public class Movie {

    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
       if (!(format.equalsIgnoreCase("DVD") || format.equalsIgnoreCase("Blue-RAY"))) {
            throw new IllegalArgumentException("Must be a valid format");
        }
       if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("rating must be between 0 and 10.");
        }

        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equalsIgnoreCase("DVD") ? 2.25 :  4.25;
        this.rentalPrice = format.equalsIgnoreCase("DVD") ? 0.99 : 1.99;
        this.isAvailable = true;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public String getname() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (!format.equalsIgnoreCase("DVD") || !format.equalsIgnoreCase("Blue-RAY")) {
            throw new IllegalArgumentException("Must be a valid format");
        }
        this.format = format;
        setSellingPrice(format.equals("DVD") ? 2.25 : 4.25);
        setRentalPrice(format.equals("DVD") ? 0.99 : 1.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("rating must be between 0 and 10.");
        }
        this.rating = rating;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "\t Name: " + this.name + "\n" +

        "\t Format: " + this.format + "\n" +
        
        "\t Rating: " + this.rating + "\n" +
        
        "\t Selling Price: " + this.sellingPrice + "\n" +
        
        "\t Rental Price: " + this.rentalPrice + "\n" +
        
                "\t Availability: " + (this.isAvailable ? "in-stock" : "rented") + "\n";
    }
}
