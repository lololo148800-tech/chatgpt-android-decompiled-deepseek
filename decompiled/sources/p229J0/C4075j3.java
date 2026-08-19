package p229J0;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10844c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0178J0;
import p017Af.C0468O;
import p049Bm.InterfaceC1439n;
import p1051v0.C20414b;
import p1051v0.C20416d;
import p124Ei.C2463L0;
import p302M0.AbstractC5273y;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8071d5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p635a1.C10456n;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13473K;
import p736f0.C13482U;
import p758g0.AbstractC13758e;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17432l;
import p895n1.C17433m;
import p895n1.C17440t;

/* JADX INFO: renamed from: J0.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4075j3 {

    /* JADX INFO: renamed from: a */
    public static final C4075j3 f12983a = new C4075j3();

    /* JADX INFO: renamed from: b */
    public static final float f12984b;

    /* JADX INFO: renamed from: c */
    public static final float f12985c;

    static {
        float f10 = AbstractC5273y.f17303a;
        f12984b = AbstractC5273y.f17304b;
        f12985c = AbstractC5273y.f17305c;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC14339Q m4744c(int i10, C6021p c6021p) {
        float f10 = AbstractC5273y.f17303a;
        InterfaceC14339Q interfaceC14339QM4770a = AbstractC4141u3.m4770a(5, c6021p);
        AbstractC16544l.m18092e(interfaceC14339QM4770a, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        C20416d c20416d = (C20416d) interfaceC14339QM4770a;
        if (i10 == 0) {
            float f11 = (float) 0.0d;
            return C20416d.m21078a(c20416d, null, new C20414b(f11), new C20414b(f11), null, 9);
        }
        if (i10 != 1) {
            return AbstractC14334L.f44973a;
        }
        float f12 = (float) 0.0d;
        return C20416d.m21078a(c20416d, new C20414b(f12), null, null, new C20414b(f12), 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m4745a(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(-1273041460);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17425e c17425eM19122b = AbstractC8071d5.f25386a;
            if (c17425eM19122b == null) {
                C17424d c17424d = new C17424d("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = AbstractC17418F.f55636a;
                C14341T c14341t = new C14341T(C14365u.f45052b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new C17433m(9.0f, 16.17f));
                arrayList.add(new C17432l(4.83f, 12.0f));
                arrayList.add(new C17440t(-1.42f, 1.41f));
                arrayList.add(new C17432l(9.0f, 19.0f));
                arrayList.add(new C17432l(21.0f, 7.0f));
                arrayList.add(new C17440t(-1.41f, -1.41f));
                arrayList.add(C17429i.f55733c);
                C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                c17425eM19122b = c17424d.m19122b();
                AbstractC8071d5.f25386a = c17425eM19122b;
            }
            AbstractC3878A1.m4597b(c17425eM19122b, null, AbstractC10844c.m11252l(C10456n.f30959Y, f12985c), 0L, c6021p, 48, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4746b(boolean z6, InterfaceC1439n interfaceC1439n, InterfaceC1439n interfaceC1439n2, C6021p c6021p, int i10) {
        int i11;
        InterfaceC1439n interfaceC1439n3;
        InterfaceC1439n interfaceC1439n4;
        c6021p.m6526U(683517296);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6544g(z6) ? 4 : 2);
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC1439n3 = interfaceC1439n;
            interfaceC1439n4 = interfaceC1439n2;
        } else {
            C8410b c8410b = AbstractC4008Y0.f12571a;
            c6021p.m6524S(1631306250);
            AbstractC10831a.m11201d(z6, null, AbstractC13508z.m15013e(AbstractC13758e.m15255t(350, 0, null, 6), 2).m14995a(new C13467E(new C13482U(null, null, null, new C13473K(0.0f, AbstractC14334L.m15632j(0.0f, 1.0f), AbstractC13758e.m15255t(350, 0, null, 6)), false, null, 55))), C13468F.f42623b, null, AbstractC8411c.m8969c(-750750819, c6021p, new C0468O(c8410b, 10)), c6021p, (i12 & 14) | 196608, 18);
            c6021p.m6553p(false);
            interfaceC1439n3 = c8410b;
            interfaceC1439n4 = null;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(this, z6, interfaceC1439n3, interfaceC1439n4, i10, 2);
        }
    }
}
