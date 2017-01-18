package basic_study;

/**
 * Created by chi on 2017/01/11.
 *  1 つのソースファイルにつき public なクラスは 1 つしか持てないので User2 クラスは何も付けずに
 *  package private にしてあげます。
 *
 *
 */

/**
 *
 * 同じパッケージ内で同じクラス名を使ってはいけない!
 */

class UserClass{
    private String name;
    private int score;

//    コンストラクタ
    public UserClass(String name,int score){
        this.name = name;
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
//        クラス内のscoreに外部からのscoreを入れる
//        マイナスの値がきたらErroを標示する。
        if(score > 0) {
            this.score = score;
        }else{
            System.out.println("マイナス値は受付けていません!");
        }
    }
}
public class MyAppSetGet {

    public static void main(String[] args) {
        UserClass tom = new UserClass("tom",65);
        System.out.println(tom.getScore());
        tom.setScore(85);
        System.out.println(tom.getScore());
        tom.setScore(-10);;


    }
}
