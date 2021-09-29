// 内部クラス
// 内部クラスとは、その名のとおり、クラスの中にあるクラスのことです。

// クラスAの中に、内部クラスBを持つ例が以下のコードです。
public class A {
    public class B {
    }
}

// 内部クラスではなくても、1ファイルに複数のクラスを持つこともできます。
public class A {

}

class B {

}

//内部クラスの使い方

// staticクラスは、クラス外から直接インスタンス化できる
// 非staticクラスは、外部クラスのインスタンスからのみインスタンス化できる

package inner_class_sample;

public class Outer {
    public class Inner {

    }
}

//このクラスA、Bを、別のクラスCからインスタンス化
public class Example {
    public static void main(String[] args) {
        Outer outer = new Outer();  // クラスOuterをインスタンス化
        Outer.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化
    }
}