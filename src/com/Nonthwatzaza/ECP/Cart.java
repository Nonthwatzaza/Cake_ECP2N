package com.Nonthwatzaza.ECP;

public class Cart {

    private final static int MAX_PRODUCT = 30;

    Priceable[] items;

    double discountRate = 10;

    public Cart() {

        items = new Priceable[MAX_PRODUCT];

    }

    public Cart(int i) {

        items = new Priceable[i];

    }

    public int sumPrice() {

        int sum = 0;



        for (Priceable x : items) {

            if (x != null) sum = sum + x.getPrice();  }

        return sum; }

    void setDiscoutRate(double d) {

        if (d > 70) {

            System.out.println("ส่วนลดต้องไม่เกิน 70%");

        } else {

            discountRate = d;

        }

    }



    public int sumPriceWithDiscount() {

        return (int) (sumPrice() * ((100.00 - discountRate) / 100.00)); }

    public int getPrice() {

        return sumPrice();

    }

}
