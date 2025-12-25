package com.example.schedule.job;

import com.example.schedule.service.EmailService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.stereotype.Component;

@Component
@DisallowConcurrentExecution
public class DailyEmailJob implements Job {

    private final EmailService emailService;

    public DailyEmailJob(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void execute(JobExecutionContext context) {
        String email =
                context.getMergedJobDataMap().getString("email");

        emailService.sendDailyEmail(email);
    }
}

