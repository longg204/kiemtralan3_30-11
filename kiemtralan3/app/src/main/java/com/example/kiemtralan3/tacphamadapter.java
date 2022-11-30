package com.example.kiemtralan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class tacphamadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cactacpham> cactacphamList;

    public tacphamadapter(Context context, int layout, List<cactacpham> cactacphamList) {
        this.context = context;
        this.layout = layout;
        this.cactacphamList = cactacphamList;
    }

    @Override
    public int getCount() {
        return cactacphamList.size();
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
        TextView texttacpham;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        tacphamadapter.ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new tacphamadapter.ViewHoder();
//connectID
            hoder.texttacpham = (TextView) view.findViewById(R.id.txt_tacpham);
            view.setTag(hoder);
        }else{
            hoder = (tacphamadapter.ViewHoder) view.getTag();
        }

        cactacpham cactacpham =cactacphamList.get(i);
        hoder.texttacpham.setText(cactacpham.getTacpham());
        return view;
    }
}