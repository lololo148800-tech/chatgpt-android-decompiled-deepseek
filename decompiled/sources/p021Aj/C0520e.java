package p021Aj;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p045Bj.C1303a;
import p049Bm.InterfaceC1426a;
import p1156zj.AbstractC22120R0;
import p140Fa.C2685e;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;

/* JADX INFO: renamed from: Aj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0520e extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1666Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f1667Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2685e f1668o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0520e(C13421l c13421l, C2685e c2685e, int i10) {
        super(0);
        this.f1666Y = i10;
        this.f1667Z = c13421l;
        this.f1668o0 = c2685e;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1666Y) {
            case 0:
                AbstractC22120R0.m22359f(this.f1667Z, this.f1668o0);
                break;
            case 1:
                AbstractC22120R0.m22359f(this.f1667Z, this.f1668o0);
                break;
            case 2:
                this.f1667Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1303a(0, this.f1668o0)));
                break;
            case 3:
                AbstractC22120R0.m22359f(this.f1667Z, this.f1668o0);
                break;
            case 4:
                this.f1667Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1303a(1, this.f1668o0)));
                break;
            case 5:
                AbstractC22120R0.m22359f(this.f1667Z, this.f1668o0);
                break;
            case 6:
                AbstractC22120R0.m22359f(this.f1667Z, this.f1668o0);
                break;
            default:
                this.f1667Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C1303a(2, this.f1668o0)));
                break;
        }
        return C17296C.f55119a;
    }
}
