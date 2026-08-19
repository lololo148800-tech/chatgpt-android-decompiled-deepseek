package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: J0.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4086l2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13056Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3880A3 f13057Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f13058o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4086l2(C3880A3 c3880a3, InterfaceC1426a interfaceC1426a, int i10) {
        super(1);
        this.f13056Y = i10;
        this.f13057Z = c3880a3;
        this.f13058o0 = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f13056Y) {
            case 0:
                if (!this.f13057Z.m4604d()) {
                    this.f13058o0.invoke();
                }
                break;
            default:
                if (!this.f13057Z.m4604d()) {
                    this.f13058o0.invoke();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
