/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Quang Nhat
 */
public class Cart {
    
    private int productId;
    private String productName;
    private String productImage;
    private double productPrice;
    private int amount;
    private double totalPrice;

    public Cart() {
    }

    public Cart(int productId, String productName, String productImage, double productPrice, int amount, double totalPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getAmount() {
        return amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "productId=" + productId + ", productName=" + productName + ", productImage=" + productImage + ", productPrice=" + productPrice + ", amount=" + amount + ", totalPrice=" + totalPrice + '}';
    }
    
    
}
