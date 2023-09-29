package practice;

public class PracticeForEach {

	public static void main(String[] args) {
		
		String[] list = { "大友", "富田", "小野田", "佐藤", "松井", "阿部", "本間", "田原", "福尾", "江藤" };
		
		for (String employee : list) {
			System.out.println(employee);
		}
	}
	
}