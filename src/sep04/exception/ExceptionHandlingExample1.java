package sep04.exception;

public class ExceptionHandlingExample1 {
    public static void printlength(String data){
        int result = data.length();
        System.out.println("문자 수: "+ result);
    }

    public static void main(String[] args){
        System.out.println("[프로그램 시작]\n");
        printlength("ThisIsJava");
        printlength(null);
        System.out.println("[프로그램 종료]");
    }
}
