package p362Of;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1025te.C19858I;
import p1155zi.C21936L0;
import p571X9.AbstractC9393x3;
import p926of.C18146I;
import p926of.C18173j;

/* JADX INFO: renamed from: Of.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6186a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20144Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f20145Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f20146o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6186a(int i10, String str, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f20144Y = i10;
        this.f20146o0 = interfaceC1436k;
        this.f20145Z = str;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f20144Y) {
            case 0:
                this.f20146o0.invoke(this.f20145Z);
                break;
            case 1:
                this.f20146o0.invoke(new C18146I(AbstractC9393x3.m9974d(new C18173j(this.f20145Z, null, null, null, null, null, null, null, null, 510)), 0, 14));
                break;
            case 2:
                this.f20146o0.invoke(new C21936L0(this.f20145Z));
                break;
            case 3:
                this.f20146o0.invoke(new C19858I(this.f20145Z));
                break;
            case 4:
                this.f20146o0.invoke(new C19858I(this.f20145Z));
                break;
            case 5:
                InterfaceC1436k interfaceC1436k = this.f20146o0;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(this.f20145Z);
                }
                break;
            default:
                this.f20146o0.invoke(this.f20145Z == null ? "" : null);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6186a(String str, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f20144Y = 1;
        this.f20145Z = str;
        this.f20146o0 = interfaceC1436k;
    }
}
