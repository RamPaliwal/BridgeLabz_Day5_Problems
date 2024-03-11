public class LeapYear{
    public static void main(String[] args){
        int year=2000;
        if(String.valueOf(year).length()==4){
            if(year%4==0 && year%100!=0  || year%400==0){
                System.out.print(year+" is a leap year");
            }
            else{
                System.out.print(year+" is not a leap year");
            }
        }
    }
}