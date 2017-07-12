package com.example.neclyeux.ufpinews2.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neclyeux.ufpinews2.R;
import com.example.neclyeux.ufpinews2.controller.core.News;
import com.example.neclyeux.ufpinews2.views.MainActivity;

public class NewsDetail extends AppCompatActivity {

    private TextView titleNews;
    private TextView descriptionNews;
    private ImageView imageNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        titleNews = (TextView) findViewById(R.id.title_news_detail);
        descriptionNews = (TextView) findViewById(R.id.news_description_detail);
        imageNews = (ImageView) findViewById(R.id.news_imageview_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.POSITION_NEWS, 0);

        News news = MainActivity.arrayNews.get(position);

        titleNews.setText(news.getTitle());
        descriptionNews.setText(news.getDescription());
        imageNews.setImageResource(news.getImage());
    }


}
