package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue()
    private long customerId;

    @Column(nullable = false)
    private String customerFirstName;

    @Column(nullable = false)
    private String customerLastName;

    public Client(String customerFirstName, String customerLastName) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
}
