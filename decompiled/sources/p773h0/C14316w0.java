package p773h0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: h0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14316w0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44938Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14318x0 f44939Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14316w0(C14318x0 c14318x0, int i10) {
        super(0);
        this.f44938Y = i10;
        this.f44939Z = c14318x0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44938Y) {
            case 0:
                return Float.valueOf(this.f44939Z.f44944z0.f44952a.m6412g());
            default:
                return Float.valueOf(this.f44939Z.f44944z0.f44955d.m6412g());
        }
    }
}
