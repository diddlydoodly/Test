package io.github.noobbyte.test;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import io.github.noobbyte.test.game.Util;


public class MainActivity extends Activity {

  private TestView tv_;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Util.SCREEN_HEIGHT = getResources().getDisplayMetrics().heightPixels;
    Util.SCREEN_WIDTH = getResources().getDisplayMetrics().widthPixels;

    tv_ = new TestView(this);

    setContentView(tv_);
  }

}