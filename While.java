package basic_study;

/**
 * Created by chi on 2017/01/10.
 */
public class While {
    public static void main(String[] args) {
        int i =100;
//        一般的なwhile文 (条件判定が先)
//        while(i<10){
//            System.out.println(i);
//            i++;
//        }

//        do while(条件判定が後になる。)
        do{
            System.out.println("必ず一回は実行します"+i);
            i++;
        }while(i < 10);

    }
}
