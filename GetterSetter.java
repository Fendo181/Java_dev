package basic_study;

/**
 * Created by chi on 2017/01/11.
 */
class GeneGetterSetter{
    private int date;

//ゲッター=>フィールドの値を取得する。
    public int getData()
    {
        return date;
    }

//  セッター =>フィールドの値をセットする。
    public void setData(int param)
    {
        date = param;

    }

}

public class GetterSetter {
    public static void main(String[] args) {
        GeneGetterSetter ref = new GeneGetterSetter();

        // Setterを使って数値を入れます。
        ref.setData( 200 );
        // Getterを使って数値を取り出します。
        int i = ref.getData();

        System.out.println( i );

    }

}
