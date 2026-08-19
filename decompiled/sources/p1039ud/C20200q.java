package p1039ud;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1062vd.C20521A;
import p1062vd.C20531K;
import p1062vd.C20541V;

/* JADX INFO: renamed from: ud.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C20200q extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63968Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f63969Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20541V f63970o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20200q(InterfaceC1436k interfaceC1436k, C20541V c20541v, int i10) {
        super(0);
        this.f63968Y = i10;
        this.f63969Z = interfaceC1436k;
        this.f63970o0 = c20541v;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f63968Y) {
            case 0:
                this.f63969Z.invoke(new C20189f(this.f63970o0.f65169a));
                break;
            case 1:
                this.f63969Z.invoke(new C20185b(this.f63970o0.f65169a));
                break;
            case 2:
                this.f63969Z.invoke(new C20521A(this.f63970o0));
                break;
            default:
                this.f63969Z.invoke(new C20531K(this.f63970o0));
                break;
        }
        return C17296C.f55119a;
    }
}
