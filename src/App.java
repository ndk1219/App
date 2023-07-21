import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("席の数を決めてください。");
		System.out.println("何行、何列の席にしますか？");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		String[][] sit = new String[row][column];		//席を準備
		int count = 0;
		String[] nameList=new String[row*column];
		
		for (int i=0;i<nameList.length;i++) {									//名前を入力
			System.out.println("名前を入力してください。");
			System.out.println("入力が終わったら[終了]と入力してください。");
			String name = scan.next();
			System.out.printf("座る人数は%sです。", nameList.length);
			
		}
		
		
		
		System.out.println("記入された名前を席にランダム配置します。");
		Random r = new Random();
		for(int i=0;i<100;i++) {
			int num = r.nextInt()+1;
		}
		
		
		
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<sit.length;j++) {
				for(int k =0;k<sit[j].length;k++){
					
				}
			}
		}
		

	}

}
