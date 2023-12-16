package ex3;

public class 三角形 implements 面積計算, 描画 { //複数のinterfaceをimplements
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

    @Override
    public void 描画する() {
        System.out.println("△");
    }

    public static void main(String[] args) {
        三角形 三角なもの = new 三角形(10, 10);
        面積計算 面積計算可能なオブジェクト = 三角なもの;
        System.out.println(面積計算可能なオブジェクト.面積を計算());

        描画 描画可能なオブジェクト = 三角なもの;
        描画可能なオブジェクト.描画する();
    }
}

