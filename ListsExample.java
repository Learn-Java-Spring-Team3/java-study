import java.util.ArrayList;

public class ListsExample {

    public static void main(String[] args) {

        // Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList list = new ArrayList(10);
        list.add(100);
        list.add("INFP");
        // ArrayList의 자료형을 명시하지 않은 경우 여러 자료형을 입력 가능

        ArrayList<Integer> list_A = new ArrayList<>(10); // 자료형 명시할 경우 객체타입 작성

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
