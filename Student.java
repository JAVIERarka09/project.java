package Projek;

public class Student extends person {
    private int number;
    private int score;
    private int major;

    public Student(String n, int a, int u, int s, int k) {
    super(n,a);
    this.number = u;
    this.score = s;
    this.major = k;
}
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMajor() {
		return this.major;
	}

	public void setMajor(int major) {
		this.major = major;
	}
    public void print() {
        super.print();
        System.out.println("number: " + number);
        System.out.println("score: " + score);
        System.out.println("major: " + major);
        
    }


    
}
