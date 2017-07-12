package com.example.neclyeux.ufpinews2.controller.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.neclyeux.ufpinews2.R;
import com.example.neclyeux.ufpinews2.controller.core.News;

import java.util.ArrayList;

/**
 * Created by Neclyeux on 11/07/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<News> news = new ArrayList<News>();
    private LayoutInflater mInflater;

    public ListViewAdapter(Context context){
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(News news){
        this.news.add(news);
        notifyDataSetChanged();
    }

    @Override
    public int getCount(){
        return news.size();
    }

    @Override
    public News getItem(int position){
        return news.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = new ViewHolder();

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.news_listview_main, null);

            holder.newsImageView = (ImageView) convertView.findViewById(R.id.news_imageview);
            holder.titleNews = (TextView) convertView.findViewById(R.id.title_news_textview);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.newsImageView.setImageResource(news.get(position).getImage());
        holder.titleNews.setText(news.get(position).getTitle());

        return convertView;
    }

    public static class ViewHolder{
        public ImageView newsImageView;
        public TextView titleNews;
    }

}
