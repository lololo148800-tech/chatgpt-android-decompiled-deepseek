package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p360Od.C6172d;
import p360Od.EnumC6170b;
import p403Qd.EnumC6606L;
import p537W0.AbstractC8411c;
import p575Xd.C9449h;
import p575Xd.C9452k;
import p575Xd.C9457p;
import p575Xd.C9463v;
import p575Xd.EnumC9447f;
import p575Xd.EnumC9455n;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Ei.H */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2454H {
    static {
        new C6172d(new C9463v(21, "petstore.swagger.io", "findByStatus", AbstractC17681o.m19382k(new C9449h("allow", EnumC9447f.f28451Z, "44c665ad-cf2c-49cc-a1ad-7213f118ecca"), new C9452k("always_allow", "44c665ad-cf2c-49cc-a1ad-7213f118ecca", "d96aeea22c22347903a5250732759d7b17863134"), new C9457p("deny", EnumC9455n.f28465Z, "44c665ad-cf2c-49cc-a1ad-7213f118ecca")), AbstractC17659D.m19244f(new C17309l("status", "available"), new C17309l("limit", "1"))), "petstore_swagger_io__jit_plugin.findByStatus", EnumC6170b.f20088p0, EnumC6606L.f21327Y, false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3583a(InterfaceC1426a onDismissRequest, InterfaceC1436k onMessagesIntent, InterfaceC1436k onActionClick, InterfaceC10459q interfaceC10459q, C6172d c6172d, C3880A3 c3880a3, C6021p c6021p, int i10) {
        int i11;
        int i12;
        C3880A3 c3880a3M4785f;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(onMessagesIntent, "onMessagesIntent");
        AbstractC16544l.m18094g(onActionClick, "onActionClick");
        c6021p.m6526U(1948785439);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onMessagesIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onActionClick) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 |= c6021p.m6542f(c6172d) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= 65536;
        }
        if ((74899 & i13) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            c3880a4 = c3880a3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                i12 = i13 & (-458753);
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, false);
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-458753);
                interfaceC10459q2 = interfaceC10459q;
                c3880a3M4785f = c3880a3;
            }
            c6021p.m6554q();
            float f10 = 10;
            AbstractC4152w2.m4780a(onDismissRequest, interfaceC10459q2, c3880a3M4785f, 0.0f, AbstractC20417e.m21080b(f10, f10), 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(784725154, c6021p, new C2450F(c6172d, onMessagesIntent, onActionClick, 1)), c6021p, (i12 & 14) | 805306368 | ((i12 >> 6) & 112), 384, 3560);
            interfaceC10459q3 = interfaceC10459q2;
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(onDismissRequest, onMessagesIntent, onActionClick, interfaceC10459q3, c6172d, c3880a4, i10, 0);
        }
    }
}
