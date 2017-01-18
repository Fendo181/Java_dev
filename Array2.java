package basic_study;

/**
 * Created by chi on 2017/01/11.
 */
public class Array2 {
    public static void main(String[] args) {
//        配列をまとめて初期化2
        int[] sales = {400,500,600};
        for(int i=0;i<sales.length;i++){
            System.out.println(sales[i]);
        }
//       更にforを使った綺麗な書き方がある
//       for(型名　変数単数名:変数複数名 = 宣言した変数名)
//       salesの配列から1つずつ取り出して、int型のsalesに代入しないさ


        String[] salesmans = {"tanaka","Endo","Sushiyama"};
        for (String salesman:salesmans){
            System.out.println(salesman);
        }
        /** 配列やクラスとか行った参照型の解説
         * 基本データ型(int,short.boolean,char)の変数には値そのものが、
         * 参照データ型(String,int[] a,etc)の変数には、メモリ領域の
         * 番地が入るということを覚えておいてください
         *
         */
    }
}
