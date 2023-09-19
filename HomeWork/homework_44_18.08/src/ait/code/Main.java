package ait.code;
/*
Дан List<Integer>. Написать метод, который определит, есть ли в этом списке такая пара чисел, которая в сумме дает заданное число N.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-2, 10, 4, 2, 6, -5, 8, 3, -7, 0);

        System.out.println(list);
        System.out.println(sumOfNum4(list, 9));

    }

    // option 1
    public static List<Integer> sumOfNum1(List<Integer> nums, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                int sum = nums.get(i) + nums.get(j);
                if (sum == n) {
                    result.add(nums.get(i));
                    result.add(nums.get(j));
                    return result;
                }
            }
        }
        return result;
    }

    // option 2
    public static List<Integer> sumOfNum2(List<Integer> nums, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int numberToFind = n - nums.get(i);
            if (set.contains(numberToFind)) {
                set.add(nums.get(i));
                return new ArrayList<>();
            }
            set.add(nums.get(i));
        }
        return new ArrayList<>(0);
    }

    // option 3
    public static List<Integer> sumOfNum3(List<Integer> nums, int n) {
        Collections.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int numberToFind = n - nums.get(i);
            int leftEnd = i + 1;
            int rightEnd = nums.size() - 1;
            while (leftEnd < rightEnd) {
                int mid = leftEnd + (rightEnd - leftEnd) / 2;
                if (nums.get(mid) == numberToFind) {
                    result.add(nums.get(i));
                }
                if (numberToFind < nums.get(mid)) {
                    rightEnd = mid - 1;
                } else {
                    leftEnd = mid + 1;
                }
            }
        }
        return result;
    }

    // option 4
    public static List<Integer> sumOfNum4(List<Integer> nums, int n) {
        Collections.sort(nums);
        List<Integer> result = new ArrayList<>();
        int leftEnd = 0;
        int rightEnd = nums.size() - 1;
        while (leftEnd < rightEnd) {
            int sum = nums.get(leftEnd) + nums.get(rightEnd);
            if (sum == n) {
                result.add(nums.get(leftEnd));
                result.add(nums.get(rightEnd));
            }
            if (sum < n) {
                leftEnd++;
            } else {
                rightEnd--;
            }
        }
        return result;
    }
}
