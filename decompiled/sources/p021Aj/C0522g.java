package p021Aj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1156zj.C22147d0;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p994rk.C19067A1;

/* JADX INFO: renamed from: Aj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0522g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1672Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f1673Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22147d0 f1674o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0522g(C13421l c13421l, C22147d0 c22147d0, int i10) {
        super(1);
        this.f1672Y = i10;
        this.f1673Z = c13421l;
        this.f1674o0 = c22147d0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f1672Y) {
            case 0:
                C19067A1 it = (C19067A1) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f1673Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C0521f(this.f1674o0, it, 0)));
                break;
            default:
                C19067A1 it2 = (C19067A1) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f1673Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C0521f(this.f1674o0, it2, 1)));
                break;
        }
        return C17296C.f55119a;
    }
}
