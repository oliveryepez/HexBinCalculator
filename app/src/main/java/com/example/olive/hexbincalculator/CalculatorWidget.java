package com.example.olive.hexbincalculator;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.TextView;

/**
 * Created by olive on 11/5/2015.
 */
public class CalculatorWidget extends AppWidgetProvider {

    private final String A_BUTTON = "A_TOUCHED";
    private final String B_BUTTON = "B_TOUCHED";

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        RemoteViews remoteViews;
        ComponentName watchWidget;

        for(int i = 0; i < appWidgetIds.length; i++){

            remoteViews = new RemoteViews(context.getPackageName(), R.layout.calculator_widget);
            watchWidget = new ComponentName(context, CalculatorWidget.class);

            remoteViews.setOnClickPendingIntent(R.id.btn_a_widget, getPendingSelfIntent(context, A_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_b_widget, getPendingSelfIntent(context, B_BUTTON));
            appWidgetManager.updateAppWidget(watchWidget, remoteViews);
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        String text = null;

        AppWidgetManager widgetManager = AppWidgetManager.getInstance(context);
        RemoteViews remoteViews;
        ComponentName watchWidget;


        remoteViews = new RemoteViews(context.getPackageName(), R.layout.calculator_widget);
        watchWidget = new ComponentName(context, CalculatorWidget.class);

        if(A_BUTTON.equals(intent.getAction())){


            remoteViews.setTextViewText(R.id.txt_text_widget, "A");
            widgetManager.updateAppWidget(watchWidget, remoteViews);
        }

        if(B_BUTTON.equals(intent.getAction())){

            remoteViews.setTextViewText(R.id.txt_text_widget, "B");
            widgetManager.updateAppWidget(watchWidget, remoteViews);
        }
    }

    protected PendingIntent getPendingSelfIntent(Context context, String action) {
        Intent intent = new Intent(context, getClass());
        intent.setAction(action);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}
