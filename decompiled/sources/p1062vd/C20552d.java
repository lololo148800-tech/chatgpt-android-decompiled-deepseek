package p1062vd;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p1051v0.AbstractC20417e;
import p229J0.AbstractC3980S2;
import p349O0.C6021p;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p635a1.C10456n;
import p736f0.C13489g;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: vd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20552d extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C20552d f65241Y = new C20552d(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C13489g AnimatedContent = (C13489g) obj;
        EnumC20540U status = (EnumC20540U) obj2;
        C6021p c6021p = (C6021p) obj3;
        ((Number) obj4).intValue();
        AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
        AbstractC16544l.m18094g(status, "status");
        int iOrdinal = status.ordinal();
        if (iOrdinal != 0) {
            C10456n c10456n = C10456n.f30959Y;
            if (iOrdinal == 1) {
                c6021p.m6524S(-2072208469);
                AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23199d), AbstractC7302f.f23128d, AbstractC20417e.f64539a), c6021p, 0);
                c6021p.m6553p(false);
            } else if (iOrdinal != 2) {
                c6021p.m6524S(186370636);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(185628062);
                AbstractC3980S2.m4668b(AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23201f), 0L, AbstractC7313q.f23197b, AbstractC7302f.m7772a(c6021p), 0, c6021p, 0, 18);
                c6021p.m6553p(false);
            }
        } else {
            c6021p.m6524S(-2072198982);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}
