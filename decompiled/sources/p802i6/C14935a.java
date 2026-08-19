package p802i6;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import p520V5.C7781j;
import p675c6.C11668c;

/* JADX INFO: renamed from: i6.a */
/* JADX INFO: loaded from: classes.dex */
public class C14935a {

    /* JADX INFO: renamed from: a */
    public final C7781j f46524a;

    /* JADX INFO: renamed from: b */
    public final Object f46525b;

    /* JADX INFO: renamed from: c */
    public Object f46526c;

    /* JADX INFO: renamed from: d */
    public final BaseInterpolator f46527d;

    /* JADX INFO: renamed from: e */
    public final BaseInterpolator f46528e;

    /* JADX INFO: renamed from: f */
    public final BaseInterpolator f46529f;

    /* JADX INFO: renamed from: g */
    public final float f46530g;

    /* JADX INFO: renamed from: h */
    public Float f46531h;

    /* JADX INFO: renamed from: i */
    public float f46532i;

    /* JADX INFO: renamed from: j */
    public float f46533j;

    /* JADX INFO: renamed from: k */
    public int f46534k;

    /* JADX INFO: renamed from: l */
    public int f46535l;

    /* JADX INFO: renamed from: m */
    public float f46536m;

    /* JADX INFO: renamed from: n */
    public float f46537n;

    /* JADX INFO: renamed from: o */
    public PointF f46538o;

    /* JADX INFO: renamed from: p */
    public PointF f46539p;

    public C14935a(C7781j c7781j, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f10, Float f11) {
        this.f46532i = -3987645.8f;
        this.f46533j = -3987645.8f;
        this.f46534k = 784923401;
        this.f46535l = 784923401;
        this.f46536m = Float.MIN_VALUE;
        this.f46537n = Float.MIN_VALUE;
        this.f46538o = null;
        this.f46539p = null;
        this.f46524a = c7781j;
        this.f46525b = obj;
        this.f46526c = obj2;
        this.f46527d = baseInterpolator;
        this.f46528e = null;
        this.f46529f = null;
        this.f46530g = f10;
        this.f46531h = f11;
    }

    /* JADX INFO: renamed from: a */
    public final float m16095a() {
        C7781j c7781j = this.f46524a;
        if (c7781j == null) {
            return 1.0f;
        }
        if (this.f46537n == Float.MIN_VALUE) {
            if (this.f46531h == null) {
                this.f46537n = 1.0f;
            } else {
                this.f46537n = ((this.f46531h.floatValue() - this.f46530g) / (c7781j.f24592m - c7781j.f24591l)) + m16096b();
            }
        }
        return this.f46537n;
    }

    /* JADX INFO: renamed from: b */
    public final float m16096b() {
        C7781j c7781j = this.f46524a;
        if (c7781j == null) {
            return 0.0f;
        }
        if (this.f46536m == Float.MIN_VALUE) {
            float f10 = c7781j.f24591l;
            this.f46536m = (this.f46530g - f10) / (c7781j.f24592m - f10);
        }
        return this.f46536m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16097c() {
        return this.f46527d == null && this.f46528e == null && this.f46529f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f46525b + ", endValue=" + this.f46526c + ", startFrame=" + this.f46530g + ", endFrame=" + this.f46531h + ", interpolator=" + this.f46527d + '}';
    }

    public C14935a(C7781j c7781j, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f10) {
        this.f46532i = -3987645.8f;
        this.f46533j = -3987645.8f;
        this.f46534k = 784923401;
        this.f46535l = 784923401;
        this.f46536m = Float.MIN_VALUE;
        this.f46537n = Float.MIN_VALUE;
        this.f46538o = null;
        this.f46539p = null;
        this.f46524a = c7781j;
        this.f46525b = obj;
        this.f46526c = obj2;
        this.f46527d = null;
        this.f46528e = baseInterpolator;
        this.f46529f = baseInterpolator2;
        this.f46530g = f10;
        this.f46531h = null;
    }

    public C14935a(C7781j c7781j, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, BaseInterpolator baseInterpolator3, float f10, Float f11) {
        this.f46532i = -3987645.8f;
        this.f46533j = -3987645.8f;
        this.f46534k = 784923401;
        this.f46535l = 784923401;
        this.f46536m = Float.MIN_VALUE;
        this.f46537n = Float.MIN_VALUE;
        this.f46538o = null;
        this.f46539p = null;
        this.f46524a = c7781j;
        this.f46525b = obj;
        this.f46526c = obj2;
        this.f46527d = baseInterpolator;
        this.f46528e = baseInterpolator2;
        this.f46529f = baseInterpolator3;
        this.f46530g = f10;
        this.f46531h = f11;
    }

    public C14935a(Object obj) {
        this.f46532i = -3987645.8f;
        this.f46533j = -3987645.8f;
        this.f46534k = 784923401;
        this.f46535l = 784923401;
        this.f46536m = Float.MIN_VALUE;
        this.f46537n = Float.MIN_VALUE;
        this.f46538o = null;
        this.f46539p = null;
        this.f46524a = null;
        this.f46525b = obj;
        this.f46526c = obj;
        this.f46527d = null;
        this.f46528e = null;
        this.f46529f = null;
        this.f46530g = Float.MIN_VALUE;
        this.f46531h = Float.valueOf(Float.MAX_VALUE);
    }

    public C14935a(C11668c c11668c, C11668c c11668c2) {
        this.f46532i = -3987645.8f;
        this.f46533j = -3987645.8f;
        this.f46534k = 784923401;
        this.f46535l = 784923401;
        this.f46536m = Float.MIN_VALUE;
        this.f46537n = Float.MIN_VALUE;
        this.f46538o = null;
        this.f46539p = null;
        this.f46524a = null;
        this.f46525b = c11668c;
        this.f46526c = c11668c2;
        this.f46527d = null;
        this.f46528e = null;
        this.f46529f = null;
        this.f46530g = Float.MIN_VALUE;
        this.f46531h = Float.valueOf(Float.MAX_VALUE);
    }
}
