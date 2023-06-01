import java.util.Scanner;
public class GelismisHesapMakinesi {
    static void Total(){
        Scanner totall=new Scanner(System.in);
        int a,b;
        System.out.print("1. Sayı: ");
        a=totall.nextInt();
        System.out.print("2. Sayı: ");
        b= totall.nextInt();
        int total;
        total=a+b;
        System.out.println("Sonuç: "+total);
    }

    static void Extraction(){
        Scanner extractionn=new Scanner(System.in);
        int a,b;
        System.out.print("1. Sayı: ");
        a=extractionn.nextInt();
        System.out.print("2. Sayı: ");
        b=extractionn.nextInt();
        int extraction;
        extraction=a-b;
        System.out.println("Sonuç: "+extraction);
    }

    static void Multiplication(){
        Scanner multiplicationn=new Scanner(System.in);
        int a,b;
        System.out.print("1. Sayı: ");
        a=multiplicationn.nextInt();
        System.out.print("2. Sayı: ");
        b=multiplicationn.nextInt();
        int multiplication;
        multiplication=a*b;
        System.out.println("Sonuç: "+multiplication);
    }

    static double Division(){
        Scanner divisionn=new Scanner(System.in);
        double a,b;
        System.out.print("1. Sayı: ");
        a=divisionn.nextDouble();
        System.out.print("2. Sayı: ");
        b=divisionn.nextDouble();
        if(b==0){
            System.out.println("Bölen 0 olmamalı!");
            return 0;
        }

        double division;
        division=a/b;
        System.out.println("Sonuç: "+division);
        return division;
    }

    static void Power(){
        Scanner powerr=new Scanner(System.in);
        int a,b,power=1;
        System.out.print("1. Sayı: ");
        a=powerr.nextInt();
        System.out.print("2. Sayı: ");
        b=powerr.nextInt();
        for(int i=1;i<=b;i++){
            power*=a;
        }
        System.out.println("Sonuç: "+power);
    }

    static void Faktoriyel(){
        int a;
        Scanner faktoriyell=new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayı: ");
        a=faktoriyell.nextInt();
        int faktoriyel=1;
        for(int i=1;i<=a;i++){
            faktoriyel*=i;
        }
        System.out.println("Sonuç: "+faktoriyel);
    }

    static void Mod(){
        Scanner modd=new Scanner(System.in);
        System.out.print("1. Sayı: ");
        int a= modd.nextInt();
        System.out.print("2. Sayı: ");
        int b= modd.nextInt();
        int mod=a%b;
        System.out.println("Sonuç: "+mod);
    }

    static void Rectangle(){
        Scanner rectanglee=new Scanner(System.in);
        int a,b;
        System.out.print("Uzun kenar: ");
        a=rectanglee.nextInt();
        System.out.print("Kısa kenar: ");
        b=rectanglee.nextInt();
        int perimeter,area;
        perimeter=2*a+2*b;
        area=a*b;
        System.out.println("Alan: "+area);
        System.out.println("Çevre: "+perimeter);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        byte select;
        String menu = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme işlemi\n"
                + "5. Üslü Sayı Hesaplama\n"
                + "6. Faktoriyel Hesaplama\n"
                + "7. Mod Alma\n"
                + "8. Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0. Çıkış Yap";
        System.out.println(menu);
        while (true) {
            System.out.print("Yapmak istediğiniz işlem: ");
            select=inp.nextByte();
            if (select==0){
                System.out.println("Çıkış yaptınız.");
                break;
            }
            switch (select){
                case 1:
                    Total();
                    break;
                case 2:
                    Extraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Power();
                    break;
                case 6:
                    Faktoriyel();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    Rectangle();
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
            }

        }
    }
}
//Her metodun içerisinde değişken alınması yerine main metodunun içerisinde bir kere alınabilir.
