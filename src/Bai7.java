import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        String s1= new String();
        String s2= new String();
        Scanner in= new Scanner(System.in);
        System.out.println("Nhập xâu s1: ");
        s1=in.nextLine();
        System.out.println("Nhập xâu s2: ");
        s2= in.nextLine();
        int n=s2.length();
        String s= new String();
        String kt= new String();
        System.out.println("Những vị trí của s2 trong s1 : ");
        for(int i=0;i<s1.length()-n+1;i++){
            kt=s1.substring(i, i+n);
            if(kt.equals(s2)) System.out.print(i+"   ");

        }
        System.out.println("");

        s1= s1.replaceAll(s2, s);

        System.out.println("Xâu s1 sau khi xóa sâu s2 : ");
        System.out.println(s1);
    }
}
