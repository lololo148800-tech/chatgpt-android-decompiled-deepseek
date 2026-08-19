package p481Tf;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;
import gd.C13906X0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.RunnableC0074m;
import p025An.AbstractC0593T;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21937L1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p544W9.AbstractC8728v3;
import p571X9.AbstractC9233X;
import p720e6.C13287b;
import p746fa.C13599h;
import p746fa.C13606o;
import p832jb.C16187g;
import p948pi.C18418a;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C7415t implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final C7409n f23491Y;

    /* JADX INFO: renamed from: Z */
    public final Application f23492Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13849E f23493o0;

    /* JADX INFO: renamed from: p0 */
    public final C18418a f23494p0;

    /* JADX INFO: renamed from: q0 */
    public final C3430e f23495q0 = AbstractC8168p6.m8749b("NotificationTokenInitializer", null);

    public C7415t(C7409n c7409n, Application application, InterfaceC13849E interfaceC13849E, C18418a c18418a) {
        this.f23491Y = c7409n;
        this.f23492Z = application;
        this.f23493o0 = interfaceC13849E;
        this.f23494p0 = c18418a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[PHI: r2 r9
      0x009d: PHI (r2v6 Tf.t) = (r2v5 Tf.t), (r2v8 Tf.t) binds: [B:31:0x007e, B:36:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r9v14 zi.Q1) = (r9v13 zi.Q1), (r9v17 zi.Q1) binds: [B:31:0x007e, B:36:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C7413r c7413r;
        C7415t c7415t;
        AbstractC21955Q1 abstractC21955Q1;
        String str;
        C7409n c7409n;
        AbstractC21955Q1 abstractC21955Q2;
        C7415t c7415t2;
        if (interfaceC18770c instanceof C7413r) {
            c7413r = (C7413r) interfaceC18770c;
            int i10 = c7413r.f23485q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7413r.f23485q0 = i10 - Integer.MIN_VALUE;
            } else {
                c7413r = new C7413r(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c7413r = new C7413r(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM15482b = c7413r.f23483o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7413r.f23485q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM15482b);
            if (!this.f23494p0.f58773a.f58783b) {
                C13906X0 c13906x0 = C13906X0.f43956c;
                c7413r.f23481Y = this;
                c7413r.f23485q0 = 1;
                objM15482b = ((C14005w2) this.f23493o0).m15482b(c13906x0, c7413r);
                if (objM15482b == enumC19250a) {
                    return enumC19250a;
                }
                c7415t = this;
            }
            return c17296c;
        }
        if (i11 == 1) {
            c7415t = c7413r.f23481Y;
            AbstractC9233X.m9807c(objM15482b);
        } else {
            if (i11 == 2) {
                c7415t = c7413r.f23481Y;
                AbstractC9233X.m9807c(objM15482b);
                abstractC21955Q1 = (AbstractC21955Q1) objM15482b;
                if (abstractC21955Q1 instanceof C21952P1) {
                    str = (String) ((C21952P1) abstractC21955Q1).f69511a;
                    c7409n = c7415t.f23491Y;
                    c7413r.f23481Y = c7415t;
                    c7413r.f23482Z = (C21952P1) abstractC21955Q1;
                    c7413r.f23485q0 = 3;
                    if (c7409n.m7797c(str, c7413r) == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q2 = abstractC21955Q1;
                    c7415t2 = c7415t;
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to register firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
                }
                return c17296c;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC21955Q2 = c7413r.f23482Z;
            c7415t2 = c7413r.f23481Y;
            AbstractC9233X.m9807c(objM15482b);
        }
        c7415t = c7415t2;
        abstractC21955Q1 = abstractC21955Q2;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to register firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
        }
        return c17296c;
        if (((Boolean) objM15482b).booleanValue()) {
            c7413r.f23481Y = c7415t;
            c7413r.f23485q0 = 2;
            objM15482b = c7415t.m7799c(c7413r);
            if (objM15482b == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q1 = (AbstractC21955Q1) objM15482b;
            if (abstractC21955Q1 instanceof C21952P1) {
                str = (String) ((C21952P1) abstractC21955Q1).f69511a;
                c7409n = c7415t.f23491Y;
                c7413r.f23481Y = c7415t;
                c7413r.f23482Z = (C21952P1) abstractC21955Q1;
                c7413r.f23485q0 = 3;
                if (c7409n.m7797c(str, c7413r) == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q2 = abstractC21955Q1;
                c7415t2 = c7415t;
                c7415t = c7415t2;
                abstractC21955Q1 = abstractC21955Q2;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to register firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to register firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
            }
        }
        return c17296c;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7799c(AbstractC19687c abstractC19687c) {
        C7412q c7412q;
        FirebaseMessaging firebaseMessaging;
        if (abstractC19687c instanceof C7412q) {
            c7412q = (C7412q) abstractC19687c;
            int i10 = c7412q.f23480o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7412q.f23480o0 = i10 - Integer.MIN_VALUE;
            } else {
                c7412q = new C7412q(this, abstractC19687c);
            }
        } else {
            c7412q = new C7412q(this, abstractC19687c);
        }
        Object objM9451a = c7412q.f23478Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7412q.f23480o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM9451a);
                C16187g.m17792e(this.f23492Z);
                C13287b c13287b = FirebaseMessaging.f36849k;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(C16187g.m17791b());
                }
                firebaseMessaging.getClass();
                C13599h c13599h = new C13599h();
                firebaseMessaging.f36857f.execute(new RunnableC0074m(firebaseMessaging, 16, c13599h));
                C13606o c13606o = c13599h.f42961a;
                AbstractC16544l.m18093f(c13606o, "getToken(...)");
                c7412q.f23480o0 = 1;
                objM9451a = AbstractC8728v3.m9451a(c13606o, c7412q);
                if (objM9451a == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9451a);
            }
            return new C21952P1((String) objM9451a);
        } catch (Exception e10) {
            return new C21937L1(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b A[PHI: r2 r9
      0x009b: PHI (r2v6 Tf.t) = (r2v5 Tf.t), (r2v8 Tf.t) binds: [B:31:0x007c, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r9v13 zi.Q1) = (r9v12 zi.Q1), (r9v16 zi.Q1) binds: [B:31:0x007c, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7800d(AbstractC19687c abstractC19687c) {
        C7414s c7414s;
        C7415t c7415t;
        AbstractC21955Q1 abstractC21955Q1;
        String str;
        C7409n c7409n;
        AbstractC21955Q1 abstractC21955Q2;
        C7415t c7415t2;
        if (abstractC19687c instanceof C7414s) {
            c7414s = (C7414s) abstractC19687c;
            int i10 = c7414s.f23490q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7414s.f23490q0 = i10 - Integer.MIN_VALUE;
            } else {
                c7414s = new C7414s(this, abstractC19687c);
            }
        } else {
            c7414s = new C7414s(this, abstractC19687c);
        }
        Object objM15482b = c7414s.f23488o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7414s.f23490q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM15482b);
            if (!this.f23494p0.f58773a.f58783b) {
                C13906X0 c13906x0 = C13906X0.f43956c;
                c7414s.f23486Y = this;
                c7414s.f23490q0 = 1;
                objM15482b = ((C14005w2) this.f23493o0).m15482b(c13906x0, c7414s);
                if (objM15482b == enumC19250a) {
                    return enumC19250a;
                }
                c7415t = this;
            }
            return c17296c;
        }
        if (i11 == 1) {
            c7415t = c7414s.f23486Y;
            AbstractC9233X.m9807c(objM15482b);
        } else {
            if (i11 == 2) {
                c7415t = c7414s.f23486Y;
                AbstractC9233X.m9807c(objM15482b);
                abstractC21955Q1 = (AbstractC21955Q1) objM15482b;
                if (abstractC21955Q1 instanceof C21952P1) {
                    str = (String) ((C21952P1) abstractC21955Q1).f69511a;
                    c7409n = c7415t.f23491Y;
                    c7414s.f23486Y = c7415t;
                    c7414s.f23487Z = (C21952P1) abstractC21955Q1;
                    c7414s.f23490q0 = 3;
                    if (c7409n.m7795a(str, c7414s) == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q2 = abstractC21955Q1;
                    c7415t2 = c7415t;
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to deregister firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
                }
                return c17296c;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC21955Q2 = c7414s.f23487Z;
            c7415t2 = c7414s.f23486Y;
            AbstractC9233X.m9807c(objM15482b);
        }
        c7415t = c7415t2;
        abstractC21955Q1 = abstractC21955Q2;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to deregister firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
        }
        return c17296c;
        if (((Boolean) objM15482b).booleanValue()) {
            c7414s.f23486Y = c7415t;
            c7414s.f23490q0 = 2;
            objM15482b = c7415t.m7799c(c7414s);
            if (objM15482b == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q1 = (AbstractC21955Q1) objM15482b;
            if (abstractC21955Q1 instanceof C21952P1) {
                str = (String) ((C21952P1) abstractC21955Q1).f69511a;
                c7409n = c7415t.f23491Y;
                c7414s.f23486Y = c7415t;
                c7414s.f23487Z = (C21952P1) abstractC21955Q1;
                c7414s.f23490q0 = 3;
                if (c7409n.m7795a(str, c7414s) == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q2 = abstractC21955Q1;
                c7415t2 = c7415t;
                c7415t = c7415t2;
                abstractC21955Q1 = abstractC21955Q2;
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to deregister firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                AbstractC8160o6.m8727b(c7415t.f23495q0, "Failed to deregister firebase messaging token", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
            }
        }
        return c17296c;
    }
}
