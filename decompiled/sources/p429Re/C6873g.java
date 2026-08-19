package p429Re;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p328N1.C5609y;
import p349O0.C6021p;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Re.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6873g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22041Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6877k f22042Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6873g(C6877k c6877k, int i10) {
        super(2);
        this.f22041Y = i10;
        this.f22042Z = c6877k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22041Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC7313q.f23200e, AbstractC7313q.f23198c);
                    C6877k c6877k = this.f22042Z;
                    AbstractC4124r4.m4768b(c6877k.f22053b, interfaceC10459qM11234l, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65528);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(1460874889);
                    C6877k c6877k2 = this.f22042Z;
                    String str = c6877k2.f22052a;
                    if (str != null) {
                        long j10 = ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12213a;
                        C3582M c3582m = ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12147c;
                        AbstractC4124r4.m4768b(str, AbstractC10842a.m11237o(C10456n.f30959Y, 0.0f, AbstractC7313q.f23202g, 0.0f, 0.0f, 13), j10, 0L, null, C5609y.f18158u0, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p2, 196608, 0, 65496);
                    }
                    c6021p2.m6553p(false);
                    if (c6877k2.f22053b != null) {
                        AbstractC4034c4.m4725a(null, ((C4135t3) c6021p2.m6548k(AbstractC4141u3.f13417a)).f13380d, 0L, 0L, AbstractC7306j.f23145c, 0.0f, null, AbstractC8411c.m8969c(1971453804, c6021p2, new C6873g(c6877k2, 0)), c6021p2, 12582912, 109);
                    }
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23201f);
                    C6875i c6875i = this.f22042Z.f22057f;
                    AbstractC4124r4.m4769c(c6875i.f22045a, interfaceC10459qM11233k, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C3582M.m4274b(((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12155k, 0L, 0L, null, null, 0L, null, c6875i.f22046b, 0, 0L, null, null, 16744447), c6021p3, 0, 0, 131068);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
