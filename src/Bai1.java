public class Bai1 {

    public static boolean checkThuanNgich(String s){
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }return true;
    }

    public static void show(){
        int count=0;
        for(int i=100000;i<=999999;i++){
            String s="";
            s+=i;
            if(checkThuanNgich(s)){
                System.out.printf("%10d",i);
                if (count++ %10==0)
                    System.out.println("");
            }
        }
    }


    public static void main(String[] args) {
        show();

    }
}
