package com.danijel;

import org.springframework.beans.factory.annotation.Autowired;

public class HomeworkWorker {

	private DoHomework2 doHomework2;

	private DoHomework doHomework;
	
	@Autowired
	public HomeworkWorker(DoHomework2 doHomework2, DoHomework doHomework) {
		this.doHomework2 = doHomework2;
		this.doHomework = doHomework;
	}


	public void setDoHomework2(DoHomework2 doHomework2) {
		this.doHomework2 = doHomework2;
	}
	

	public void setDoHomework(DoHomework doHomework) {
		this.doHomework = doHomework;
	}
	
	public void DoHomeworkNow (String text){
		doHomework.doIt(text);
	}
	public void DoHomework2Now (String text){
		doHomework2.doIt(text);
	}
}