package p999s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: s.C */
/* JADX INFO: loaded from: classes.dex */
public final class C19286C extends SeekBar {

    /* JADX INFO: renamed from: o0 */
    public final C19288D f61121o0;

    public C19286C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC19311O0.m20394a(this, getContext());
        C19288D c19288d = new C19288D(this);
        this.f61121o0 = c19288d;
        c19288d.mo20357b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C19288D c19288d = this.f61121o0;
        Drawable drawable = c19288d.f61123f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C19286C c19286c = c19288d.f61122e;
        if (drawable.setState(c19286c.getDrawableState())) {
            c19286c.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f61121o0.f61123f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f61121o0.m20359g(canvas);
    }
}
