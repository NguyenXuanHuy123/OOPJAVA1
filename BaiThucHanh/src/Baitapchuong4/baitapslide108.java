package Baitapchuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class baitapslide108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(7, 9d);
        treeMap.put(49, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);

        System.out.println("Cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        treeMap.replace(49, 20.11d);
        treeMap.replace(2, 7.2d, 7.7d);
        System.out.println("Cac phan tu co trong treeMap sau khi thay the: ");
        System.out.println(setTreeMap);
    }
}
