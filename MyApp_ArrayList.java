package basic_study;
import java.util.*;

/**
 * Created by chi on 2017/01/15.
 *
 * 配列と同じようなものなのですが、
 * 配列と違って後から要素を追加したり削除したり
 * することができるので見ていきます。
 * ArrayList を使うには java.util パッケージが
 * 必要なのでこのように import しておいてあげましょう。
 */
public class MyApp_ArrayList {

    public static void main(String[] args) {
//        ジェネリクスで実装している。
        /**
         * ArrayList だけで使えるメソッド
         * はあまり使わないので ArrayList が
         * 実装している List 型のインターフェース
         * で宣言することもよくあります。
         */

//        LinkedListがあります。 X検索。◯追加/削除
        LinkedList<Integer> number = new LinkedList<>();

        number.add(100);

        System.out.println(number.get(0));




//        ArrayList<Integer> sales = new ArrayList<>();
        List<Integer> sales = new ArrayList<>();

        sales.add(10);
        sales.add(20);
        sales.add(30);

//        System.out.println(sales); //[10, 20, 30]

        for (int i=0; i < sales.size(); i++){
            System.out.println(sales.get(i));
        }

//        要素を変更する。
        sales.set(0,100);

//        要素を削除する。
        sales.remove(0);

        System.out.println("もう少しスマートな書き方");
//        別の書き方
        for (Integer sale :sales){
            System.out.println(sale);
        }




    }
}
