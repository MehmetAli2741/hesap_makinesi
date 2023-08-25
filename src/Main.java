import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1,number2,select;
       System.out.print("Lütfen 1.Sayıyı Giriniz: ");
       number1 = input.nextInt();
       System.out.print("Lütfen 2.Sayıyı giriniz: ");
       number2 = input.nextInt();
       System.out.println("Lütfen Bir İşlem Seçiniz: \n1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
       select = input.nextInt();
       switch (select){
           case 1:
               System.out.println("Toplam: "+ (number1 + number2));
               break;
           case 2:
               System.out.println("Çıkan: " + (number1 - number2));
               break;
           case 3:
               System.out.println("Çarpım: "+ (number1 * number2));
               break;
           case 4:
               if (number2 != 0){
                   System.out.println("Bölüm: " + (number1 / number2));

               }else {
                   System.out.println("Bir Sayı Sıfıra Bölünmez!!!");
                   break;
               }
           default:
               System.out.println("Lütfen Geçerli Bir İşlem Seçiniz: ");
       }
    }
}