package p349O0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p586Y0.AbstractC9543B;
import p692d0.C12954G;

/* JADX INFO: renamed from: O0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5974R0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19442Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12954G f19443Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5974R0(C12954G c12954g, int i10) {
        super(1);
        this.f19442Y = i10;
        this.f19443Z = c12954g;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f19442Y) {
            case 0:
                if (obj instanceof AbstractC9543B) {
                    ((AbstractC9543B) obj).m10038d(4);
                }
                this.f19443Z.m14624a(obj);
                return C17296C.f55119a;
            default:
                return obj == this.f19443Z ? "(this)" : String.valueOf(obj);
        }
    }
}
