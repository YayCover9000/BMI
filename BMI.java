import java.util.Scanner;
public class BMI {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int KG = sc.nextInt();
        float KGROE = sc.nextFloat();
        //int KG = 75;
        //float KGROE = 1.8f;
        float KS;
        String res;
        int KSA;
        float ZKSB;
        float ZZKSB;
        int ZZZKSB;
        
        KS = KGROE * KGROE;
        KS = KG/KS;
        System.out.println("1. " + KS);
        KSA = (int)KS;
        System.out.println("2. " + KSA);

        ZKSB = (KS-KSA);
        System.out.println("3. " + ZKSB);
        
        ZZKSB = ZKSB * 10;
        System.out.println("4. " + ZZKSB);
        
        ZZZKSB = (int)Math.round(ZZKSB);
        System.out.println("5. " + ZZZKSB);
        
        res = KSA + "," + ZZZKSB;

        
        System.out.println("Koerpergewicht: "+KG+" kg\nKoerpergroesse: "+KGROE+" m\nDer BMI betraegt: "+res);
        sc.close();
    }
}
