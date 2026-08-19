package p1139z0;

import mm.C17296C;
import p003A1.C0275o0;
import p006A4.C0362w;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: z0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21609d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f68443Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f68444Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C0362w f68445o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21611e f68446p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C21587J f68447q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21609d(C0362w c0362w, C21611e c21611e, C21587J c21587j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f68445o0 = c0362w;
        this.f68446p0 = c21611e;
        this.f68447q0 = c21587j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21609d c21609d = new C21609d(this.f68445o0, this.f68446p0, this.f68447q0, interfaceC18770c);
        c21609d.f68444Z = obj;
        return c21609d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((C21609d) create((C0275o0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f68443Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21607c c21607c = new C21607c((C0275o0) this.f68444Z, this.f68445o0, this.f68446p0, this.f68447q0, null);
            this.f68443Y = 1;
            if (AbstractC0575H.m1183l(c21607c, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }
}
