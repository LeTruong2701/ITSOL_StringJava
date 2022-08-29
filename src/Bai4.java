import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    public static void xauMax(String s){
        StringTokenizer strToken= new StringTokenizer(s,",\t,\r");
        int max,i=1,dodaixau;
        max= strToken.nextToken().length();
        int vitri=i;
        while ((strToken.hasMoreTokens())){
            dodaixau=strToken.nextToken().length();
            i++;
            if(max<dodaixau){
                max=dodaixau;
                vitri=i;
            }
        }
        System.out.println("Độ dài xâu lớn nhất là:" +max+" vị trí thứ "+vitri);

    }

    public static void main(String[] args) {
        Bai4 bt4= new Bai4();
        System.out.println("Nhâp xâu: ");
        String xau= new Scanner(System.in).nextLine();
        bt4.xauMax(xau);
    }
}
