package p046Bk;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;

/* JADX INFO: renamed from: Bk.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1331I0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3513Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f3514Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1360X0 f3515o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1331I0(C13421l c13421l, C1360X0 c1360x0, int i10) {
        super(0);
        this.f3513Y = i10;
        this.f3514Z = c13421l;
        this.f3515o0 = c1360x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3513Y) {
            case 0:
                this.f3514Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f3515o0, C1363Z.f3617t0));
                break;
            default:
                this.f3514Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f3515o0, C1363Z.f3618u0));
                break;
        }
        return C17296C.f55119a;
    }
}
