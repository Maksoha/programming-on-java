package org.example.prac_23;

import java.util.*;

public class InternetOrder {
    private List<Item> items;
    public InternetOrder() {
        items = new LinkedList<>();
    }
    public InternetOrder(LinkedList<Item> items) {
        this.items = items;
    }
    public boolean add(Item item) {
        try {
            items.add(item);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean remove(String itemName) {
        try {
            int size = items.size();
            int chosenPosition = -1;
            for (int i = 0; i < size; i++) {
                if (Objects.equals(items.get(i).getName(), itemName))
                    chosenPosition = i;
            }
            items.remove(chosenPosition);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public int removeAll(String name) {
        int count = 0;
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                count++;
            }
        }
        return count;
    }
    public List<Item> getItems() {
        return items;
    }
    public double costTotal() {
        double result = 0.0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (Item item : items) {
            if (Objects.equals(item.getName(), itemName))
                quantity++;
        }
        return quantity;
    }
    public String[] itemsNames() {
        int size = items.size();
        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            results[i] = items.get(i).getName();
        }
        return results;
    }
    public Item[] sortedItemsByCostDesc() {
        items.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice())
                return 1;
            else if (o1.getPrice() < o2.getPrice())
                return -1;
            else
                return 0;
        });
        return null;
    }
}
