package p002A0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: A0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0119S extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f496Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0120T f497Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f498o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0119S(C0120T c0120t, C0120T c0120t2, int i10) {
        super(0);
        this.f496Y = i10;
        this.f497Z = c0120t;
        this.f498o0 = c0120t2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f496Y) {
            case 0:
                this.f498o0.m403f(true);
                this.f497Z.m419x(EnumC0123W.f526Y);
                break;
            case 1:
                this.f498o0.m416u();
                this.f497Z.m419x(EnumC0123W.f526Y);
                break;
            case 2:
                this.f498o0.m404g();
                this.f497Z.m419x(EnumC0123W.f526Y);
                break;
            default:
                this.f498o0.m417v();
                this.f497Z.m419x(EnumC0123W.f528o0);
                break;
        }
        return C17296C.f55119a;
    }
}
