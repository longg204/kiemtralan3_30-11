package com.example.kiemtralan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class chitietadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<chitiet> chitietList;

    public chitietadapter(Context context, int layout, List<chitiet> chitietList) {
        this.context = context;
        this.layout = layout;
        this.chitietList = chitietList;
    }

    @Override
    public int getCount() {
        return chitietList.size();
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
        TextView texttentacpham, textnoidung;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        chitietadapter.ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new chitietadapter.ViewHoder();
//connectID
            hoder.texttentacpham = (TextView) view.findViewById(R.id.tentacpham);
            hoder.textnoidung = (TextView) view.findViewById(R.id.noidung);
            view.setTag(hoder);
        }else{
            hoder = (chitietadapter.ViewHoder) view.getTag();
        }

        chitiet chitiet =chitietList.get(i);
        hoder.texttentacpham.setText(chitiet.getTentacpham());
        hoder.textnoidung.setText(chitiet.getNoidungchitiet());
        return view;
    }
}