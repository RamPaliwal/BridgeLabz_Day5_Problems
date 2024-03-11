public class Powerof2{
    public static void main(String args[]){
        int n= Integer.parseInt(args[0]);
        if(n<31){
        for(int i=0;i<=n;i++){
            double pow=Math.pow(2,i);
            if(pow%4==0 && pow%100!=0 || pow%400==0){
            System.out.println(Math.pow(2,i)+" ->Leap year");
            }
            else{
            System.out.println(Math.pow(2,i)+" ->Not a Leap year");
            }
        }
        }
    }
}