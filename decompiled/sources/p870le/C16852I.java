package p870le;

import bf.AbstractC11372a0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p1062vd.C20525E;

/* JADX INFO: renamed from: le.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C16852I extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54063Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f54064Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20263a0 f54065o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16852I(InterfaceC1436k interfaceC1436k, C20263a0 c20263a0, int i10) {
        super(0);
        this.f54063Y = i10;
        this.f54064Z = interfaceC1436k;
        this.f54065o0 = c20263a0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54063Y) {
            case 0:
                this.f54064Z.invoke(this.f54065o0);
                break;
            default:
                this.f54064Z.invoke(new C20525E(AbstractC11372a0.m12782a(this.f54065o0)));
                break;
        }
        return C17296C.f55119a;
    }
}
