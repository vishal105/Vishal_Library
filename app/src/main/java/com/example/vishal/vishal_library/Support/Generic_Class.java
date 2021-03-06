package com.example.vishal.vishal_library.Support;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.vishal.vishal_library.Charts.Barchart;
import com.example.vishal.vishal_library.Charts.Bubblechart;
import com.example.vishal.vishal_library.Charts.Linechart;
import com.example.vishal.vishal_library.Charts.Piechart;
import com.example.vishal.vishal_library.Custom_Spinner_object.SpinnerWithObject;
import com.example.vishal.vishal_library.R;
import com.example.vishal.vishal_library.swipe_and_undo.Swipe_Undo;


/**
 * Created by VISHAL on 4/8/2017.
 */

public class Generic_Class {
    public static void  drawactivity(final Context context){
        final TextView barchartdraw,bubblechartdraw,piechartdraw,linechartdraw,customapinnerdraw,swipeundodraw;
        barchartdraw =(TextView)((Activity)context).findViewById(R.id.tv_bar_chart_draw);
        bubblechartdraw =(TextView)((Activity)context).findViewById(R.id.tv_bubble_chart_draw);
        piechartdraw =(TextView)((Activity)context).findViewById(R.id.tv_pie_chart_draw);
        linechartdraw =(TextView)((Activity)context).findViewById(R.id.tv_line_chart_draw);
        customapinnerdraw =(TextView)((Activity)context).findViewById(R.id.tv_spinner_object_draw);
        swipeundodraw = (TextView) ((Activity) context).findViewById(R.id.tv_swipeactivitydraw);

        barchartdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, Barchart.class));
                ((Activity) context).finish();
            }
        });
        bubblechartdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, Bubblechart.class));
                ((Activity) context).finish();
            }
        });
        piechartdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, Piechart.class));
                ((Activity) context).finish();
            }
        });
        linechartdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, Linechart.class));
                ((Activity) context).finish();
            }
        });
        customapinnerdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, SpinnerWithObject.class));
                ((Activity) context).finish();
            }
        });
        swipeundodraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).startActivity(new Intent(context, Swipe_Undo.class));
                ((Activity) context).finish();
            }
        });
    }
}
