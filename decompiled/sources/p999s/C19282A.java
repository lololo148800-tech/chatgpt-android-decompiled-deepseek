package p999s;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: s.A */
/* JADX INFO: loaded from: classes.dex */
public final class C19282A extends RatingBar {

    /* JADX INFO: renamed from: o0 */
    public final C19388y f61090o0;

    public C19282A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC19311O0.m20394a(this, getContext());
        C19388y c19388y = new C19388y(this);
        this.f61090o0 = c19388y;
        c19388y.mo20357b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmap = (Bitmap) this.f61090o0.f61406c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
