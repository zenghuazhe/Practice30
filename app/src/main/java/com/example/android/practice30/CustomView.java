package com.example.android.practice30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.BLACK);

        Paint paint=new Paint();

        ////绘制矩形，内部不填充
        //抗锯齿
        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.BLUE);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(10);

        //绘制普通矩形
        canvas.drawRect(0, 0, 500,500, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(10, 120);
        path.lineTo(200, 120);
        path.lineTo(100, 200);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        //绘制文本
        paint.setTextSize(30);
        paint.setColor(Color.RED);

        canvas.drawText("android编程", 20, 30, paint);

        Path pathText=new Path();
        pathText.addCircle(200,300,80, Path.Direction.CCW);

        canvas.drawTextOnPath("欢迎来到北京信息科技大学",pathText,0,10,paint);
    }
}
