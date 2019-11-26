package homework_14.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMerge {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(34);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(33);
        List<Integer> list3 = new ArrayList<>();
        list3.add(144);
        list3.add(335);
        List<Integer> list4 = new ArrayList<>();
        list4.add(1222);
        list4.add(313);
        HashMap<String, List<Integer>> hashMapOne = new HashMap<>();
        hashMapOne.put("one", list1);
        hashMapOne.put("two", list2);
        System.out.println(hashMapOne);
        HashMap<String, List<Integer>> hashMapTwo = new HashMap<>();
        hashMapTwo.put("two", list3);
        hashMapTwo.put("three", list4);
        System.out.println(hashMapTwo);

        HashMap<String, List<Integer>> newHashMap = mergeMaps(hashMapOne, hashMapTwo);
        System.out.println(newHashMap);
    }

    private static HashMap<String, List<Integer>> mergeMaps(HashMap<String, List<Integer>> mapOne,
                                                            HashMap<String, List<Integer>> mapTwo) {
        HashMap<String, List<Integer>> newHashMap = new HashMap<>(mapOne);

        mapTwo.forEach(
                (key, value) -> {
                    System.out.println("!!!!");
                    newHashMap.merge(key, value, (v1, v2) -> {
                        System.out.println("1" + v1);
                        System.out.println("2" + v2);
                        v1.addAll(v2);
                        return v1;
                    });

                }
        );
        return newHashMap;
    }
}
