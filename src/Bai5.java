import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
    public static void chuyenDoi(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer kq = new StringBuffer();
        String str[]=new String[100];
        int i=1;
        while(st.hasMoreElements()){
            str[i]= st.nextToken();
            i++;
        }
        kq.append(str[3]).append(" ");
        kq.append(str[1]).append(" ");
        kq.append(str[2]).append(" ");
        System.out.println(kq);
    }

    public static void main(String[] args) {
        String str1;
        System.out.println("Nhập họ tên: ");
        str1= new Scanner(System.in).nextLine();
        chuyenDoi(str1);
    }
}
