package Genaric;

import java.util.ArrayList;
import java.util.List;

// import java.util.*;

public class Pair<V> {
    public List<V> first = new ArrayList<V>();

    public List<V> setSecond(V x) {
        // this.first = x;
        this.first.clear();
        for (int i = 1; i <= 7; i++)
            this.first.add(x);
        return this.first;

    }

}
