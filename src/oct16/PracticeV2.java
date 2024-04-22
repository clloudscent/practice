package oct16;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeV2 {
    public static void main(String[] args) {
        //3명의 학생정보를 입력하기
        Scanner sc = new Scanner(System.in);

        ArrayList<StudentTemp> stdList = new ArrayList<>();
        for(int i =0; i < 3; i++){
            StudentTemp std = new StudentTemp();
            System.out.println("이름: ");
            std.name = sc.nextLine();
            System.out.println("학번: ");
            std.id = sc.nextInt();
            sc.nextLine();
            System.out.println(i+1+"명의 학생 입력완료");
            stdList.add(std);
        }

        //사용자로부터 학번을 입력받기
        System.out.println("학번을 입력해주세요:");
        int inputId = sc.nextInt();

        System.out.println("ListSize:"+stdList.size());


        //해당 학번의 학생 이름을 출력하기
        for(int i =0; i<stdList.size(); i++){
            if(stdList.get(i).id==inputId){
                System.out.println("현재이름: "+stdList.get(i).name);
                System.out.println("수정할이름: ");
                sc.nextLine();
                String changedName = sc.nextLine();
                stdList.get(i).name = changedName;
                System.out.println(changedName+"으로 변경완료");
            }
        }

        for(int i =0; i<stdList.size(); i++){
            System.out.println(stdList.get(i).name);
            System.out.println(stdList.get(i).id);

        }
    }
}
