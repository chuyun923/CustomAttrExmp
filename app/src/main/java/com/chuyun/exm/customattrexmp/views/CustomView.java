package com.chuyun.exm.customattrexmp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chuyun.exm.customattrexmp.R;

/**
 * Date:15/9/29
 * Time:15:22
 * Small improvements each day~
 */
public class CustomView extends LinearLayout{

    private int color1;
    private int color2;
    private int color3;
    private int color4;
    private int color5;

    public CustomView(Context context) {
        this(context,null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.custom_style);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        final TypedArray a = context.obtainStyledAttributes(
                attrs, R.styleable.custom_attrs, defStyleAttr, R.style.default_style);

        color1 = a.getColor(R.styleable.custom_attrs_custom_color1,0xffff0000);
        color2 = a.getColor(R.styleable.custom_attrs_custom_color2,0xffff0000);
        color3 = a.getColor(R.styleable.custom_attrs_custom_color3,0xffff0000);
        color4 = a.getColor(R.styleable.custom_attrs_custom_color4,0xffff0000);
        color5 = a.getColor(R.styleable.custom_attrs_custom_color4,0xffff0000);


        TextView textView1 = new TextView(context);
        textView1.setText("color1"+Integer.toHexString(color1));
        addView(textView1);

        TextView textView2 = new TextView(context);
        textView2.setText("color2"+Integer.toHexString(color2));
        addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("color3"+Integer.toHexString(color3));
        addView(textView3);

        TextView textView4 = new TextView(context);
        textView4.setText("color4"+Integer.toHexString(color4));
        addView(textView4);

        TextView textView5 = new TextView(context);
        textView5.setText("color5"+Integer.toHexString(color5));
        addView(textView5);

        a.recycle();

    }

}
