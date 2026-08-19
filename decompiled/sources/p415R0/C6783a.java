package p415R0;

import java.util.List;
import p440S0.AbstractC6977c;
import p594Y9.AbstractC9870d0;
import p909nm.AbstractC17671e;

/* JADX INFO: renamed from: R0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6783a extends AbstractC17671e {

    /* JADX INFO: renamed from: Y */
    public final AbstractC6977c f21790Y;

    /* JADX INFO: renamed from: Z */
    public final int f21791Z;

    /* JADX INFO: renamed from: o0 */
    public final int f21792o0;

    public C6783a(AbstractC6977c abstractC6977c, int i10, int i11) {
        this.f21790Y = abstractC6977c;
        this.f21791Z = i10;
        AbstractC9870d0.m10525c(i10, i11, abstractC6977c.mo1316f());
        this.f21792o0 = i11 - i10;
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f21792o0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC9870d0.m10523a(i10, this.f21792o0);
        return this.f21790Y.get(this.f21791Z + i10);
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final List subList(int i10, int i11) {
        AbstractC9870d0.m10525c(i10, i11, this.f21792o0);
        int i12 = this.f21791Z;
        return new C6783a(this.f21790Y, i10 + i12, i12 + i11);
    }
}
