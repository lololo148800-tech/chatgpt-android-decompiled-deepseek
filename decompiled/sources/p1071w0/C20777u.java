package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0260j0;
import p049Bm.InterfaceC1436k;
import p204I1.C3578I;
import p586Y0.C9566r;

/* JADX INFO: renamed from: w0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C20777u extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65982Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20718K0 f65983Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f65984o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20777u(C20718K0 c20718k0, InterfaceC1436k interfaceC1436k, int i10) {
        super(1);
        this.f65982Y = i10;
        this.f65983Z = c20718k0;
        this.f65984o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f65982Y) {
            case 0:
                C3578I c3578i = (C3578I) obj;
                C20718K0 c20718k0 = this.f65983Z;
                if (c20718k0 != null) {
                    c20718k0.f65691b.setValue(c3578i);
                }
                InterfaceC1436k interfaceC1436k = this.f65984o0;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(c3578i);
                }
                return C17296C.f55119a;
            default:
                C20718K0 c20718k1 = this.f65983Z;
                C9566r c9566r = c20718k1.f65693d;
                InterfaceC1436k interfaceC1436k2 = this.f65984o0;
                c9566r.add(interfaceC1436k2);
                return new C0260j0(c20718k1, 14, interfaceC1436k2);
        }
    }
}
