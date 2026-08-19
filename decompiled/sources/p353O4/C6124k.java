package p353O4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p692d0.C12966e;

/* JADX INFO: renamed from: O4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6124k extends AbstractC6125l {

    /* JADX INFO: renamed from: a */
    public final Matrix f19935a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f19936b;

    /* JADX INFO: renamed from: c */
    public float f19937c;

    /* JADX INFO: renamed from: d */
    public float f19938d;

    /* JADX INFO: renamed from: e */
    public float f19939e;

    /* JADX INFO: renamed from: f */
    public float f19940f;

    /* JADX INFO: renamed from: g */
    public float f19941g;

    /* JADX INFO: renamed from: h */
    public float f19942h;

    /* JADX INFO: renamed from: i */
    public float f19943i;

    /* JADX INFO: renamed from: j */
    public final Matrix f19944j;

    /* JADX INFO: renamed from: k */
    public String f19945k;

    public C6124k() {
        this.f19935a = new Matrix();
        this.f19936b = new ArrayList();
        this.f19937c = 0.0f;
        this.f19938d = 0.0f;
        this.f19939e = 0.0f;
        this.f19940f = 1.0f;
        this.f19941g = 1.0f;
        this.f19942h = 0.0f;
        this.f19943i = 0.0f;
        this.f19944j = new Matrix();
        this.f19945k = null;
    }

    @Override // p353O4.AbstractC6125l
    /* JADX INFO: renamed from: a */
    public final boolean mo6670a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19936b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC6125l) arrayList.get(i10)).mo6670a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // p353O4.AbstractC6125l
    /* JADX INFO: renamed from: b */
    public final boolean mo6671b(int[] iArr) {
        int i10 = 0;
        boolean zMo6671b = false;
        while (true) {
            ArrayList arrayList = this.f19936b;
            if (i10 >= arrayList.size()) {
                return zMo6671b;
            }
            zMo6671b |= ((AbstractC6125l) arrayList.get(i10)).mo6671b(iArr);
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6672c() {
        Matrix matrix = this.f19944j;
        matrix.reset();
        matrix.postTranslate(-this.f19938d, -this.f19939e);
        matrix.postScale(this.f19940f, this.f19941g);
        matrix.postRotate(this.f19937c, 0.0f, 0.0f);
        matrix.postTranslate(this.f19942h + this.f19938d, this.f19943i + this.f19939e);
    }

    public String getGroupName() {
        return this.f19945k;
    }

    public Matrix getLocalMatrix() {
        return this.f19944j;
    }

    public float getPivotX() {
        return this.f19938d;
    }

    public float getPivotY() {
        return this.f19939e;
    }

    public float getRotation() {
        return this.f19937c;
    }

    public float getScaleX() {
        return this.f19940f;
    }

    public float getScaleY() {
        return this.f19941g;
    }

    public float getTranslateX() {
        return this.f19942h;
    }

    public float getTranslateY() {
        return this.f19943i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f19938d) {
            this.f19938d = f10;
            m6672c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f19939e) {
            this.f19939e = f10;
            m6672c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f19937c) {
            this.f19937c = f10;
            m6672c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f19940f) {
            this.f19940f = f10;
            m6672c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f19941g) {
            this.f19941g = f10;
            m6672c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f19942h) {
            this.f19942h = f10;
            m6672c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f19943i) {
            this.f19943i = f10;
            m6672c();
        }
    }

    public C6124k(C6124k c6124k, C12966e c12966e) {
        AbstractC6126m c6122i;
        this.f19935a = new Matrix();
        this.f19936b = new ArrayList();
        this.f19937c = 0.0f;
        this.f19938d = 0.0f;
        this.f19939e = 0.0f;
        this.f19940f = 1.0f;
        this.f19941g = 1.0f;
        this.f19942h = 0.0f;
        this.f19943i = 0.0f;
        Matrix matrix = new Matrix();
        this.f19944j = matrix;
        this.f19945k = null;
        this.f19937c = c6124k.f19937c;
        this.f19938d = c6124k.f19938d;
        this.f19939e = c6124k.f19939e;
        this.f19940f = c6124k.f19940f;
        this.f19941g = c6124k.f19941g;
        this.f19942h = c6124k.f19942h;
        this.f19943i = c6124k.f19943i;
        String str = c6124k.f19945k;
        this.f19945k = str;
        if (str != null) {
            c12966e.put(str, this);
        }
        matrix.set(c6124k.f19944j);
        ArrayList arrayList = c6124k.f19936b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof C6124k) {
                this.f19936b.add(new C6124k((C6124k) obj, c12966e));
            } else {
                if (obj instanceof C6123j) {
                    C6123j c6123j = (C6123j) obj;
                    C6123j c6123j2 = new C6123j(c6123j);
                    c6123j2.f19925e = 0.0f;
                    c6123j2.f19927g = 1.0f;
                    c6123j2.f19928h = 1.0f;
                    c6123j2.f19929i = 0.0f;
                    c6123j2.f19930j = 1.0f;
                    c6123j2.f19931k = 0.0f;
                    c6123j2.f19932l = Paint.Cap.BUTT;
                    c6123j2.f19933m = Paint.Join.MITER;
                    c6123j2.f19934n = 4.0f;
                    c6123j2.f19924d = c6123j.f19924d;
                    c6123j2.f19925e = c6123j.f19925e;
                    c6123j2.f19927g = c6123j.f19927g;
                    c6123j2.f19926f = c6123j.f19926f;
                    c6123j2.f19948c = c6123j.f19948c;
                    c6123j2.f19928h = c6123j.f19928h;
                    c6123j2.f19929i = c6123j.f19929i;
                    c6123j2.f19930j = c6123j.f19930j;
                    c6123j2.f19931k = c6123j.f19931k;
                    c6123j2.f19932l = c6123j.f19932l;
                    c6123j2.f19933m = c6123j.f19933m;
                    c6123j2.f19934n = c6123j.f19934n;
                    c6122i = c6123j2;
                } else if (obj instanceof C6122i) {
                    c6122i = new C6122i((C6122i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f19936b.add(c6122i);
                Object obj2 = c6122i.f19947b;
                if (obj2 != null) {
                    c12966e.put(obj2, c6122i);
                }
            }
        }
    }
}
