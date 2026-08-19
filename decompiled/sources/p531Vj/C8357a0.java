package p531Vj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p045Bj.C1307e;
import p046Bk.C1325F0;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.C13430u;
import p729ej.InterfaceC13410a;
import p729ej.InterfaceC13418i;

/* JADX INFO: renamed from: Vj.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8357a0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26032Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8361c0 f26033Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13421l f26034o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8351V f26035p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8357a0(C8361c0 c8361c0, C13421l c13421l, C8351V c8351v, int i10) {
        super(1);
        this.f26032Y = i10;
        this.f26033Z = c8361c0;
        this.f26034o0 = c13421l;
        this.f26035p0 = c8351v;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26032Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                boolean z6 = ((C8351V) action.f42520a).f26007b;
                C13421l c13421l = this.f26034o0;
                C8361c0 c8361c0 = this.f26033Z;
                InterfaceC13410a interfaceC13410a = c13421l.f42503Y;
                if (z6) {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c0, new C8352W(c8361c0, this.f26035p0, 2)));
                } else {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c0, C8385x.f26098t0));
                }
                return C17296C.f55119a;
            case 1:
                AbstractC8337G it = (AbstractC8337G) obj;
                AbstractC16544l.m18094g(it, "it");
                boolean zEquals = it.equals(C8336F.f25989a);
                C13421l c13421l2 = this.f26034o0;
                C8361c0 c8361c1 = this.f26033Z;
                if (zEquals) {
                    return AbstractC8215v5.m8839a(c8361c1, new C8355Z(c13421l2, c8361c1, 1));
                }
                if (it.equals(C8335E.f25988a)) {
                    return AbstractC8215v5.m8839a(c8361c1, new C8357a0(c13421l2, c8361c1, this.f26035p0, 0));
                }
                throw new C0644w();
            case 2:
                C8382u it2 = (C8382u) obj;
                AbstractC16544l.m18094g(it2, "it");
                C13421l c13421l3 = this.f26034o0;
                C8351V c8351v = this.f26035p0;
                C8361c0 c8361c2 = this.f26033Z;
                return AbstractC8215v5.m8839a(c8361c2, new C1307e(it2, c13421l3, c8361c2, c8351v));
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13421l c13421l4 = this.f26034o0;
                InterfaceC13418i interfaceC13418iMo3400l = c13421l4.f42503Y.mo3400l();
                C8351V c8351v2 = this.f26035p0;
                C8361c0 c8361c3 = this.f26033Z;
                interfaceC13418iMo3400l.mo3393B(AbstractC8215v5.m8839a(c8361c3, new C1325F0(zBooleanValue, c8361c3, c8351v2, c13421l4)));
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8357a0(C13421l c13421l, C8361c0 c8361c0, C8351V c8351v, int i10) {
        super(1);
        this.f26032Y = i10;
        this.f26034o0 = c13421l;
        this.f26033Z = c8361c0;
        this.f26035p0 = c8351v;
    }
}
