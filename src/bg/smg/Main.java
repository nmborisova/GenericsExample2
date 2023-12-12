package bg.smg;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Output:[1, 2, 3, 4, 5, 8, 7, 10]
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 8, 10);
        System.out.println("List of numbers:");
        System.out.println(nums1);
        System.out.println(nums2);
        List<Integer> mergedNumbers = MergeTwoLists.mergeLists(nums1, nums2);
        System.out.println("\nMerged Numbers: " + mergedNumbers);

        // Output:[Red, White, Green, Black, Blue, Orange, Pink]
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
        System.out.println("\nList of colors:");
        System.out.println(colors1);
        System.out.println(colors2);
        List<String> mergedWords = MergeTwoLists.mergeLists(colors1, colors2);
        System.out.println("Merged Colors: " + mergedWords);
    }
}
