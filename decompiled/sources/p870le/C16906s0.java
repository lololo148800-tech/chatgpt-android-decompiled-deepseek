package p870le;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p229J0.C3899D4;
import p349O0.C5997d;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16906s0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54295Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f54296Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f54297o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f54298p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3899D4 f54299q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f54300r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16906s0(boolean z6, boolean z10, C3899D4 c3899d4, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54297o0 = z6;
        this.f54298p0 = z10;
        this.f54299q0 = c3899d4;
        this.f54300r0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16906s0 c16906s0 = new C16906s0(this.f54297o0, this.f54298p0, this.f54299q0, this.f54300r0, interfaceC18770c);
        c16906s0.f54296Z = obj;
        return c16906s0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16906s0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54295Y;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0571F = (InterfaceC0571F) this.f54296Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            float f10 = AbstractC16912v0.f54326a;
            ((InterfaceC1426a) this.f54300r0.getValue()).invoke();
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC0571F = (InterfaceC0571F) this.f54296Z;
        C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C16900p0(this.f54297o0, this.f54298p0));
        C16902q0 c16902q0 = new C16902q0(2, null);
        this.f54296Z = interfaceC0571F;
        this.f54295Y = 1;
        if (AbstractC2124C.m3220s(c2219z0M6441a0, c16902q0, this) == enumC19250a) {
            return enumC19250a;
        }
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C16904r0(this.f54299q0, null), 3);
        long j10 = AbstractC16868Z.f54121a;
        this.f54296Z = null;
        this.f54295Y = 2;
        if (AbstractC0575H.m1185n(j10, this) == enumC19250a) {
            return enumC19250a;
        }
        float f11 = AbstractC16912v0.f54326a;
        ((InterfaceC1426a) this.f54300r0.getValue()).invoke();
        return C17296C.f55119a;
    }
}
