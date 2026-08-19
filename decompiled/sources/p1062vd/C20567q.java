package p1062vd;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p049Bm.InterfaceC1439n;
import p080D0.AbstractC1823p0;
import p080D0.InterfaceC1815l0;
import p103Dn.C2153Q0;
import p1063vf.C20608p;
import p1071w0.InterfaceC20772r0;
import p1106xf.C21202j;
import p1139z0.C21582E0;
import p1139z0.C21640s0;
import p1140z1.AbstractC21661G;
import p1140z1.AbstractC21678Y;
import p1140z1.C21688e;
import p1140z1.C21691f0;
import p349O0.C6021p;
import p523V9.AbstractC8063c5;
import p544W9.AbstractC8583X2;
import p759g1.C13800b;
import p774h1.C14336N;
import p774h1.InterfaceC14362r;
import p796i0.C14898e;
import p820j0.AbstractC16033d;
import p820j0.C16031b;
import p843k1.C16308b;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: vd.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20567q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65281Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f65282Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20567q(Object obj, int i10) {
        super(2);
        this.f65281Y = i10;
        this.f65282Z = obj;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        C0166F0 c0166f0;
        String strM9248c = null;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f65282Z;
        switch (this.f65281Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8063c5.m8464g(((C20541V) obj3).f65170b, null, c6021p, 0);
                }
                return c17296c;
            case 1:
                String uri = (String) obj;
                String filePath = (String) obj2;
                AbstractC16544l.m18094g(uri, "uri");
                AbstractC16544l.m18094g(filePath, "filePath");
                C2153Q0 c2153q0 = ((C20608p) obj3).f65398q0;
                do {
                    value = c2153q0.getValue();
                } while (!c2153q0.m3250k(value, AbstractC17659D.m19249k((Map) value, new C17309l(uri, filePath))));
                return c17296c;
            case 2:
                long jLongValue = ((Number) obj2).longValue();
                if (AbstractC1823p0.m2652a((InterfaceC1815l0) obj3, jLongValue)) {
                    return Long.valueOf(jLongValue);
                }
                return null;
            case 3:
                ((InterfaceC20772r0) obj3).mo468e(((C13800b) obj2).f43584a);
                return c17296c;
            case 4:
                C0166F0 c0166f1 = (C0166F0) obj;
                C0169G0 c0169g0 = (C0169G0) obj2;
                C21640s0 c21640s0 = (C21640s0) obj3;
                C21640s0.m21985N0(c21640s0);
                c21640s0.f68552D0.m402e();
                String strM9248c2 = AbstractC8583X2.m9248c(c0166f1);
                C16031b c16031bM17588a = AbstractC16033d.m17588a(c21640s0);
                if (c16031bM17588a != null) {
                    C14898e c14898eMo9531a = c16031bM17588a.f49468b.mo9531a(new C14898e(c0166f1, c0169g0, 1, null));
                    if (c14898eMo9531a != null && (c0166f0 = c14898eMo9531a.f46391a) != null) {
                        strM9248c = AbstractC8583X2.m9248c(c0166f0);
                    }
                    strM9248c2 = strM9248c;
                }
                if (strM9248c2 != null) {
                    C21582E0.m21877f(c21640s0.f68550B0, strM9248c2, false, 0, 6);
                }
                return Boolean.TRUE;
            default:
                InterfaceC14362r interfaceC14362r = (InterfaceC14362r) obj;
                C16308b c16308b = (C16308b) obj2;
                AbstractC21678Y abstractC21678Y = (AbstractC21678Y) obj3;
                if (abstractC21678Y.f68819x0.m22025W()) {
                    C21691f0 snapshotObserver = AbstractC21661G.m22082a(abstractC21678Y.f68819x0).getSnapshotObserver();
                    C14336N c14336n = AbstractC21678Y.f68797R0;
                    snapshotObserver.m22222a(abstractC21678Y, C21688e.f68834p0, new C21202j(abstractC21678Y, interfaceC14362r, c16308b, 4));
                    abstractC21678Y.f68816O0 = false;
                } else {
                    abstractC21678Y.f68816O0 = true;
                }
                return c17296c;
        }
    }
}
