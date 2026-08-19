package p729ej;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0569E;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ej.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C13428s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f42513Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13427r f42514Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13429t f42515o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13421l f42516p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13428s(InterfaceC13427r interfaceC13427r, C13429t c13429t, C13421l c13421l, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f42514Z = interfaceC13427r;
        this.f42515o0 = c13429t;
        this.f42516p0 = c13421l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C13428s(this.f42514Z, this.f42515o0, this.f42516p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13428s) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f42513Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            String str = this.f42515o0.f42518b;
            InterfaceC13418i interfaceC13418iMo3400l = this.f42516p0.f42503Y.mo3400l();
            this.f42513Y = 1;
            InterfaceC13427r interfaceC13427r = this.f42514Z;
            String string = interfaceC13427r.toString();
            if (!AbstractC21322p.m21681O(str)) {
                string = string + ':' + str;
            }
            Object objM1168P = AbstractC0575H.m1168P(new C0569E(string), new C13409B(interfaceC13427r, interfaceC13418iMo3400l, str, null), this);
            if (objM1168P != enumC19250a) {
                objM1168P = c17296c;
            }
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
