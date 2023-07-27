import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	List<Human>	List = new ArrayList<Human>();
		
		Human h1 = new Human("イワツル",1.5);
		Human h2 = new Human("コジマ",0.5);
		Human h3 = new Human("ジンノウチ",1.2);
		Human h4 = new Human("タナカ",1.1);
		Human h5 = new Human("テイ",0.4);
		Human h6 = new Human("ナリタ",1.3);
		Human h7 = new Human("ノダ",1);
		Human h8 = new Human("ササキ",99);
		List.add(h1);
		List.add(h2);
		List.add(h3);
		List.add(h4);
		List.add(h5);
		List.add(h6);
		List.add(h7);
		List.add(h8);		
		
	
		String[] names = { "イワツル", "コジマ", "ジンノウチ", "タナカ", "テイ", "ナリタ", "ノダ", "ササキ" }; //名前を入力
		System.out.println("席の数を決めてください。");
		System.out.println("何行、何列の席にしますか？");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();//行
		int column = scan.nextInt();//列
		if (row * column < names.length) {
			System.out.println("人数分の席がありません。もう一度入力しなおしてください。");
		} else {
			String[][] sit = new String[row][column]; //席を準備
			String[] nameList = new String[row * column]; //名前を入れる要素を準備
			System.out.printf("席数は%s行%s列の%s席です。\n", row, column, row * column);
			System.out.println("名前をランダムな順番にします。"); //名前を席の要素に配置
			Random r = new Random();
			for (int i = 0; i < 100; i++) { //100回名前の要素順を入れ替える　以下入れ替え処理
				int num = r.nextInt(names.length - 1) + 1;//ランダムな値を代入
				String temp = names[0];//作ったランダムな値をtempに入れる
				names[0] = names[num];//
				names[num] = temp;//
			}
			System.out.println(Arrays.toString(names));

			System.out.println("名前を席の要素に代入します。");
			nameList = names;
			for (int k = 0; k < nameList.length; k++) {//人数分処理を回す
				for (int i = 0; i < sit.length; i++) {//何行目の処理なのか決める
					int j = 0;//jのスコープを広げるために下のfor文の最初の条件を()の外に出した。43行目の処理のためにスコープを広げた。
					for (; j < sit[i].length; j++) {//何列目の処理なのかを決める
						if (sit[i][j] == null) {//席に人が座っていないならnameListから一人座らせて、処理を抜ける
							sit[i][j] = nameList[k];
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
	
	
}


