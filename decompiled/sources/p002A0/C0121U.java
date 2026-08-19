package p002A0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p544W9.AbstractC8590Y3;
import p842k0.C16305n;

/* JADX INFO: renamed from: A0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0121U extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f520Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16305n f521Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0120T f522o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0121U(C16305n c16305n, C0120T c0120t, int i10) {
        super(0);
        this.f520Y = i10;
        this.f521Z = c16305n;
        this.f522o0 = c0120t;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f520Y) {
            case 0:
                this.f522o0.m404g();
                AbstractC8590Y3.m9254a(this.f521Z);
                break;
            case 1:
                this.f522o0.m403f(false);
                AbstractC8590Y3.m9254a(this.f521Z);
                break;
            case 2:
                this.f522o0.m416u();
                AbstractC8590Y3.m9254a(this.f521Z);
                break;
            default:
                this.f522o0.m417v();
                AbstractC8590Y3.m9254a(this.f521Z);
                break;
        }
        return C17296C.f55119a;
    }
}
