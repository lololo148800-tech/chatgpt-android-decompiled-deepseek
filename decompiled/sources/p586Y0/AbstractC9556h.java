package p586Y0;

import p049Bm.InterfaceC1436k;
import p658b5.C11242m;

/* JADX INFO: renamed from: Y0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9556h {

    /* JADX INFO: renamed from: a */
    public C9560l f28738a;

    /* JADX INFO: renamed from: b */
    public int f28739b;

    /* JADX INFO: renamed from: c */
    public boolean f28740c;

    /* JADX INFO: renamed from: d */
    public int f28741d;

    public AbstractC9556h(int i10, C9560l c9560l) {
        int iM3493a;
        int iNumberOfTrailingZeros;
        this.f28738a = c9560l;
        this.f28739b = i10;
        if (i10 != 0) {
            C9560l c9560lMo10045e = mo10045e();
            C11242m c11242m = AbstractC9562n.f28758a;
            int[] iArr = c9560lMo10045e.f28754p0;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j10 = c9560lMo10045e.f28752Z;
                int i11 = c9560lMo10045e.f28753o0;
                if (j10 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = c9560lMo10045e.f28751Y;
                    if (j11 != 0) {
                        i11 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                i10 = iNumberOfTrailingZeros + i11;
            }
            synchronized (AbstractC9562n.f28759b) {
                iM3493a = AbstractC9562n.f28762e.m3493a(i10);
            }
        } else {
            iM3493a = -1;
        }
        this.f28741d = iM3493a;
    }

    /* JADX INFO: renamed from: p */
    public static void m10068p(AbstractC9556h abstractC9556h) {
        AbstractC9562n.f28758a.m12607I(abstractC9556h);
    }

    /* JADX INFO: renamed from: a */
    public final void m10069a() {
        synchronized (AbstractC9562n.f28759b) {
            mo10063b();
            mo10064o();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo10063b() {
        AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10073j(mo10044d());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10043c();

    /* JADX INFO: renamed from: d */
    public int mo10044d() {
        return this.f28739b;
    }

    /* JADX INFO: renamed from: e */
    public C9560l mo10045e() {
        return this.f28738a;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC1436k mo10046f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo10047g();

    /* JADX INFO: renamed from: h */
    public int mo10048h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC1436k mo10049i();

    /* JADX INFO: renamed from: j */
    public final AbstractC9556h m10070j() {
        C11242m c11242m = AbstractC9562n.f28758a;
        AbstractC9556h abstractC9556h = (AbstractC9556h) c11242m.m12621z();
        c11242m.m12607I(this);
        return abstractC9556h;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo10050k();

    /* JADX INFO: renamed from: l */
    public abstract void mo10051l();

    /* JADX INFO: renamed from: m */
    public abstract void mo10052m();

    /* JADX INFO: renamed from: n */
    public abstract void mo10053n(InterfaceC9542A interfaceC9542A);

    /* JADX INFO: renamed from: o */
    public void mo10064o() {
        int i10 = this.f28741d;
        if (i10 >= 0) {
            AbstractC9562n.m10098v(i10);
            this.f28741d = -1;
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo10054q(int i10) {
        this.f28739b = i10;
    }

    /* JADX INFO: renamed from: r */
    public void mo10055r(C9560l c9560l) {
        this.f28738a = c9560l;
    }

    /* JADX INFO: renamed from: s */
    public void mo10056s(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: t */
    public abstract AbstractC9556h mo10057t(InterfaceC1436k interfaceC1436k);
}
