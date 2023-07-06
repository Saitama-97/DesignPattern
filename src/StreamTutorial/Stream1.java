package StreamTutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Time   : 2023/7/5 14:50
 * @File   : Stream1.java
 * @Type   : Class
 * @Package: StreamTutorial
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class Stream1 {
    public static void main(String[] args) {
        List<ShipCount> list = new ArrayList<ShipCount>();
        list.add(new ShipCount("001", 3, 1));
        list.add(new ShipCount("002", 3, 2));
        list.add(new ShipCount("003", 3, 3));
        list.add(new ShipCount("004", 100, 300));
        ShipCount count = new ShipCount();
        Map<String,Integer> map1 = list.stream().collect(Collectors.toMap(ShipCount::getMarkerId, ShipCount::getTotalCount));
        System.out.println(map1);
//        list.stream().map(i- > fuc()).collect(Collectors.toCollection())
//        list.stream().collect(Collectors.toMap(ShipCount::getMarkerId,(ShipCount::getUpCount+ShipCount::getDownCount)))
//        list =  list.stream().map(i -> fuc(i)).collect(Collectors.toList());
//        for (ShipCount item : list) {
//            System.out.println(item.totalCount);
//        }

    }

    private static HashMap<String, Integer> fuc(ShipCount i) {
        HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
        int totalCount = i.upCount + i.downCount;
        tempMap.put(i.markerId, totalCount);
        return tempMap;
    }

}
