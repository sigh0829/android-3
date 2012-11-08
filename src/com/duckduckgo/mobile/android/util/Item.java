package com.duckduckgo.mobile.android.util;

public class Item {
    public final String text;
    public final int icon;
    public final ItemType type;
    public Item(String text, Integer icon, ItemType type) {
        this.text = text;
        this.icon = icon;
        this.type = type;
    }
    @Override
    public String toString() {
        return text;
    }
    
    public static enum ItemType {
    	SHARE, SAVE, EXTERNAL
    }
}