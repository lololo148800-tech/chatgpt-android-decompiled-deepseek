package p763g5;

import p049Bm.InterfaceC1439n;
import p228J.AbstractC3812N;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.C14932d;
import p825j5.C16127d;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: g5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13819d extends AbstractC3812N implements InterfaceC13817b {
    /* JADX WARN: Code duplicated, block: B:46:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public final Object m15420Q(boolean z6, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) throws Throwable {
        C13818c c13818c;
        AbstractC13819d abstractC13819d;
        C16127d c16127d;
        C16127d c16127d2;
        Throwable th2;
        C16127d c16127d3;
        C16127d c16127d4;
        C14932d c14932dM17683a;
        AbstractC13819d abstractC13819d2;
        Object obj;
        C16127d c16127d5;
        C16127d c16127d6;
        C16127d c16127d7;
        C14932d c14932dM17683a2;
        C16127d c16127d8;
        Object obj2;
        AbstractC13819d abstractC13819d3;
        if (abstractC19687c instanceof C13818c) {
            c13818c = (C13818c) abstractC19687c;
            int i10 = c13818c.f43824u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13818c.f43824u0 = i10 - Integer.MIN_VALUE;
            } else {
                c13818c = new C13818c(this, abstractC19687c);
            }
        } else {
            c13818c = new C13818c(this, abstractC19687c);
        }
        Object obj3 = c13818c.f43822s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13818c.f43824u0;
        Object obj4 = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj3);
            C14932d c14932dM10273S = ((C9683j) this.f11539Z).m10273S();
            c13818c.f43816Y = this;
            c13818c.f43817Z = interfaceC1439n;
            c13818c.f43821r0 = z6;
            c13818c.f43824u0 = 1;
            obj3 = c14932dM10273S.f46522b;
            if (obj3 == enumC19250a) {
                return enumC19250a;
            }
            abstractC13819d = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    C16127d c16127d9 = c13818c.f43818o0;
                    C16127d c16127d10 = (C16127d) c13818c.f43817Z;
                    abstractC13819d = c13818c.f43816Y;
                    try {
                        AbstractC9233X.m9807c(obj3);
                        c16127d4 = c16127d10;
                        c16127d3 = c16127d9;
                        c16127d7 = c16127d4;
                        try {
                            c16127d7.f50046f = true;
                            c14932dM17683a2 = c16127d7.m17683a();
                            c13818c.f43816Y = abstractC13819d;
                            c13818c.f43817Z = c16127d7;
                            c13818c.f43818o0 = c16127d3;
                            c13818c.f43819p0 = obj3;
                            c13818c.f43824u0 = 3;
                            if (c14932dM17683a2.f46522b == enumC19250a) {
                                return enumC19250a;
                            }
                            c16127d8 = c16127d7;
                            obj2 = obj3;
                            abstractC13819d3 = abstractC13819d;
                        } catch (Throwable th3) {
                            c16127d2 = c16127d3;
                            obj4 = obj3;
                            th2 = th3;
                            c16127d = c16127d7;
                            c14932dM17683a = c16127d.m17683a();
                            c13818c.f43816Y = abstractC13819d;
                            c13818c.f43817Z = c16127d;
                            c13818c.f43818o0 = c16127d2;
                            c13818c.f43819p0 = th2;
                            c13818c.f43820q0 = obj4;
                            c13818c.f43824u0 = 4;
                            if (c14932dM17683a.f46522b == enumC19250a) {
                                return enumC19250a;
                            }
                            abstractC13819d2 = abstractC13819d;
                            obj = obj4;
                            c16127d5 = c16127d2;
                            c16127d6 = c16127d;
                            abstractC13819d2.m4520K(c16127d6, c16127d5, th2, obj);
                            return obj;
                        }
                    } catch (Throwable th4) {
                        c16127d2 = c16127d9;
                        c16127d = c16127d10;
                        th2 = th4;
                        c14932dM17683a = c16127d.m17683a();
                        c13818c.f43816Y = abstractC13819d;
                        c13818c.f43817Z = c16127d;
                        c13818c.f43818o0 = c16127d2;
                        c13818c.f43819p0 = th2;
                        c13818c.f43820q0 = obj4;
                        c13818c.f43824u0 = 4;
                        if (c14932dM17683a.f46522b == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC13819d2 = abstractC13819d;
                        obj = obj4;
                        c16127d5 = c16127d2;
                        c16127d6 = c16127d;
                        abstractC13819d2.m4520K(c16127d6, c16127d5, th2, obj);
                        return obj;
                    }
                } else {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            obj = c13818c.f43820q0;
                            th2 = (Throwable) c13818c.f43819p0;
                            c16127d5 = c13818c.f43818o0;
                            c16127d6 = (C16127d) c13818c.f43817Z;
                            abstractC13819d2 = c13818c.f43816Y;
                            AbstractC9233X.m9807c(obj3);
                            abstractC13819d2.m4520K(c16127d6, c16127d5, th2, obj);
                            return obj;
                        }
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = c13818c.f43819p0;
                        C16127d c16127d11 = c13818c.f43818o0;
                        C16127d c16127d12 = (C16127d) c13818c.f43817Z;
                        AbstractC13819d abstractC13819d4 = c13818c.f43816Y;
                        AbstractC9233X.m9807c(obj3);
                        abstractC13819d4.m4520K(c16127d12, c16127d11, null, obj5);
                        return obj5;
                    }
                    obj2 = c13818c.f43819p0;
                    c16127d3 = c13818c.f43818o0;
                    c16127d8 = (C16127d) c13818c.f43817Z;
                    abstractC13819d3 = c13818c.f43816Y;
                    AbstractC9233X.m9807c(obj3);
                }
                abstractC13819d3.m4520K(c16127d8, c16127d3, null, obj2);
                return obj2;
            }
            z6 = c13818c.f43821r0;
            interfaceC1439n = (InterfaceC1439n) c13818c.f43817Z;
            abstractC13819d = c13818c.f43816Y;
            AbstractC9233X.m9807c(obj3);
        }
        c16127d = (C16127d) obj3;
        c16127d2 = c16127d.f50048h;
        if (c16127d2 != null && z6) {
            throw new IllegalStateException("Already in a transaction");
        }
        try {
            C13820e c13820e = new C13820e();
            c13818c.f43816Y = abstractC13819d;
            c13818c.f43817Z = c16127d;
            c13818c.f43818o0 = c16127d2;
            c13818c.f43824u0 = 2;
            Object objInvoke = interfaceC1439n.invoke(c13820e, c13818c);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            c16127d3 = c16127d2;
            c16127d4 = c16127d;
            obj3 = objInvoke;
            c16127d7 = c16127d4;
            c16127d7.f50046f = true;
            c14932dM17683a2 = c16127d7.m17683a();
            c13818c.f43816Y = abstractC13819d;
            c13818c.f43817Z = c16127d7;
            c13818c.f43818o0 = c16127d3;
            c13818c.f43819p0 = obj3;
            c13818c.f43824u0 = 3;
            if (c14932dM17683a2.f46522b == enumC19250a) {
                return enumC19250a;
            }
            c16127d8 = c16127d7;
            obj2 = obj3;
            abstractC13819d3 = abstractC13819d;
            abstractC13819d3.m4520K(c16127d8, c16127d3, null, obj2);
            return obj2;
        } catch (Throwable th5) {
            th2 = th5;
            c14932dM17683a = c16127d.m17683a();
            c13818c.f43816Y = abstractC13819d;
            c13818c.f43817Z = c16127d;
            c13818c.f43818o0 = c16127d2;
            c13818c.f43819p0 = th2;
            c13818c.f43820q0 = obj4;
            c13818c.f43824u0 = 4;
            if (c14932dM17683a.f46522b == enumC19250a) {
                return enumC19250a;
            }
            abstractC13819d2 = abstractC13819d;
            obj = obj4;
            c16127d5 = c16127d2;
            c16127d6 = c16127d;
            abstractC13819d2.m4520K(c16127d6, c16127d5, th2, obj);
            return obj;
        }
    }
}
