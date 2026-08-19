package p870le;

import ge.C14027G;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3759g;
import p620Zc.InterfaceC10277b;

/* JADX INFO: renamed from: le.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C16905s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54291Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10277b f54292Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC0300w1 f54293o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC3759g f54294p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16905s(InterfaceC10277b interfaceC10277b, InterfaceC0300w1 interfaceC0300w1, InterfaceC3759g interfaceC3759g, int i10) {
        super(0);
        this.f54291Y = i10;
        this.f54292Z = interfaceC10277b;
        this.f54293o0 = interfaceC0300w1;
        this.f54294p0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54291Y) {
            case 0:
                this.f54292Z.mo10876f();
                InterfaceC0300w1 interfaceC0300w1 = this.f54293o0;
                if (interfaceC0300w1 != null) {
                    ((C0190N0) interfaceC0300w1).m571a();
                }
                ((InterfaceC1436k) this.f54294p0).invoke(C14027G.f44115a);
                break;
            default:
                this.f54292Z.mo10876f();
                InterfaceC0300w1 interfaceC0300w2 = this.f54293o0;
                if (interfaceC0300w2 != null) {
                    ((C0190N0) interfaceC0300w2).m571a();
                }
                ((InterfaceC1436k) this.f54294p0).invoke(C14027G.f44115a);
                break;
        }
        return C17296C.f55119a;
    }
}
