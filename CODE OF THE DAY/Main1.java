/*Write a Java program to convert minutes into a number of years and days.

Input Format
An integer, representing minutes.

Output Format
Return two integer values representing years and days.

Example 1
Input

3456789
Output

6 years and 210 days
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        scanner.close();
        
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        days = days % 365;
        
        System.out.println(years + " years and " + days + " days");
    }
}
