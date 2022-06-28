import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] freq = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            freq[i] = 1;

        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    freq[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;

                }
            }
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            if (freq[i] > 1) {
                if (list[i] != 0)
                    System.out.println(list[i] + " sayısı " + freq[i] + " kere tekrar edildi.");
            }
        }
    }
}