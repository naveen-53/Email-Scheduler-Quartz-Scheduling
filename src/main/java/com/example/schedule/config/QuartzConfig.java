package com.example.schedule.config;

import com.example.schedule.job.DailyEmailJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail dailyEmailJobDetail() {
        return JobBuilder.newJob(DailyEmailJob.class)
                .withIdentity("dailyEmailJob")
                .usingJobData("email", "user@example.com")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger dailyEmailTrigger(JobDetail dailyEmailJobDetail) {
        return TriggerBuilder.newTrigger()
                .forJob(dailyEmailJobDetail)
                .withIdentity("dailyEmailTrigger")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0 0 9 * * ?")
                )
                .build();
    }
}

