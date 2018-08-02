package uprak1;
import java.util.Scanner;

public class Uprak1 {

    
    public static void main(String[] args) {
        String KA,KB="";
        System.out.println("====================== ");
        System.out.println("Annsa Muti'ah Sandra ");
        System.out.println("SMK TELKOM JAKARTA ");
        System.out.println(" Semester genap 2018 ");
        System.out.println("MASUKAN KATA : ");
        Scanner sc= new Scanner(System.in);
        KA= sc.nextLine();
        KB= new StringBuilder(KA).reverse().toString();
        if(KA.equals(KB))System.out.println("Jumlah Kata " + KA.length() + "\nPalindrome");
        else System.out.println("Jumlah Kata " + KA.length() + "\nNot Palindrome");
    }
}
