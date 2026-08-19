package p858ko;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1095x1.AbstractC21073a0;
import p1095x1.AbstractC21075b0;
import p349O0.C6002f0;
import p492U1.EnumC7546k;
import p523V9.AbstractC8088f6;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8448A4;
import p544W9.AbstractC8753z4;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14343V;
import p878lo.C17105n;
import p878lo.C17106o;

/* JADX INFO: renamed from: ko.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C16518u extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f51238Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16484C f51239Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16518u(C16484C c16484c, int i10) {
        super(0);
        this.f51238Y = i10;
        this.f51239Z = c16484c;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        boolean z6;
        C13801c c13801cM15326m = null;
        int i10 = 0;
        C16484C c16484c = this.f51239Z;
        switch (this.f51238Y) {
            case 0:
                C16503f c16503fM18050c = c16484c.m18050c();
                if (c16503fM18050c != null) {
                    return AbstractC8448A4.m9056a(c16503fM18050c, c16484c.m18055h().mo18064a(c16503fM18050c));
                }
                int i11 = AbstractC21073a0.f66991b;
                return new C17106o(false, AbstractC21075b0.m21561b(0.0f, 0.0f), new C17105n(0.0f, AbstractC21075b0.m21561b(0.0f, 0.0f)), 0L, null, 0L);
            case 1:
                return new C16520w(c16484c);
            case 2:
                if (AbstractC8753z4.m9515c(((C13803e) c16484c.f51143j.getValue()).f43598a)) {
                    C6002f0 c6002f0 = c16484c.f51142i;
                    z6 = !AbstractC16544l.m18089b((InterfaceC16489H) c6002f0.getValue(), C16488G.f51156a) && AbstractC8753z4.m9515c(((InterfaceC16489H) c6002f0.getValue()).mo18061a(((C13803e) c16484c.f51143j.getValue()).f43598a, (EnumC7546k) c16484c.f51141h.getValue()).m15319f());
                }
                return Boolean.valueOf(z6);
            case 3:
                C17106o c17106oM18054g = c16484c.m18054g();
                C16503f c16503fM18050c2 = c16484c.m18050c();
                if (c16503fM18050c2 != null) {
                    c17106oM18054g.getClass();
                    int i12 = C14343V.f45024c;
                    long jM15632j = AbstractC14334L.m15632j(0.0f, 0.0f);
                    C16482A c16482a = new C16482A(c17106oM18054g, i10);
                    C13801c c13801c = c16503fM18050c2.f51190d;
                    long jM8536b = AbstractC8088f6.m8536b(C14343V.m15668b(jM15632j) * C13803e.m15333e(c13801c.m15319f()), C14343V.m15669c(jM15632j) * C13803e.m15331c(c13801c.m15319f()));
                    c13801cM15326m = ((C13801c) c16482a.invoke(c13801c.m15326m((-9223372034707292160L) ^ jM8536b))).m15326m(jM8536b);
                }
                if (c13801cM15326m != null) {
                    return c13801cM15326m;
                }
                if (c16484c.f51146m.getValue() == null) {
                    return C13801c.f43585e;
                }
                throw new ClassCastException();
            case 4:
                C16503f c16503fM18050c3 = c16484c.m18050c();
                if (c16503fM18050c3 == null) {
                    return null;
                }
                C16501d c16501dMo18064a = c16484c.m18055h().mo18064a(c16503fM18050c3);
                C16485D c16485d = c16484c.m18056i().f51154c;
                long j10 = c16503fM18050c3.f51188b;
                float fM18060a = c16485d.m18060a(j10) / AbstractC8753z4.m9514b(j10);
                C16485D c16485d2 = c16484c.m18056i().f51154c;
                float fMax = Math.max(c16485d2.f51151b, c16485d2.m18060a(j10)) / AbstractC8753z4.m9514b(j10);
                float fM8920k = AbstractC8301I.m8920k(c16501dMo18064a.f51185b, fM18060a, fMax);
                return Float.valueOf(((Float.compare(fM8920k, fM18060a) == 0) && Float.compare(fM18060a, fMax) == 0) ? 1.0f : AbstractC8301I.m8920k((fM8920k - fM18060a) / (fMax - fM18060a), 0.0f, 1.0f));
            default:
                return c16484c.m18054g();
        }
    }
}
