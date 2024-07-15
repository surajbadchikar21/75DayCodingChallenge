// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DAY5_FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> l = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                l.add(key);
            }
        }

        return l;
    }
}
