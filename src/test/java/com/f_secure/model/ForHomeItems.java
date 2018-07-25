package com.f_secure.model;

public enum ForHomeItems {
    F_SECURE_TOTAL("F‑Secure TOTAL"),
    F_SECURE_SAFE("F‑Secure SAFE"),
    FREEDOM_VPN("FREEDOME VPN");

    private final String item;

    ForHomeItems(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
