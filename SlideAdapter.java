package com.example.mahmoud.besafe;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Sumeet Jain on 25-02-2018.
 */

public class SlideAdapter extends PagerAdapter {


    Context context;
    LayoutInflater inflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    //Array
    public int[] list_images={

            R.drawable.welcome,
            R.drawable.shield,
            R.drawable.question

    };

    public String[] list_title={

            "Welcome",
            "Your Security",
            "To Be Safe"

    };

    public String[] list_description={


            "To obtain an effective account, follow the instructions below",
            "Use a password that contains numbers and capital letters",
            "Please write your data very carefully.. as others will help you based on that data"

    };
    public int[] list_color={

            Color.rgb(133,193,176),
            Color.rgb(133,193,176),
            Color.rgb(133,193,176)


    };

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view==(LinearLayout)obj;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.slidelinearlayout);


        ImageView img = (ImageView)view.findViewById(R.id.slideimg);
        TextView txt1 = (TextView) view.findViewById(R.id.slidetitle);
        TextView txt2 = (TextView) view.findViewById(R.id.slidedescription);


        img.setImageResource(list_images[position]);
        txt1.setText(list_title[position]);
        txt2.setText(list_description[position]);
        linearLayout.setBackgroundColor(list_color[position]);



        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}