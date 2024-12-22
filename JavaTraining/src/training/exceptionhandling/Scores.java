package training.exceptionhandling;

public class Scores /* implements Serializable */ {

//	private static final long serialVersionUID = 5463457550784355585L;

	private double mathsScores;

	private double physicsScores;

	private double chemistryScores;

	private double englishScores;

	public Scores(double mathsScores, double physicsScores,
			double chemistryScores, double englishScores) {
		super();
		this.mathsScores = mathsScores;
		this.physicsScores = physicsScores;
		this.chemistryScores = chemistryScores;
		this.englishScores = englishScores;
	}

	public double getMathsScores() {
		return mathsScores;
	}

	public double getPhysicsScores() {
		return physicsScores;
	}

	public double getChemistryScores() {
		return chemistryScores;
	}

	public double getEnglishScores() {
		return englishScores;
	}
	
	public void setEnglishScores(double englishScore) {
		this.englishScores = englishScore;
	}

	@Override
	public String toString() {
		return "[mathsScores=" + mathsScores + ", physicsScores=" + physicsScores + ", chemistryScores="
				+ chemistryScores + ", englishScores=" + englishScores + "]";
	}

}
