package com.rameshit.common;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class EmailJob extends QuartzJobBean {
	
	private SendEmailTask sendEmailTask;

	public void setSendEmailTask(SendEmailTask sendEmailTask) {
		this.sendEmailTask = sendEmailTask;
	}
	
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		sendEmailTask.sendEmail();

	}
}