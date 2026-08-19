package p002A0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.C0278p0;
import p003A1.InterfaceC0303x1;
import p103Dn.InterfaceC2186j;
import p1139z0.C21582E0;
import p204I1.C3581L;
import p759g1.C13801c;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: A0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0114M implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f479Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f480Z;

    public /* synthetic */ C0114M(C0120T c0120t, int i10) {
        this.f479Y = i10;
        this.f480Z = c0120t;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        switch (this.f479Y) {
            case 0:
                C0120T c0120t = this.f480Z;
                c0120t.m418w(false);
                c0120t.m419x(EnumC0123W.f526Y);
                break;
            default:
                C13801c c13801c = (C13801c) obj;
                boolean zM18089b = AbstractC16544l.m18089b(c13801c, C13801c.f43585e);
                C0120T c0120t2 = this.f480Z;
                if (zM18089b) {
                    c0120t2.m414s();
                } else {
                    InterfaceC0303x1 interfaceC0303x1 = c0120t2.f507i;
                    if (interfaceC0303x1 != null) {
                        C21582E0 c21582e0 = c0120t2.f499a;
                        ((C0278p0) interfaceC0303x1).m863a(c13801c, !(!C3581L.m4267c(c21582e0.m21881c().f67818Z) && !c0120t2.f505g) ? null : new C0119S(c0120t2, c0120t2, 0), !c0120t2.m401d() ? null : new C0119S(c0120t2, c0120t2, 1), (C3581L.m4267c(c21582e0.m21881c().f67818Z) || !c0120t2.f502d || c0120t2.f503e || c0120t2.f505g) ? null : new C0119S(c0120t2, c0120t2, 2), C3581L.m4268d(c21582e0.m21881c().f67818Z) != c21582e0.m21881c().f67817Y.length() ? new C0119S(c0120t2, c0120t2, 3) : null);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}
