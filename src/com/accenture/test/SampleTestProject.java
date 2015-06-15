package com.accenture.test;

public class SampleTestProject {

	private static SampleTestProject singletonObj;
	
	/*private SampleTestProject(){
		
	}*/
	
	public static SampleTestProject getInstance(){
		if(singletonObj == null){
			singletonObj = new SampleTestProject();
		}
		return singletonObj;
	}
	
	public static void main(String[] args){
		SampleTestProject sampleProject = SampleTestProject.getInstance();
		System.out.println("-----instance" + sampleProject.hashCode());
		SampleTestProject sampleProject1 = SampleTestProject.getInstance();
		System.out.println("-----instance" + sampleProject1.hashCode());
		SampleTestProject sampleProject2 = SampleTestProject.getInstance();
		System.out.println("-----instance" + sampleProject2.hashCode());
		SampleTestProject sampleProject3 = SampleTestProject.getInstance();
		System.out.println("-----instance" + sampleProject3.hashCode());
		
		
	}
	
	
	
	
}
