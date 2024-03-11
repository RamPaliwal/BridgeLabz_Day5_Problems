public class Harmonic{
    public static void main(String[] args){
        int n=5;float harmonic = 0;
        for(float i=1;i<=n;i++){
            harmonic = harmonic + (1/i);
        }
        System.out.println(harmonic);
    }
}