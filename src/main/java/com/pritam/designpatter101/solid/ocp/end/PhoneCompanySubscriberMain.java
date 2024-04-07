package com.pritam.designpatter101.solid.ocp.end;

import java.time.LocalDateTime;
import java.util.List;

public class PhoneCompanySubscriberMain {
    public static void main(String[] args) {
        // Creating instances of subscribers
        PhoneSubscriber phoneSubscriber = new PhoneSubscriber();
        phoneSubscriber.setSubscriberId(1L);
        phoneSubscriber.setBaseRate(1);

        ISPSubscriber ispSubscriber = new ISPSubscriber(1000);
        ispSubscriber.setSubscriberId(2L);
        ispSubscriber.setBaseRate(2);

        // Adding call sessions for the phone subscriber
        CallHistory.addSession(1L, LocalDateTime.now(), 100);
        CallHistory.addSession(1L, LocalDateTime.now(), 200);
        CallHistory.addSession(1L, LocalDateTime.now(), 300);

        // Adding internet sessions for the ISP subscriber
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 500);
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 600);
        InternetSessionHistory.addSession(2L, LocalDateTime.now(), 700);

        // Calculating bills for subscribers
        double phoneBill = phoneSubscriber.calculateBill();
        double ispBill = ispSubscriber.calculateBill();

        // Displaying bills
        System.out.println("Phone Subscriber Bill: " + phoneBill + " Subscriber ID: " + phoneSubscriber.subscriberId);
        System.out.println("ISP Subscriber Bill: " + ispBill+ " Subscriber ID: " + ispSubscriber.subscriberId);

        // Add some internet sessions for a subscriber and test getCurrentSessions
        InternetSessionHistory.addSession(ispSubscriber.subscriberId, LocalDateTime.now(), 100);
        InternetSessionHistory.addSession(ispSubscriber.subscriberId, LocalDateTime.now().plusHours(1), 200);
        InternetSessionHistory.addSession(ispSubscriber.subscriberId, LocalDateTime.now().plusHours(2), 150);

        // Retrieve the current internet sessions for the subscriber
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(ispSubscriber.subscriberId);

        // Display the retrieved sessions
        System.out.println("Current Internet Sessions for Subscriber ID " + ispSubscriber.subscriberId + ":");
        for (InternetSessionHistory.InternetSession session : sessions) {
            System.out.println("Begin Time: " + session.getBegin() + ", Data Used: " + session.getDataUsed());
        }
    }
}
