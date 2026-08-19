package p046Bk;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p909nm.C17689w;
import p994rk.C19207q0;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1369b0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3631Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19201o2 f3632Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1369b0(InterfaceC19201o2 interfaceC19201o2, int i10) {
        super(1);
        this.f3631Y = i10;
        this.f3632Z = interfaceC19201o2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3631Y) {
            case 0:
                List it = (List) obj;
                AbstractC16544l.m18094g(it, "it");
                C19207q0 c19207q0 = (C19207q0) this.f3632Z;
                c19207q0.f60939r0.m16594z(it);
                c19207q0.f60940s0.m16594z(C17689w.f56480Y);
                c19207q0.f60944w0.m12493q("");
                break;
            default:
                List it2 = (List) obj;
                AbstractC16544l.m18094g(it2, "it");
                C19207q0 c19207q1 = (C19207q0) this.f3632Z;
                c19207q1.f60940s0.m16594z(it2);
                c19207q1.f60944w0.m12493q("");
                break;
        }
        return C17296C.f55119a;
    }
}
