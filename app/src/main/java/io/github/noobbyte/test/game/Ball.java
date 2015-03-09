package io.github.noobbyte.test.game;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by noobbyte on 03/09/15.
 */
public class Ball {

  private float x, y, radius, rate;
  private float[] dest, move;
  private Paint p;

  public Ball() {

    p = new Paint();
    p.setColor(Color.BLUE);
    x = Util.SCREEN_WIDTH / 2;
    y = Util.SCREEN_HEIGHT / 2;
    radius = Util.SCREEN_WIDTH / 10;
    dest = new float[2];
    move = new float[2];
    rate = radius / 2;
  }

  public void update() {
    x += move[0];
    y += move[1];
    if (Math.abs(x - dest[0]) < Util.EPSILON) {
      move[0] = 0;
    }
    if (Math.abs(y - dest[1]) < Util.EPSILON) {
      move[1] = 0;
    }
  }

  public void render(Canvas canvas) {
    canvas.drawCircle(x, y, radius, p);
  }

  public void touchUpdate(MotionEvent event) {
    int action = event.getAction();

    if (action == MotionEvent.ACTION_DOWN) {
      dest[0] = event.getX();
      dest[1] = event.getY();
      move[0] = (dest[0] - x) / rate;
      move[1] = (dest[1] - y) / rate;
    }
  }
}
