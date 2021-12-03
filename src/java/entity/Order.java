/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Quang Nhat
 */
public class Order {
    
    private int id;
    private int customerId;
    private Date createDate;
    private float totalPrice;
    private int statusId;
    private String note;

    public Order() {
    }

    public Order(int id, int customerId, Date createDate, float totalPrice, String note) {
        this.id = id;
        this.customerId = customerId;
        this.createDate = createDate;
        this.totalPrice = totalPrice;
        this.note = note;
    }

    public Order(int customerId, Date createDate, float totalPrice, String note) {
        this.customerId = customerId;
        this.createDate = createDate;
        this.totalPrice = totalPrice;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getStatusId() {
        return statusId;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customerId=" + customerId + ", createDate=" + createDate + ", totalPrice=" + totalPrice + ", statusId=" + statusId + ", note=" + note + '}';
    }
    
    
    
}
