package abc;

import java.util.Scanner;

public class Silahçı {

    private static Silahlar silah;

    public static void main(String[] args) {

        System.out.println("Ammunation Store'a Hoşgeldiniz");

        System.out.print(" 1-Assault Rifle \n ");
        System.out.println("     1-AK47 ");
        System.out.println("     2-AUG A3 ");
        System.out.println("     3-M16A4 ");
        System.out.println("     4-Geri \n");

        System.out.println(" 2-DMR ");
        System.out.println("     1-SKS ");
        System.out.println("     2-SLR ");
        System.out.println("     3-QBU ");
        System.out.println("     4-Geri \n");

        System.out.println(" 3-Shotgun ");
        System.out.println("     1-S12K ");
        System.out.println("    2-Geri \n");

        System.out.println(" 4-SMG ");
        System.out.println("    1-Micro Uzi ");
        System.out.println("    2-UMP45 ");
        System.out.println("    3-Vector  ");
        System.out.println("     4-Geri \n");

        System.out.println(" 5-Handgun ");
        System.out.println("    1-P1911 ");
        System.out.println("    2-P92 ");
        System.out.println("    3-R1895 ");
        System.out.println("     4-Geri \n");
        System.out.println(" 6-Çıkış ");

        System.out.println("Lütfen Kategori Seçiniz...");

                
        while (0 == 0) {

            
                
            
            Scanner giris = new Scanner(System.in);

            int secim, secim1;

            secim = giris.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Assault Rifle klasmanı silahlar");
                     {
                        Scanner giris1 = new Scanner(System.in);

                        secim1 = giris1.nextInt();
                        switch (secim1) {
                            case 1:
                                System.out.println("AK47");
                                 
                                break;
                            case 2:
                                System.out.println("AUG A3");
                                break;
                            case 3:
                                System.out.println("M16A4");
                                break;
                            case 4:
                                System.out.println("Geri");
                                break;
                            default:
                                System.out.println("Hatalı Tuşlama yaptınız");
                                break;

                        }

                    }
                    break;

                case 2:
                    System.out.println("DMR klasmanı silahlar");

                    Scanner giris1 = new Scanner(System.in);

                    secim1 = giris1.nextInt();

                    switch (secim1) {
                        case 1:
                            System.out.println("SKS");
                            break;
                        case 2:
                            System.out.println("SLR");
                            break;
                        case 3:
                            System.out.println("QBU");
                            break;
                        case 4:
                            System.out.println("Geri");
                            break;
                        default:
                            System.out.println("Hatalı Tuşlama yaptınız");
                            break;

                    }
                    break;

                case 3:
                    System.out.println("Shotgun klasmanı silahlar");

                    giris1 = new Scanner(System.in);

                    secim1 = giris1.nextInt();

                    switch (secim1) {
                        case 1:
                            System.out.println("S12K");
                            break;
                        case 2:
                            System.out.println("Geri");
                            break;
                        default:
                            System.out.println("Hatalı Tuşlama Yaptınız");
                            break;

                    }
                    break;
                case 4:
                    System.out.println("SMG klasmanı silahlar");

                    giris1 = new Scanner(System.in);

                    secim1 = giris1.nextInt();

                    switch (secim1) {
                        case 1:
                            System.out.println("Micro Uzi");
                            break;
                        case 2:
                            System.out.println("UMP45");
                            break;
                        case 3:
                            System.out.println("Vector");
                            break;
                        case 4:
                            System.out.println("Geri");
                            break;
                        default:
                            System.out.println("Hatalı Tuşlama Yaptınız");

                    }

                    break;
                case 5:
                    System.out.println("Handgun klasmanı silahlar");
                    giris1 = new Scanner(System.in);

                    secim1 = giris1.nextInt();
                    switch (secim1) {
                        case 1:
                            System.out.println("P1911");
                            break;
                        case 2:
                            System.out.println("P92");
                            break;
                        case 3:
                            System.out.println("R1895");
                            break;
                        case 4:
                            System.out.println("Geri");
                            break;
                        default:
                            System.out.println("Hatalı Tuşlama Yaptınız");
                            break;

                    }

                    break;
                default:
                    System.out.println("Hoşçakalın... :)");
                    break;
            }
        }
    }
}
