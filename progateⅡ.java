//xとyが等しい時true
//xとyが等しくない時false
x == y

//xとyが等しくない時true

//xとyが等しい時false
x != y

System.out.println(true);

System.out.println(false);

//false
System.out.println(6 + 2 == 5);

//true
System.out.println(6 + 2 != 5);

class Main {
    public static void main(String[] args) {
      // 「true」を用いて、「真」を表す真偽値を出力してください
      System.out.println(true);
      
      // 「false」を用いて、「偽」を表す真偽値を出力してください
      System.out.println(false);
      
      // 「==」を用いて、値を比較した結果を出力してください
      System.out.println(12 / 4 == 3);
      
      // 「!=」を用いて、値を比較した結果を出力してください
      System.out.println(12 / 4 != 3);
      
      // 変数を定義し、値を比較した結果を代入してください
      boolean bool = 3 * 9 == 27;
      
      // 変数boolの値を出力してください
      System.out.println(bool);
      
    }
  }

  class Main {
    public static void main(String[] args) {
      // 8と5を比較し、falseとなるようにしてください
      System.out.println(8 < 5);
      
      // 3と2を比較し、trueとなるようにしてください
      System.out.println(3 >= 2);
      
    }
  }

 // 〜でない
//!を用いると、「〜でない」を表現できます。
//例えば、!(x >= 30)は「xが30以上でない（つまり30より小さい）」ときtrueになり、
//「xが30以上」のときfalseになります。

!(x >= 30)

class Main {
    public static void main(String[] args) {
      // trueと出力されるようにしてください
      System.out.println(true || false);
      
      // falseと出力されるようにしてください
      System.out.println(false && true);
      
      // 「8 < 5」かつ「3 >= 2」の結果を出力してください
      System.out.println(8 < 5 && 3 >= 2);
      
      // 「8 < 5」または「3 >= 2」の結果を出力してください
      System.out.println(8 < 5 || 3 >= 2);
      
      // 「8 < 5」でない、の結果を出力してください
      System.out.println(!(8 < 5));
      
    }
  }

//if文
if(条件式){
  処理;
}