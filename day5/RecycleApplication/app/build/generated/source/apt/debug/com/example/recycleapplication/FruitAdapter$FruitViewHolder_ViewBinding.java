// Generated code from Butter Knife. Do not modify!
package com.example.recycleapplication;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FruitAdapter$FruitViewHolder_ViewBinding implements Unbinder {
  private FruitAdapter.FruitViewHolder target;

  @UiThread
  public FruitAdapter$FruitViewHolder_ViewBinding(FruitAdapter.FruitViewHolder target,
      View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.iv_fruit, "field 'imageView'", ImageView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.tv_fruit, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FruitAdapter.FruitViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.textView = null;
  }
}
