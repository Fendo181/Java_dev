package basic_study;
import java.util.Map;
import java.util.Random;

/**
 * Created by chi on 2017/01/15.
 */
public class MyApp_Random {
    public static void main(String[] args) {

        double d = 54.34;

//        小数点以下切り上げ
        System.out.println(Math.ceil(d));
//        切り下げ
        System.out.println(Math.floor(d));
//        四捨五入
        System.out.println(Math.round(d));
//        円周率
        System.out.println(Math.PI);

        /**
         * それから乱数を発生させたい場合には
         * Math クラスにも Math.random() が
         * 用意されていたりするのですが
         * Random クラスを使った方が高速で精度も良いので
         * そちらを使っていきましょう。
         */

        Random m = new Random();

        System.out.println(m.nextDouble()); //0 -1
        System.out.println(m.nextInt(100)); //0-100
        System.out.println(m.nextBoolean());

    }
}
