package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void sub(String[]englishWord) {
	
	HashMap<String,String> dictionary = new HashMap<String,String>();

	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	for(int i=0;i<englishWord.length;i++) {
		String fruit = dictionary.get(englishWord[i]);
	
		if(fruit==null) {
		    System.out.println(englishWord[i]+"は辞書に存在しません");
		} else {
		    System.out.println(englishWord[i]+"の意味は"+fruit);
		}
		
	}
	}
}
