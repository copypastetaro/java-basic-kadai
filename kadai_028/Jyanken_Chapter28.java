package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分の入力するメソッド
	public String getMyChoice() {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			
			while(true) {
				System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\n"
						+ "チョキはscissorsのsを入力しましょう\n"
						+ "パーはpaperのpを入力しましょう");
				
				input= scanner.next();
					if(input.equals("p")||input.equals("s")||input.equals("r")) {
						break;
					}else {
						System.out.println("正しい手を入力してください");
					}
				}
			return input;

		}
	public	String	getRandom() {
		String[]mataJanken= {"p","s","r"};
		String answer=(mataJanken[(int)(Math.floor (Math.random() *2))]);
		
		return answer;
		
	}
	public void playGame() {
	HashMap<String,String>convert=new HashMap<String,String>();
	
	convert.put("p","パー");
	convert.put("s","チョキ");
	convert.put("r","グー");
	String myHand=convert.get(getMyChoice());
	String cpuHand=convert.get(getRandom());
	System.out.println("自分の手は"+myHand+",対戦相手の手は"+cpuHand);
	
	if ((myHand.equals("グー") && cpuHand.equals("グー") ) ||
		    (myHand.equals("チョキ") && cpuHand.equals("チョキ") ) ||
		    (myHand.equals("パー") && cpuHand.equals("パー") )) {
		    
		    System.out.println("あいこです");
		}else if((myHand.equals("グー") && cpuHand.equals("チョキ") ) ||
		    (myHand.equals("チョキ") && cpuHand.equals("パー") ) ||
		    (myHand.equals("パー") && cpuHand.equals("グー") )) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}

	
	
	}

}
