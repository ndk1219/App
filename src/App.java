import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<Human>();

		Human h1 = new Human("イワツル", 1);
		Human h2 = new Human("コジマ", 0.7);
		Human h3 = new Human("ジンノウチ", 8);
		Human h4 = new Human("タナカ", 13);
		Human h5 = new Human("テイ", 0.1);
		Human h6 = new Human("ナリタ", 5);
		Human h7 = new Human("ノダ", 0.3);
		Human h8 = new Human("ササキ", 99);
		list.add(h1);
		list.add(h2);
		list.add(h3);
		list.add(h4);
		list.add(h5);
		list.add(h6);
		list.add(h7);
		list.add(h8);

		System.out.println("席の数を決めてください。");
		System.out.println("何行、何列の席にしますか？");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();//行
		int column = scan.nextInt();//列

		if (row * column < list.size()) {
			System.out.println("人数分の席がありません。もう一度入力しなおし987てください。");
		} else {
			String[][] sit = new String[row][column]; //席を準備

			System.out.printf("席数は%s行%s列の%s席です。\n", row, column, row * column);

			eye(list); //参照型

			//			System.out.println("名前をランダムな順番にします。"); //名前を席の要素に配置
			//			Random r = new Random();
			//			for (int i = 0; i < 100; i++) { //100回名前の要素順を入れ替える　以下入れ替え処理
			//				int num = r.nextInt(list.size() - 1);//ランダムな値を代入
			//				Human temp = list.get(0);//最初の名前をtempに入れて避難させる
			//				list.set(0, list.get(num));//
			//				list.set(num, temp);//
			//			}
			for (Human h : list) {//デバッグ用
				System.out.println(h.name);
			}

			System.out.println("名前を席の要素に代入します。");
			for (int k = 0; k < list.size(); k++) {//人数分処理を回す
				for (int i = 0; i < sit.length; i++) {//何行目の処理なのか決める
					int j = 0;//jのスコープを広げるために下のfor文の最初の条件を()の外に出した。43行目の処理のためにスコープを広げた。
					for (; j < sit[i].length; j++) {//何列目の処理なのかを決める
						if (sit[i][j] == null) {//席に人が座っていないならnameListから一人座らせて、処理を抜ける
							sit[i][j] = list.get(k).name;
							break;
						}
					}
					if (j != sit[i].length)//i行目に人が座っているかどうかを判別。jの値が座席数と違ったら抜けてまた次の人を抽選する。
						break;
				}
			}
			for (int i = 0; i < sit.length; i++) {
				System.out.println(Arrays.toString(sit[i]));
			}
		}
	}

	public static void eye(List<Human> list) {
		// 並び替え処理
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				// 右側の数字が大きい場合
				if (list.get(i).eyeSight > list.get(j).eyeSight) {
					Human temp2 = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp2);
				}
			}
		}
		//		// コンソールに配列の中身を表示
		//		System.out.println(Arrays.toString(list));

	}
}
