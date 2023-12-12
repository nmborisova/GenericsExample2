package bg.smg;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<T>();

        int maxLength = Math.max(list1.size(), list2.size());

        for (int i=0; i<maxLength; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }

            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }
}
