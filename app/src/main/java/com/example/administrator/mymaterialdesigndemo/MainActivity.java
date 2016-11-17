package com.example.administrator.mymaterialdesigndemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class  MainActivity extends Activity {

    private FoldLayout foldLayout,foldLayout1,foldLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        foldLayout = (FoldLayout) findViewById(R.id.foldLayout);
        foldLayout1 = (FoldLayout) findViewById(R.id.foldLayout1);
        foldLayout2 = (FoldLayout) findViewById(R.id.foldLayout2);

        List<View> a =new ArrayList<>();

        List<View> a1 =new ArrayList<>();
        List<View> a2 =new ArrayList<>();

        /**
         * 初始化第一个Menu的Item
         */
        for (int i = 0;i<2;i++) {
            a.add(getLayoutInflater().inflate(R.layout.layout_item,null));
        }
        foldLayout.addItemView(a);
        /**
         * 初始化第二个Menu的Item
         */
        for (int i = 0;i<5;i++) {
            a1.add(getLayoutInflater().inflate(R.layout.layout_item,null));
        }
        foldLayout1.addItemView(a2);

        /**
         *
         * 初始化第san个Menu的Item
         */
        for (int i = 0;i<5;i++) {
            a2.add(getLayoutInflater().inflate(R.layout.layout_item,null));
        }
        foldLayout2.addItemView(a2);

        /**
         * 设置Item的单击事件
         */
        foldLayout.setOnItemClickListener(new FoldLayout.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "点击了第"+position+"个", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
