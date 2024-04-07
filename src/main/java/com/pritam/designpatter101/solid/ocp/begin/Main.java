package com.pritam.designpatter101.solid.ocp.begin;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Adding call sessions for the phone subscriber
        CallHistory.addSession(1L, LocalDateTime.now(), 100);
        CallHistory.addSession(1L, LocalDateTime.now(), 200);
        CallHistory.addSession(1L, LocalDateTime.now(), 300);

        // Adding internet sessions for the ISP subscriber
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 500);
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 600);
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 700);

        // Creating a phone subscriber
        PhoneSubscriber phoneSubscriber = new PhoneSubscriber();
        phoneSubscriber.setSubscriberId(1L);
        phoneSubscriber.setBaseRate(1);

        // Calculating bill for the phone subscriber
        double phoneBill = phoneSubscriber.calculateBill();
        System.out.println("Phone Subscriber Bill: " + phoneBill);

        // Creating an ISP subscriber
        ISPSubscriber ispSubscriber = new ISPSubscriber();
        ispSubscriber.setSubscriberId(2L);
        ispSubscriber.setBaseRate(2);

        // Calculating bill for the ISP subscriber
        double ispBill = ispSubscriber.calculateBill();
        System.out.println("ISP Subscriber Bill: " + ispBill);
    }
}
