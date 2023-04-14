package com.example.d_martapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomList extends ArrayAdapter {

    public String[] first;
    public String[]prise;
    public String rating[];
    public String qty[];
    public Integer Img[];
    Context context;

    public CustomList(@NonNull Context context, String[]first,String[]prise,String rating[],String qty[],Integer Img[]) {
        super(context, R.layout.row_item,first);
        this.context = context;
        this.first =first;
        this.prise = prise;
        this.rating = rating;
        this.qty= qty;
        this.Img = Img;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        if(convertView==null)
            row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, null, true);
        TextView textViewCountry = (TextView) row.findViewById(R.id.textViewCountry);
        TextView textViewCapital = (TextView) row.findViewById(R.id.textViewCapital);
        TextView textViewqty = (TextView) row.findViewById(R.id.textViewqty);
        TextView textViewrating = (TextView) row.findViewById(R.id.textViewrating);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);

        textViewCountry.setText(first[position]);
        textViewCapital.setText(prise[position]);
        imageFlag.setImageResource(Img[position]);
        textViewrating.setText(rating[position]);
        textViewqty.setText(qty[position]);
        return  row;
    }
}
