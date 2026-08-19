package p784hb;

import fo.C13711h;
import p658b5.C11234e;

/* JADX INFO: renamed from: hb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14433b extends C14432a {

    /* JADX INFO: renamed from: d */
    public final long[] f45397d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14433b(C11234e c11234e) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f45397d = jArr3;
        C13711h c13711h = (C13711h) c11234e.f34001Z;
        AbstractC14434c.m15949n(jArr, (long[]) c13711h.f43260o0, (long[]) c13711h.f43259Z);
        AbstractC14434c.m15948m(jArr2, (long[]) c13711h.f43260o0, (long[]) c13711h.f43259Z);
        System.arraycopy((long[]) c13711h.f43261p0, 0, jArr3, 0, 10);
        AbstractC14434c.m15942g(jArr4, (long[]) c11234e.f34002o0, AbstractC14435d.f45405b);
    }

    @Override // p784hb.C14432a
    /* JADX INFO: renamed from: a */
    public final void mo15935a(long[] jArr, long[] jArr2) {
        AbstractC14434c.m15942g(jArr, jArr2, this.f45397d);
    }
}
