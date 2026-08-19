package io.ktor.utils.p815io;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0638t;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: io.ktor.utils.io.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C15069E extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Object f46828Y;

    /* JADX INFO: renamed from: Z */
    public int f46829Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f46830o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f46831p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15085k f46832q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15069E(InterfaceC1439n interfaceC1439n, C15085k c15085k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f46831p0 = (AbstractC19694j) interfaceC1439n;
        this.f46832q0 = c15085k;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C15069E c15069e = new C15069E(this.f46831p0, this.f46832q0, interfaceC18770c);
        c15069e.f46830o0 = obj;
        return c15069e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C15069E) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:30:0x0092, B:32:0x00a0), top: B:64:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [An.n0] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v16, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r9v18 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        Throwable th3;
        InterfaceC0571F interfaceC0571F;
        C0631p0 c0631p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r6 = this.f46829Z;
        C15085k c15085k = this.f46832q0;
        try {
            try {
                switch (r6) {
                    case 0:
                        AbstractC9233X.m9807c(obj);
                        interfaceC0571F = (InterfaceC0571F) this.f46830o0;
                        C0631p0 c0631p1 = new C0631p0(AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()));
                        ?? r10 = this.f46831p0;
                        C15074J c15074j = new C15074J(c15085k, interfaceC0571F.getCoroutineContext().plus(c0631p1));
                        this.f46830o0 = interfaceC0571F;
                        this.f46828Y = c0631p1;
                        this.f46829Z = 1;
                        r6 = c0631p1;
                        if (r10.invoke(c15074j, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        c0631p0 = (C0631p0) r6;
                        c0631p0.m1279g0();
                        try {
                            if (AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()).isCancelled()) {
                                c15085k.mo1138b(AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()).mo1273T());
                            }
                            this.f46830o0 = interfaceC0571F;
                            this.f46828Y = null;
                            this.f46829Z = 2;
                            if (c0631p0.mo1272P(this) == enumC19250a) {
                                return enumC19250a;
                            }
                            this.f46830o0 = null;
                            this.f46829Z = 3;
                            if (c15085k.m16204i(this) == enumC19250a) {
                                return enumC19250a;
                            }
                            break;
                        } catch (Throwable th4) {
                            r6 = c0631p0;
                            th = th4;
                            try {
                                r6.mo1275e(AbstractC0575H.m1172a("Exception thrown while writing to channel", th));
                                c15085k.mo1138b(th);
                                this.f46830o0 = interfaceC0571F;
                                this.f46828Y = null;
                                this.f46829Z = 4;
                                if (r6.mo1272P(this) == enumC19250a) {
                                    return enumC19250a;
                                }
                                this.f46830o0 = null;
                                this.f46829Z = 5;
                                if (c15085k.m16204i(this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                this.f46830o0 = interfaceC0571F;
                                this.f46828Y = th;
                                this.f46829Z = 6;
                                if (r6.mo1272P(this) == enumC19250a) {
                                    return enumC19250a;
                                }
                            }
                        }
                        return C17296C.f55119a;
                    case 1:
                        InterfaceC0638t interfaceC0638t = (InterfaceC0638t) this.f46828Y;
                        interfaceC0571F = (InterfaceC0571F) this.f46830o0;
                        AbstractC9233X.m9807c(obj);
                        r6 = interfaceC0638t;
                        c0631p0 = (C0631p0) r6;
                        c0631p0.m1279g0();
                        if (AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()).isCancelled()) {
                            c15085k.mo1138b(AbstractC0575H.m1192u(interfaceC0571F.getCoroutineContext()).mo1273T());
                            break;
                        }
                        this.f46830o0 = interfaceC0571F;
                        this.f46828Y = null;
                        this.f46829Z = 2;
                        if (c0631p0.mo1272P(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        this.f46830o0 = null;
                        this.f46829Z = 3;
                        if (c15085k.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return C17296C.f55119a;
                    case 2:
                        AbstractC9233X.m9807c(obj);
                        this.f46830o0 = null;
                        this.f46829Z = 3;
                        if (c15085k.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return C17296C.f55119a;
                    case 3:
                        AbstractC9233X.m9807c(obj);
                        return C17296C.f55119a;
                    case 4:
                        AbstractC9233X.m9807c(obj);
                        this.f46830o0 = null;
                        this.f46829Z = 5;
                        if (c15085k.m16204i(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        return C17296C.f55119a;
                    case 5:
                        AbstractC9233X.m9807c(obj);
                        return C17296C.f55119a;
                    case 6:
                        Throwable th6 = (Throwable) this.f46828Y;
                        AbstractC9233X.m9807c(obj);
                        th = th6;
                        try {
                            this.f46830o0 = th;
                            this.f46828Y = null;
                            this.f46829Z = 7;
                            if (c15085k.m16204i(this) == enumC19250a) {
                                return enumC19250a;
                            }
                            throw th;
                        } catch (Throwable th7) {
                            th2 = th;
                            th3 = th7;
                            AbstractC9233X.m9806b(th3);
                            throw th2;
                        }
                    case 7:
                        th2 = (Throwable) this.f46830o0;
                        try {
                            AbstractC9233X.m9807c(obj);
                            throw th2;
                        } catch (Throwable th8) {
                            th3 = th8;
                            AbstractC9233X.m9806b(th3);
                            throw th2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            AbstractC9233X.m9806b(th10);
        }
    }
}
