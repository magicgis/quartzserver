package com.papi.quartz.quartzjobs;

import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.papi.quartz.utils.DateUtils;

public class SenseDeviceJob extends BasicJob{

	@SuppressWarnings("unused")
	@Override
	public void execute(JobExecutionContext jobExecutionContext)
			throws JobExecutionException {			
		
		
		
		String date = DateUtils.dateToString(new Date(), DateUtils.DATE_PATTERN_YYYYMMDDHMS);
		
		String name = jobExecutionContext.getJobDetail().getKey().getName();
		String group = jobExecutionContext.getJobDetail().getKey().getGroup();
		JobDataMap map = jobExecutionContext.getJobDetail().getJobDataMap();
		
		String triggerName = jobExecutionContext.getTrigger().getKey().getName();
		
		String username = map.getString("username");
		String token = map.getString("req_token");
		String source = map.getString("sourceScene");
		String doScene = map.getString("doScene");
		JSONArray.fromObject(doScene);
		
		System.out.println("-----------------"+ date +"--------------------");
		System.out.println(triggerName);
		System.out.println("\n" + name + "\n" +  group + "\n" + map + "\n" + 
		username+ "\n" + token+ "\n" + source+ "\n" + 
				doScene+ "\n" + JSONArray.fromObject(doScene));
		System.out.println("-------------------------------------");
	
	}
    
}