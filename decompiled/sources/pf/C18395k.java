package pf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: pf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18395k extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58677Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f58678Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18398n f58679o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18395k(InterfaceC1436k interfaceC1436k, C18398n c18398n, int i10) {
        super(0);
        this.f58677Y = i10;
        this.f58678Z = interfaceC1436k;
        this.f58679o0 = c18398n;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f58677Y) {
            case 0:
                this.f58678Z.invoke(new C18389e(!this.f58679o0.f58695j));
                break;
            default:
                this.f58678Z.invoke(new C18387c(!this.f58679o0.f58692g));
                break;
        }
        return C17296C.f55119a;
    }
}
