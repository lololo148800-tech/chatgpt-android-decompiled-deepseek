package p365Oi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9162L;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Oi.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6257e implements InterfaceC6255c {

    /* JADX INFO: renamed from: b */
    public float f20334b;

    /* JADX INFO: renamed from: c */
    public float f20335c;

    /* JADX INFO: renamed from: e */
    public int f20337e;

    /* JADX INFO: renamed from: f */
    public float f20338f;

    /* JADX INFO: renamed from: g */
    public float f20339g;

    /* JADX INFO: renamed from: a */
    public final C6258f f20333a = new C6258f(1, 4, AbstractC9393x3.m9974d(Float.valueOf(120.0f)), 1.0f);

    /* JADX INFO: renamed from: d */
    public final float[] f20336d = new float[960];

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: a */
    public final float mo6742a(float f10, boolean z6) {
        float f11 = this.f20334b * (z6 ? 10 : 5);
        float f12 = f11 / (1 + f11);
        float f13 = this.f20335c;
        float f14 = (z6 ? 30.0f : 5.0f) / f10;
        if (f12 <= f13) {
            f14 = z6 ? 0.08f : 0.05f;
        }
        float fM9712b = AbstractC9162L.m9712b(f13, f12, f14);
        this.f20335c = fM9712b;
        return fM9712b;
    }

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: b */
    public final float[] mo6743b(float f10) {
        return this.f20333a.m6748b(f10);
    }

    @Override // p365Oi.InterfaceC6255c
    /* JADX INFO: renamed from: c */
    public final void mo6744c(byte[] buffer) {
        AbstractC16544l.m18094g(buffer, "buffer");
        float[] fArrM9713c = AbstractC9162L.m9713c(buffer);
        ArrayList arrayList = new ArrayList(fArrM9713c.length);
        for (float f10 : fArrM9713c) {
            arrayList.add(Float.valueOf(AbstractC8301I.m8920k(f10 - this.f20339g, -1.0f, 1.0f)));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf((((Number) it.next()).floatValue() + 1.0f) / 2.0f));
        }
        float[] fArrM19320A0 = AbstractC17680n.m19320A0(arrayList2);
        float f11 = this.f20338f;
        int i10 = this.f20337e;
        float[] fArr = this.f20336d;
        float f12 = f11 - fArr[i10];
        this.f20338f = f12;
        float fM19289L = AbstractC17678l.m19289L(fArrM9713c) + f12;
        this.f20338f = fM19289L;
        this.f20339g = fM19289L / fArrM19320A0.length;
        fArr[this.f20337e] = AbstractC17678l.m19289L(fArr);
        int i11 = 1;
        this.f20337e = (this.f20337e + 1) % fArrM19320A0.length;
        if (fArrM9713c.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArrM9713c[0];
        int length = fArrM9713c.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArrM9713c[i11]);
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f20334b = fMax;
        this.f20333a.m6749d(fArrM19320A0);
    }
}
