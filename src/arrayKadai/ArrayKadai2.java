package arrayKadai;

import java.util.Arrays;
import java.util.Collections;

public class ArrayKadai2 {
	public static void main (String[] args) {

		// 変数宣言
		int[] numberArray = new int[5];
		numberArray[0] = 1;
		numberArray[1] = 5;
		numberArray[2] = 11;
		numberArray[3] = 3;
		numberArray[4] = 7;

		// 配列の値を出力
		System.out.println("1個目 : " + numberArray[0]);
		System.out.println("2個目 : " + numberArray[1]);
		System.out.println("3個目 : " + numberArray[2]);
		System.out.println("4個目 : " + numberArray[3]);
		System.out.println("5個目 : " + numberArray[4]);
		System.out.println("");

		// 配列の要素数を出力
		System.out.println("numberArrayの要素数 : " + numberArray.length);
		System.out.println("");

		// 要素を昇順に並び替え
		System.out.println("numberArrayの昇順");

		Arrays.sort(numberArray);
			System.out.println("1個目 : " + numberArray[0]);
			System.out.println("2個目 : " + numberArray[1]);
			System.out.println("3個目 : " + numberArray[2]);
			System.out.println("4個目 : " + numberArray[3]);
			System.out.println("5個目 : " + numberArray[4]);
			System.out.println("");

		// 要素を降順に並べ替え
		System.out.println("numberArrayの降順");

		Integer[] a = {1, 5, 11, 3, 7};
		a[0] = 1;
		a[1] = 5;
		a[2] = 11;
		a[3] = 3;
		a[4] = 7;


		Arrays.sort(a,Collections.reverseOrder());


		System.out.println("1個目 : " + a[0]);
		System.out.println("2個目 : " + a[1]);
		System.out.println("3個目 : " + a[2]);
		System.out.println("4個目 : " + a[3]);
		System.out.println("5個目 : " + a[4]);


	}
	}

