import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int tempNumber = number;
        int digitSum = 0;

        while (tempNumber != 0) {
            int basamak = tempNumber % 10; // Son basamağı al
            digitSum += basamak; // Basamağı toplamaya ekle
            tempNumber /= 10; // Bir basamak sağa kaydır
        }

        System.out.println("Basamaklar Toplamı: " + digitSum);
    }
}
