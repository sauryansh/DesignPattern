package com.pritam.designpatter101.solid.ocp.begin;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PhoneSubscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

    //only demonstration
    public double calculateBill(){
        List<CallHistory.Call> sessions= CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::duration).sum();
        return (double) (totalDuration * baseRate) /100;
    }
}
