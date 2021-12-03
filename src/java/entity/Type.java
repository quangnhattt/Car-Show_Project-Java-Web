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
public class Type {
    
    private int id;
    private String type;
    private int statusid;
    private String icon;

    public Type() {
    }

    public Type(int id, String type, int statusid, String icon) {
        this.id = id;
        this.type = type;
        this.statusid = statusid;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getStatusid() {
        return statusid;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatusid(int statusid) {
        this.statusid = statusid;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", type=" + type + ", statusid=" + statusid + ", icon=" + icon + '}';
    }
    
    
}
