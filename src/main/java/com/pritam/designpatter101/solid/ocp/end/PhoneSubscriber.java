package com.pritam.designpatter101.solid.ocp.end;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PhoneSubscriber extends Subscriber {

    //only demonstration - open for modification
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::duration).sum();
        return (double) (totalDuration * baseRate) / 100;
    }
}
