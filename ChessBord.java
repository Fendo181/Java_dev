package basic_study;

/**
 * Created by chi on 2017/01/10.

 /*        アルゴリズムは
 (0.0)は黒,
 (1.1.)は黒
 (0,2)は黒

 座標を足し算して下さい。

 x+y = 0
 x+y = 2
 x+y = 4


 つまりは2の余りが0の時に黒
 */


public class ChessBord {
    public static void main(String[] args) {
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("■ ");
                } else {
                    System.out.print("□ ");
                }
            }
            System.out.println();
        }
    }
}
