package ex3;

public class 正方形 implements 面積計算,描画{
    double 辺の長さ;
    
    正方形(double 辺の長さ){
        this.辺の長さ = 辺の長さ;
    }
    @Override
    public double 面積を計算(){
        return this.辺の長さ*this.辺の長さ;
    }
    @Override
    public void 描画する(){
        System.out.println("□");
    }
    public static void main(String[] args){
        正方形 四角のもの = new 正方形(10);
        面積計算 面積計算可能なオブジェクト = 四角のもの;
        System.out.println("正方形の面積");
        System.out.println(面積計算可能なオブジェクト.面積を計算());

        描画 描画可能なオブジェクト = 四角のもの;
        描画可能なオブジェクト.描画する();



    }
}
