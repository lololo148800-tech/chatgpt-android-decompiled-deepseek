package p999s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.openai.chatgpt.R;
import p030B2.AbstractC0738T;
import p658b5.C11242m;
import p880m.AbstractC17123a;

/* JADX INFO: renamed from: s.D */
/* JADX INFO: loaded from: classes.dex */
public final class C19288D extends C19388y {

    /* JADX INFO: renamed from: e */
    public final C19286C f61122e;

    /* JADX INFO: renamed from: f */
    public Drawable f61123f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f61124g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f61125h;

    /* JADX INFO: renamed from: i */
    public boolean f61126i;

    /* JADX INFO: renamed from: j */
    public boolean f61127j;

    public C19288D(C19286C c19286c) {
        super(c19286c);
        this.f61124g = null;
        this.f61125h = null;
        this.f61126i = false;
        this.f61127j = false;
        this.f61122e = c19286c;
    }

    @Override // p999s.C19388y
    /* JADX INFO: renamed from: b */
    public final void mo20357b(AttributeSet attributeSet, int i10) {
        super.mo20357b(attributeSet, R.attr.seekBarStyle);
        C19286C c19286c = this.f61122e;
        Context context = c19286c.getContext();
        int[] iArr = AbstractC17123a.f54738g;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0738T.m1583k(c19286c, c19286c.getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, R.attr.seekBarStyle);
        Drawable drawableM12602C = c11242mM12599G.m12602C(0);
        if (drawableM12602C != null) {
            c19286c.setThumb(drawableM12602C);
        }
        Drawable drawableM12601B = c11242mM12599G.m12601B(1);
        Drawable drawable = this.f61123f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f61123f = drawableM12601B;
        if (drawableM12601B != null) {
            drawableM12601B.setCallback(c19286c);
            drawableM12601B.setLayoutDirection(c19286c.getLayoutDirection());
            if (drawableM12601B.isStateful()) {
                drawableM12601B.setState(c19286c.getDrawableState());
            }
            m20358f();
        }
        c19286c.invalidate();
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        if (typedArray.hasValue(3)) {
            this.f61125h = AbstractC19357i0.m20463b(typedArray.getInt(3, -1), this.f61125h);
            this.f61127j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f61124g = c11242mM12599G.m12600A(2);
            this.f61126i = true;
        }
        c11242mM12599G.m12606H();
        m20358f();
    }

    /* JADX INFO: renamed from: f */
    public final void m20358f() {
        Drawable drawable = this.f61123f;
        if (drawable != null) {
            if (this.f61126i || this.f61127j) {
                Drawable drawableMutate = drawable.mutate();
                this.f61123f = drawableMutate;
                if (this.f61126i) {
                    drawableMutate.setTintList(this.f61124g);
                }
                if (this.f61127j) {
                    this.f61123f.setTintMode(this.f61125h);
                }
                if (this.f61123f.isStateful()) {
                    this.f61123f.setState(this.f61122e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20359g(Canvas canvas) {
        if (this.f61123f != null) {
            C19286C c19286c = this.f61122e;
            int max = c19286c.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f61123f.getIntrinsicWidth();
                int intrinsicHeight = this.f61123f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f61123f.setBounds(-i10, -i11, i10, i11);
                float width = ((c19286c.getWidth() - c19286c.getPaddingLeft()) - c19286c.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c19286c.getPaddingLeft(), c19286c.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f61123f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
