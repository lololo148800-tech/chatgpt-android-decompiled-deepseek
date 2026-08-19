package p1156zj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p729ej.C13421l;
import p729ej.C13430u;

/* JADX INFO: renamed from: zj.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22119Q0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69928Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8340J f69929Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f69930o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22119Q0(C8340J c8340j, C13421l c13421l, int i10) {
        super(1);
        this.f69928Y = i10;
        this.f69929Z = c8340j;
        this.f69930o0 = c13421l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69928Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                int iOrdinal = this.f69929Z.f25996a.f26059Z.ordinal();
                C13421l c13421l = this.f69930o0;
                if (iOrdinal == 0) {
                    c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69892q0));
                } else if (iOrdinal == 1) {
                    AbstractC22120R0.m22359f(c13421l, null);
                } else if (iOrdinal == 2) {
                    c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69892q0));
                }
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                int iOrdinal2 = this.f69929Z.f25996a.f26059Z.ordinal();
                C13421l c13421l2 = this.f69930o0;
                if (iOrdinal2 == 0) {
                    c13421l2.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69893r0));
                } else if (iOrdinal2 == 1) {
                    AbstractC22120R0.m22359f(c13421l2, null);
                } else if (iOrdinal2 == 2) {
                    c13421l2.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(C22109L0.f69893r0));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
