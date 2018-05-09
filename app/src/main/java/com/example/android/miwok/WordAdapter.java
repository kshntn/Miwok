package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word>Words){
        super(context,0,Words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View ListItemView = convertView;
       if(ListItemView==null){
           ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       Word currentWord=getItem(position);
        TextView MiwokTexTView=ListItemView.findViewById(R.id.newtext1);
        MiwokTexTView.setText(currentWord.getMiwokTranslation());
        TextView DefaultTextView = ListItemView.findViewById(R.id.newtext2);
        DefaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView Image=ListItemView.findViewById(R.id.image);
        Image.setImageResource(currentWord.getmImageResourceId());

        return ListItemView;
    }

}