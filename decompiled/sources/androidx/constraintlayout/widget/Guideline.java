package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p822j2.C16047d;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: o0 */
    public boolean f32858o0;

    public Guideline(Context context) {
        super(context);
        this.f32858o0 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z6) {
        this.f32858o0 = z6;
    }

    public void setGuidelineBegin(int i10) {
        C16047d c16047d = (C16047d) getLayoutParams();
        if (this.f32858o0 && c16047d.f49529a == i10) {
            return;
        }
        c16047d.f49529a = i10;
        setLayoutParams(c16047d);
    }

    public void setGuidelineEnd(int i10) {
        C16047d c16047d = (C16047d) getLayoutParams();
        if (this.f32858o0 && c16047d.f49531b == i10) {
            return;
        }
        c16047d.f49531b = i10;
        setLayoutParams(c16047d);
    }

    public void setGuidelinePercent(float f10) {
        C16047d c16047d = (C16047d) getLayoutParams();
        if (this.f32858o0 && c16047d.f49533c == f10) {
            return;
        }
        c16047d.f49533c = f10;
        setLayoutParams(c16047d);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32858o0 = true;
        super.setVisibility(8);
    }
}
