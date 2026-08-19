package p797i1;

import p774h1.C14365u;

/* JADX INFO: renamed from: i1.g */
/* JADX INFO: loaded from: classes.dex */
public class C14905g {

    /* JADX INFO: renamed from: a */
    public final AbstractC14901c f46429a;

    /* JADX INFO: renamed from: b */
    public final AbstractC14901c f46430b;

    /* JADX INFO: renamed from: c */
    public final AbstractC14901c f46431c;

    /* JADX INFO: renamed from: d */
    public final float[] f46432d;

    public C14905g(AbstractC14901c abstractC14901c, AbstractC14901c abstractC14901c2, AbstractC14901c abstractC14901c3, float[] fArr) {
        this.f46429a = abstractC14901c;
        this.f46430b = abstractC14901c2;
        this.f46431c = abstractC14901c3;
        this.f46432d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo16075a(long j10) {
        float fM15780h = C14365u.m15780h(j10);
        float fM15779g = C14365u.m15779g(j10);
        float fM15777e = C14365u.m15777e(j10);
        float fM15776d = C14365u.m15776d(j10);
        AbstractC14901c abstractC14901c = this.f46430b;
        long jMo16072d = abstractC14901c.mo16072d(fM15780h, fM15779g, fM15777e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo16072d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo16072d & 4294967295L));
        float fMo16073e = abstractC14901c.mo16073e(fM15780h, fM15779g, fM15777e);
        float[] fArr = this.f46432d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo16073e *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f46431c.mo16074f(f10, f11, fMo16073e, fM15776d, this.f46429a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14905g(AbstractC14901c abstractC14901c, AbstractC14901c abstractC14901c2, int i10) {
        long j10 = abstractC14901c.f46403b;
        long j11 = AbstractC14900b.f46397a;
        AbstractC14901c abstractC14901cM16076a = AbstractC14900b.m16067a(j10, j11) ? AbstractC14908j.m16076a(abstractC14901c) : abstractC14901c;
        AbstractC14901c abstractC14901cM16076a2 = AbstractC14900b.m16067a(abstractC14901c2.f46403b, j11) ? AbstractC14908j.m16076a(abstractC14901c2) : abstractC14901c2;
        float[] fArr = null;
        if (i10 == 3) {
            boolean zM16067a = AbstractC14900b.m16067a(abstractC14901c.f46403b, j11);
            boolean zM16067a2 = AbstractC14900b.m16067a(abstractC14901c2.f46403b, j11);
            if ((!zM16067a || !zM16067a2) && (zM16067a || zM16067a2)) {
                abstractC14901c = zM16067a ? abstractC14901c : abstractC14901c2;
                float[] fArrM16086a = AbstractC14908j.f46438e;
                C14917s c14917s = ((C14915q) abstractC14901c).f46453d;
                float[] fArrM16086a2 = zM16067a ? c14917s.m16086a() : fArrM16086a;
                fArrM16086a = zM16067a2 ? c14917s.m16086a() : fArrM16086a;
                fArr = new float[]{fArrM16086a2[0] / fArrM16086a[0], fArrM16086a2[1] / fArrM16086a[1], fArrM16086a2[2] / fArrM16086a[2]};
            }
        }
        this(abstractC14901c2, abstractC14901cM16076a, abstractC14901cM16076a2, fArr);
    }
}
