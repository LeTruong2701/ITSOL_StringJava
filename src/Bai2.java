
import java.util.Scanner;

public class Bai2{

    public static void xenKe(String str) {
        char[] ch = str.toCharArray();
        String B[] = new String[500];
        for(int i=0; i<ch.length; i++) {
            B[i] = String.valueOf(ch[i]);
        }
        for(int i=0; i<ch.length; i++) {
            if(i%2 == 0) {
                B[i] = B[i].toUpperCase();
            }else {
                B[i] = B[i].toLowerCase();
            }
        }
        for(int i=0; i<ch.length; i++) {
            System.out.print(B[i]);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String str = input.nextLine();
        xenKe(str);
    }
}
