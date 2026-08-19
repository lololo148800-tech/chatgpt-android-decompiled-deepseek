package p953q0;

import p200Hm.C3508g;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: q0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C18561T implements InterfaceC5982V0 {

    /* JADX INFO: renamed from: Y */
    public final int f59131Y;

    /* JADX INFO: renamed from: Z */
    public final int f59132Z;

    /* JADX INFO: renamed from: o0 */
    public final C6002f0 f59133o0;

    /* JADX INFO: renamed from: p0 */
    public int f59134p0;

    public C18561T(int i10, int i11, int i12) {
        this.f59131Y = i11;
        this.f59132Z = i12;
        int i13 = (i10 / i11) * i11;
        this.f59133o0 = C5997d.m6430Q(AbstractC8301I.m8929t(Math.max(i13 - i12, 0), i13 + i11 + i12), C5975S.f19448r0);
        this.f59134p0 = i10;
    }

    /* JADX INFO: renamed from: c */
    public final void m19939c(int i10) {
        if (i10 != this.f59134p0) {
            this.f59134p0 = i10;
            int i11 = this.f59131Y;
            int i12 = (i10 / i11) * i11;
            int i13 = this.f59132Z;
            this.f59133o0.setValue(AbstractC8301I.m8929t(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    @Override // p349O0.InterfaceC5982V0
    public final Object getValue() {
        return (C3508g) this.f59133o0.getValue();
    }
}
