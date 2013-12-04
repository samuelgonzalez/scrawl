import java.util.ArrayList;
import java.util.Random;

public class Data {
	
	public ArrayList<Scrawl> getScrawlList(){
		ArrayList<Scrawl> sc = new ArrayList<Scrawl>();
		Scrawl s;
		int amount = this.generateRandomInteger();
		
		for(int i =0; i< amount; i++){
			s = new Scrawl();
			s.i = this.generateRandomInteger();
			s.s = this.generateRandomWords();
			
			sc.add(s);
		}
		
		return sc;
	}
	
	private String generateRandomWords()
	{
	    Random random = new Random();
	    char[] word = new char[random.nextInt(8)+3];
	    for(int j = 0; j < word.length; j++)
	    {
	        word[j] = (char)('a' + random.nextInt(26));
	    }
	    return new String(word);
	}
	
	private int generateRandomInteger() {
		int min = 1;
		int max = 100;
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
