
public class codingTest_Interview1{
	public static void main(String[] args) throws NullPointerException {
		System.out.println("==========  Program start");
		Fruit fruit = new Fruit();
		fruit.Apple("abc", "pqr");
		fruit.Banana("who seems deep yellow");

	}


	static class Fruit {  // class: fruit, method: Apple, Banana
		static void Apple(String word1, String word2){
			System.out.println("==========  Merge Strings Alternately Start");
			Integer C = 100;
			int D = 200;
			String cb = "100";
			System.out.println(cb);
			System.out.println(C);

			System.out.println(C+D);
			System.out.println("========");
			System.out.println(Integer.parseInt(cb)+ C.toString()); // String + int 값을 더하면


//
//            int A = word1.length(); // 갯수를 알파뱃의 갯수를 추출해내는것임.
//            int B = word2.length();
//            word1.toString(); // word1 에담견 단어를 추츨해냄.
//            System.out.println(word1);
//            for(int i=0; i<A; i++){
//                System.out.println(word1.toString());
//
//            }

		}

		static void Banana(String yellow){ // void 가 없으며 값을 return 받아야한다.

			System.out.println("I like a banana with " + yellow);
		}
	}




}