package p911o0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21058L;
import p392Q0.C6546d;
import p635a1.InterfaceC10457o;

/* JADX INFO: renamed from: o0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C17730J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56608Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6546d f56609Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17730J(int i10, C6546d c6546d) {
        super(1);
        this.f56608Y = i10;
        this.f56609Z = c6546d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f56608Y) {
            case 0:
                C6546d c6546d = this.f56609Z;
                int i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    Object[] objArr = c6546d.f21182Y;
                    int i11 = 0;
                    do {
                        ((InterfaceC21058L) objArr[i11]).mo19806b();
                        i11++;
                    } while (i11 < i10);
                }
                return C17296C.f55119a;
            default:
                this.f56609Z.m7099c((InterfaceC10457o) obj);
                return Boolean.TRUE;
        }
    }
}
