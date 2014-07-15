package com.telpoo.hotpic.task;

import java.util.ArrayList;

import android.content.Context;

import com.telpoo.frame.model.BaseTask;
import com.telpoo.frame.model.TaskListener;
import com.telpoo.frame.model.TaskParams;

public class TaskDinh extends BaseTask {

	public TaskDinh(TaskListener taskListener, int taskType, ArrayList<?> list,
			Context context) {
		super(taskListener, taskType, list, context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Boolean doInBackground(TaskParams... params) {
		
		
		switch (taskType) {
		case 1:// thuc hien task o day
			
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return super.doInBackground(params);
	}

}
