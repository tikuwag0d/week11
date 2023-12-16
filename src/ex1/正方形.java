package ex1;

public class 正方形 implements 面積計算{
    double 辺の長さ;
    
    正方形(double 辺の長さ){
        this.辺の長さ = 辺の長さ;
    }
    @Override
    public double 面積を計算(){
        return this.辺の長さ*this.辺の長さ;
    }
    public static void main(String[] args){
        面積計算 四角のもの = new 正方形(10);
        System.out.println("正方形の面積");
        System.out.println(四角のもの.面積を計算());
    }
}
