package p797i1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: i1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14904f extends C14905g {

    /* JADX INFO: renamed from: e */
    public final C14915q f46426e;

    /* JADX INFO: renamed from: f */
    public final C14915q f46427f;

    /* JADX INFO: renamed from: g */
    public final float[] f46428g;

    public C14904f(C14915q c14915q, C14915q c14915q2, int i10) {
        float[] fArrM16083h;
        super(c14915q2, c14915q, c14915q2, null);
        this.f46426e = c14915q;
        this.f46427f = c14915q2;
        C14917s c14917s = c14915q2.f46453d;
        C14917s c14917s2 = c14915q.f46453d;
        boolean zM16079d = AbstractC14908j.m16079d(c14917s2, c14917s);
        float[] fArrM16083h2 = c14915q.f46458i;
        float[] fArrM16082g = c14915q2.f46459j;
        if (zM16079d) {
            fArrM16083h = AbstractC14908j.m16083h(fArrM16082g, fArrM16083h2);
        } else {
            float[] fArrM16086a = c14917s2.m16086a();
            C14917s c14917s3 = c14915q2.f46453d;
            float[] fArrM16086a2 = c14917s3.m16086a();
            C14917s c14917s4 = AbstractC14908j.f46435b;
            boolean zM16079d2 = AbstractC14908j.m16079d(c14917s2, c14917s4);
            float[] fArr = AbstractC14908j.f46438e;
            float[] fArr2 = C14899a.f46395b.f46396a;
            if (!zM16079d2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                AbstractC16544l.m18093f(fArrCopyOf, "copyOf(this, size)");
                fArrM16083h2 = AbstractC14908j.m16083h(AbstractC14908j.m16078c(fArr2, fArrM16086a, fArrCopyOf), fArrM16083h2);
            }
            if (!AbstractC14908j.m16079d(c14917s3, c14917s4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                AbstractC16544l.m18093f(fArrCopyOf2, "copyOf(this, size)");
                fArrM16082g = AbstractC14908j.m16082g(AbstractC14908j.m16083h(AbstractC14908j.m16078c(fArr2, fArrM16086a2, fArrCopyOf2), c14915q2.f46458i));
            }
            fArrM16083h = AbstractC14908j.m16083h(fArrM16082g, i10 == 3 ? AbstractC14908j.m16084i(new float[]{fArrM16086a[0] / fArrM16086a2[0], fArrM16086a[1] / fArrM16086a2[1], fArrM16086a[2] / fArrM16086a2[2]}, fArrM16083h2) : fArrM16083h2);
        }
        this.f46428g = fArrM16083h;
    }

    @Override // p797i1.C14905g
    /* JADX INFO: renamed from: a */
    public final long mo16075a(long j10) {
        float fM15780h = C14365u.m15780h(j10);
        float fM15779g = C14365u.m15779g(j10);
        float fM15777e = C14365u.m15777e(j10);
        float fM15776d = C14365u.m15776d(j10);
        C14911m c14911m = this.f46426e.f46465p;
        float fMo9580b = (float) c14911m.mo9580b(fM15780h);
        float fMo9580b2 = (float) c14911m.mo9580b(fM15779g);
        float fMo9580b3 = (float) c14911m.mo9580b(fM15777e);
        float[] fArr = this.f46428g;
        float f10 = (fArr[6] * fMo9580b3) + (fArr[3] * fMo9580b2) + (fArr[0] * fMo9580b);
        float f11 = (fArr[7] * fMo9580b3) + (fArr[4] * fMo9580b2) + (fArr[1] * fMo9580b);
        float f12 = (fArr[8] * fMo9580b3) + (fArr[5] * fMo9580b2) + (fArr[2] * fMo9580b);
        C14915q c14915q = this.f46427f;
        float fMo9580b4 = (float) c14915q.f46462m.mo9580b(f10);
        double d10 = f11;
        C14911m c14911m2 = c14915q.f46462m;
        return AbstractC14334L.m15624b(fMo9580b4, (float) c14911m2.mo9580b(d10), (float) c14911m2.mo9580b(f12), fM15776d, c14915q);
    }
}
