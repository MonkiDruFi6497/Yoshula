package com.example.yoshula;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SeetingFragment extends Fragment {

    private TextView textView;
    private WebView webView;
    private View view;
    private Button btTest;
    private Activity activity;
    String psy_test;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view     = inflater.inflate(R.layout.fragment_setting,container,false);
        textView = view.findViewById(R.id.textView);
        webView  = view.findViewById(R.id.webView);
        btTest   = view.findViewById(R.id.btTest);
        btTest.setOnClickListener(new BtTest());

        //取得文字
        psy_test = getResources().getString(R.string.psy_test);

        // For WebView
        String webText = String.valueOf(Html.fromHtml(
                "<![CDATA[<body style=\"text-align:justify\">"
                       +psy_test+ "</body>]]>"
        ));
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.loadData(webText,"text/html;charset=utf-8", "UTF-8");

        //super.onCreateView(inflater, container, savedInstanceState);
        activity.setTitle("心理測驗");

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private class BtTest implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), MentalityOne.class);
            startActivity(intent);
            //getActivity().finish();

        }
    }
}
