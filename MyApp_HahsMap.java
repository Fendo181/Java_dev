package basic_study;
import java.util.*;

/**
 * Created by chi on 2017/01/15.
 *
 * これも複数データを管理するためのものですが
 * key と value でデータを管理していきます
 *
 * Hashではデータの順番が不定
 * TreeMap では key の順番
 * LinkedHashMap ではデータが追加された順番
 でデータが保持されるので違いを覚えておくといいでしょう
 */
public class MyApp_HahsMap {
    public static void main(String[] args) {
//        <Key,型>を宣言する。
        HashMap<String,Integer> sales = new HashMap<>();

        sales.put("tom",10);
        sales.put("bob",20);
        sales.put("Terry",30);

//        要素の取得
        System.out.println(sales.get("tom")); //keyは"tom"でvalueが10
//        要素数の個数
        System.out.println(sales.size()); //3

//        全ての要素を取得する。
        for(Map.Entry<String,Integer> sale : sales.entrySet()){
            System.out.println(sale.getKey()+":"+sale.getValue());
        }

//        値の更新
        sales.put("tom",100);
//        値の削除
        sales.remove("bob");

        for(Map.Entry<String,Integer> sale : sales.entrySet()){
            System.out.println(sale.getKey()+":"+sale.getValue());
        }








    }
}
