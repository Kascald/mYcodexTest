package com.example.demo.dto;

public class OrderProjection {
    private Long orderId;
    private Long customerId;
    private String customerName;
    private Long recipientId;
    private String recipientAddress;

    public OrderProjection(Long orderId, Long customerId, String customerName, Long recipientId, String recipientAddress) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.recipientId = recipientId;
        this.recipientAddress = recipientAddress;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }
}
