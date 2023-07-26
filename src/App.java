import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("席の数を決めてください。");
		System.out.println("何行、何列の席にしますか？");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		String[][] sit = new String[row][column];								//席を準備
		int count = 0;
		String[]names= {"イワツル","コジマ","ジンノウチ","タナカ","テイ","ナリタ","ノダ","ササキ"};	//名前を入力
		String[]nameList=new String[row*column];								//名前を入れる要素を準備
		System.out.printf("席数は%s行%s列の%s席です。\n",row,column,row*column);
		
		System.out.println("名前をランダムな要素数に代入します。");			//名前を席の要素に配置
		Random r = new Random();
		for(int i=0;i<100;i++) {												//100回名前の要素順を入れ替える　以下入れ替え処理
			int num = r.nextInt(names.length-1)+1;//ランダムな値を代入
			String temp=names[0];//作ったランダムな値をtempに入れる
			names[0]=names[num];//
			names[num]=temp;//
		}
		System.out.println(Arrays.toString(names));	
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<sit.length;j++) {
				for(int k =0;k<sit[j].length;k++){
					
				}
			}
		}
		

	}

}
