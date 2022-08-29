import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    public static void sapXep(String s){
        StringTokenizer st= new StringTokenizer(s);
        ArrayList<String> arr= new ArrayList<>();
        int n= st.countTokens();
        int i=0;
        while(st.hasMoreTokens()){
            String st2=st.nextToken();
            arr.add(st2);

        }
        Collections.sort(arr);
        System.out.println(arr.toString());
    }
    public static void main(String[] args) {
        String str;
        Scanner in= new Scanner(System.in);
        System.out.println("Nhập xâu: ");
        str= in.nextLine();
        sapXep(str);
    }
}
