package com.example.viewpager;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class MyPagerAdapter extends PagerAdapter {
    Context context;
    MyPagerAdapter(Context context)
    {
        this.context=context;
    }

    @Override
    public int getCount() {
        return Houses.values().length;
    }
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater=LayoutInflater.from(context);
        Houses h=Houses.values()[position];
        ViewGroup viewGroup=(ViewGroup) inflater.inflate(h.getLayout(),container,false);
        container.addView(viewGroup);
        return viewGroup;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
    public CharSequence getPageTitle(int position)
    {
        Houses h=Houses.values()[position];
        return context.getString(h.getTitle());
    }
}
