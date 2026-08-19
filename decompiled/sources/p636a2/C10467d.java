package p636a2;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p349O0.InterfaceC5985X;
import p492U1.C7540e;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p716e2.C13265b;

/* JADX INFO: renamed from: a2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10467d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30993Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f30994Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f30995o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f30996p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f30997q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10467d(float f10, float f11, InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f30993Y = 2;
        this.f30994Z = f10;
        this.f30995o0 = f11;
        this.f30996p0 = interfaceC1436k;
        this.f30997q0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f30996p0;
        float f10 = this.f30995o0;
        float f11 = this.f30994Z;
        Object obj3 = this.f30997q0;
        switch (this.f30993Y) {
            case 0:
                C10482s state = (C10482s) obj;
                AbstractC16544l.m18094g(state, "state");
                C10470g c10470g = (C10470g) obj2;
                c10470g.getClass();
                C13265b c13265bM10948a = state.m10948a(c10470g.f31012c);
                AbstractC16544l.m18093f(c13265bM10948a, "state.constraints(id)");
                C10471h c10471h = (C10471h) obj3;
                ((C13265b) C10466c.f30992b[c10470g.f31011b][c10471h.f31014b].invoke(c13265bM10948a, c10471h.f31013a)).mo14867f(new C7540e(f11)).m14868g(new C7540e(f10));
                return c17296c;
            case 1:
                C10482s state2 = (C10482s) obj;
                AbstractC16544l.m18094g(state2, "state");
                EnumC7546k enumC7546k = state2.f31059g;
                if (enumC7546k == null) {
                    AbstractC16544l.m18103p("layoutDirection");
                    throw null;
                }
                InterfaceC1440o[][] interfaceC1440oArr = C10466c.f30991a;
                C10470g c10470g2 = (C10470g) obj2;
                int i10 = c10470g2.f31011b;
                EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
                if (i10 < 0) {
                    i10 = enumC7546k == enumC7546k2 ? i10 + 2 : (-i10) - 1;
                }
                C10472i c10472i = (C10472i) obj3;
                int i11 = c10472i.f31016b;
                if (i11 < 0) {
                    i11 = enumC7546k == enumC7546k2 ? i11 + 2 : (-i11) - 1;
                }
                C13265b c13265bM10948a2 = state2.m10948a(c10470g2.f31012c);
                AbstractC16544l.m18093f(c13265bM10948a2, "state.constraints(id)");
                InterfaceC1440o interfaceC1440o = C10466c.f30991a[i10][i11];
                EnumC7546k enumC7546k3 = state2.f31059g;
                if (enumC7546k3 != null) {
                    ((C13265b) interfaceC1440o.invoke(c13265bM10948a2, c10472i.f31015a, enumC7546k3)).mo14867f(new C7540e(f11)).m14868g(new C7540e(f10));
                    return c17296c;
                }
                AbstractC16544l.m18103p("layoutDirection");
                throw null;
            default:
                long j10 = ((C7545j) obj).f23903a;
                ((InterfaceC5985X) obj3).setValue(new C7545j(j10));
                ((InterfaceC1436k) obj2).invoke(Integer.valueOf((int) ((((int) (j10 >> 32)) + f11) / (f10 + f11))));
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10467d(Object obj, Object obj2, float f10, float f11, int i10) {
        super(1);
        this.f30993Y = i10;
        this.f30996p0 = obj;
        this.f30997q0 = obj2;
        this.f30994Z = f10;
        this.f30995o0 = f11;
    }
}
