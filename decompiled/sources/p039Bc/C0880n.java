package p039Bc;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.AbstractC12214a;
import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17314q;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1439n;
import p092Dc.C1998o;
import p195Hh.C3430e;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6021p;
import p478Tc.AbstractC7308l;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.InterfaceC10459q;
import p892mi.C17279a;
import p893n.AbstractActivityC17375g;
import ug.AbstractC20236s;

/* JADX INFO: renamed from: Bc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C0880n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2587Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f2588Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3430e f2589o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC20236s f2590p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f2591q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17314q f2592r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880n(C3430e c3430e, AbstractC20236s abstractC20236s, InterfaceC10459q interfaceC10459q, C8870f c8870f, C17314q c17314q) {
        super(2);
        this.f2589o0 = c3430e;
        this.f2590p0 = abstractC20236s;
        this.f2591q0 = interfaceC10459q;
        this.f2588Z = c8870f;
        this.f2592r0 = c17314q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        C8870f c8870f = this.f2588Z;
        switch (this.f2587Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    RootViewModel rootViewModel = (RootViewModel) ((C1998o) this.f2592r0.getValue()).f6055l0.get();
                    AbstractC12214a.m14226d(rootViewModel, c6021p, 0);
                    StringBuilder sb2 = new StringBuilder("Root view state: ");
                    AbstractC20236s abstractC20236s = this.f2590p0;
                    sb2.append(abstractC20236s);
                    AbstractC8160o6.m8728c(this.f2589o0, sb2.toString(), null, null, 6);
                    AbstractC12214a.m14224b(abstractC20236s, rootViewModel, this.f2591q0.mo428M(AbstractC10844c.f32512c), c6021p, 0);
                    AbstractC8662k3.m9352c(null, c8870f.f27151d, c6021p, 0, 1);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5997d.m6442b(new C6014l0[]{AbstractC0187M0.f714p.mo6405a(new C17279a((AbstractActivityC17375g) c6021p2.m6548k(AbstractC7308l.f23151a), c8870f)), AbstractC8873i.f27157a.mo6405a(c8870f)}, AbstractC8411c.m8969c(1458665924, c6021p2, new C0880n(this.f2589o0, this.f2590p0, this.f2591q0, this.f2588Z, this.f2592r0)), c6021p2, 56);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880n(C8870f c8870f, C3430e c3430e, AbstractC20236s abstractC20236s, InterfaceC10459q interfaceC10459q, C17314q c17314q) {
        super(2);
        this.f2588Z = c8870f;
        this.f2589o0 = c3430e;
        this.f2590p0 = abstractC20236s;
        this.f2591q0 = interfaceC10459q;
        this.f2592r0 = c17314q;
    }
}
