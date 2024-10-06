import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sasha_and_array {
//Sasha found an array a consisting of n integers and asked you to paint elements.You have to paint
// each element of the array. You can use as many colors as you want, but each element should be painted into
// exactly one color, and for each color, there should be at least one element of that color.
//The cost of one color is the value of max(S)−min(S) where S is the sequence of elements of that color.
// The cost of the whole coloring is the sum of costs over all colors.
//For example, suppose you have an array a=[1,5,6,3,4]
//, and you painted its elements into two colors as follows: elements on positions 1, 2 and 5 have color 1; elements on positions 3 and 4 have color 2
//. Then: the cost of the color 1 is max([1,5,4])−min([1,5,4])=5−1=4 the cost of the color 2 is max([6,3])−min([6,3])=6−3=3
//the total cost of the coloring is 7  For the given array a you have to calculate the maximum possible cost of the coloring.
    public static int minTotalColoringCost(int[] a) {
        int n = a.length;

        Map<Integer, List<Integer>> colors = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int color = a[i];

            if (!colors.containsKey(color)) {
                colors.put(color, new ArrayList<>());
            }

            colors.get(color).add(a[i]);
        }

        int totalCost = 0;

        for (List<Integer> color : colors.values()) {
            int colorCost = max(color) - min(color);
            totalCost += colorCost;
        }

        return totalCost;
    }

    private static int max(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 3, 4};
        int cost = minTotalColoringCost(a);
        System.out.println("Total cost: " + cost);
    }
}