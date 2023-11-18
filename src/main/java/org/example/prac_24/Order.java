package org.example.prac_24;


import java.util.List;

public interface Order {
    boolean add(Item dish);
    boolean remove(String dishName);
    int removeAll(String itemName);
    List<Item> getItems();
    double costTotal();
    int itemQuantity(String itemName);
    String[] itemsNames();
    List<Item> sortedItemsByCostDesc();
}
