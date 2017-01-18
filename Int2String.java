package basic_study;

/**
 * Created by chi on 2017/01/10.
 */
public class Int2String {
    public static void main(String[] args) {
        System.out.println("文字列の変換。");

//        int型からString方
        int num = 10+2;
        System.out.println(num);
        String str = String.valueOf(num);
        System.out.println(str);
    }
}
