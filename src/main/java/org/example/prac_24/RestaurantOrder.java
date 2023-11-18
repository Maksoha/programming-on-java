package org.example.prac_24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class RestaurantOrder implements Order {
    private int size;
    private List<Item> items;
    public RestaurantOrder() {
        this.items = new ArrayList<>();
    }
    public RestaurantOrder(ArrayList<Item> items) {
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
            result += item.getCost();
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
    public List<Item> sortedItemsByCostDesc() {
        List<Item> itemscopy = new ArrayList<>(items);
        itemscopy.sort((o1, o2) -> {
            if (o1.getCost() < o2.getCost())
                return 1;
            else if (o1.getCost() < o2.getCost())
                return -1;
            else
                return 0;
        });
        return itemscopy;
    }
}
