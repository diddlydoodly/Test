package io.github.noobbyte.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.Arrays;

import io.github.noobbyte.test.game.Ball;

/**
 * Created by mini on 3/9/15.
 */
public class TestView extends View {

  private Ball ball_;

  public TestView(Context context) {
    super(context);
    ball_ = new Ball();
  }

  public void onDraw(Canvas canvas) {
    ball_.update();
    ball_.render(canvas);
    invalidate();
  }

  public boolean onTouchEvent(MotionEvent event) {
    ball_.touchUpdate(event);
    return super.onTouchEvent(event);
  }
}
