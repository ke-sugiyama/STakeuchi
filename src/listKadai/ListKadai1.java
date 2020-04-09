package listKadai;

import java.util.ArrayList;

public class ListKadai1 {
	public static void main(String[] args ){

		// 変数宣言
		ArrayList<String> stringList = new ArrayList<String>();

		// 文字列の追加
		stringList.add("ジャイアンツ");
		stringList.add("ベイスターズ");
		stringList.add("タイガース");
		stringList.add("カープ");
		stringList.add("ドラゴンズ");
		stringList.add("スワローズ");

		// 配列の値を出力
		System.out.println("1個目 : " + stringList.get(0));
		System.out.println("2個目 : " + stringList.get(1));
		System.out.println("3個目 : " + stringList.get(2));
		System.out.println("4個目 : " + stringList.get(3));
		System.out.println("5個目 : " + stringList.get(4));
		System.out.println("6個目 : " + stringList.get(5));
		System.out.println("");

		// ４個目の文字列を削除
		stringList.remove(3);

		// 値の出力
		System.out.println("4個目の文字列削除後");
		System.out.println("1個目 : " + stringList.get(0));
		System.out.println("2個目 : " + stringList.get(1));
		System.out.println("3個目 : " + stringList.get(2));
		System.out.println("4個目 : " + stringList.get(3));
		System.out.println("5個目 : " + stringList.get(4));
		System.out.println("");

		// ベイスターズを削除
		stringList.remove("ベイスターズ");

		// 値の出力
		System.out.println("文字列ベイスターズ削除後");
		System.out.println("1個目 : " + stringList.get(0));
		System.out.println("2個目 : " + stringList.get(1));
		System.out.println("3個目 : " + stringList.get(2));
		System.out.println("4個目 : " + stringList.get(3));







		// "ジャイアンツ", "ベイスターズ", "タイガース", "カープ", "ドラゴンズ", "スワローズ"

}
}