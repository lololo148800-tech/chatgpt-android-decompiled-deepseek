package p228J;

import p158G3.C2988g;
import p178H.C3146g0;
import p178H.InterfaceC3148h0;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: J.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3792A0 implements InterfaceC3148h0 {

    /* JADX INFO: renamed from: b */
    public final long f11463b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3148h0 f11464c;

    public C3792A0(long j10, InterfaceC3148h0 interfaceC3148h0) {
        AbstractC4941g.m5554M("Timeout must be non-negative.", j10 >= 0);
        this.f11463b = j10;
        this.f11464c = interfaceC3148h0;
    }

    @Override // p178H.InterfaceC3148h0
    /* JADX INFO: renamed from: a */
    public final long mo3985a() {
        return this.f11463b;
    }

    @Override // p178H.InterfaceC3148h0
    /* JADX INFO: renamed from: b */
    public final C3146g0 mo3986b(C2988g c2988g) {
        C3146g0 c3146g0Mo3986b = this.f11464c.mo3986b(c2988g);
        long j10 = this.f11463b;
        if (j10 > 0) {
            return c2988g.f8971b >= j10 - c3146g0Mo3986b.f9468a ? C3146g0.f9465d : c3146g0Mo3986b;
        }
        return c3146g0Mo3986b;
    }
}
