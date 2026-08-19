package p086D6;

import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1441p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1966j extends AbstractC19694j implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public int f5818Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Throwable f5819Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16558z f5820o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1967k f5821p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1966j(C16558z c16558z, C1967k c1967k, InterfaceC18770c interfaceC18770c) {
        super(4, interfaceC18770c);
        this.f5820o0 = c16558z;
        this.f5821p0 = c1967k;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        C1966j c1966j = new C1966j(this.f5820o0, this.f5821p0, (InterfaceC18770c) obj4);
        c1966j.f5819Z = (Throwable) obj2;
        return c1966j.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5818Y;
        boolean z6 = true;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (this.f5819Z instanceof C1963g) {
                C16558z c16558z = this.f5820o0;
                c16558z.f51287Y++;
                this.f5821p0.getClass();
                C21554a c21554a = C21555b.f68260Z;
                long jM8643i = AbstractC8128k6.m8643i(Math.pow(2.0d, c16558z.f51287Y), EnumC21557d.SECONDS);
                this.f5818Y = 2;
                if (AbstractC0575H.m1185n(jM8643i, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                z6 = false;
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return Boolean.valueOf(z6);
    }
}
