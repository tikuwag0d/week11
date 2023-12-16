package ex3;

public class 楕円 implements 面積計算,描画{
    double 半径a;
    double 半径b;

    楕円(double 半径a, double 半径b){
        this.半径a = 半径a;
        this.半径b = 半径b;
    }
    @Override
    public double 面積を計算(){
        return this.半径a * this.半径b * Math.PI;
    }
    @Override
    public void 描画する(){
        System.out.println("O");
    }
    public static void main(String[] args){
        楕円 楕円のもの = new 楕円(2, 3);
        面積計算 面積計算可能なオブジェクト = 楕円のもの;
        System.out.println("楕円の面積");
        System.out.println(面積計算可能なオブジェクト.面積を計算());

        描画 描画可能なオブジェクト = 楕円のもの;
        描画可能なオブジェクト.描画する();
    }
}
