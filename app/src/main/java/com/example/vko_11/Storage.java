package com.example.vko_11;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Purchase> purchases = new ArrayList<>();
    private static Storage storage = null;

    private Storage() {
    }

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;

    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
        System.out.println("Ostoksen lisääminen onnistui.");
    }

    public Purchase removePurchaseById(int id) {
        return purchases.remove(id);
    }

    public Purchase getPurchaseById(int id) {
        return purchases.get(id);
    }

    public void removePurchase(int id) {
        int i = 0;
        for (Purchase p : purchases) {
            if (p.getId() == id) {
                break;
            }
            i++;
        }
        purchases.remove(i);
    }



}
