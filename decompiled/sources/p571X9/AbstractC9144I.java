package p571X9;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6237k;
import p364Oh.C6238l;
import p364Oh.C6248v;
import p364Oh.InterfaceC6239m;
import p364Oh.InterfaceC6247u;
import p676c7.C11688g;
import p792hl.AbstractC14527b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9144I {
    /* JADX INFO: renamed from: a */
    public static final boolean m9689a(C11688g c11688g) {
        AbstractC16544l.m18094g(c11688g, "<this>");
        return (c11688g.f35452a == null && c11688g.f35453b == null && c11688g.f35454c == null && c11688g.f35455d.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static Object m9690b(InterfaceC6239m interfaceC6239m, C21296a c21296a, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        C6237k c6237k;
        if (interfaceC18770c instanceof C6237k) {
            c6237k = (C6237k) interfaceC18770c;
            int i10 = c6237k.f20314p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6237k.f20314p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6237k = new C6237k(interfaceC18770c);
            }
        } else {
            c6237k = new C6237k(interfaceC18770c);
        }
        Object objMo6741a = c6237k.f20313o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6237k.f20314p0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c21296a = c6237k.f20312Z;
                    interfaceC6239m = c6237k.f20311Y;
                    AbstractC9233X.m9807c(objMo6741a);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objMo6741a);
                        return (AbstractC6224C) objMo6741a;
                    }
                    interfaceC6239m = c6237k.f20311Y;
                    AbstractC9233X.m9807c(objMo6741a);
                }
                return new C6223B(objMo6741a);
            }
            AbstractC9233X.m9807c(objMo6741a);
            c6237k.f20311Y = interfaceC6239m;
            c6237k.f20312Z = c21296a;
            c6237k.f20314p0 = 1;
            objMo6741a = interfaceC6239m.mo6739b(interfaceC1439n, c6237k);
            if (objMo6741a == enumC19250a) {
                return enumC19250a;
            }
            AbstractC6224C abstractC6224C = (AbstractC6224C) objMo6741a;
            if (!(abstractC6224C instanceof C6223B)) {
                if (abstractC6224C instanceof C6248v) {
                    return abstractC6224C;
                }
                if (abstractC6224C instanceof AbstractC6249w) {
                    return (AbstractC6249w) abstractC6224C;
                }
                throw new C0644w();
            }
            AbstractC14527b abstractC14527b = (AbstractC14527b) ((C6223B) abstractC6224C).f20258a;
            c6237k.f20311Y = interfaceC6239m;
            c6237k.f20312Z = null;
            c6237k.f20314p0 = 2;
            objMo6741a = abstractC14527b.mo7303b().m7294a(c21296a, c6237k);
            if (objMo6741a == enumC19250a) {
                return enumC19250a;
            }
            return new C6223B(objMo6741a);
        } catch (Exception e10) {
            InterfaceC6247u interfaceC6247uMo6738a = interfaceC6239m.mo6738a();
            c6237k.f20311Y = null;
            c6237k.f20312Z = null;
            c6237k.f20314p0 = 3;
            objMo6741a = interfaceC6247uMo6738a.mo6741a(e10, c6237k);
            if (objMo6741a == enumC19250a) {
                return enumC19250a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static Object m9691c(InterfaceC6239m interfaceC6239m, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C6238l c6238l;
        if (abstractC19687c instanceof C6238l) {
            c6238l = (C6238l) abstractC19687c;
            int i10 = c6238l.f20317o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6238l.f20317o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6238l = new C6238l(abstractC19687c);
            }
        } else {
            c6238l = new C6238l(abstractC19687c);
        }
        Object objMo6741a = c6238l.f20316Z;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c6238l.f20317o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objMo6741a);
                Object objMo6740c = interfaceC6239m.mo6740c();
                c6238l.f20315Y = interfaceC6239m;
                c6238l.f20317o0 = 1;
                objMo6741a = interfaceC1439n.invoke(objMo6740c, c6238l);
                if (objMo6741a == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objMo6741a);
                    return (AbstractC6224C) objMo6741a;
                }
                interfaceC6239m = c6238l.f20315Y;
                AbstractC9233X.m9807c(objMo6741a);
            }
            return new C6223B((AbstractC14527b) objMo6741a);
        } catch (CancellationException unused) {
            return C6248v.f20327a;
        } catch (Exception e10) {
            InterfaceC6247u interfaceC6247uMo6738a = interfaceC6239m.mo6738a();
            c6238l.f20315Y = null;
            c6238l.f20317o0 = 2;
            objMo6741a = interfaceC6247uMo6738a.mo6741a(e10, c6238l);
            if (objMo6741a == obj) {
                return obj;
            }
        }
    }
}
