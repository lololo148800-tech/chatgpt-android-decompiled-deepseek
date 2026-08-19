package p349O0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.C0227a;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p415R0.InterfaceC6787e;
import p466T0.C7176c;
import p491U0.C7533a;
import p491U0.C7534b;
import p515V0.C7736b;
import p571X9.AbstractC9233X;
import p586Y0.AbstractC9567s;
import p586Y0.C9555g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6026r0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C9555g f19596Y;

    /* JADX INFO: renamed from: Z */
    public int f19597Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f19598o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6032u0 f19599p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6030t0 f19600q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5977T f19601r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6026r0(C6032u0 c6032u0, C6030t0 c6030t0, InterfaceC5977T interfaceC5977T, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19599p0 = c6032u0;
        this.f19600q0 = c6030t0;
        this.f19601r0 = interfaceC5977T;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6026r0 c6026r0 = new C6026r0(this.f19599p0, this.f19600q0, this.f19601r0, interfaceC18770c);
        c6026r0.f19598o0 = obj;
        return c6026r0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6026r0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e6 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:39:0x00e2, B:41:0x00e6, B:44:0x00eb), top: B:69:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010c A[Catch: all -> 0x010f, TryCatch #4 {all -> 0x010f, blocks: (B:55:0x0108, B:57:0x010c, B:60:0x0111), top: B:73:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2153Q0 c2153q0;
        InterfaceC6787e interfaceC6787e;
        C7534b c7534b;
        InterfaceC0627n0 interfaceC0627n0;
        Throwable th2;
        C9555g c9555g;
        List listM6599A;
        C6032u0 c6032u0;
        C6032u0 c6032u1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19597Z;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c9555g = this.f19596Y;
            interfaceC0627n0 = (InterfaceC0627n0) this.f19598o0;
            try {
                AbstractC9233X.m9807c(obj);
                c9555g.dispose();
                c6032u1 = this.f19599p0;
                synchronized (c6032u1.f19647c) {
                    try {
                        if (c6032u1.f19648d == interfaceC0627n0) {
                            c6032u1.f19648d = null;
                        }
                        c6032u1.m6608x();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C2153Q0 c2153q1 = C6032u0.f19643w;
                C5975S.m6403b(this.f19599p0.f19666v);
                return C17296C.f55119a;
            } catch (Throwable th4) {
                th2 = th4;
                c9555g.dispose();
                c6032u0 = this.f19599p0;
                synchronized (c6032u0.f19647c) {
                    try {
                        if (c6032u0.f19648d == interfaceC0627n0) {
                            c6032u0.f19648d = null;
                        }
                        c6032u0.m6608x();
                        C2153Q0 c2153q2 = C6032u0.f19643w;
                        C5975S.m6403b(this.f19599p0.f19666v);
                        throw th2;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC0627n0 interfaceC0627n0M1192u = AbstractC0575H.m1192u(((InterfaceC0571F) this.f19598o0).getCoroutineContext());
        C6032u0.m6597u(this.f19599p0, interfaceC0627n0M1192u);
        C9555g c9555gM10111g = AbstractC9567s.m10111g(new C0227a(this.f19599p0, 15));
        C5975S c5975s = this.f19599p0.f19666v;
        do {
            c2153q0 = C6032u0.f19643w;
            interfaceC6787e = (InterfaceC6787e) c2153q0.getValue();
            c7534b = (C7534b) interfaceC6787e;
            C7176c c7176c = c7534b.f23883o0;
            if (!c7176c.containsKey(c5975s)) {
                boolean zIsEmpty = c7534b.isEmpty();
                C7736b c7736b = C7736b.f24402a;
                if (zIsEmpty) {
                    c7534b = new C7534b(c5975s, c5975s, c7176c.m7555b(c5975s, new C7533a(c7736b, c7736b)));
                } else {
                    Object obj2 = c7534b.f23882Z;
                    Object obj3 = c7176c.get(obj2);
                    AbstractC16544l.m18091d(obj3);
                    c7534b = new C7534b(c7534b.f23881Y, c5975s, c7176c.m7555b(obj2, new C7533a(((C7533a) obj3).f23878a, c5975s)).m7555b(c5975s, new C7533a(obj2, c7736b)));
                }
            }
            if (interfaceC6787e == c7534b) {
                break;
            }
        } while (!c2153q0.m3250k(interfaceC6787e, c7534b));
        try {
            C6032u0 c6032u2 = this.f19599p0;
            synchronized (c6032u2.f19647c) {
                listM6599A = c6032u2.m6599A();
            }
            int size = listM6599A.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((C6029t) listM6599A.get(i11)).m6579p();
            }
            C6024q0 c6024q0 = new C6024q0(this.f19600q0, this.f19601r0, null);
            this.f19598o0 = interfaceC0627n0M1192u;
            this.f19596Y = c9555gM10111g;
            this.f19597Z = 1;
            if (AbstractC0575H.m1183l(c6024q0, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC0627n0 = interfaceC0627n0M1192u;
            c9555g = c9555gM10111g;
            c9555g.dispose();
            c6032u1 = this.f19599p0;
            synchronized (c6032u1.f19647c) {
                if (c6032u1.f19648d == interfaceC0627n0) {
                    c6032u1.f19648d = null;
                }
                c6032u1.m6608x();
                C2153Q0 c2153q3 = C6032u0.f19643w;
                C5975S.m6403b(this.f19599p0.f19666v);
                return C17296C.f55119a;
            }
        } catch (Throwable th6) {
            interfaceC0627n0 = interfaceC0627n0M1192u;
            th2 = th6;
            c9555g = c9555gM10111g;
            c9555g.dispose();
            c6032u0 = this.f19599p0;
            synchronized (c6032u0.f19647c) {
                if (c6032u0.f19648d == interfaceC0627n0) {
                    c6032u0.f19648d = null;
                }
                c6032u0.m6608x();
            }
            C2153Q0 c2153q4 = C6032u0.f19643w;
            C5975S.m6403b(this.f19599p0.f19666v);
            throw th2;
        }
    }
}
