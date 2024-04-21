package com.ps;

// BONUS 1: Move Do-whiles/Menu to their own separate classes.
// BONUS 2: Maybe add an Error message once all books are checked out.
    // Or display the number of books available & checked out.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(1110, "01", "Frankenstein");
        Book book2 = new Book(1111, "02", "The Giving Tree");
        Book book3 = new Book(1112, "03", "To Kill a Mockingbird");
        Book book4 = new Book(1113, "04", "The Alchemist");
        Book book5 = new Book(1114, "05", "The Three-Body Problem");
        Book book6 = new Book(1115, "06", "Dune");
        Book book7 = new Book(1116, "07", "Harry Potter");
        Book book8 = new Book(1117, "08", "Percy Jackson And the Olympians");
        Book book9 = new Book(1118, "09", "Magnus Chase");
        Book book10 = new Book(1119, "10", "Maximum Ride");
        Book book11 = new Book(1120, "11", "Nancy Drew");
        Book book12 = new Book(1121, "12", "Sherlock Holmes");
        Book book13 = new Book(1122, "13", "Dr. Jekyll and Mr. Hyde");
        Book book14 = new Book(1123, "14", "Divine Comedy");
        Book book15 = new Book(1124, "15", "Faust");
        Book book16 = new Book(1125, "16", "Little Women");
        Book book17 = new Book(1126, "17", "Book of Five Rings");
        Book book18 = new Book(1127, "18", "Summoner");
        Book book19 = new Book(1128, "19", "The Kane Chronicles");
        Book book20 = new Book(1129, "20", "The Blood of Olympus");

        Book[] bookInventory = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12,
               book13, book14, book15, book16, book17, book18, book19, book20};

        String userName;
        String homeSelection;
        do {
            // Store Home Screen
            System.out.println("Welcome to THE Mars Hall Library!\n");
            System.out.println("Home Menu");
                // Option: Show Available books
            System.out.println("\tEnter 1 to for Available Books menu.");
                // Option: Show Checked Out books
            System.out.println("\tEnter 2 to for Checked Out Books menu.");
                // Else Exit
            System.out.println("\tEnter 3 to Exit.\n");

            System.out.println("Enter Menu selection here: ");
            homeSelection = scanner.next();

            switch (homeSelection) {
                case "1":

                    String avBksSelection;
                    do {
                        System.out.println("Available Books menu\n");

                        // Show Available books
                        int numOfAvBooks = 0;
                        for (Book book : bookInventory) {
                            if (!book.isCheckedOut()) {
                                System.out.println("\"" + book.getTitle() + "\"");
                                System.out.println("ISBN: " + book.getIsbn());
                                System.out.println("ID: " + book.getId());
                                System.out.println();
                                ++numOfAvBooks;
                            } else {
                                // Intentionally left blank
                            }
                        }

                        System.out.println("\n# of Available books: " + numOfAvBooks + "\n");

                        // Ask user if they want to check out book(s)
                        System.out.println("Would you like to CHECK OUT a book?");
                            // Option: If Yes:
                        System.out.println("\tIf Yes, type 1");
                            // Else Exit/go back
                        System.out.println("\tIf No, type 2 to go BACK\n");
                        System.out.println("Enter here: ");

                        avBksSelection = scanner.next();
                        int iDToCheckOut;
                        switch (avBksSelection) {
                            case "1":
                                // Ask for user's name
                                System.out.println("What is your name? ");
                                userName = scanner.next(); // For some reason scanner.nextLine() "skipped" this line and went to line 93.

                                System.out.println("Enter ID of the book you would like to CHECK OUT: ");
                                iDToCheckOut = scanner.nextInt(); // This only accepts ONE book to check out.

                                String ckdOutBook; // Checked Out book title
                                for (Book book : bookInventory) {
                                    if (book.getId() == iDToCheckOut) {
                                        book.setCheckedOut(true);
                                        book.setCheckedOutTo(userName);

                                        ckdOutBook = book.getTitle();
                                        System.out.println("\nYou CHECKED OUT " + "\"" + ckdOutBook + "\""); // Prints book title that's been checked out
                                    }
                                    else {
                                        // Intentionally left blank
                                    }
                                }

                                // Put this here so that it won't automatically go back to the Available Books menu after checking out.
                                String exitString;
                                do {
                                    System.out.println(
                                            "\nType 1 to Exit to Available Books menu\n"
                                                    + "Enter here: ");
                                    exitString = scanner.next();
                                    if (exitString.equals("1")) {
                                        break;
                                    } else {
                                        System.out.println("\nERROR: Must type 1 to Exit.\n");
                                    }
                                } while (!exitString.equals("1"));

                                System.out.println("Returning to Available Books Menu ...\n");
                                break;
                            case "2":
                                System.out.println("Returning to Home Menu ...\n");
                                break;
                            default:
                                System.out.println("\nERROR: type either 1 or 2.\n");
                                break;
                        }
                    } while (!avBksSelection.equals("2"));
                    break;
                case "2":

                    String ckdOutBksSelection;
                    do {
                        System.out.println("Checked-Out Books menu\n");
                        // Show Checked Out books
                        int numOfCkdOutBooks = 0;
                        for (Book book : bookInventory) {
                            if (book.isCheckedOut()) {
                                System.out.println("\"" + book.getTitle() + "\"");
                                System.out.println("ISBN: " + book.getIsbn());
                                System.out.println("ID: " + book.getId());
                                System.out.println("\tChecked Out by " + book.getCheckedOutTo());
                                System.out.println();
                                ++numOfCkdOutBooks;
                            } else {
                                // Intentionally left blank
                            }
                        }

                        System.out.println("\n# of Checked-Out books: " + numOfCkdOutBooks + "\n");

                        System.out.println("Would you like to CHECK IN a book?");
                        // Option: If Yes:
                        System.out.println("\tType C to check in");
                        // Else Exit/go back
                        System.out.println("\tType X to go BACK to Home menu\n");
                        System.out.println("Enter here: ");
                        ckdOutBksSelection = scanner.next();

                        int iDToCheckIn;
                        // Using "toUpperCase()" so that any input will be upper-case; making the switch statement "ignore" the casing.
                        switch (ckdOutBksSelection.toUpperCase()) {
                            case "C":
                                // Ask for book ID to check in
                                System.out.println("What is the ID# of the book you wish to CHECK IN? ");
                                iDToCheckIn = scanner.nextInt(); // This only accepts ONE book to check out.

                                String ckdInBook; // Book title that's being Checked-in
                                for (Book book : bookInventory) {
                                    if (book.getId() == iDToCheckIn) {
                                        book.setCheckedOut(false);
                                        book.setCheckedOutTo("");

                                        ckdInBook = book.getTitle();
                                        System.out.println("\nYou CHECKED IN " + "\"" + ckdInBook + "\""); // Prints book title that's been checked IN
                                    }
                                    else {
                                        // Intentionally left blank
                                    }
                                }

                                // Put this here so that it won't automatically go back to the Checked-Out Books menu after checking out.
                                String exitString;
                                do {
                                    System.out.println(
                                            "\nType 1 to Exit to Checked-Out Books menu\n"
                                                    + "Enter here: ");
                                    exitString = scanner.next();
                                    if (exitString.equals("1")) {
                                        break;
                                    } else {
                                        System.out.println("\nERROR: Must type 1 to Exit.\n");
                                    }
                                } while (!exitString.equals("1"));

                                System.out.println("Returning to Checked-Out Books Menu ...\n");
                                break;
                            case "X":
                                System.out.println("Returning to Home Menu ...\n");
                                break;
                            default:
                                System.out.println("\nERROR: type either C or X\n");
                                break;
                        }
                    } while (!ckdOutBksSelection.equalsIgnoreCase("X"));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("\nERROR: You must type either 1, 2, or 3.\n");
                    break;
            }


        } while (!homeSelection.equals("3"));




    }
}
