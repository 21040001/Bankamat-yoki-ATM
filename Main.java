import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s =1;

        while (s<2) {
            atmclass atm = new atmclass();
            Scanner input = new Scanner(System.in);
            System.out.println("Qanday ishlam bajarasiz: pul yechish-1, pul yuklash-2 , hisobdagi pul miqdorini organish-3 ni tiklang");
            int b = input.nextInt();
            int d;
            if (b == 1) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Qancha yechib olmoqchisz iltimos qiymatni kiring ");
                int h = input2.nextInt();
                d = atm.bakiye();
                if (h>d){
                    System.out.println("Hisobingizda yetarlicha mablag' yoqtir");
                }
                atm.chekmek(h);


                System.out.println("Hisobingizdaki qolgan mablag' = " + d);

            }
            if (b >3) {

                System.out.println("Hato ishlam raqamini tanladingiz" );

            }
            if (b == 2) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Qancha yuklamoqchisiz iltimos qiymatni kiring ");
                int q = input3.nextInt();
                atm.yuklash(q);
                d = atm.bakiye();
                System.out.println("Hisobingizdaki qolgan mablag' = " + d);
            }
            if (b == 3) {
                atm.bakiye();
            }
            Scanner im=new Scanner(System.in);
            System.out.println("Boshqa bir amal bajarmoqchimisiz: evet =1 , hayir=2");
            int r = im.nextInt();
            if(r==2){
                s=s+1;
            }
        }
    }
}
