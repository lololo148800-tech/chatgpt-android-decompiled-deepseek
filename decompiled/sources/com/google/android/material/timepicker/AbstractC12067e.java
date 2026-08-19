package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p140Fa.C2687g;
import p140Fa.C2688h;
import p140Fa.C2690j;
import p329N3.RunnableC5611a;
import p783ha.AbstractC14431a;

/* JADX INFO: renamed from: com.google.android.material.timepicker.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12067e extends ConstraintLayout {

    /* JADX INFO: renamed from: G0 */
    public final RunnableC5611a f36821G0;

    /* JADX INFO: renamed from: H0 */
    public int f36822H0;

    /* JADX INFO: renamed from: I0 */
    public final C2687g f36823I0;

    public AbstractC12067e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2687g c2687g = new C2687g();
        this.f36823I0 = c2687g;
        C2688h c2688h = new C2688h(0.5f);
        C2690j c2690jM3694e = c2687g.f8246Y.f8220a.m3694e();
        c2690jM3694e.f8265e = c2688h;
        c2690jM3694e.f8266f = c2688h;
        c2690jM3694e.f8267g = c2688h;
        c2690jM3694e.f8268h = c2688h;
        c2687g.setShapeAppearanceModel(c2690jM3694e.m3689a());
        this.f36823I0.m3682l(ColorStateList.valueOf(-1));
        C2687g c2687g2 = this.f36823I0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setBackground(c2687g2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45392y, R.attr.materialClockStyle, 0);
        this.f36822H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f36821G0 = new RunnableC5611a(this, 24);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC5611a runnableC5611a = this.f36821G0;
            handler.removeCallbacks(runnableC5611a);
            handler.post(runnableC5611a);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo13685l();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo13685l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC5611a runnableC5611a = this.f36821G0;
            handler.removeCallbacks(runnableC5611a);
            handler.post(runnableC5611a);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f36823I0.m3682l(ColorStateList.valueOf(i10));
    }
}
