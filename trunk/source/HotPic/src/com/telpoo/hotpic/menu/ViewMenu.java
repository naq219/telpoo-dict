package com.telpoo.hotpic.menu;

/**
 * @author naq
 * day la class cua phan menu
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.dinh.dict.R;
import com.telpoo.frame.delegate.Idelegate;
import com.telpoo.hotpic.delegate.IOnMenuClosed;
import com.telpoo.hotpic.home.HomeActivity;

public class ViewMenu implements IOnMenuClosed {
	Context context;
	Idelegate idelegate;
	View v;
	TextView favorite;
	View layFavorite;

	public ViewMenu(Context context1, Idelegate idelegate1) {
		this.context = context1;
		this.idelegate = idelegate1;

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		v = inflater.inflate(R.layout.layout_menu, null);
		// khai bao view o day
		favorite = (TextView) v.findViewById(R.id.favorite);
		layFavorite = v.findViewById(R.id.layFavorite);
		((HomeActivity) context1).setDelegateOnMenuClosed(this);

	}

	public View getView() {

		return v;
	}

	@Override
	public void onMenuClosed() {

	}

}
