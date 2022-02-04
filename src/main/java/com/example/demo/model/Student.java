package com.example.demo.model;

public class Student {

//	 private MathsExam exam;
//
//	public void setExam(MathsExam exam) {
//		this.exam = exam;
//	}
//
//	void stu() {
//		exam.exam();
//
//	}
	
	private Exam exam;

	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	void show()
	{
		exam.exam();
	}

	

}
