package _15_Exceptions;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        randomSayi();
    }

    private static void randomSayi() {
        int sayi1 = (int) (Math.random() * 10);
        int sayi2 = (int) (Math.random() * 10);

        int toplam=sayi1+sayi2;

        if (toplam<12){
            throw new IllegalArgumentException("Sayı 12'den küçük ise hata verir");
        }else System.out.println("toplam = " + toplam);




    }
}
