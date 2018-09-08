package com.f_secure.model.jobPeningPage;

public enum InterviewPhase {
    APPLYING("Applying", "apply"),
    INTERVIEWS("Interviews", "interviews"),
    FINAL_SELECTION("Final selection", "final-selection"),
    ON_BOARDING("On-boarding", "on-boarding");

    private final String label;
    private final String content;

    InterviewPhase(String label, String content) {
        this.label = label;
        this.content = content;
    }

    public String getLabel() {
        return label;
    }

    public String getContent() {
        return content;
    }
}
