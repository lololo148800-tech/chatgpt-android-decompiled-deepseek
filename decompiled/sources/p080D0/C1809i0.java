package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p544W9.AbstractC8590Y3;
import p842k0.C16305n;

/* JADX INFO: renamed from: D0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809i0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5210Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16305n f5211Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1803f0 f5212o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1809i0(C16305n c16305n, C1803f0 c1803f0, int i10) {
        super(0);
        this.f5210Y = i10;
        this.f5211Z = c16305n;
        this.f5212o0 = c1803f0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f5210Y) {
            case 0:
                this.f5212o0.m2590b();
                AbstractC8590Y3.m9254a(this.f5211Z);
                break;
            default:
                this.f5212o0.m2599k();
                AbstractC8590Y3.m9254a(this.f5211Z);
                break;
        }
        return C17296C.f55119a;
    }
}
