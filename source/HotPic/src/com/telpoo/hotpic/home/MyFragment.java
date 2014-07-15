package com.telpoo.hotpic.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.dinh.dict.R;
import com.telpoo.frame.ui.BaseFragment;

public class MyFragment extends BaseFragment{
	ProgressBar progress;
	protected View loadingView;
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
	
	protected void showProgress(){
		if(progress!=null){
			progress.setVisibility(View.VISIBLE);
		}
	}
	
	protected void closeProgress(){
		if(progress!=null){
			progress.setVisibility(View.GONE);
		}
	}

}
