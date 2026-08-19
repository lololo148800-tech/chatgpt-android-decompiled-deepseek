package p080D0;

import android.os.Build;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5985X;
import p492U1.C7542g;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p773h0.AbstractC14282f0;
import p773h0.C14308s0;
import p773h0.C14312u0;

/* JADX INFO: renamed from: D0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1813k0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5218Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC7537b f5219Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f5220o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1813k0(InterfaceC7537b interfaceC7537b, InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f5218Y = i10;
        this.f5219Z = interfaceC7537b;
        this.f5220o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f5218Y) {
            case 0:
                long j10 = ((C7542g) obj).f23896a;
                float fM7877b = C7542g.m7877b(j10);
                InterfaceC7537b interfaceC7537b = this.f5219Z;
                this.f5220o0.setValue(new C7545j(AbstractC9113C4.m9643a(interfaceC7537b.mo7866k0(fM7877b), interfaceC7537b.mo7866k0(C7542g.m7876a(j10)))));
                return C17296C.f55119a;
            case 1:
                C1811j0 c1811j0 = new C1811j0(0, (InterfaceC1426a) obj);
                C1813k0 c1813k0 = new C1813k0(this.f5219Z, this.f5220o0, 0);
                if (AbstractC14282f0.m15571a()) {
                    return AbstractC14282f0.m15572b(c1811j0, c1813k0, Build.VERSION.SDK_INT == 28 ? C14308s0.f44922a : C14312u0.f44930a);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 2:
                long j11 = ((C7542g) obj).f23896a;
                float fM7877b2 = C7542g.m7877b(j11);
                InterfaceC7537b interfaceC7537b2 = this.f5219Z;
                this.f5220o0.setValue(new C7545j(AbstractC9113C4.m9643a(interfaceC7537b2.mo7866k0(fM7877b2), interfaceC7537b2.mo7866k0(C7542g.m7876a(j11)))));
                return C17296C.f55119a;
            default:
                C1811j0 c1811j1 = new C1811j0(1, (InterfaceC1426a) obj);
                C1813k0 c1813k1 = new C1813k0(this.f5219Z, this.f5220o0, 2);
                if (AbstractC14282f0.m15571a()) {
                    return AbstractC14282f0.m15572b(c1811j1, c1813k1, Build.VERSION.SDK_INT == 28 ? C14308s0.f44922a : C14312u0.f44930a);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
