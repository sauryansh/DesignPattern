package com.pritam.designpatter101.solid.ocp.begin;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.*;

public class InternetSessionHistory {
    private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

    public synchronized static List<InternetSession> getCurrentSessions(Long subscriberId) {
        if (!SESSIONS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return SESSIONS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
        List<InternetSession> sessions;
        if (!SESSIONS.containsKey(subscriberId)) {
            sessions = new LinkedList<>();
            SESSIONS.put(subscriberId, sessions);
        } else {
            sessions = SESSIONS.get(subscriberId);
        }
        sessions.add(new InternetSession(subscriberId, begin, dataUsed));
    }

    @Getter
    public static class InternetSession {
        private final LocalDateTime begin;
        private final Long subscriberId;
        private final Long dataUsed;

        public InternetSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
            this.begin = begin;
            this.dataUsed = dataUsed;
            this.subscriberId = subscriberId;
        }

    }
}