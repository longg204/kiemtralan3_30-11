package com.example.kiemtralan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class tacgiaadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cactacgia> cactacgiaList;

    public tacgiaadapter(Context context, int layout, List<cactacgia> cactacgiaList) {
        this.context = context;
        this.layout = layout;
        this.cactacgiaList = cactacgiaList;
    }

    @Override
    public int getCount() {
        return cactacgiaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoder{
        TextView texttacgia;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new ViewHoder();
//connectID
            hoder.texttacgia = (TextView) view.findViewById(R.id.txt_tacgia);
            view.setTag(hoder);
        }else{
            hoder = (ViewHoder) view.getTag();
        }

        cactacgia cactacgia =cactacgiaList.get(i);
        hoder.texttacgia.setText(cactacgia.getTacgia());
        return view;
    }
}