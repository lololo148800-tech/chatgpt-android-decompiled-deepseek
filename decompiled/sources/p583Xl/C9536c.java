package p583Xl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0583L;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Xl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9536c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f28689Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f28690Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC19694j f28691o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9536c(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f28691o0 = (AbstractC19694j) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C9536c c9536c = new C9536c(this.f28691o0, interfaceC18770c);
        c9536c.f28690Z = obj;
        return c9536c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9536c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f28689Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f28690Z;
            String name = Thread.currentThread().getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            boolean zM21734u = AbstractC21329w.m21734u(name, "LK_RTC_THREAD", false);
            ?? r6 = this.f28691o0;
            if (zM21734u) {
                this.f28689Y = 1;
                obj = r6.invoke(interfaceC0571F, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C0583L c0583lM1177f = AbstractC0575H.m1177f(interfaceC0571F, AbstractC9537d.f28693b, new C9535b(r6, null), 2);
                this.f28689Y = 2;
                obj = c0583lM1177f.m1309u(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
