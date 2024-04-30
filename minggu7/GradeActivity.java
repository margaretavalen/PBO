public class GradeActivity {
	private double score;
	private string nama;
	public GradeActivity() {
		//
	}
	public GradeActivity(String n) {
		nama=n;
	}
	public void setscore(double s) {
		score=s;
	}
	public double getScore() {
		return score;
	}
	public char getGrade() {
		if(score>=70)
			return 'A';
		else 
			return 'B';
	}
}