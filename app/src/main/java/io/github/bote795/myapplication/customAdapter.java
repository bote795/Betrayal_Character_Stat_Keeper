package io.github.bote795.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nick on 4/4/2015.
 */
class customAdapter extends ArrayAdapter<String> {
    customAdapter(Context context, String[] names) {
        super(context, R.layout.custom_row, names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater Inflator = LayoutInflater.from(getContext());
        View customView = Inflator.inflate(R.layout.custom_row, parent, false);
        String singleCharacter = getItem(position);
        TextView CustomText = (TextView) customView.findViewById(R.id.customRow_textview);
        ImageView CustomImage = (ImageView) customView.findViewById(R.id.custom_imageView);
        CustomText.setText(singleCharacter);
        CustomImage.setImageResource(R.drawable.flash);
        return customView;
    }
}
