package training.exceptionhandling;

public class MyStudent {

	private int rollNo;

	private String name;

	private int clazz;

	private char section;

	private Scores scores;

	public MyStudent(int rollNo, String name, int clazz, char section) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.clazz = clazz;
		this.section = section;
	}

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public void setScores(double mathsScores, double physicsScores, double chemistryScores, double englishScores) {
		this.scores = new Scores(mathsScores, physicsScores, chemistryScores, englishScores);
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getClazz() {
		return clazz;
	}

	public char getSection() {
		return section;
	}

	@Override
	public String toString() {
		return "MyStudent [rollNo=" + rollNo + ", name=" + name + ", class=" + clazz + ", section=" + section
				+ ", scores=" + scores + "]\n```````";
	}

}
