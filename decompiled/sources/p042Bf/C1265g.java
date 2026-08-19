package p042Bf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p635a1.C10456n;
import p911o0.C17794y;

/* JADX INFO: renamed from: Bf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C1265g extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C1166t f3356Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f3357Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f3358o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265g(C1166t c1166t, InterfaceC1436k interfaceC1436k, int i10) {
        super(3);
        this.f3356Y = c1166t;
        this.f3357Z = interfaceC1436k;
        this.f3358o0 = i10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17794y Card = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-847593981);
            InterfaceC1436k interfaceC1436k = this.f3357Z;
            boolean zM6542f = c6021p.m6542f(interfaceC1436k);
            int i10 = this.f3358o0;
            boolean zM6538d = zM6542f | c6021p.m6538d(i10);
            Object objM6514H = c6021p.m6514H();
            if (zM6538d || objM6514H == C6013l.f19514a) {
                objM6514H = new C1263e(i10, 1, interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC1277s.m1992d(this.f3356Y, AbstractC10844c.m11244d(AbstractC10842a.m11233k(AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), AbstractC7313q.f23199d), 1.0f), null, c6021p, 0, 4);
        }
        return C17296C.f55119a;
    }
}
