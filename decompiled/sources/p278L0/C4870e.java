package p278L0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p658b5.C11246q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4870e extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ InterfaceC0571F f15854Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ float f15855Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11246q f15856o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4870e(C11246q c11246q, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f15856o0 = c11246q;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C4870e c4870e = new C4870e(this.f15856o0, (InterfaceC18770c) obj3);
        c4870e.f15854Y = (InterfaceC0571F) obj;
        c4870e.f15855Z = fFloatValue;
        C17296C c17296c = C17296C.f55119a;
        c4870e.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC0575H.m1156D(this.f15854Y, null, null, new C4868d(this.f15856o0, this.f15855Z, null), 3);
        return C17296C.f55119a;
    }
}
