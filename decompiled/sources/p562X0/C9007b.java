package p562X0;

import cd.C11709i;
import io.sentry.android.replay.capture.C15272c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21974X0;
import p153Fn.C2925c;
import p479Td.C7351f0;
import p544W9.AbstractC8614c3;
import p553Wh.C8870f;
import p623Zf.C10311g;
import p623Zf.C10324t;
import p658b5.C11242m;
import p893n.AbstractActivityC17375g;
import p948pi.C18418a;

/* JADX INFO: renamed from: X0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9007b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27484Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f27485Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f27486o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f27487p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f27488q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f27489r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f27490s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9007b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(0);
        this.f27484Y = i10;
        this.f27485Z = obj;
        this.f27486o0 = obj2;
        this.f27487p0 = obj3;
        this.f27488q0 = obj4;
        this.f27489r0 = obj5;
        this.f27490s0 = obj6;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws Throwable {
        boolean z6;
        switch (this.f27484Y) {
            case 0:
                C9008c c9008c = (C9008c) this.f27485Z;
                InterfaceC9016k interfaceC9016k = c9008c.f27492Z;
                InterfaceC9016k interfaceC9016k2 = (InterfaceC9016k) this.f27487p0;
                boolean z10 = true;
                if (interfaceC9016k != interfaceC9016k2) {
                    c9008c.f27492Z = interfaceC9016k2;
                    z6 = true;
                } else {
                    z6 = false;
                }
                String str = c9008c.f27493o0;
                String str2 = (String) this.f27488q0;
                if (AbstractC16544l.m18089b(str, str2)) {
                    z10 = z6;
                } else {
                    c9008c.f27493o0 = str2;
                }
                c9008c.f27491Y = (InterfaceC9019n) this.f27486o0;
                c9008c.f27494p0 = this.f27489r0;
                c9008c.f27495q0 = (Object[]) this.f27490s0;
                InterfaceC9015j interfaceC9015j = c9008c.f27496r0;
                if (interfaceC9015j != null && z10) {
                    ((C11242m) interfaceC9015j).m12609K();
                    c9008c.f27496r0 = null;
                    c9008c.m9593b();
                }
                break;
            case 1:
                C16525B c16525b = (C16525B) this.f27485Z;
                InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) c16525b.f51262Y;
                if (interfaceC0627n0 != null) {
                    interfaceC0627n0.mo1275e(null);
                }
                c16525b.f51262Y = AbstractC0575H.m1156D((C2925c) this.f27486o0, null, null, new C10311g((InterfaceC1436k) this.f27487p0, (AbstractActivityC17375g) this.f27488q0, (C10324t) this.f27489r0, (InterfaceC20904w) this.f27490s0, null), 3);
                break;
            default:
                ((C11709i) this.f27485Z).m13031a();
                AbstractC8614c3.m9262a((C18418a) this.f27486o0, (C8870f) this.f27487p0, EnumC21974X0.f69561u0, new C15272c((String) this.f27488q0, (InterfaceC1436k) this.f27489r0, (C7351f0) this.f27490s0, 29));
                break;
        }
        return C17296C.f55119a;
    }
}
