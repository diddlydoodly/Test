package io.github.noobbyte.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by mini on 3/9/15.
 */
public class TestView extends View {
    public TestView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        canvas.drawCircle(100, 100, 10, p);
    }
}



