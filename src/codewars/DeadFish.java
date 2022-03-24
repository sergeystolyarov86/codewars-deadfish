package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a simple parser that will parse and run Deadfish.
 * <p>
 * Deadfish has 4 commands, each 1 character long:
 * <p>
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 * <p>
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */


public class DeadFish {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdosodddddiso")));
    }

    public static int[] parse(String data) {
        char[] dataChar = data.toCharArray();
        List<Integer> list = new ArrayList<>();
        int val = 0;
        for (char c : dataChar) {
            switch (c) {
                case 'i':
                    val++;
                    break;
                case 'd':
                    val--;
                    break;
                case 's':
                    val = val * val;
                    break;
                case 'o':
                    list.add(val);
                default:
                    break;
            }
        }return list.stream().mapToInt(i -> i).toArray();
    }
}

