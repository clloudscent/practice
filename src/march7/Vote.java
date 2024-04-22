package march7;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //가고싶은 여행지 투표
        //input
        //오사카 홍길동
        //제주도 둘리
        //뉴욕 임꺽정
        //제주도 짱구
        //제주도 철수
        //오사카 유리
        //output
        //1위. 제주도 3명 (둘리, 짱구, 철수)
        //2위. 오사카 2명 (홍길동, 유리)
        //3위. 뉴욕 1명 (임꺽정)

        Map<String, String> inputMap = new HashMap<>();
        for(int i=0; i<6; i++){
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("가고싶은 도시: ");
            String city = sc.nextLine();
            inputMap.put(name, city);
        }

        for(String currentName : inputMap.keySet()){
            System.out.println("이름: "+currentName);
            System.out.println("도시: "+inputMap.get(currentName));
        }

        Map<String, VoterVO> sortedMap = new HashMap<>();
        for(String currentName : inputMap.keySet()){
            String currentCity = inputMap.get(currentName);
            if(!sortedMap.containsKey(currentCity)){
                VoterVO voterVO = new VoterVO();
                voterVO.setCount(1);
                voterVO.getNameList().add(currentName);
                voterVO.setCity(currentCity);
                sortedMap.put(currentCity, voterVO);
            }else{
                //count 1증가
                //이름추가
                sortedMap.get(currentCity).setCount(sortedMap.get(currentCity).getCount()+1);
                sortedMap.get(currentCity).getNameList().add(currentName);
            }
        }
        for(String currentCity : sortedMap.keySet()){
            System.out.println("도시: "+currentCity);
            System.out.println("이름: "+sortedMap.get(currentCity));
            System.out.println("count: "+sortedMap.get(currentCity).getCount());
        }


        //sortedList 리스트를 이용해서 정렬하기
        List<VoterVO> sortedList = new ArrayList<>();
        for(String currentCity : sortedMap.keySet()){
            //VoterVO 타입의 value 값을 리스트에 넣는다.
            sortedList.add(sortedMap.get(currentCity));
        }

        for(int i=0; i<sortedList.size()-1; i++){
            for(int j=i+1; j<sortedList.size(); j++){
                if(sortedList.get(i).getCount()<sortedList.get(j).getCount()){
                    VoterVO temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, temp);
                }
            }
        }
        int rank =0;
        for(int i=0; i<sortedList.size(); i++){
            rank++;
            System.out.print(rank+"위. "+sortedList.get(i).getCity()+" "+sortedList.get(i).getCount()+"명 "+sortedList.get(i).getNameList());
            System.out.println(" ");
        }
    }


    public static Map<String, String> makeInputMap(){
        Scanner sc = new Scanner(System.in);
        //가고싶은 여행지 투표
        //input
        //오사카 홍길동
        //제주도 둘리
        //뉴욕 임꺽정
        //제주도 짱구
        //제주도 철수
        //오사카 유리
        //output
        //1위. 제주도 3명 (둘리, 짱구, 철수)
        //2위. 오사카 2명 (홍길동, 유리)
        //3위. 뉴욕 1명 (임꺽정)

        Map<String, String> inputMap = new HashMap<>();
        for(int i=0; i<6; i++){
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("가고싶은 도시: ");
            String city = sc.nextLine();
            inputMap.put(name, city);
        }
        return inputMap;
    }
}
