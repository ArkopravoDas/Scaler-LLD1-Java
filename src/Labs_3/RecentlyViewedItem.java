package Labs_3;

import java.util.LinkedList;

public class RecentlyViewedItem {
    private LinkedList<Item> recentlyViewedItems;
    static int MAX_SIZE = 3;

    public RecentlyViewedItem(int capacity) {
        this.recentlyViewedItems = new LinkedList<>();
    }

    public LinkedList<Item> getRecentlyViewedItems() {
        return recentlyViewedItems;
    }

    public void addRecentlyViewedItem(Item item) {
        recentlyViewedItems.remove(item);
        recentlyViewedItems.addFirst(item);
        if (recentlyViewedItems.size() > MAX_SIZE) {
            recentlyViewedItems.removeLast();
        }
    }
}
