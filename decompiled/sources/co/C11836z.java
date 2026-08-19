package co;

import kotlinx.serialization.json.AbstractC16643b;
import mm.C17296C;
import mm.C17299b;
import p049Bm.InterfaceC1440o;
import p211I8.lPE.sRXLFOsOgS;
import p372P3.AbstractC6327i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: co.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C11836z extends AbstractC19692h implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public int f35868Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ C17299b f35869o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11801B f35870p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11836z(C11801B c11801b, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f35870p0 = c11801b;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C11836z c11836z = new C11836z(this.f35870p0, (InterfaceC18770c) obj3);
        c11836z.f35869o0 = (C17299b) obj;
        return c11836z.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35868Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17299b c17299b = this.f35869o0;
            C11801B c11801b = this.f35870p0;
            byte bMo6939y = ((AbstractC6327i) c11801b.f35773d).mo6939y();
            if (bMo6939y == 1) {
                return c11801b.m13067e(true);
            }
            if (bMo6939y == 0) {
                return c11801b.m13067e(false);
            }
            if (bMo6939y != 6) {
                if (bMo6939y == 8) {
                    return c11801b.m13066d();
                }
                AbstractC6327i.m6908r((AbstractC6327i) c11801b.f35773d, sRXLFOsOgS.dDJpl, 0, null, 6);
                throw null;
            }
            this.f35868Z = 1;
            obj = C11801B.m13063a(c11801b, c17299b, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return (AbstractC16643b) obj;
    }
}
