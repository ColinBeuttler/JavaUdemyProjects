import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Movie;
import models.Store;

public class Main {
    
    static Store store = new Store();
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");

        try {
            loadMovies("movies.txt");
            System.out.println("MOVIES LOADED\n\n");
            System.out.print(store);
            manageMovies();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nProcess Complete");;
        }



    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */

    public static void manageMovies() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("a) purchase \nb) rent \nc) return \nd) exit.\n");
            String answer = scan.nextLine();
            if (!(answer.equals("a") || answer.equals("b") || answer.equals("c"))) {
                scan.close();
                break;
            }
            System.out.println("Which Movie?");
            String movieAws = scan.nextLine();

            if (store.getMovie(movieAws)== null) {
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
            }

            switch (answer) {
                case "a": {
                    if (!(store.getMovie(movieAws).isAvailable())) {
                        System.out.print("Movie not available for purchase");
                        continue;
                    }
                    store.action(movieAws, "sell");
                    break;
                }
                case "b": {
                    store.action(movieAws, "rent");
                    break;
                }
                case "c": {
                    store.action(movieAws, "return");
                    break;
                }
            }
            System.out.println("\n\nUpdated Movies\n\n" + store);
        }
     }


    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */

    public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            String movieScan = scanFile.nextLine();
            String[] arrOfMovies = movieScan.split("--");
        
                store.addMovie(new Movie(arrOfMovies[0], arrOfMovies[1], Double.parseDouble(arrOfMovies[2])));
        }
        
        scanFile.close();
    }

}
