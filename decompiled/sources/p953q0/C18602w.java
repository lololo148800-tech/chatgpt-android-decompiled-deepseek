package p953q0;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p758g0.C13756d;
import p758g0.InterfaceC13726B;
import p843k1.C16308b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: q0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C18602w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f59250Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f59251Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18546D f59252o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC13726B f59253p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C16308b f59254q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18602w(boolean z6, C18546D c18546d, InterfaceC13726B interfaceC13726B, C16308b c16308b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59251Z = z6;
        this.f59252o0 = c18546d;
        this.f59253p0 = interfaceC13726B;
        this.f59254q0 = c16308b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18602w(this.f59251Z, this.f59252o0, this.f59253p0, this.f59254q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18602w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10 = 0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f59250Y;
        C18546D c18546d = this.f59252o0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                int i12 = C18546D.f59080t;
                c18546d.m19914d(false);
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            if (this.f59251Z) {
                C13756d c13756d = c18546d.f59096p;
                Float f10 = new Float(0.0f);
                this.f59250Y = 1;
                if (c13756d.m15226g(f10, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            C13756d c13756d2 = c18546d.f59096p;
            Float f11 = new Float(1.0f);
            InterfaceC13726B interfaceC13726B = this.f59253p0;
            C18601v c18601v = new C18601v(this.f59254q0, c18546d, i10);
            this.f59250Y = 2;
            if (C13756d.m15222c(c13756d2, f11, interfaceC13726B, c18601v, this, 4) == enumC19250a) {
                return enumC19250a;
            }
            int i13 = C18546D.f59080t;
            c18546d.m19914d(false);
            return C17296C.f55119a;
        } catch (Throwable th2) {
            int i14 = C18546D.f59080t;
            c18546d.m19914d(false);
            throw th2;
        }
    }
}
