package edu.eskisehir;

import java.util.LinkedList;

public class Item {

    String name;
    String itemID;
    int amountOnHand;
    int scheduledReceipt;
    int arrivalOnWeek;
    int leadTime;
    String lotSizingRule;
    int level;
    int[][] bill;
    int needed;
    LinkedList<Integer> grossReqList;
    LinkedList<Integer> pReleases = new LinkedList<>();
    String materialFor;
    boolean isBillFull = false;

    public Item(String itemID, int amountOnHand, int scheduledReceipt, int arrivalOnWeek,
            int leadTime, String lotSizingRule, int level, int needed, String materialFor, String name) {
        this.itemID = itemID;
        this.amountOnHand = amountOnHand;
        this.scheduledReceipt = scheduledReceipt;
        this.arrivalOnWeek = arrivalOnWeek;
        this.leadTime = leadTime;
        this.lotSizingRule = lotSizingRule.toLowerCase();
        this.level = level;
        this.needed = needed;
        this.materialFor = materialFor;
        this.name = name;

    }

    public int level() {
        return level;
    }

    public Item findDuplicate() {
        for (Item item : SecondFrame.items) {
            if (item != null && item.itemID.equals(itemID) && !item.materialFor.equals(materialFor)) {
                return item;
            }

        }
        return null;
    }

    public static Item search(String itemID) {
        for (int i = 0; i < SecondFrame.items.size(); i++) {
            if (SecondFrame.items.get(i).itemID.equals(itemID)) {
                return SecondFrame.items.get(i);
            }
        }

        return null;
    }
}
