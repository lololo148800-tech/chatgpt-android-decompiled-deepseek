package p229J0;

import p492U1.C7544i;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p587Y1.InterfaceC9595u;

/* JADX INFO: renamed from: J0.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4154w4 implements InterfaceC9595u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13460a;

    public C4154w4(int i10) {
        this.f13460a = i10;
    }

    @Override // p587Y1.InterfaceC9595u
    /* JADX INFO: renamed from: a */
    public final long mo2638a(C7544i c7544i, long j10, EnumC7546k enumC7546k, long j11) {
        int iM7885b = ((c7544i.m7885b() - ((int) (j11 >> 32))) / 2) + c7544i.f23899a;
        int i10 = c7544i.f23900b - ((int) (j11 & 4294967295L));
        int i11 = this.f13460a;
        int i12 = i10 - i11;
        if (i12 < 0) {
            i12 = c7544i.f23902d + i11;
        }
        return AbstractC9101A4.m9631a(iM7885b, i12);
    }
}
