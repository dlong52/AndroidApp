package com.example.myapplication.Tuan6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class T6Adapter extends BaseAdapter {
    private Context mContext;
    private List<Product> mProductList;

    public T6Adapter(Context mContext, List<Product> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int i) {
        return mProductList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderT61 holder;
        if( view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.item_view_t6,viewGroup, false);
            holder = new ViewHolderT61();
            holder.imageView = view.findViewById(R.id.item_image);
            holder.styleId = view.findViewById(R.id.item_styleId);
            holder.brand = view.findViewById(R.id.item_brand);
            holder.price = view.findViewById(R.id.item_price);
            holder.addInfo = view.findViewById(R.id.item_addInfo);
            view.setTag(holder);
        }else{
            holder = (ViewHolderT61) view.getTag();
        }
        Product product = mProductList.get(i);
        if(product != null){
            Picasso.get().load(product.getSearchImage()).into(holder.imageView);
            holder.addInfo.setText(product.getAddittionalInfo());
            holder.brand.setText(product.getBrand());
            holder.price.setText(product.getPrice());
            holder.styleId.setText(product.getStyleId());
        }
        return view;
    }
    static class ViewHolderT61 {
        ImageView imageView;
        TextView styleId, brand, price, addInfo;

    }
}
