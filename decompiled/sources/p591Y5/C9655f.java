package p591Y5;

import android.graphics.Color;
import android.graphics.Matrix;
import io.sentry.internal.debugmeta.C15384c;
import p117Eb.C2392v;
import p520V5.C7777f;
import p540W5.C8430a;
import p660b6.C11249a;
import p660b6.C11250b;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: Y5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9655f implements InterfaceC9650a {

    /* JADX INFO: renamed from: a */
    public final AbstractC13029b f29091a;

    /* JADX INFO: renamed from: b */
    public final Object f29092b;

    /* JADX INFO: renamed from: c */
    public final C9654e f29093c;

    /* JADX INFO: renamed from: d */
    public final C9656g f29094d;

    /* JADX INFO: renamed from: e */
    public final C9656g f29095e;

    /* JADX INFO: renamed from: f */
    public final C9656g f29096f;

    /* JADX INFO: renamed from: g */
    public final C9656g f29097g;

    /* JADX INFO: renamed from: h */
    public float f29098h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f29099i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f29100j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public int f29101k = 0;

    /* JADX INFO: renamed from: l */
    public final float[] f29102l = new float[9];

    public C9655f(InterfaceC9650a interfaceC9650a, AbstractC13029b abstractC13029b, C2392v c2392v) {
        this.f29092b = interfaceC9650a;
        this.f29091a = abstractC13029b;
        AbstractC9653d abstractC9653dMo10670p = ((C11249a) c2392v.f7436Z).mo10670p();
        this.f29093c = (C9654e) abstractC9653dMo10670p;
        abstractC9653dMo10670p.m10230a(this);
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        C9656g c9656gMo10670p = ((C11250b) c2392v.f7437o0).mo10670p();
        this.f29094d = c9656gMo10670p;
        c9656gMo10670p.m10230a(this);
        abstractC13029b.m14772d(c9656gMo10670p);
        C9656g c9656gMo10670p2 = ((C11250b) c2392v.f7438p0).mo10670p();
        this.f29095e = c9656gMo10670p2;
        c9656gMo10670p2.m10230a(this);
        abstractC13029b.m14772d(c9656gMo10670p2);
        C9656g c9656gMo10670p3 = ((C11250b) c2392v.f7439q0).mo10670p();
        this.f29096f = c9656gMo10670p3;
        c9656gMo10670p3.m10230a(this);
        abstractC13029b.m14772d(c9656gMo10670p3);
        C9656g c9656gMo10670p4 = ((C11250b) c2392v.f7440r0).mo10670p();
        this.f29097g = c9656gMo10670p4;
        c9656gMo10670p4.m10230a(this);
        abstractC13029b.m14772d(c9656gMo10670p4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y5.a, java.lang.Object] */
    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f29092b.mo9610a();
    }

    /* JADX INFO: renamed from: b */
    public final void m10241b(C8430a c8430a, Matrix matrix, int i10) {
        float fM10243k = this.f29095e.m10243k() * 0.017453292f;
        float fFloatValue = ((Float) this.f29096f.mo10234e()).floatValue();
        double d10 = fM10243k;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        Matrix matrixM10252e = this.f29091a.f41357w.m10252e();
        float[] fArr = this.f29102l;
        matrixM10252e.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[4];
        matrix.getValues(fArr);
        float f12 = fArr[0] / f10;
        float f13 = fSin * f12;
        float f14 = fCos * (fArr[4] / f11);
        int iIntValue = ((Integer) this.f29093c.mo10234e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f29094d.mo10234e()).floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.f29097g.mo10234e()).floatValue() * f12 * 0.33f, Float.MIN_VALUE);
        if (this.f29098h == fMax && this.f29099i == f13 && this.f29100j == f14 && this.f29101k == iArgb) {
            return;
        }
        this.f29098h = fMax;
        this.f29099i = f13;
        this.f29100j = f14;
        this.f29101k = iArgb;
        c8430a.setShadowLayer(fMax, f13, f14, iArgb);
    }

    /* JADX INFO: renamed from: c */
    public final void m10242c(C15384c c15384c) {
        this.f29094d.m10239j(new C7777f(c15384c, 1));
    }
}
