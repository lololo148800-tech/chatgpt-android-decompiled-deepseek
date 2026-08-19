package p842k0;

import p492U1.C7544i;
import p492U1.EnumC7546k;
import p544W9.AbstractC8584X3;
import p571X9.AbstractC9101A4;
import p587Y1.InterfaceC9595u;

/* JADX INFO: renamed from: k0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16298g implements InterfaceC9595u {

    /* JADX INFO: renamed from: a */
    public final long f50489a;

    public C16298g(long j10) {
        this.f50489a = j10;
    }

    @Override // p587Y1.InterfaceC9595u
    /* JADX INFO: renamed from: a */
    public final long mo2638a(C7544i c7544i, long j10, EnumC7546k enumC7546k, long j11) {
        int i10 = c7544i.f23899a;
        long j12 = this.f50489a;
        return AbstractC9101A4.m9631a(AbstractC8584X3.m9249a(i10 + ((int) (j12 >> 32)), (int) (j11 >> 32), (int) (j10 >> 32), enumC7546k == EnumC7546k.f23904Y), AbstractC8584X3.m9249a(c7544i.f23900b + ((int) (j12 & 4294967295L)), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), true));
    }
}
