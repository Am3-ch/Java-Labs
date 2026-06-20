/* This program grades students' exams based on a predefined answer key. It compares each student's answers to the key and calculates their score as a percentage. */
public class GradeExam{
	public static void main(String[] args){
		int score = 0;
		char[] key = {'A','B','D','D','A','C','B','A','A','C'};
		char[][] student = {
				{'A','A','B','D','D','C','B','A','C','C'},
				{'D','D','A','C','C','C','A','D','B','B'},
				{'A','B','D','D','A','C','B','A','A','C'}
		};
		for(int i = 0; i < student.length ; i++){
			score = mark(key, student[i])*10;
			System.out.println("The number " + (i+1) + " student got " + score + " percent");
		} 
	}
	public static int mark(char[] student, char[] key){
		int count = 0;
		for(int i = 0; i < student.length ; i++ ){
			if(key[i] == student[i]){
			 count += 1;
			}
		}
		return count;
	}
}