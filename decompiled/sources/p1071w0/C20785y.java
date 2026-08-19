package p1071w0;

import ge.C14103t0;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p103Dn.C2219z0;
import p129En.C2602m;
import p349O0.C5997d;
import p349O0.InterfaceC5985X;
import p350O1.C6046D;
import p350O1.C6065n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: w0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C20785y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66032Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20750g0 f66033Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f66034o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6046D f66035p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C1837w0 f66036q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6065n f66037r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20785y(C20750g0 c20750g0, InterfaceC5985X interfaceC5985X, C6046D c6046d, C1837w0 c1837w0, C6065n c6065n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66033Z = c20750g0;
        this.f66034o0 = interfaceC5985X;
        this.f66035p0 = c6046d;
        this.f66036q0 = c1837w0;
        this.f66037r0 = c6065n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20785y(this.f66033Z, this.f66034o0, this.f66035p0, this.f66036q0, this.f66037r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20785y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66032Y;
        C20750g0 c20750g0 = this.f66033Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C14103t0(this.f66034o0, 19));
                C2602m c2602m = new C2602m(c20750g0, this.f66035p0, this.f66036q0, this.f66037r0, 6);
                this.f66032Y = 1;
                if (c2219z0M6441a0.mo3141d(c2602m, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC20740b0.m21270k(c20750g0);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            AbstractC20740b0.m21270k(c20750g0);
            throw th2;
        }
    }
}
