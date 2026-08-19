package tf;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0172H0;
import p049Bm.InterfaceC1426a;
import p1051v0.AbstractC20417e;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p953q0.C18557O;

/* JADX INFO: renamed from: tf.M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19908M {

    /* JADX INFO: renamed from: a */
    public static final long f63103a = AbstractC14334L.m15626d(4292269267L);

    /* JADX INFO: renamed from: b */
    public static final float f63104b = 10;

    /* JADX INFO: renamed from: c */
    public static final long f63105c = C14365u.m15774b(0.8f, C14365u.f45052b);

    /* JADX INFO: renamed from: a */
    public static final void m20797a(InterfaceC1426a onDismissRequest, String prompt, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C3880A3 c3880a3M4785f;
        int i12;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(prompt, "prompt");
        c6021p.m6526U(800299880);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(prompt) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1408;
        }
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            c3880a4 = c3880a3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                interfaceC10459q2 = C10456n.f30959Y;
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                i12 = i13 & (-7169);
            } else {
                c6021p.m6517L();
                i12 = i13 & (-7169);
                interfaceC10459q2 = interfaceC10459q;
                c3880a3M4785f = c3880a3;
            }
            c6021p.m6554q();
            InterfaceC0172H0 interfaceC0172H0 = (InterfaceC0172H0) c6021p.m6548k(AbstractC0187M0.f702d);
            float f10 = f63104b;
            AbstractC4152w2.m4780a(onDismissRequest, interfaceC10459q2, c3880a3M4785f, 0.0f, AbstractC20417e.m21080b(f10, f10), f63105c, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(501126597, c6021p, new C19907L(prompt, interfaceC0172H0, onDismissRequest)), c6021p, (i12 & 14) | 196608 | ((i12 >> 3) & 112), 384, 4040);
            interfaceC10459q3 = interfaceC10459q2;
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(onDismissRequest, prompt, interfaceC10459q3, c3880a4, i10, 8);
        }
    }
}
