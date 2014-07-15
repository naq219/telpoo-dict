/**
 * @author naq
 * Màn hình Activity duy nhất của ứng dụng
 * bắt đầu vào sẽ gọi tới fragment home để em chứa listview search
 */
package com.telpoo.hotpic.home;

import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu.OnClosedListener;
import com.telpoo.hotpic.delegate.IOnMenuClosed;
import com.telpoo.hotpic.menu.ViewMenu;
import com.telpoo.hotpic.task.TaskType;

public class HomeActivity extends MyHomeActivity implements TaskType {

	private static HomeActivity me;
	IOnMenuClosed iOnMenuClosed;

	public static HomeActivity getInstance() {
		return me;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		viewMenu = new ViewMenu(HomeActivity.this, this);
		super.onCreate(savedInstanceState);
		me = HomeActivity.this;
		
		pushFragments(TabId.home, new HomeFragment(), true, null);

		getSlidingMenu().setOnClosedListener(new OnClosedListener() {

			@Override
			public void onClosed() {

				iOnMenuClosed.onMenuClosed();

			}
		});

	}

	/**
	 * Class ViewMenu se set listener nay de lang nghe su kien khi menu da dong
	 * lai khi click vao 1 row trong ViewMenu
	 * 
	 * @author naq
	 * @param iOnMenuClosed
	 */
	public void setDelegateOnMenuClosed(IOnMenuClosed iOnMenuClosed) {
		this.iOnMenuClosed = iOnMenuClosed;

	}

	public void setUptitle(String title) {
		tvTitle.setText("" + title);
	}

}
