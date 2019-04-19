import java.util.Random;

public class Test {
public static void main(String[] args) {
	int min=10;
	int max=60;
	Random random=new Random();
	int randNum=random.nextInt((max-min)+1)+min;
	System.out.println(randNum);
//	int randNum1=random.nextInt(3);
//	System.out.println(randNum1);
  }
}
