package p647ak;

import ck.AbstractC11768e;
import ck.C11766c;
import ck.C11767d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p482Tg.C7448e;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.C13430u;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: ak.T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10669T0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31666Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10696e1 f31667Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f31668o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10669T0(C10696e1 c10696e1, C13421l c13421l, int i10) {
        super(1);
        this.f31666Y = i10;
        this.f31667Z = c10696e1;
        this.f31668o0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31666Y) {
            case 0:
                Throwable it = (Throwable) obj;
                AbstractC16544l.m18094g(it, "it");
                C10696e1.m11020f(this.f31667Z, this.f31668o0, it);
                return C17296C.f55119a;
            case 1:
                Throwable it2 = (Throwable) obj;
                AbstractC16544l.m18094g(it2, "it");
                C10696e1.m11020f(this.f31667Z, this.f31668o0, it2);
                return C17296C.f55119a;
            case 2:
                Throwable it3 = (Throwable) obj;
                AbstractC16544l.m18094g(it3, "it");
                C10696e1.m11020f(this.f31667Z, this.f31668o0, it3);
                return C17296C.f55119a;
            case 3:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                this.f31667Z.m11024h(this.f31668o0, C10738x0.f31914a);
                return C17296C.f55119a;
            case 4:
                AbstractC11768e it4 = (AbstractC11768e) obj;
                AbstractC16544l.m18094g(it4, "it");
                boolean z6 = it4 instanceof C11767d;
                C13421l c13421l = this.f31668o0;
                C10696e1 c10696e1 = this.f31667Z;
                if (z6) {
                    return AbstractC8215v5.m8839a(c10696e1, new C10669T0(c10696e1, c13421l, 3));
                }
                if (it4 instanceof C11766c) {
                    return AbstractC8215v5.m8839a(c10696e1, new C7448e(c10696e1, c13421l, it4, 12));
                }
                throw new C0644w();
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                InterfaceC13418i interfaceC13418iMo3400l = this.f31668o0.f42503Y.mo3400l();
                C10696e1 c10696e2 = this.f31667Z;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c10696e2, new C10662P0(c10696e2, 2)));
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10669T0(C13421l c13421l, C10696e1 c10696e1) {
        super(1);
        this.f31666Y = 5;
        this.f31668o0 = c13421l;
        this.f31667Z = c10696e1;
    }
}
