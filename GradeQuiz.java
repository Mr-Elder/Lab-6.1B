/**
 * @(#)GradeQuiz.java
 *
 *
 * @author 
 * @version 1.00 2014/5/28
 */


public class GradeQuiz {

    public static void gradeQuiz(){
    	char[] keys = new char[GetInfo.getInt("Enter the number of questions")];
  		char[] answers;
    	
    	String allKeys = GetInfo.getString("Enter the answer key without spaces");
    	allKeys = allKeys.toUpperCase();
    	
    	for(int i = 0; i < keys.length; i++){
    		keys[i] = allKeys.charAt(i);
    	}
    	
    	boolean stillGradin = true;
    	
    	while(stillGradin){
    	String answersString = GetInfo.getString("Enter the answers to be graded");
    	answersString = answersString.toUpperCase();
    	
    	answers = new char[keys.length];
    	
    	for(int i = 0; i < answers.length; i++){
    		answers[i] = answersString.charAt(i);
    	}
    	
    	int numRight = 0;
    	int numWrong = 0;
    	
    	for(int i = 0; i < answers.length; i++){
    		if(keys[i] == answers[i])
    			numRight++;
    		else numWrong++;
    	}
    	
    	GetInfo.showMessage("Num right : " + numRight + "\nNum Wrong : " + numWrong + "\nStudent got a : " + ((100.0/answers.length) * numRight) +"%");
    	
    	stillGradin = GetInfo.getYesNo("You still wanna grade yo?");
    	}
    }
    
    
}