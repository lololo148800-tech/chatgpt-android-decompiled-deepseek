package p1156zj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: zj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C22158h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f70061Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22172l1 f70062Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22158h(C22172l1 c22172l1, int i10) {
        super(0);
        this.f70061Y = i10;
        this.f70062Z = c22172l1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f70061Y) {
            case 0:
                this.f70062Z.f70191l.invoke();
                break;
            default:
                this.f70062Z.f70190k.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
