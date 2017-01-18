package basic_study;

/**
 * Created by chi on 2017/01/10.
 */
public class For {
    public static void main(String[] args) {
//        break; 抜ける
//        continue; 続ける

        System.out.println("for文を実行します。");
        for(int i=0; i <10; i++ ){
            if(i == 5){
//                break;
                continue;
            }
            System.out.println(i);
        }
    }
}
