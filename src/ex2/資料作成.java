package ex2;

public class 資料作成 implements 業務指示{
    String テーマ;

    資料作成(String テーマ){
        this.テーマ = テーマ;
    }
    @Override
    public void 実行させる(部下 作業者){
        作業者.説明する(テーマ + "の文書を作成した");
    }
}
