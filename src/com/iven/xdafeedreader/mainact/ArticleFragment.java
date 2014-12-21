package com.iven.xdafeedreader.mainact;

import com.iven.xdafeedreader.R;
import com.iven.xdafeedreader.domparser.RSSFeed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.ScrollView;
import android.widget.TextView;

public class ArticleFragment extends Fragment {
	private int fPos;
	RSSFeed fFeed;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fFeed = (RSSFeed) getArguments().getSerializable("feed");
		fPos = getArguments().getInt("pos");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater
				.inflate(R.layout.article_fragment, container, false);
		
		TextView title = (TextView) view.findViewById(R.id.title);
		WebView wb = (WebView) view.findViewById(R.id.desc);

		ScrollView sv = (ScrollView) view.findViewById(R.id.sv);
		sv.setVerticalFadingEdgeEnabled(true);

		// Set webview settings
		WebSettings ws = wb.getSettings();
		ws.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		

		// Set the views
		title.setText(fFeed.getItem(fPos).getTitle());
		
		wb.loadData(fFeed.getItem(fPos).getDescription(), "text/html; charset=utf-8", "UTF-8");
		
		
		
		return view;
	}
}