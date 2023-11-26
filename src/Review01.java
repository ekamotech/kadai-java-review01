
public class Review01 {

    public static void main(String[] args) {
        // 商品価格
        int price = 1500;

        // 消費税額を計算
        int result = tax(price);

        // 税込価格を計算
        int total = price + result;

        // 計算結果を表示
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + result + "円）です。");
    }

    // 商品価格を受け取り、消費税額を計算するメソッド
    public static int tax(int price) {
        // 税率
        double rate = 0.10;

        // 整数値になるようにキャスト（型変換）する
        int result = (int) (price * rate);

        // 戻り値
        return result;
    }

}
