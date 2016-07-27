package com.papi.quartz.service;

import java.io.Serializable;
import java.util.List;

import org.quartz.JobDataMap;
import org.quartz.Scheduler;
import org.quartz.Trigger;

import com.papi.quartz.bean.JobInfo;
import com.papi.quartz.bean.TriggerInfo;

public abstract interface QuartzService extends Serializable{
	public Scheduler getTheScheduler();
	
    public abstract boolean addNewJob(JobInfo jobInfo); 
    
    public abstract List<JobInfo> getAllJobs();
    
    public abstract List<JobInfo> getJobsByGroupName(String groupName);
    
    public abstract boolean deleteJob(JobInfo jobInfo);
    
    public abstract boolean jobFire(JobInfo jobInfo);
    
    public abstract boolean jobPause(JobInfo jobInfo);
    
    public abstract boolean jobResume(JobInfo jobInfo);
    
    public abstract boolean isJobExsit(String jobName,String group);
    
    public abstract boolean addTrigger(JobInfo jobInfo, TriggerInfo triggerInfo);
    
    public abstract boolean editTrigger(JobInfo jobInfo, TriggerInfo triggerInfo);
    
    public abstract boolean deleteTrigger(TriggerInfo triggerInfo);
    
    public abstract TriggerInfo getTrigger(String triggerName, String triggerGroup);
    
    public abstract boolean isTriggerExist(String triggerName, String triggerGroup);
    
    public List<? extends Trigger> getTriggersOfJob(String jobName,String jobGroup);
    
    public JobDataMap getJobDataMap(String jobName, String jobGroup);
}