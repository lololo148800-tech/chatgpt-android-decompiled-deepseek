package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: zj.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C22131X extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69962Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22199u1 f69963Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22131X(C22199u1 c22199u1, int i10) {
        super(0);
        this.f69962Y = i10;
        this.f69963Z = c22199u1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f69962Y) {
            case 0:
                this.f69963Z.f70371l.invoke();
                break;
            default:
                this.f69963Z.f70374o.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
