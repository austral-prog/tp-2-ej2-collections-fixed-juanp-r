package com.collections;

import java.util.List;

public class Lists {


    public static int indexOf(String str, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String str, List<String> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("")) {
                return i;
            }
        }
        return -1;
    }

    public static int put(String str, List<String> list) {
        int emptyIndex = indexOfEmpty(list);
        if (emptyIndex != -1) {
            list.set(emptyIndex, str);
        }
        return emptyIndex;
    }

    public static int remove(String str, List<String> list) {
        int removalCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                list.set(i, "");
                removalCount++;
            }
        }
        return removalCount;
    }

}
