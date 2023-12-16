package ex1;
public class 三角形 implements 面積計算 {
    double 底辺;
    double 高さ;

    三角形(double 底辺, double 高さ) {
        this.底辺 = 底辺;
        this.高さ = 高さ;
    }
    @Override
    public double 面積を計算() {
        return this.底辺 * this.高さ / 2;
    }

    public static void main(String[] args) {
        面積計算 三角なもの = new 三角形(10, 10); //「面積を計算できる」型に代入できる
        System.out.print("三角形の面積：");
        System.out.println(三角なもの.面積を計算());    
        //「面積計算」型はメソッド「面積を計算」が利用可能であるを示している．
    }
}
