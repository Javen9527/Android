//--------------------------------------------------------------//
//新建RectView类：

package com.telenav.transformerhmi.nav; //替换上下文包

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;


public class RectView extends View {
    private String TAG = "MyView.RectView";
    private int width, height;
    public Rect rect = new Rect(100, 100, 500, 500);

    public RectView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public void setValue(Rect rect) {
        this.rect = rect;
        invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        
        canvas.drawRect(rect, paint);
    }
}

//--------------------------------------------------------------//
//在xml中：
xmlns:tools="http://schemas.android.com/tools"
  
<com.telenav.transformerhmi.nav.RectView
            android:id="@+id/rectView"
            android:layout_height="wrap_content"
            android:layout_width="wrap_content"
            tools:ignore="MissingConstraints">
</com.telenav.transformerhmi.nav.RectView>

//--------------------------------------------------------------//
//在需要绘制的地方：

import com.telenav.transformerhmi.nav.RectView

activity?.findViewById<RectView>(R.id.rectView)?.setValue(rect)


