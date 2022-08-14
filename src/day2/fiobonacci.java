package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fiobonacci {
/*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34...
     */


    public static void main(String[] args) {
        List<Integer> fibonaccilist=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        fibonaccilist.add(0);
        fibonaccilist.add(1);
        System.out.println("fibonacci liste"+ fibonaccilist);

        int i=1;// bu i yi while sartını olusturmak ıcın kullandık

        if (sayi<=1){
            System.out.println("daha buyuk sayılar girin");
        }else {
            while (fibonaccilist.get(i)<sayi) {// fibonacci elemanları  sayidan kucuk oldugu surece

                fibonaccilist.add(fibonaccilist.get(i)+fibonaccilist.get(i-1));// bir onceki elemanı yanındakı ıle toplar
                i++;

            }
            System.out.println("fibonacci list"+ fibonaccilist);//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34] 34 u yok etmem lazım

        }
        int sonIndexdekiEleman=fibonaccilist.size()-1;
        if (fibonaccilist.get(sonIndexdekiEleman)>sayi){/* fibonacci listesine git son ındexteki eleman sayidan buyukse sil*/
            fibonaccilist.remove(sonIndexdekiEleman);/* burası son elemanı sıler*/

            System.out.println("girdiğin sayi fıbonacci lıstesı ıcınde bulunmamaktadır = "+
                    "sizin girdiğiniz sayiya kadar kı fibonacci dızısı budur  " + fibonaccilist);
        }else {
            System.out.println("senin girdigin sayi fibonacci listinde var fibonacciList = " + fibonaccilist);
        }
    }

}
