package ex1;

public class 楕円 implements 面積計算{
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
    public static void main(String[] args){
        面積計算 楕円のもの =new 楕円(1, 02);
        System.out.println("楕円の面積");
        System.out.println(楕円のもの.面積を計算());
    }
}
