/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantclient;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Johnson Didinya
 */
public class RestaurantClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Restaurant r1;
        Restaurant r2;

        Scanner scan = new Scanner(System.in);
        String restaurantName;
        int numberOfPeopleServedYearly;
        float averageMealPrice;

        System.out.print("Enter the Restaurant Name: ");
        restaurantName = scan.next();
        System.out.print("Enter the Number of People Served Yearly: ");
        numberOfPeopleServedYearly = scan.nextInt();
        System.out.print("Enter the Price per Meal: ");
        averageMealPrice = scan.nextFloat();

        r1 = new Restaurant(restaurantName, numberOfPeopleServedYearly, averageMealPrice);

        System.out.print("Enter the Restaurant Name: ");
        restaurantName = scan.next();
        System.out.print("Enter the Number of People Served Yearly: ");
        numberOfPeopleServedYearly = scan.nextInt();
        System.out.print("Enter the Price per Meal: ");
        averageMealPrice = scan.nextFloat();

        r2 = new Restaurant(restaurantName, numberOfPeopleServedYearly, averageMealPrice);

        System.out.print(r1.toString());
        System.out.print(r2.toString());

        r2.setPeopleServed(r1.getPeopleServed());
        r2.setAveragePrice(r1.getAverageMeal());

        if (r1.equals(r2)) {
            System.out.println("\nThe two objects are the same");
        } else {
            System.out.println("\nThe two objects are NOT the same");
        }

        r2.setName(r1.getName());

        r2.setName(r1.getName());
        if (r1.equals(r2)) {
            System.out.println("\nThe two objects are the same");
        } else {
            System.out.println("\nThe two objects are NOT the same");
        }
        
        DecimalFormat df = new DecimalFormat("$0.00");
        System.out.println("Tax paid per year: " + df.format(r1.averageTaxes()));

        System.exit(0);
    }

}
