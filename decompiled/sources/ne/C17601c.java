package ne;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p045Bj.C1307e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1029u0.C20090a;
import p156G1.AbstractC2965l;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4141u3;
import p269Kh.C4688o;
import p302M0.AbstractC5253e;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p594Y9.AbstractC9746I4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: ne.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17601c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56350Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f56351Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4688o f56352o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f56353p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f56354q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17601c(List list, C4688o c4688o, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, int i10) {
        super(2);
        this.f56350Y = i10;
        this.f56351Z = list;
        this.f56352o0 = c4688o;
        this.f56353p0 = interfaceC1426a;
        this.f56354q0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f56350Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC2965l.m3789a(AbstractC10844c.m11247g(C10456n.f30959Y, 0.0f, AbstractC7312p.f23192i, 1), false, C20090a.f63616Y), AbstractC7313q.f23202g);
                    c6021p.m6524S(1598084961);
                    List list = this.f56351Z;
                    boolean zM6545h = c6021p.m6545h(list);
                    C4688o c4688o = this.f56352o0;
                    boolean zM6542f = zM6545h | c6021p.m6542f(c4688o);
                    InterfaceC1426a interfaceC1426a = this.f56353p0;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1426a);
                    InterfaceC1436k interfaceC1436k = this.f56354q0;
                    boolean zM6542f3 = zM6542f2 | c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f3 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C1307e(list, c4688o, interfaceC1426a, interfaceC1436k, 28);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qM11233k, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    float f10 = AbstractC4017a.f12601a;
                    AbstractC4034c4.m4725a(null, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p2), 0L, 0L, AbstractC7306j.f23147e, 0.0f, null, AbstractC8411c.m8969c(-1953398447, c6021p2, new C17601c(this.f56351Z, this.f56352o0, this.f56353p0, this.f56354q0, 0)), c6021p2, 12582912, 109);
                }
                break;
        }
        return c17296c;
    }
}
