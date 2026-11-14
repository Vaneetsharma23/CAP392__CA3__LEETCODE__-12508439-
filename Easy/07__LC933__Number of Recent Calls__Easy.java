import java.util.ArrayList;

class RecentCounter {

ArrayList<Integer> list = new ArrayList<>();

public RecentCounter() {
    
}

public int ping(int t) {
    list.add(t);

    int count = 0;

    for (int i = list.size() - 1; i >= 0; i--) {
        if (list.get(i) >= t - 3000) {
            count++;
        } else {
            break;
        }
    }

    return count;
}


}


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
