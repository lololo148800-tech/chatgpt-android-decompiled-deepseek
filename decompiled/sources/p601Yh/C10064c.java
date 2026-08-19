package p601Yh;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p103Dn.AbstractC2124C;
import p103Dn.C2217y0;
import p571X9.AbstractC9233X;
import p625Zh.C10396b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Yh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10064c extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f29804Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ int f29805Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Throwable f29806o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10396b f29807p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19694j f29808q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10064c(C10396b c10396b, InterfaceC1440o interfaceC1440o, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f29807p0 = c10396b;
        this.f29808q0 = (AbstractC19694j) interfaceC1440o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.o, sm.j] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ?? r6 = this.f29808q0;
        C10064c c10064c = new C10064c(this.f29807p0, r6, (InterfaceC18770c) obj3);
        c10064c.f29805Z = iIntValue;
        c10064c.f29806o0 = (Throwable) obj2;
        return c10064c.invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[PHI: r8
      0x0054: PHI (r8v5 java.lang.Object) = (r8v3 java.lang.Object), (r8v0 java.lang.Object) binds: [B:18:0x0051, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Throwable th2;
        Throwable th3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f29804Y;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f29805Z;
                th3 = this.f29806o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return obj;
        }
        AbstractC9233X.m9807c(obj);
        i10 = this.f29805Z;
        th2 = this.f29806o0;
        if (i10 > 0) {
            C2217y0 c2217y0 = this.f29807p0.f30812q0;
            C10063b c10063b = new C10063b(2, null);
            this.f29806o0 = th2;
            this.f29805Z = i10;
            this.f29804Y = 1;
            if (AbstractC2124C.m3220s(c2217y0, c10063b, this) == enumC19250a) {
                return enumC19250a;
            }
            th3 = th2;
        }
        Integer num = new Integer(i10);
        this.f29806o0 = null;
        this.f29804Y = 2;
        obj = this.f29808q0.invoke(num, th2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return obj;
        th2 = th3;
        Integer num2 = new Integer(i10);
        this.f29806o0 = null;
        this.f29804Y = 2;
        obj = this.f29808q0.invoke(num2, th2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return obj;
    }
}
