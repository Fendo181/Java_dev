package basic_study;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by chi on 2017/01/15.
 *
 *
 */


public class MyApp_LocalDateTime {
    public static void main(String[] args) {
//        現在時刻のインスタンスを取得
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);
        //        特定の日日を取得したい。
        // 2017年1月1日10時10分10秒
        LocalDateTime s = LocalDateTime.of(2017,1,1,10,10,10);
        System.out.println(s);
//        もっと直感的に取得したい。
        LocalDateTime s2 = LocalDateTime.parse("2016-04-03T10:10:10");
        System.out.println(s2);


//        年
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonth().getValue());
//        例えば 2 ヶ月分足して、3 日分引くには
        /**
         *
         * 日時クラスは変更が不可
         * つまりイミュータブルになっています。
         * したがって、ここで色々足し算や引き算をしましたが
         * こちらの d ではオリジナルの日付をまた保持している点に注意しておきましょう。
         */

        System.out.println(d.plusMonths(2).minusMonths(6));

//        好きなフォーマットで出力する。
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!!");
        System.out.println(d.format(dtf));

        /**
         * おわったぁぁぁあ!!
         *
         * 2017/1/15!!!
         *
         */




    }
}
