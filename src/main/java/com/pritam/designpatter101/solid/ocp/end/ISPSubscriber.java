package com.pritam.designpatter101.solid.ocp.end;

import java.util.List;

public class ISPSubscriber extends Subscriber {
    private final long freeUsage;

    public ISPSubscriber(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    //only demonstration - open for modification
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        if (chargeableData <= 0)
            return 0;
        return (double) (chargeableData * baseRate) / 100;
    }
}
