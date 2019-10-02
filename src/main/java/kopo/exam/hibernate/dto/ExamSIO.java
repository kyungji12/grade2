package kopo.exam.hibernate.dto;
//Repository의 IO//public class aaa{}를 만들거라면 ExamRIO뒤에 extend해줘야함.//IO만들기 
public class ExamSIO{	//1. private 변수들을 선언해준다음에
	private String name;
	private int studentid;
	private int kor;
	private int eng;
	private int mat;
	//3. 오버라이딩해주기
	public ExamSIO() {
		super(); 
	}//이것이 없다면 상속받은 원 class를 실행하지 않는다. ★중요하게 만들어야함//원 class의 생성자를 없앨 때 아무것도 쓰지않는다ㅣ.
	public ExamSIO(String name, int studentid, int kor, int eng, int mat) {
		super(); //원class의 생성자를 실행
		this.name = name;
		this.studentid = studentid;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;		
	}//2. Source-Generates Getter and Setters 로 만들어주기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
