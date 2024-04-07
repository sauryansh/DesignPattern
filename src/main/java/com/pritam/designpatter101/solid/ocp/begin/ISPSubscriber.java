package com.pritam.designpatter101.solid.ocp.begin;



import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ISPSubscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;
    private long freeUsage;

    //only demonstration
    public double calculateBill(){
        List<InternetSessionHistory.InternetSession> sessions= InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData-freeUsage;
        if(chargeableData<=0)
            return 0;
        return (double) (chargeableData * baseRate) /100;
    }
}
