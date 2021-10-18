package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        List<Integer> sum = new ArrayList<>();
        Iterator firstIterator = firstNumber.iterator();
        Iterator secondIterator = secondNumber.iterator();
        while (firstIterator.hasNext() || secondIterator.hasNext()) {
            if (firstIterator.hasNext() && secondIterator.hasNext()) {
                sum.add((int)firstIterator.next() + (int)secondIterator.next());
            }
            else {
                if (firstIterator.hasNext() && !secondIterator.hasNext()) {
                    sum.add((int) firstIterator.next());
                }
                else {
                    sum.add((int) secondIterator.next());
                }
            }
        }
        int result = 0;
        int ten = 1;
        for (int i = 0; i < sum.size(); i++) {
            result += sum.get(i) * ten;
            ten *= 10;
        }
        return result;
    }
    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List <T> oddList = new ArrayList<T>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0)
                oddList.add(list.get(i));
        }
        return oddList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        List <T> firstLastList = new ArrayList<T>();
        if (!list.isEmpty() && list.size() > 1){
            firstLastList.add(list.get(0));
            firstLastList.add(list.get(list.size()-1));
        }
        else if (list.size() == 1){
            firstLastList.add(list.get(0));
        }
        return firstLastList;
    }
}
