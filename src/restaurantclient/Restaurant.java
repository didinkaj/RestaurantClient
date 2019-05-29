/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantclient;

/**
 *
 * @author Johnson Didinya
 */
public class Restaurant extends Store {

    private int numberOfPeopleServedYearly;
    private float averageMealPrice;

    public Restaurant(String newStoreName, int peopleServedyearly, float avgMealPrice) {
        super(newStoreName);
        setPeopleServed(peopleServedyearly);
        setAveragePrice(avgMealPrice);
    }

    public void setPeopleServed(int newNumberOfPeopleServedYearly) 
    {
            numberOfPeopleServedYearly = newNumberOfPeopleServedYearly;
    }
    
    public int getPeopleServed() 
    {
        return numberOfPeopleServedYearly;
    }

    public void setAveragePrice(float newprice) 
    {
            averageMealPrice = newprice;
    } 

    public float getAverageMeal()
    {
        return averageMealPrice;   
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name of store is:   " + super.getName()
                + "\nNumber of people served is   " + numberOfPeopleServedYearly
                + "\nAverage price per person is " + averageMealPrice + "\n";
    }

    public boolean equals(Restaurant restraurant) {
       
        return averageMealPrice == restraurant.getAverageMeal() &&
                numberOfPeopleServedYearly == restraurant.getPeopleServed() &&
                super.equals(restraurant);

    }

    public double averageTaxes() {
        double avgtaxes = (double) (super.taxRate * 
                (numberOfPeopleServedYearly * averageMealPrice));
        return avgtaxes;        
    }

}
