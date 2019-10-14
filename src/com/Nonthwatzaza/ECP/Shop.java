package com.Nonthwatzaza.ECP;

public class Shop {

    public static void main(String[] args) {

        Cart cart1 = new Cart(10);

        Priceable c1 = new Cake(2);

        Priceable c2 = new Cake2(1);

        cart1.items[0]= c1;

        cart1.items[1]= c2;

        System.out.printf("รวมราคาสินค้า");
                System.out.print(cart1.getPrice());
                System.out.printf("บาท");

    }

}
