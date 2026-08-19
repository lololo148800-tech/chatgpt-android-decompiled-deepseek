package p140Fa;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: Fa.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2700t {

    /* JADX INFO: renamed from: a */
    public float f8305a;

    /* JADX INFO: renamed from: b */
    public float f8306b;

    /* JADX INFO: renamed from: c */
    public float f8307c;

    /* JADX INFO: renamed from: d */
    public float f8308d;

    /* JADX INFO: renamed from: e */
    public float f8309e;

    /* JADX INFO: renamed from: f */
    public Object f8310f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public Object f8311g = new ArrayList();

    public C2700t() {
        m3701d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m3698a(float f10) {
        float f11 = this.f8308d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f8306b;
        float f14 = this.f8307c;
        C2696p c2696p = new C2696p(f13, f14, f13, f14);
        c2696p.f8298f = this.f8308d;
        c2696p.f8299g = f12;
        ((ArrayList) this.f8311g).add(new C2694n(c2696p));
        this.f8308d = f10;
    }

    /* JADX INFO: renamed from: b */
    public void m3699b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f8310f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2698r) arrayList.get(i10)).mo3697a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3700c(float f10, float f11) {
        C2697q c2697q = new C2697q();
        c2697q.f8300b = f10;
        c2697q.f8301c = f11;
        ((ArrayList) this.f8310f).add(c2697q);
        C2695o c2695o = new C2695o(c2697q, this.f8306b, this.f8307c);
        float fM3696b = c2695o.m3696b() + 270.0f;
        float fM3696b2 = c2695o.m3696b() + 270.0f;
        m3698a(fM3696b);
        ((ArrayList) this.f8311g).add(c2695o);
        this.f8308d = fM3696b2;
        this.f8306b = f10;
        this.f8307c = f11;
    }

    /* JADX INFO: renamed from: d */
    public void m3701d(float f10, float f11, float f12) {
        this.f8305a = f10;
        this.f8306b = 0.0f;
        this.f8307c = f10;
        this.f8308d = f11;
        this.f8309e = (f11 + f12) % 360.0f;
        ((ArrayList) this.f8310f).clear();
        ((ArrayList) this.f8311g).clear();
    }
}
