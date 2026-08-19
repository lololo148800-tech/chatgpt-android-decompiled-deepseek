package p792hl;

import il.AbstractC15037b;
import io.ktor.utils.p815io.AbstractC15070F;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0625m0;
import p025An.C0631p0;
import p025An.InterfaceC0638t;
import p049Bm.InterfaceC1439n;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p556Wk.AbstractC8936r;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9261b3;
import p754fl.C13693c;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18774g;
import p996rm.EnumC19250a;
import sl.C19666a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: hl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14535j {

    /* JADX INFO: renamed from: a */
    public final C13693c f45812a;

    /* JADX INFO: renamed from: b */
    public final C6752c f45813b;

    public C14535j(C13693c builder, C6752c client) {
        AbstractC16544l.m18094g(builder, "builder");
        AbstractC16544l.m18094g(client, "client");
        this.f45812a = builder;
        this.f45813b = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m16036a(AbstractC14527b abstractC14527b, AbstractC19687c abstractC19687c) {
        C14531f c14531f;
        if (abstractC19687c instanceof C14531f) {
            c14531f = (C14531f) abstractC19687c;
            int i10 = c14531f.f45798o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14531f.f45798o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14531f = new C14531f(this, abstractC19687c);
            }
        } else {
            c14531f = new C14531f(this, abstractC19687c);
        }
        Object obj = c14531f.f45796Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14531f.f45798o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC18774g interfaceC18774g = abstractC14527b.getCoroutineContext().get(C0625m0.f1875Y);
            AbstractC16544l.m18091d(interfaceC18774g);
            InterfaceC0638t interfaceC0638t = (InterfaceC0638t) interfaceC18774g;
            ((C0631p0) interfaceC0638t).m1279g0();
            try {
                AbstractC15070F.m16174b(abstractC14527b.mo7304c());
            } catch (Throwable unused) {
            }
            c14531f.f45798o0 = 1;
            if (interfaceC0638t.mo1272P(c14531f) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m16037b(InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) throws Throwable {
        C14532g c14532g;
        C14535j c14535j;
        AbstractC14527b abstractC14527b;
        AbstractC14527b abstractC14527b2;
        if (abstractC19687c instanceof C14532g) {
            c14532g = (C14532g) abstractC19687c;
            int i10 = c14532g.f45803q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14532g.f45803q0 = i10 - Integer.MIN_VALUE;
            } else {
                c14532g = new C14532g(this, abstractC19687c);
            }
        } else {
            c14532g = new C14532g(this, abstractC19687c);
        }
        Object objM16039d = c14532g.f45801o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14532g.f45803q0;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM16039d);
                    c14532g.f45799Y = this;
                    c14532g.f45800Z = interfaceC1439n;
                    c14532g.f45803q0 = 1;
                    objM16039d = m16039d(c14532g);
                    if (objM16039d == enumC19250a) {
                        return enumC19250a;
                    }
                    c14535j = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                Object obj = c14532g.f45799Y;
                                AbstractC9233X.m9807c(objM16039d);
                                return obj;
                            }
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) c14532g.f45799Y;
                            AbstractC9233X.m9807c(objM16039d);
                            throw th;
                        }
                        abstractC14527b2 = (AbstractC14527b) c14532g.f45800Z;
                        c14535j = (C14535j) c14532g.f45799Y;
                        try {
                            AbstractC9233X.m9807c(objM16039d);
                            c14532g.f45799Y = objM16039d;
                            c14532g.f45800Z = null;
                            c14532g.f45803q0 = 3;
                            if (c14535j.m16036a(abstractC14527b2, c14532g) == enumC19250a) {
                                return enumC19250a;
                            }
                            return objM16039d;
                        } catch (Throwable th2) {
                            abstractC14527b = abstractC14527b2;
                            th = th2;
                            c14532g.f45799Y = th;
                            c14532g.f45800Z = null;
                            c14532g.f45803q0 = 4;
                            if (c14535j.m16036a(abstractC14527b, c14532g) == enumC19250a) {
                                return enumC19250a;
                            }
                            throw th;
                        }
                    }
                    interfaceC1439n = (InterfaceC1439n) c14532g.f45800Z;
                    c14535j = (C14535j) c14532g.f45799Y;
                    AbstractC9233X.m9807c(objM16039d);
                }
                c14532g.f45799Y = c14535j;
                c14532g.f45800Z = abstractC14527b;
                c14532g.f45803q0 = 2;
                Object objInvoke = interfaceC1439n.invoke(abstractC14527b, c14532g);
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
                objM16039d = objInvoke;
                abstractC14527b2 = abstractC14527b;
                c14532g.f45799Y = objM16039d;
                c14532g.f45800Z = null;
                c14532g.f45803q0 = 3;
                if (c14535j.m16036a(abstractC14527b2, c14532g) == enumC19250a) {
                    return enumC19250a;
                }
                return objM16039d;
            } catch (Throwable th3) {
                th = th3;
                c14532g.f45799Y = th;
                c14532g.f45800Z = null;
                c14532g.f45803q0 = 4;
                if (c14535j.m16036a(abstractC14527b, c14532g) == enumC19250a) {
                    return enumC19250a;
                }
                throw th;
            }
            abstractC14527b = (AbstractC14527b) objM16039d;
        } catch (CancellationException e10) {
            throw AbstractC15037b.m16170b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m16038c(InterfaceC18770c interfaceC18770c) throws Throwable {
        C14533h c14533h;
        C14535j c14535j;
        C6911c c6911c;
        C14535j c14535j2;
        AbstractC14527b abstractC14527bM7297d;
        AbstractC14527b abstractC14527bM7297d2;
        if (interfaceC18770c instanceof C14533h) {
            c14533h = (C14533h) interfaceC18770c;
            int i10 = c14533h.f45808q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14533h.f45808q0 = i10 - Integer.MIN_VALUE;
            } else {
                c14533h = new C14533h(this, interfaceC18770c);
            }
        } else {
            c14533h = new C14533h(this, interfaceC18770c);
        }
        Object objM7189e = c14533h.f45806o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14533h.f45808q0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    c14535j = (C14535j) c14533h.f45804Y;
                    AbstractC9233X.m9807c(objM7189e);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC14527b abstractC14527b = (AbstractC14527b) c14533h.f45804Y;
                        AbstractC9233X.m9807c(objM7189e);
                        return abstractC14527b;
                    }
                    c6911c = c14533h.f45805Z;
                    c14535j2 = (C14535j) c14533h.f45804Y;
                    AbstractC9233X.m9807c(objM7189e);
                }
                abstractC14527bM7297d = ((C6911c) objM7189e).m7297d();
                abstractC14527bM7297d2 = c6911c.m7297d();
                c14533h.f45804Y = abstractC14527bM7297d;
                c14533h.f45805Z = null;
                c14533h.f45808q0 = 3;
                if (c14535j2.m16036a(abstractC14527bM7297d2, c14533h) == enumC19250a) {
                    return enumC19250a;
                }
                return abstractC14527bM7297d;
            }
            AbstractC9233X.m9807c(objM7189e);
            C13693c c13693c = new C13693c();
            c13693c.m15169d(this.f45812a);
            C6752c c6752c = this.f45813b;
            c14533h.f45804Y = this;
            c14533h.f45808q0 = 1;
            objM7189e = c6752c.m7189e(c13693c, c14533h);
            if (objM7189e == enumC19250a) {
                return enumC19250a;
            }
            c14535j = this;
            C6911c c6911c2 = (C6911c) objM7189e;
            c14533h.f45804Y = c14535j;
            c14533h.f45805Z = c6911c2;
            c14533h.f45808q0 = 2;
            Object objM9835a = AbstractC9261b3.m9835a(c6911c2, c14533h);
            if (objM9835a == enumC19250a) {
                return enumC19250a;
            }
            C14535j c14535j3 = c14535j;
            c6911c = c6911c2;
            objM7189e = objM9835a;
            c14535j2 = c14535j3;
            abstractC14527bM7297d = ((C6911c) objM7189e).m7297d();
            abstractC14527bM7297d2 = c6911c.m7297d();
            c14533h.f45804Y = abstractC14527bM7297d;
            c14533h.f45805Z = null;
            c14533h.f45808q0 = 3;
            if (c14535j2.m16036a(abstractC14527bM7297d2, c14533h) == enumC19250a) {
                return enumC19250a;
            }
            return abstractC14527bM7297d;
        } catch (CancellationException e10) {
            throw AbstractC15037b.m16170b(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m16039d(AbstractC19687c abstractC19687c) throws Throwable {
        C14534i c14534i;
        if (abstractC19687c instanceof C14534i) {
            c14534i = (C14534i) abstractC19687c;
            int i10 = c14534i.f45811o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14534i.f45811o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14534i = new C14534i(this, abstractC19687c);
            }
        } else {
            c14534i = new C14534i(this, abstractC19687c);
        }
        Object objM7189e = c14534i.f45809Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14534i.f45811o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM7189e);
                C13693c c13693c = new C13693c();
                c13693c.m15169d(this.f45812a);
                C19666a c19666a = AbstractC8936r.f27327a;
                c13693c.f43200f.m20652f(AbstractC8936r.f27327a, C17296C.f55119a);
                C6752c c6752c = this.f45813b;
                c14534i.f45811o0 = 1;
                objM7189e = c6752c.m7189e(c13693c, c14534i);
                if (objM7189e == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM7189e);
            }
            return ((C6911c) objM7189e).m7297d();
        } catch (CancellationException e10) {
            throw AbstractC15037b.m16170b(e10);
        }
    }

    public final String toString() {
        return "HttpStatement[" + this.f45812a.f43195a + ']';
    }
}
