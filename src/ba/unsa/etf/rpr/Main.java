package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for(int i=1; i<n; i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }
    public static int sumaCifara(int n){
        int sumaCifara=0;
        while(n!=0){
            sumaCifara+=n%10;
            n/=10;
        }
        return sumaCifara;
    }
}

