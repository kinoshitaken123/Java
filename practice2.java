//()の中身を出力せよという命令
System.out.println("Hello world");

class Main {
    public static void main(String[]args){

    }
}

class Main {
  public static void main(String[] args) {
    // 数値の17を出力してください
    System.out.println(17);
    
    // 5に3を足した値を出力してください
      System.out.println(5 + 3);
    
    // 「5 + 3」を文字列として出力してください
       System.out.println("5 + 3");
  }
}

class Main {            
  public static void main(String[] args) {            
    // int型の変数numberを定義してください            
              int number;            
                

    // 変数numberに3を代入してください            
               number = 3;            
                

    // 変数numberを出力してください            
                System.out.println(number);            

    // String型の変数nameを定義してください            
               String name;            
                

    // 変数nameに"Wanko"を代入してください            
                name = "Wanko";            
                

    // 変数nameを出力してください            
                System.out.println(name);            
                

  }            
}

//更新時の注意
int number = 3;
number = 5;

//自己代入
//変数xに3が入っているとき、xの値に2を足して5に上書きしたい場合はどうすればよいでしょうか。
//この場合は、左の図のように変数xと2を足して、また変数xに代入します。不思議な式に見えますが、
//プログラミングでは「=」は代入なので問題はありません。よく使うので覚えておきましょう。
//またこのような代入を自己代入と呼びます

int x = 3;
System.out.println(x);
x = x +2;

System.out.println(x);