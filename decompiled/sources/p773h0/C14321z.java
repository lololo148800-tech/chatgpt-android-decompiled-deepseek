package p773h0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p759g1.C13800b;

/* JADX INFO: renamed from: h0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C14321z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44949Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14245A f44950Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14321z(C14245A c14245a, int i10) {
        super(1);
        this.f44949Y = i10;
        this.f44950Z = c14245a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44949Y) {
            case 0:
                long j10 = ((C13800b) obj).f43584a;
                InterfaceC1426a interfaceC1426a = this.f44950Z.f44705V0;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
                break;
            case 1:
                long j11 = ((C13800b) obj).f43584a;
                InterfaceC1426a interfaceC1426a2 = this.f44950Z.f44704U0;
                if (interfaceC1426a2 != null) {
                    interfaceC1426a2.invoke();
                }
                break;
            default:
                long j12 = ((C13800b) obj).f43584a;
                C14245A c14245a = this.f44950Z;
                if (c14245a.f44844F0) {
                    c14245a.f44845G0.invoke();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
