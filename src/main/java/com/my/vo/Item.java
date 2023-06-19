package com.my.vo;

public class Item {
    private Integer ItemId;
    private String ItemName;
    private String ItemTitle;
    private String ItemDate;
    private String ItemContent;

    public Item() {
    }

    public Integer getItemId() {
        return ItemId;
    }

    public void setItemId(Integer itemId) {
        ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public String getItemDate() {
        return ItemDate;
    }

    public void setItemDate(String itemDate) {
        ItemDate = itemDate;
    }

    public String getItemContent() {
        return ItemContent;
    }

    public void setItemContent(String itemContent) {
        ItemContent = itemContent;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemId=" + ItemId +
                ", ItemName='" + ItemName + '\'' +
                ", ItemTitle='" + ItemTitle + '\'' +
                ", ItemDate='" + ItemDate + '\'' +
                ", ItemContent='" + ItemContent + '\'' +
                '}';
    }
}
