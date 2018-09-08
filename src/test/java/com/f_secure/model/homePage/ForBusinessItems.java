package com.f_secure.model.homePage;

public enum ForBusinessItems {

    Protection_Service_for_Business("Protection Service for Business"),
    F_Secure_Rapid_DetectionResponse_Service("F-Secure Rapid Detection & Response Service"),
    F_Secure_Rapid_DetectionResponse("F-Secure Rapid Detection & Response");

    private final String item;

    ForBusinessItems(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
