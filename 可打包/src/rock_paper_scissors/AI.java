package rock_paper_scissors;

import java.util.Random;

public class AI {
	static int winNUM=0;
	static int drawNUM=0;
	static int lostNUM=0; 

	//1布2剪刀3石头  -1输 0平 1赢
	static Random random =new Random();
public static int ai(int num) {
	int rand=random.nextInt(1200)+1;
	switch (rand%3+1) {//1布2剪刀3石头ai出上次玩家出的
	case 1:
		switch (num) {
		case 1:
			drawNUM++;
			
			break;
		case 2:
			winNUM++;
		
			break;
		case 3:
			lostNUM++;
			
			break;
		
		}
		
		break;

	case 2://1布2剪刀3石头
		switch (num) {
		case 1:
			lostNUM++;
			
			break;
		case 2:
			drawNUM++;
			
			break;
		case 3:
			winNUM++;
			
			break;
		
		}
		break;
		
	case 3://1布2剪刀3石头
		switch (num) {
		case 1:
			winNUM++;
			
			break;
		case 2:
			lostNUM++;
			
			break;
		case 3:
			drawNUM++;
			
			break;
		
		}
		break;
	}

	return rand%3+1;
	
	
}
}
