package p353O4;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p013Ab.C0420b;

/* JADX INFO: renamed from: O4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6123j extends AbstractC6126m {

    /* JADX INFO: renamed from: d */
    public C0420b f19924d;

    /* JADX INFO: renamed from: e */
    public float f19925e;

    /* JADX INFO: renamed from: f */
    public C0420b f19926f;

    /* JADX INFO: renamed from: g */
    public float f19927g;

    /* JADX INFO: renamed from: h */
    public float f19928h;

    /* JADX INFO: renamed from: i */
    public float f19929i;

    /* JADX INFO: renamed from: j */
    public float f19930j;

    /* JADX INFO: renamed from: k */
    public float f19931k;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f19932l;

    /* JADX INFO: renamed from: m */
    public Paint.Join f19933m;

    /* JADX INFO: renamed from: n */
    public float f19934n;

    @Override // p353O4.AbstractC6125l
    /* JADX INFO: renamed from: a */
    public final boolean mo6670a() {
        return this.f19926f.m1068x() || this.f19924d.m1068x();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p353O4.AbstractC6125l
    /* JADX INFO: renamed from: b */
    public final boolean mo6671b(int[] iArr) {
        boolean z6;
        C0420b c0420b = this.f19926f;
        boolean z10 = false;
        if (c0420b.m1068x()) {
            ColorStateList colorStateList = (ColorStateList) c0420b.f1383p0;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0420b.f1381Z) {
                c0420b.f1381Z = colorForState;
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        C0420b c0420b2 = this.f19924d;
        if (c0420b2.m1068x()) {
            ColorStateList colorStateList2 = (ColorStateList) c0420b2.f1383p0;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0420b2.f1381Z) {
                c0420b2.f1381Z = colorForState2;
                z10 = true;
            }
        }
        return z6 | z10;
    }

    public float getFillAlpha() {
        return this.f19928h;
    }

    public int getFillColor() {
        return this.f19926f.f1381Z;
    }

    public float getStrokeAlpha() {
        return this.f19927g;
    }

    public int getStrokeColor() {
        return this.f19924d.f1381Z;
    }

    public float getStrokeWidth() {
        return this.f19925e;
    }

    public float getTrimPathEnd() {
        return this.f19930j;
    }

    public float getTrimPathOffset() {
        return this.f19931k;
    }

    public float getTrimPathStart() {
        return this.f19929i;
    }

    public void setFillAlpha(float f10) {
        this.f19928h = f10;
    }

    public void setFillColor(int i10) {
        this.f19926f.f1381Z = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f19927g = f10;
    }

    public void setStrokeColor(int i10) {
        this.f19924d.f1381Z = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f19925e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f19930j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f19931k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f19929i = f10;
    }
}
