package jun20;

public class Practice3 {
    public static void main(String[] args) {
        //4x+5y=60
        for(int x =1; x<=10; x++){
            for(int y =1; y<=10; y++){
                if(4*x+5*y==60){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
