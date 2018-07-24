package com.f_secure.model;

public enum ForHomeItems {
    F_SECURE_TOTAL("F‑Secure TOTAL", "Internet security and VPN for all devices"),
    F_SECURE_SAFE("F‑Secure SAFE", "Internet security for PCs,Macs, smartphones and tablets"),
    FREEDOM_VPN("FREEDOME VPN", "Protect your privacy. Access blocked content");

    private final String item;
    private final String content;

    ForHomeItems(String item, String content) {
        this.item = item;
        this.content = content;
    }

    public String getItem() {
        return item;
    }

//    public String getContent() {
//        return content;
//    }
}
