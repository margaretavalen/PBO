public class FinalExamDemo {
	public static void main(String[] args){
		FinalExam fe = new FinalExam(6,3);
		fe.pointsPerQuestion=10;
		System.out.println("Point : " + fe.getPointPerQuestion());
		System.out.println("Missed : " + fe.getNumberMissed());
		fe.setScore(fe.getPointPerQuestion());
		System.out.println("Grade : " + fe.getGrade());
	}
}