package p858ko;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21073a0;
import p1139z0.C21585H;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8448A4;
import p544W9.AbstractC8454B4;
import p544W9.AbstractC8753z4;
import p562X0.C9008c;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p878lo.C17090M;
import p878lo.C17091N;
import p878lo.C17106o;

/* JADX INFO: renamed from: ko.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C16512o extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C16512o f51213Y = new C16512o(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17090M c17090m;
        C9008c Saver = (C9008c) obj;
        C16484C state = (C16484C) obj2;
        AbstractC16544l.m18094g(Saver, "$this$Saver");
        AbstractC16544l.m18094g(state, "state");
        C21585H c21585h = C16484C.f51133q;
        C16503f c16503fM18050c = state.m18050c();
        if (c16503fM18050c == null) {
            return null;
        }
        C16501d c16501dMo18064a = state.m18055h().mo18064a(c16503fM18050c);
        long jM9066a = AbstractC8454B4.m9066a(c16501dMo18064a.f51184a);
        long jM9066a2 = AbstractC8454B4.m9066a(c16501dMo18064a.f51186c);
        long j10 = c16503fM18050c.f51187a;
        C13803e c13803e = new C13803e(j10);
        if (!AbstractC8753z4.m9515c(j10)) {
            c13803e = null;
        }
        if (c13803e != null) {
            long j11 = c13803e.f43598a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C13803e.m15333e(j11))) << 32) | (((long) Float.floatToRawIntBits(C13803e.m15331c(j11))) & 4294967295L);
            C17106o c17106oM9056a = AbstractC8448A4.m9056a(c16503fM18050c, c16501dMo18064a);
            long jM8605c = AbstractC8112i6.m8605c(j11);
            C13801c c13801c = c16503fM18050c.f51190d;
            long j12 = c17106oM9056a.f54660b;
            float fM21556b = AbstractC21073a0.m21556b(j12) * c13801c.f43586a;
            long j13 = c17106oM9056a.f54662d;
            float fM15306g = C13800b.m15306g(j13) + fM21556b;
            AbstractC21073a0.m21556b(j12);
            C13800b.m15306g(j13);
            float fM15307h = C13800b.m15307h(j13) + (AbstractC21073a0.m21557c(j12) * c13801c.f43587b);
            AbstractC21073a0.m21557c(j12);
            C13800b.m15307h(j13);
            long jM9066a3 = AbstractC8454B4.m9066a(C13800b.m15311l(AbstractC8753z4.m9513a(C13800b.m15310k(jM8605c, AbstractC8088f6.m8536b(fM15306g, fM15307h)), j12), c13801c.m15320g()));
            long jM21558d = AbstractC21073a0.m21558d(c16501dMo18064a.f51185b, c16503fM18050c.f51188b);
            c17090m = new C17090M(jFloatToRawIntBits, jM9066a3, (((long) Float.floatToRawIntBits(AbstractC21073a0.m21556b(jM21558d))) << 32) | (((long) Float.floatToRawIntBits(AbstractC21073a0.m21557c(jM21558d))) & 4294967295L));
        } else {
            c17090m = null;
        }
        return new C17091N(jM9066a, c16501dMo18064a.f51185b, jM9066a2, c17090m);
    }
}
