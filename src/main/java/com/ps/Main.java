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
            System.out.println("Welcome to THE Mars Hall Library!\n");
            System.out.println("Home Menu");
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

                    int avBksSelection;
                    do {
                        System.out.println("Available Books menu\n");

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

                        // Ask user if they want to check out book(s)
                        System.out.println("Would you like to check out a book?");
                            // Option: If Yes:
                        System.out.println("\tIf Yes, type 1");
                            // Else Exit/go back
                        System.out.println("\tIf No, type 2 to go BACK\n");
                        System.out.println("Enter selection here: ");

                        avBksSelection = scanner.nextInt();
                        int iDToCheckOut;
                        switch (avBksSelection) {
                            case 1:
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
                                        System.out.println("You checked out " + "\"" + ckdOutBook + "\""); // Prints book title that's been checked out
                                    }
                                    else {
                                        // Intentionally left blank
                                    }
                                }

                                // Put this here so that it won't automatically go back to the Available Books menu after checking out.
                                int exitNum;
                                do {
                                    System.out.println(
                                            "Type 1 to Exit to Available Books menu\n"
                                                    + "Enter here: ");
                                    exitNum = scanner.nextInt();
                                    if (exitNum == 1) {
                                        break;
                                    } else {
                                        System.out.println("\nERROR: Must type 1 to Exit.\n");
                                    }
                                } while (exitNum != 1);

                                System.out.println("Returning to Available Books Menu ...\n");
                                break;
                            case 2:
                                System.out.println("Returning to Home Menu ...\n");
                                break;
                            default:
                                System.out.println("ERROR: type either 1 or 2.");
                                break;
                        }
                    } while (avBksSelection != 2);
                    break;

                case 2:
                    System.out.println("Checked-Out Books\n");

                    /*int ckdOutBksSelection;
                    do {
                        // Show Checked Out books
                        // Displays book info + user's name that checked out
                            // Option: (C)heck-in book
                                // Ask for book ID to check in
                                    // Check-in book with ID
                                        // Exit/return/go back to Home
                            // Else Exit/go back



                    } while (ckdOutBksSelection != 2);*/
                    break;

                case 3:
                    break;
                default:

            }


        } while (homeSelection != 3);




    }
}
