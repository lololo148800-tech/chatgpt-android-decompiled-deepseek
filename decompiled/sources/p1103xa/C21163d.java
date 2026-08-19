package p1103xa;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p806ia.AbstractC14951a;

/* JADX INFO: renamed from: xa.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21163d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f67255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f67256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f67257c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f67258d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f67259e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f67260f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f67261g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Matrix f67262h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC21167h f67263i;

    public C21163d(AbstractC21167h abstractC21167h, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
        this.f67263i = abstractC21167h;
        this.f67255a = f10;
        this.f67256b = f11;
        this.f67257c = f12;
        this.f67258d = f13;
        this.f67259e = f14;
        this.f67260f = f15;
        this.f67261g = f16;
        this.f67262h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC21167h abstractC21167h = this.f67263i;
        abstractC21167h.f67299s.setAlpha(AbstractC14951a.m16114b(this.f67255a, this.f67256b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = abstractC21167h.f67299s;
        float f10 = this.f67257c;
        float f11 = this.f67258d;
        floatingActionButton.setScaleX(AbstractC14951a.m16113a(f10, f11, fFloatValue));
        abstractC21167h.f67299s.setScaleY(AbstractC14951a.m16113a(this.f67259e, f11, fFloatValue));
        float f12 = this.f67260f;
        float f13 = this.f67261g;
        abstractC21167h.f67296p = AbstractC14951a.m16113a(f12, f13, fFloatValue);
        float fM16113a = AbstractC14951a.m16113a(f12, f13, fFloatValue);
        Matrix matrix = this.f67262h;
        abstractC21167h.m21596a(fM16113a, matrix);
        abstractC21167h.f67299s.setImageMatrix(matrix);
    }
}
