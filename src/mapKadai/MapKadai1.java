package mapKadai;

import java.util.HashMap;
import java.util.Map;

public class MapKadai1 {
	public static void main (String[] args ) {

		// 変数宣言
		Map<String, String> stringMap = new HashMap<String, String>();

		// 値の設定
		stringMap.put("北海道" , "札幌市");
		stringMap.put("宮城県" , "仙台市");
		stringMap.put("島根県" , "松江市");

		// 値の出力
		System.out.println("keyが北海道のときのvalueは" + stringMap.get("北海道"));
		System.out.println("keyが宮城県のときのvalueは" + stringMap.get("宮城県"));
		System.out.println("keyが島根県のときのvalueは" + stringMap.get("島根県"));
		System.out.println("");

		// keyに北海道と沖縄県が含まれているかを判定
		boolean contains1 = stringMap.containsKey("北海道");
		boolean contains2 = stringMap.containsKey("沖縄県");

		// 出力
		System.out.println("key=北海道は" + contains1);
		System.out.println("key=沖縄県は" + contains2);
		System.out.println("");

		// keyに沖縄県を指定して値を取得
		System.out.println("keyが沖縄県のときのvalueは" + stringMap.get("沖縄県"));

	}
}
