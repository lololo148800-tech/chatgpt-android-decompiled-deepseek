package p229J0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: J0.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4110p2 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ float f13203Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f13204Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4110p2(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f13204Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C4110p2 c4110p2 = new C4110p2(this.f13204Z, (InterfaceC18770c) obj3);
        c4110p2.f13203Y = fFloatValue;
        C17296C c17296c = C17296C.f55119a;
        c4110p2.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f13204Z.invoke(new Float(this.f13203Y));
        return C17296C.f55119a;
    }
}
