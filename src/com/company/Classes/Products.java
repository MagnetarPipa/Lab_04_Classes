package com.company.Classes;

public class Products {

    private Product[] products;
    private int currentProductNumber;


    public Products(final int productsNumber) {
        this.products = new Product[productsNumber];
        currentProductNumber = -1;
    }

    public Product findMostExpensiveProduct() {
        Product product1 = products[0];

        for (final Product product : products) {

            if (product.getPrice() > product1.getPrice()) product1 = product;


        }

        return product1;
    }

    public void addProduct(final Product product) {
        if (++currentProductNumber < products.length) {
            products[currentProductNumber] = product;
        }
    }

    @Override
    public String toString() {
        int count = 0;

        String result = "Products: " + System.lineSeparator();

        for (final Product product : products) {
            result += product + System.lineSeparator();
            count++;
        }


        return result + "Amount of products=" + count;
    }

}
