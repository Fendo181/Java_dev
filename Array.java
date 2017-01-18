package basic_study;

/**
 * Created by chi on 2017/01/11.
 */
public class Array {
    public static void main(String[] args) {
//        配列1
//        ①型[] 変数名
//        ②変数名 = new 型 [データ領域を確保する。]
        String [] salesman;
        salesman = new String[3];

        salesman[0] = "Tanaka";
        salesman[1] = "Yoshida";
        salesman[2] = "Kimnugawa";

        System.out.println(salesman[1]);

//        配列2 最初から初期化を行う
//        ①型[] 変数名
//        ②変数名 = new 型 []{値1,値2,値3}
        int[] sales;
        sales = new int[] {100,200,300};

//       配列3   ※(new 型[]省略系)
//        一番メジャー
//        ①型[] 変数名  = {値、値、値}
        String[] salesman_taijyu2= {"200","300","400"};

//        配列を初期化! 初期化時にもnew が必要となる!
        Integer[] salesman_taijyu = new Integer[3];
        System.out.println("ここから以下は文字列を数値型に変換しています!");

        for(int i=0; i<salesman_taijyu2.length; i++){
//            String 方から数値型へ変換する。
            salesman_taijyu[i]=Integer.valueOf(salesman_taijyu2[i]);
            System.out.println(salesman_taijyu[i]);
        }

    }
}
