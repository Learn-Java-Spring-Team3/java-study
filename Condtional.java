public class Condtional {

    public static void main(String[] args) {

        int a = 1;
        int b = 100;

//        if (a == b){
//            System.out.println("a == b");
//        } else{
//            System.out.println("else block");
//        }
        // 다중 조건의 경우 조건을 만족하는 최초의 분기만 실행!
        if (a == b){
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else if (a <=b) {
            System.out.println("a <=b ");
        }
        {
            System.out.println("else");
        }

        int c = 10;

        switch (c + 1){

            case 9:
                System.out.println("c + 1 == 9");
                break;
            case 10:
                System.out.println("c + 1 == 10");
                break;
            case 11:
                System.out.println("c + 1 == 11");
                break;
            default:
                System.out.println("default");
        }


    }
}
