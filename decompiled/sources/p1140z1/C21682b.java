package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1117y1.InterfaceC21363c;
import p635a1.InterfaceC10457o;

/* JADX INFO: renamed from: z1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21682b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68823Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21684c f68824Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21682b(C21684c c21684c, int i10) {
        super(0);
        this.f68823Y = i10;
        this.f68824Z = c21684c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f68823Y) {
            case 0:
                this.f68824Z.m22194M0();
                break;
            default:
                C21684c c21684c = this.f68824Z;
                InterfaceC10457o interfaceC10457o = c21684c.f68828z0;
                AbstractC16544l.m18092e(interfaceC10457o, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC21363c) interfaceC10457o).mo19471p(c21684c);
                break;
        }
        return C17296C.f55119a;
    }
}
