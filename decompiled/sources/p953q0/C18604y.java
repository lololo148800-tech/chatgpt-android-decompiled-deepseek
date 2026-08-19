package p953q0;

import java.util.concurrent.CancellationException;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p221Ii.C3726e;
import p492U1.C7543h;
import p571X9.AbstractC9233X;
import p758g0.C13746W;
import p758g0.C13756d;
import p758g0.InterfaceC13726B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: q0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C18604y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC13726B f59259Y;

    /* JADX INFO: renamed from: Z */
    public int f59260Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18546D f59261o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC13726B f59262p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f59263q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18604y(C18546D c18546d, InterfaceC13726B interfaceC13726B, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f59261o0 = c18546d;
        this.f59262p0 = interfaceC13726B;
        this.f59263q0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18604y(this.f59261o0, this.f59262p0, this.f59263q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18604y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC13726B interfaceC13726B;
        C13756d c13756d;
        C7543h c7543h;
        C3726e c3726e;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f59260Z;
        C18546D c18546d = this.f59261o0;
        long j10 = this.f59263q0;
        C13756d c13756d2 = c18546d.f59095o;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC13726B = this.f59259Y;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                int i11 = C18546D.f59080t;
                c18546d.m19916f(false);
                c18546d.f59087g = false;
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            boolean zM15225f = c13756d2.m15225f();
            interfaceC13726B = this.f59262p0;
            if (zM15225f) {
                interfaceC13726B = interfaceC13726B instanceof C13746W ? (C13746W) interfaceC13726B : AbstractC18547E.f59099a;
            }
            if (!c13756d2.m15225f()) {
                C7543h c7543h2 = new C7543h(j10);
                this.f59259Y = interfaceC13726B;
                this.f59260Z = 1;
                if (c13756d2.m15226g(c7543h2, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            long jM7881c = C7543h.m7881c(((C7543h) c13756d2.m15224e()).f23897a, j10);
            c13756d = c18546d.f59095o;
            c7543h = new C7543h(jM7881c);
            c3726e = new C3726e(c18546d, jM7881c, 3);
            this.f59259Y = null;
            this.f59260Z = 2;
            if (C13756d.m15222c(c13756d, c7543h, interfaceC13726B, c3726e, this, 4) == enumC19250a) {
                return enumC19250a;
            }
            int i12 = C18546D.f59080t;
            c18546d.m19916f(false);
            c18546d.f59087g = false;
            return C17296C.f55119a;
            c18546d.f59083c.invoke();
            long jM7881c2 = C7543h.m7881c(((C7543h) c13756d2.m15224e()).f23897a, j10);
            c13756d = c18546d.f59095o;
            c7543h = new C7543h(jM7881c2);
            c3726e = new C3726e(c18546d, jM7881c2, 3);
            this.f59259Y = null;
            this.f59260Z = 2;
            if (C13756d.m15222c(c13756d, c7543h, interfaceC13726B, c3726e, this, 4) == enumC19250a) {
                return enumC19250a;
            }
            int i13 = C18546D.f59080t;
            c18546d.m19916f(false);
            c18546d.f59087g = false;
        } catch (CancellationException unused) {
        }
        return C17296C.f55119a;
    }
}
