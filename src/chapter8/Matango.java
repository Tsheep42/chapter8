package chapter8;

public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
    public void attack2(){
        System.out.println("お化けキノコの攻撃");
        System.out.println("勇者に5のダメージ");
    }
}
