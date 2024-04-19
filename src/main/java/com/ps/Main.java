package com.ps;

// BONUS 1: Move Do-whiles/Menu to their own separate classes.
// BONUS 2: Maybe add an Error message once all books are checked out.
    // Or display the number of books available & checked out.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String[] bookInventory = {"Frankenstein", "The Giving Tree", "To Kill a Mockingbird", "The Alchemist",
                "The Three-Body Problem", "Dune", "Harry Potter", "Percy Jackson And the Olympians", "Magnus Chase",
                "Maximum Ride", "Nancy Drew", "Sherlock Holmes", "Dr. Jekyll and Mr. Hyde", "Divine Comedy",
                "Faust", "Little Women", "Book of Five Rings", "Summoner", "The Kane Chronicles",
                "The Blood of Olympus"};*/

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
        int homeSelection;
        do {
            // Store Home Screen
            System.out.println("Welcome to THE Mars Hall Library!");
                // Option: Show Available books
            System.out.println("\tEnter 1 to show available books.");
                // Option: Show Checked Out books
            System.out.println("\tEnter 2 to show checked out books.");
                // Else Exit
            System.out.println("\tEnter 3 to Exit.\n");

            System.out.println("Enter your selection here: ");
            homeSelection = scanner.nextInt();

            switch (homeSelection) {
                case 1:
                    System.out.println("Available books");

                    int aBSelection;
                    do {
                        // Show Available books
                        for (Book book : bookInventory) {
                            if (!book.isCheckedOut()) {
                                System.out.println("\"" + book.getTitle() + "\"");
                                System.out.println("ISBN: " + book.getIsbn());
                                System.out.println("ID: " + book.getId());
                                System.out.println();
                            } else {
                                // Intentionally left blank
                            }
                        }

                        // Option: Ask user if they want to check out book(s)
                        System.out.println("Would you like to check out a book?");
                        // If Yes:
                        System.out.println("\tIf Yes, type 1");
                        // Else Exit/go back
                        System.out.println("\tIf No, type 2 to EXIT\n");
                        System.out.println("Enter selection here: ");

                        aBSelection = scanner.nextInt();
                        int iDToCheckOut;
                        switch (aBSelection) {
                            case 1:
                                // Ask for user's name
                                System.out.println("What is your name?");
                                userName = scanner.nextLine();

                                    // Then: check out
                                        // Ask what book IDs to check out
                                        // Get variable name from ID
                                System.out.println("Enter ID of book you would like to CHECK OUT: ");
                                iDToCheckOut = scanner.nextInt();

                                for (Book book : bookInventory) {
                                    if (book.getId() == iDToCheckOut) {
                                        book.setCheckedOut(true);
                                        book.setCheckedOutTo(userName);
                                    }
                                    else {
                                        // Intentionally left blank
                                    }
                                }

                                break;
                            case 2:
                                System.out.println("Returning to Home Menu ...");
                                break;
                            default:
                                System.out.println("ERROR: type either 1 or 2.");
                                break;
                        }
                    } while (aBSelection != 2);
                    break;

                case 2:
                    System.out.println("Checked-out books");

                    /*int cOBSelection;
                    do {
                        // Show Checked Out books
                        // Displays book info + user's name that checked out
                            // Option: (C)heck-in book
                                // Ask for book ID to check in
                                    // Check-in book with ID
                                        // Exit/return/go back to Home
                            // Else Exit/go back



                    } while (cOBSelection != 2);*/
                    break;

                case 3:
                    break;
                default:

            }


        } while (homeSelection != 3);




    }
}
