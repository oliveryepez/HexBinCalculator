package com.example.olive.hexbincalculator;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Created by olive on 11/5/2015.
 */
public class CalculatorWidget extends AppWidgetProvider {

    private final String A_BUTTON = "A_TOUCHED";
    private final String B_BUTTON = "B_TOUCHED";
    private final String C_BUTTON = "C_TOUCHED";
    private final String D_BUTTON = "D_TOUCHED";
    private final String E_BUTTON = "E_TOUCHED";
    private final String F_BUTTON = "F_TOUCHED";

    private final String ZERO_BUTTON = "0_TOUCHED";
    private final String ONE_BUTTON = "1_TOUCHED";
    private final String TWO_BUTTON = "2_TOUCHED";
    private final String THREE_BUTTON = "3_TOUCHED";
    private final String FOUR_BUTTON = "4_TOUCHED";
    private final String FIVE_BUTTON = "5_TOUCHED";

    private final String SIX_BUTTON = "SIX_TOUCHED";
    private final String SEVEN_BUTTON = "SEVEN_TOUCHED";
    private final String EIGHT_BUTTON = "EIGHT_TOUCHED";
    private final String NINE_BUTTON = "NINE_TOUCHED";

    private static String text = null;

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
            remoteViews.setOnClickPendingIntent(R.id.btn_c_widget, getPendingSelfIntent(context, C_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_d_widget, getPendingSelfIntent(context, D_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_e_widget, getPendingSelfIntent(context, E_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_f_widget, getPendingSelfIntent(context, F_BUTTON));

            remoteViews.setOnClickPendingIntent(R.id.btn_zero_widget, getPendingSelfIntent(context, ZERO_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_one_widget, getPendingSelfIntent(context, ONE_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_two_widget, getPendingSelfIntent(context, TWO_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_three_widget, getPendingSelfIntent(context, THREE_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_four_widget, getPendingSelfIntent(context, FOUR_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_five_widget, getPendingSelfIntent(context, FIVE_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_six_widget, getPendingSelfIntent(context, SIX_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_seven_widget, getPendingSelfIntent(context, SEVEN_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_eight_widget, getPendingSelfIntent(context, EIGHT_BUTTON));
            remoteViews.setOnClickPendingIntent(R.id.btn_nine_widget, getPendingSelfIntent(context, NINE_BUTTON));

            appWidgetManager.updateAppWidget(watchWidget, remoteViews);
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        AppWidgetManager widgetManager = AppWidgetManager.getInstance(context);
        RemoteViews remoteViews;
        ComponentName watchWidget;

        remoteViews = new RemoteViews(context.getPackageName(), R.layout.calculator_widget);
        watchWidget = new ComponentName(context, CalculatorWidget.class);

        if(A_BUTTON.equals(intent.getAction())){

            text = (text == null) ? text = "A" : text + "A";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(B_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "B" : text + "B";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(C_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "C" : text + "C";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(D_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "C" : text + "C";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(E_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "E" : text + "E";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(F_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "F" : text + "F";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(ZERO_BUTTON.equals(intent.getAction())){

            text = (text == null) ? text = "0" : text + "0";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(ONE_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "1" : text + "1";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(TWO_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "2" : text + "2";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(THREE_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "3" : text + "3";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(FOUR_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "4" : text + "4";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(FIVE_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "5" : text + "";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(SIX_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "6" : text + "6";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(SEVEN_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "7" : text + "7";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(EIGHT_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "8" : text + "8";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        if(NINE_BUTTON.equals(intent.getAction())){
            text = (text == null) ? text = "9" : text + "9";
            remoteViews.setTextViewText(R.id.txt_text_widget, text);
        }

        widgetManager.updateAppWidget(watchWidget, remoteViews);
    }

    protected PendingIntent getPendingSelfIntent(Context context, String action) {
        Intent intent = new Intent(context, getClass());
        intent.setAction(action);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }
}
