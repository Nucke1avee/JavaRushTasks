package com.javarush.task.task18.task1828;

import java.util.Arrays;

public class Product {

    private static final char SYMBOL_SPACE = ' ';

    private char[] id;
    private char[] name;
    private char[] price;
    private char[] quantity;

    public Product(final String data) {
        this.id = data.substring(0, 8).toCharArray();
        this.name = data.substring(8, 38).toCharArray();
        this.price = data.substring(38, 46).toCharArray();
        this.quantity = data.substring(46).toCharArray();
    }

    public void setName(final String name) {
        modify(this.name, name);
    }


    public void setPrice(final String price) {
        modify(this.price, price);
    }

    public void setQuantity(final String quantity) {
        checkCapacityQuantity(quantity);
        modify(this.quantity, quantity);
    }

    private void modify(final char[] data, final String str) {
        Arrays.fill(data, SYMBOL_SPACE);
        for (int i = 0; i < str.length(); i++) {
            data[i] = str.charAt(i);
        }
    }

    private void checkCapacityQuantity(final String quantity) {
        if (this.quantity.length != quantity.length()) {
            this.quantity = new char[quantity.length()];
        }
    }

    @Override
    public String toString() {
        return String.valueOf(id) +
                String.valueOf(name) +
                String.valueOf(price) +
                String.valueOf(quantity);
    }
}