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
public class Store {

    private String storeName;
    public final float taxRate = (float) .08000;

    public Store(String newStoreName) {
        setName(newStoreName);
    }

    public String getName() {
        return storeName;
    }

    public void setName(String newName) {
        storeName = newName;
    }

    @Override
    public String toString() {
        return "Name of store is:   " + storeName;
    }

    public boolean equals(Store s) {
        return storeName.equals(s.storeName);
    }

}
