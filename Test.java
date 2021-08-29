import java.util.Scanner;
/*
Programming Fundamentals
NAME : Hniangtha Thluai
Programming Assignment 4- SET
Summer 2021
 */

public class Test {
    public static void main(String[] args) {

        Set set = new Set(); // creating a new set object

        String line;

        Scanner scan = new Scanner(System.in);

        // infinite loop

        while (true) {

            System.out.print("Enter command: ");

            line = scan.nextLine();

            String[] data = line.split(" "); // split command by white space

            if (data.length > 1) { // checks if data contains more than one elements

                // add the integer x from the set
                if (data[0].equalsIgnoreCase("add")) {

                    try {

                        int x = Integer.parseInt(data[1]); // convert the data to integer

                        set.add(x);

                        System.out.println(set);

                    } catch (Exception e) {

                        System.out.println("Error, Please try again");

                    }

                    // deletes the integer x from the set

                } else if (data[0].equalsIgnoreCase("del")) {

                    try {

                        int x = Integer.parseInt(data[1]);

                        set.delete(x);

                        System.out.println(set); // display the updated set

                    } catch (Exception e) {

                        System.out.println("Error, Please try again");

                    }

                /*
                Returns true if the integer x exists in the set
                Returns false if the integer x exists in the set
                 */

                } else if (data[0].equalsIgnoreCase("exists")) {

                    try {

                        int x = Integer.parseInt(data[1]);

                        System.out.println(set.exists(x));

                    } catch (Exception e) {

                        System.out.println("Error, Please try again");

                    }

                }
            }

        }

    }
}
