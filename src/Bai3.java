import java.util.Scanner;

public class Bai3 {
    String str;
    public void nhapXau(){
        System.out.println("Nhập xâu: ");
        str= new Scanner(System.in).nextLine();
    }
    public void show() {
        System.out.println(str);
    }

    public void chuanHoa() {
        str=str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String[] temp= str.split(" ");
        str="";
        for(int i=0;i<temp.length;i++) {
            str+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                str+=" ";
        }
    }

    public static void main(String[] args) {
        Bai3 a =new Bai3();
        a.nhapXau();
        a.chuanHoa();
        System.out.println("Xâu sau khi chuẩn hóa: ");
        a.show();
    }
}
