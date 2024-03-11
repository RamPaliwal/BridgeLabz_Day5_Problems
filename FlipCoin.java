public class FlipCoin{
    void Flip(){
        if(Math.random()<0.5){
            System.out.print("Tail");
        }
        else{
            System.out.print("Head");
        }
    }
    public static void main(String[] args){
        FlipCoin fp=new FlipCoin();
        fp.Flip();
    }
}