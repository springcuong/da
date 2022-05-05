/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffelogic;

/**
 *
 * @author HOAI NGUYEN
 */
public class Coffeeshop {
    private String name;
    private String address;

    public Coffeeshop() {
    }

    public Coffeeshop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Coffeshop{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
