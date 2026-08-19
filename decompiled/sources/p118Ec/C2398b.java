package p118Ec;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p142Fc.C2708b;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ec.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2398b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f7460Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2399c f7461Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2398b(C2399c c2399c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7461Z = c2399c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2398b c2398b = new C2398b(this.f7461Z, interfaceC18770c);
        c2398b.f7460Y = obj;
        return c2398b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C2398b c2398b = (C2398b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c2398b.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3516e c3516e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f7460Y;
        for (C2708b c2708b : this.f7461Z.f7462a) {
            switch (c2708b.f8338a) {
                case 0:
                    c3516e = AbstractC0593T.f1824a;
                    break;
                default:
                    c3516e = AbstractC0593T.f1824a;
                    break;
            }
            AbstractC0575H.m1156D(interfaceC0571F, c3516e, null, new C2397a(c2708b, null), 2);
        }
        return C17296C.f55119a;
    }
}
