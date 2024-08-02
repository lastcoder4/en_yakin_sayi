import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumbers {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("lütfen bır sayı gırınız: ");
        Scanner inp = new Scanner(System.in);
        int target = inp.nextInt();
        Arrays.sort(numbers);

        Integer closestSmaller = null;
        Integer closestLarger = null;

        for (int num : numbers) {
            if (num < target) {
                closestSmaller = num;
            } else if (num > target) {
                closestLarger = num;
                break;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(numbers));
        System.out.println("Girilen Sayı: " + target);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}
