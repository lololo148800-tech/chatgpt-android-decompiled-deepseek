package p351O2;

import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import mm.C17312o;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.C0625m0;
import p025An.C0636s;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p025An.InterfaceC0634r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p197Hj.C3457c;
import p229J0.C4171z3;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p292Lg.C5034f;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8017W3;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O2.G */
/* JADX INFO: loaded from: classes.dex */
public final class C6084G implements InterfaceC6094h {

    /* JADX INFO: renamed from: j */
    public static final LinkedHashSet f19809j = new LinkedHashSet();

    /* JADX INFO: renamed from: k */
    public static final Object f19810k = new Object();

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f19811a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6097k f19812b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6088b f19813c;

    /* JADX INFO: renamed from: d */
    public final C2219z0 f19814d;

    /* JADX INFO: renamed from: e */
    public final String f19815e;

    /* JADX INFO: renamed from: f */
    public final C17314q f19816f;

    /* JADX INFO: renamed from: g */
    public final C2153Q0 f19817g;

    /* JADX INFO: renamed from: h */
    public List f19818h;

    /* JADX INFO: renamed from: i */
    public final C11238i f19819i;

    /* JADX WARN: Multi-variable type inference failed */
    public C6084G(InterfaceC1426a interfaceC1426a, InterfaceC6097k interfaceC6097k, List list, InterfaceC6088b interfaceC6088b, InterfaceC0571F scope) {
        AbstractC16544l.m18094g(scope, "scope");
        this.f19811a = (AbstractC16546n) interfaceC1426a;
        this.f19812b = interfaceC6097k;
        this.f19813c = interfaceC6088b;
        this.f19814d = new C2219z0(new C6107u(this, null));
        this.f19815e = ".tmp";
        int i10 = 26;
        this.f19816f = AbstractC9227W.m9800c(new C3457c(this, i10));
        this.f19817g = AbstractC2124C.m3204c(C6086I.f19820a);
        this.f19818h = AbstractC17680n.m19322C0(list);
        C4171z3 c4171z3 = new C4171z3(this, i10);
        C6104r c6104r = new C6104r(this, null);
        AbstractC16544l.m18094g(scope, "scope");
        C11238i c11238i = new C11238i();
        c11238i.f34008Y = scope;
        c11238i.f34009Z = c6104r;
        c11238i.f34010o0 = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
        c11238i.f34011p0 = new AtomicInteger(0);
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) scope.getCoroutineContext().get(C0625m0.f1875Y);
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1271H0(new C5034f(c4171z3, 13, c11238i));
        }
        this.f19819i = c11238i;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [O2.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [O2.G] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: c */
    public static final Object m6649c(C6084G c6084g, C6100n c6100n, AbstractC19687c abstractC19687c) {
        C6108v c6108v;
        InterfaceC0634r interfaceC0634r;
        C0636s c0636s;
        ?? r10;
        Object objM6658j;
        ?? r11;
        c6084g.getClass();
        if (abstractC19687c instanceof C6108v) {
            c6108v = (C6108v) abstractC19687c;
            int i10 = c6108v.f19865r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6108v.f19865r0 = i10 - Integer.MIN_VALUE;
            } else {
                c6108v = new C6108v(c6084g, abstractC19687c);
            }
        } else {
            c6108v = new C6108v(c6084g, abstractC19687c);
        }
        Object objM9806b = c6108v.f19863p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6108v.f19865r0;
        boolean z6 = true;
        if (i11 != 0) {
            try {
                if (i11 == 1) {
                    interfaceC0634r = (InterfaceC0634r) c6108v.f19860Y;
                } else if (i11 == 2) {
                    C0636s c0636s2 = c6108v.f19862o0;
                    C6084G c6084g2 = c6108v.f19861Z;
                    C6100n c6100n2 = (C6100n) c6108v.f19860Y;
                    AbstractC9233X.m9807c(objM9806b);
                    c0636s = c0636s2;
                    r10 = c6084g2;
                    c6100n = c6100n2;
                    r10 = c6084g;
                    InterfaceC1439n interfaceC1439n = c6100n.f19843a;
                    InterfaceC18776i interfaceC18776i = c6100n.f19846d;
                    c6108v.f19860Y = c0636s;
                    c6108v.f19861Z = null;
                    c6108v.f19862o0 = null;
                    c6108v.f19865r0 = 3;
                    objM6658j = r10.m6658j(interfaceC1439n, interfaceC18776i, c6108v);
                    if (objM6658j == enumC19250a) {
                        return enumC19250a;
                    }
                    C0636s c0636s3 = c0636s;
                    objM9806b = objM6658j;
                    r11 = c0636s3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0634r = (InterfaceC0634r) c6108v.f19860Y;
                }
                AbstractC9233X.m9807c(objM9806b);
                r11 = interfaceC0634r;
            } catch (Throwable th2) {
                th = th2;
                objM9806b = AbstractC9233X.m9806b(th);
                r11 = c6084g;
            }
        } else {
            AbstractC9233X.m9807c(objM9806b);
            c0636s = c6100n.f19844b;
            try {
                AbstractC6085H abstractC6085H = (AbstractC6085H) c6084g.f19817g.getValue();
                if (abstractC6085H instanceof C6089c) {
                    InterfaceC1439n interfaceC1439n2 = c6100n.f19843a;
                    InterfaceC18776i interfaceC18776i2 = c6100n.f19846d;
                    c6108v.f19860Y = c0636s;
                    c6108v.f19865r0 = 1;
                    objM6658j = c6084g.m6658j(interfaceC1439n2, interfaceC18776i2, c6108v);
                    if (objM6658j == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (!(abstractC6085H instanceof C6096j)) {
                        z6 = abstractC6085H instanceof C6086I;
                    }
                    if (!z6) {
                        if (abstractC6085H instanceof C6095i) {
                            throw ((C6095i) abstractC6085H).f19837a;
                        }
                        throw new C0644w();
                    }
                    if (abstractC6085H != c6100n.f19845c) {
                        throw ((C6096j) abstractC6085H).f19838a;
                    }
                    c6108v.f19860Y = c6100n;
                    c6108v.f19861Z = c6084g;
                    c6108v.f19862o0 = c0636s;
                    c6108v.f19865r0 = 2;
                    if (c6084g.m6654f(c6108v) == enumC19250a) {
                        r10 = c6084g;
                        return enumC19250a;
                    }
                    r10 = c6084g;
                    InterfaceC1439n interfaceC1439n3 = c6100n.f19843a;
                    InterfaceC18776i interfaceC18776i3 = c6100n.f19846d;
                    c6108v.f19860Y = c0636s;
                    c6108v.f19861Z = null;
                    c6108v.f19862o0 = null;
                    c6108v.f19865r0 = 3;
                    objM6658j = r10.m6658j(interfaceC1439n3, interfaceC18776i3, c6108v);
                    if (objM6658j == enumC19250a) {
                        return enumC19250a;
                    }
                }
                C0636s c0636s4 = c0636s;
                objM9806b = objM6658j;
                r11 = c0636s4;
            } catch (Throwable th3) {
                th = th3;
                c6084g = c0636s;
                objM9806b = AbstractC9233X.m9806b(th);
                r11 = c6084g;
            }
        }
        Throwable thM18979a = C17312o.m18979a(objM9806b);
        C0636s c0636s5 = (C0636s) r11;
        if (thM18979a == null) {
            c0636s5.m1298O(objM9806b);
        } else {
            c0636s5.m1281g0(thM18979a);
        }
        return C17296C.f55119a;
    }

    @Override // p351O2.InterfaceC6094h
    /* JADX INFO: renamed from: a */
    public final InterfaceC2184i mo6650a() {
        return this.f19814d;
    }

    @Override // p351O2.InterfaceC6094h
    /* JADX INFO: renamed from: b */
    public final Object mo6651b(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) throws Throwable {
        C0636s c0636sM1173b = AbstractC0575H.m1173b();
        this.f19819i.m12576u0(new C6100n(interfaceC1439n, c0636sM1173b, (AbstractC6085H) this.f19817g.getValue(), interfaceC18770c.getContext()));
        Object objM1309u = c0636sM1173b.m1309u(interfaceC18770c);
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1309u;
    }

    /* JADX INFO: renamed from: d */
    public final File m6652d() {
        return (File) this.f19816f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cc->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m6653e(AbstractC19687c abstractC19687c) throws C6087a, FileNotFoundException {
        C6109w c6109w;
        InterfaceC4814a interfaceC4814aM5451a;
        C16525B c16525b;
        C6084G c6084g;
        C16525B c16525b2;
        C6084G c6084g2;
        C16525B c16525b3;
        C6111y c6111y;
        Iterator it;
        InterfaceC4814a interfaceC4814a;
        C16556x c16556x;
        C16556x c16556x2;
        C6084G c6084g3;
        C4816c c4816c;
        InterfaceC4814a interfaceC4814a2;
        C16525B c16525b4;
        InterfaceC1439n interfaceC1439n;
        Object obj;
        int iHashCode;
        if (abstractC19687c instanceof C6109w) {
            c6109w = (C6109w) abstractC19687c;
            int i10 = c6109w.f19874u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6109w.f19874u0 = i10 - Integer.MIN_VALUE;
            } else {
                c6109w = new C6109w(this, abstractC19687c);
            }
        } else {
            c6109w = new C6109w(this, abstractC19687c);
        }
        Object objM6657i = c6109w.f19872s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6109w.f19874u0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16525b = (C16525B) c6109w.f19869p0;
                c16525b2 = (C16525B) c6109w.f19868o0;
                interfaceC4814aM5451a = (InterfaceC4814a) c6109w.f19867Z;
                c6084g = c6109w.f19866Y;
                AbstractC9233X.m9807c(objM6657i);
            } else if (i11 == 2) {
                it = c6109w.f19871r0;
                c6111y = c6109w.f19870q0;
                c16556x = (C16556x) c6109w.f19869p0;
                c16525b3 = (C16525B) c6109w.f19868o0;
                interfaceC4814a = (InterfaceC4814a) c6109w.f19867Z;
                c6084g2 = c6109w.f19866Y;
                AbstractC9233X.m9807c(objM6657i);
                while (it.hasNext()) {
                    interfaceC1439n = (InterfaceC1439n) it.next();
                    c6109w.f19866Y = c6084g2;
                    c6109w.f19867Z = interfaceC4814a;
                    c6109w.f19868o0 = c16525b3;
                    c6109w.f19869p0 = c16556x;
                    c6109w.f19870q0 = c6111y;
                    c6109w.f19871r0 = it;
                    c6109w.f19874u0 = 2;
                    if (interfaceC1439n.invoke(c6111y, c6109w) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                c16556x2 = c16556x;
                c16525b2 = c16525b3;
                interfaceC4814aM5451a = interfaceC4814a;
                c6084g3 = c6084g2;
                c6084g3.f19818h = null;
                c6109w.f19866Y = c6084g3;
                c6109w.f19867Z = c16525b2;
                c6109w.f19868o0 = c16556x2;
                c6109w.f19869p0 = interfaceC4814aM5451a;
                c6109w.f19870q0 = null;
                c6109w.f19871r0 = null;
                c6109w.f19874u0 = 3;
                c4816c = (C4816c) interfaceC4814aM5451a;
                if (c4816c.m5448e(null, c6109w) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC4814a2 = c4816c;
                c16525b4 = c16525b2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4814a2 = (InterfaceC4814a) c6109w.f19869p0;
                c16556x2 = (C16556x) c6109w.f19868o0;
                c16525b4 = (C16525B) c6109w.f19867Z;
                c6084g3 = c6109w.f19866Y;
                AbstractC9233X.m9807c(objM6657i);
            }
            try {
                c16556x2.f51285Y = true;
                ((C4816c) interfaceC4814a2).m5450g(null);
                C2153Q0 c2153q0 = c6084g3.f19817g;
                obj = c16525b4.f51262Y;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                C6089c c6089c = new C6089c(obj, iHashCode);
                c2153q0.getClass();
                c2153q0.m3251l(null, c6089c);
                return C17296C.f55119a;
            } catch (Throwable th2) {
                ((C4816c) interfaceC4814a2).m5450g(null);
                throw th2;
            }
        }
        AbstractC9233X.m9807c(objM6657i);
        C2153Q0 c2153q1 = this.f19817g;
        if (!AbstractC16544l.m18089b(c2153q1.getValue(), C6086I.f19820a) && !(c2153q1.getValue() instanceof C6096j)) {
            throw new IllegalStateException("Check failed.");
        }
        interfaceC4814aM5451a = AbstractC4817d.m5451a();
        c16525b = new C16525B();
        c6109w.f19866Y = this;
        c6109w.f19867Z = interfaceC4814aM5451a;
        c6109w.f19868o0 = c16525b;
        c6109w.f19869p0 = c16525b;
        c6109w.f19874u0 = 1;
        objM6657i = m6657i(c6109w);
        if (objM6657i == enumC19250a) {
            return enumC19250a;
        }
        c6084g = this;
        c16525b2 = c16525b;
        c16525b.f51262Y = objM6657i;
        C16556x c16556x3 = new C16556x();
        C6111y c6111y2 = new C6111y(interfaceC4814aM5451a, c16556x3, c16525b2, c6084g);
        List list = c6084g.f19818h;
        if (list == null) {
            c16556x2 = c16556x3;
            c6084g3 = c6084g;
        } else {
            c6084g2 = c6084g;
            c16525b3 = c16525b2;
            c6111y = c6111y2;
            it = list.iterator();
            interfaceC4814a = interfaceC4814aM5451a;
            c16556x = c16556x3;
            while (it.hasNext()) {
                interfaceC1439n = (InterfaceC1439n) it.next();
                c6109w.f19866Y = c6084g2;
                c6109w.f19867Z = interfaceC4814a;
                c6109w.f19868o0 = c16525b3;
                c6109w.f19869p0 = c16556x;
                c6109w.f19870q0 = c6111y;
                c6109w.f19871r0 = it;
                c6109w.f19874u0 = 2;
                if (interfaceC1439n.invoke(c6111y, c6109w) == enumC19250a) {
                    return enumC19250a;
                }
            }
            c16556x2 = c16556x;
            c16525b2 = c16525b3;
            interfaceC4814aM5451a = interfaceC4814a;
            c6084g3 = c6084g2;
        }
        c6084g3.f19818h = null;
        c6109w.f19866Y = c6084g3;
        c6109w.f19867Z = c16525b2;
        c6109w.f19868o0 = c16556x2;
        c6109w.f19869p0 = interfaceC4814aM5451a;
        c6109w.f19870q0 = null;
        c6109w.f19871r0 = null;
        c6109w.f19874u0 = 3;
        c4816c = (C4816c) interfaceC4814aM5451a;
        if (c4816c.m5448e(null, c6109w) == enumC19250a) {
            return enumC19250a;
        }
        interfaceC4814a2 = c4816c;
        c16525b4 = c16525b2;
        c16556x2.f51285Y = true;
        ((C4816c) interfaceC4814a2).m5450g(null);
        C2153Q0 c2153q2 = c6084g3.f19817g;
        obj = c16525b4.f51262Y;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        C6089c c6089c2 = new C6089c(obj, iHashCode);
        c2153q2.getClass();
        c2153q2.m3251l(null, c6089c2);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m6654f(AbstractC19687c abstractC19687c) throws Throwable {
        C6112z c6112z;
        C6084G c6084g;
        if (abstractC19687c instanceof C6112z) {
            c6112z = (C6112z) abstractC19687c;
            int i10 = c6112z.f19890p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6112z.f19890p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6112z = new C6112z(this, abstractC19687c);
            }
        } else {
            c6112z = new C6112z(this, abstractC19687c);
        }
        Object obj = c6112z.f19888Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6112z.f19890p0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6084g = c6112z.f19887Y;
            try {
                AbstractC9233X.m9807c(obj);
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                C2153Q0 c2153q0 = c6084g.f19817g;
                C6096j c6096j = new C6096j(th);
                c2153q0.getClass();
                c2153q0.m3251l(null, c6096j);
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            c6112z.f19887Y = this;
            c6112z.f19890p0 = 1;
            if (m6653e(c6112z) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
            c6084g = this;
            C2153Q0 c2153q1 = c6084g.f19817g;
            C6096j c6096j2 = new C6096j(th);
            c2153q1.getClass();
            c2153q1.m3251l(null, c6096j2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m6655g(AbstractC19687c abstractC19687c) {
        C6078A c6078a;
        C6084G c6084g;
        if (abstractC19687c instanceof C6078A) {
            c6078a = (C6078A) abstractC19687c;
            int i10 = c6078a.f19782p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6078a.f19782p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6078a = new C6078A(this, abstractC19687c);
            }
        } else {
            c6078a = new C6078A(this, abstractC19687c);
        }
        Object obj = c6078a.f19780Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6078a.f19782p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                c6078a.f19779Y = this;
                c6078a.f19782p0 = 1;
                if (m6653e(c6078a) == enumC19250a) {
                    return enumC19250a;
                }
            } catch (Throwable th2) {
                th = th2;
                c6084g = this;
                C2153Q0 c2153q0 = c6084g.f19817g;
                C6096j c6096j = new C6096j(th);
                c2153q0.getClass();
                c2153q0.m3251l(null, c6096j);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6084g = c6078a.f19779Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (Throwable th3) {
                th = th3;
                C2153Q0 c2153q1 = c6084g.f19817g;
                C6096j c6096j2 = new C6096j(th);
                c2153q1.getClass();
                c2153q1.m3251l(null, c6096j2);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [O2.G] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [O2.B] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [O2.G] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: h */
    public final Object m6656h(AbstractC19687c abstractC19687c) throws FileNotFoundException {
        ?? c6079b;
        C15378c c15378c;
        Throwable th2;
        if (abstractC19687c instanceof C6079B) {
            C6079B c6079b2 = (C6079B) abstractC19687c;
            int i10 = c6079b2.f19787q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6079b2.f19787q0 = i10 - Integer.MIN_VALUE;
                c6079b = c6079b2;
            } else {
                c6079b = new C6079B(this, abstractC19687c);
            }
        } else {
            c6079b = new C6079B(this, abstractC19687c);
        }
        Object obj = c6079b.f19785o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6079b.f19787q0;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c15378c = c6079b.f19784Z;
                c6079b = c6079b.f19783Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    AbstractC7942M5.m8232a(c15378c, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        AbstractC7942M5.m8232a(c15378c, th2);
                        throw th4;
                    }
                }
            }
            AbstractC9233X.m9807c(obj);
            try {
                File fileM6652d = m6652d();
                C15378c c15378cM9492c = AbstractC8746y3.m9492c(fileM6652d, new FileInputStream(fileM6652d));
                try {
                    InterfaceC6097k interfaceC6097k = this.f19812b;
                    c6079b.f19783Y = this;
                    c6079b.f19784Z = c15378cM9492c;
                    c6079b.f19787q0 = 1;
                    Object objMo6663c = interfaceC6097k.mo6663c(c15378cM9492c);
                    if (objMo6663c == enumC19250a) {
                        return enumC19250a;
                    }
                    c15378c = c15378cM9492c;
                    obj = objMo6663c;
                    AbstractC7942M5.m8232a(c15378c, null);
                    return obj;
                } catch (Throwable th5) {
                    c15378c = c15378cM9492c;
                    th2 = th5;
                    c6079b = this;
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                c6079b = this;
                if (c6079b.m6652d().exists()) {
                    throw e;
                }
                return c6079b.f19812b.mo6661a();
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            if (c6079b.m6652d().exists()) {
                return c6079b.f19812b.mo6661a();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m6657i(AbstractC19687c abstractC19687c) throws C6087a, FileNotFoundException {
        C6080C c6080c;
        C6084G c6084g;
        Object objMo6660e;
        C6087a c6087a;
        C6084G c6084g2;
        C6087a c6087a2;
        if (abstractC19687c instanceof C6080C) {
            c6080c = (C6080C) abstractC19687c;
            int i10 = c6080c.f19792q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6080c.f19792q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6080c = new C6080C(this, abstractC19687c);
            }
        } else {
            c6080c = new C6080C(this, abstractC19687c);
        }
        Object objM6656h = c6080c.f19790o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6080c.f19792q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6656h);
            try {
                c6080c.f19788Y = this;
                c6080c.f19792q0 = 1;
                objM6656h = m6656h(c6080c);
                return objM6656h == enumC19250a ? enumC19250a : objM6656h;
            } catch (C6087a e10) {
                e = e10;
                c6084g = this;
                InterfaceC6088b interfaceC6088b = c6084g.f19813c;
                c6080c.f19788Y = c6084g;
                c6080c.f19789Z = e;
                c6080c.f19792q0 = 2;
                objMo6660e = interfaceC6088b.mo6660e(e);
                if (objMo6660e == enumC19250a) {
                    return enumC19250a;
                }
                C6084G c6084g3 = c6084g;
                c6087a = e;
                objM6656h = objMo6660e;
                c6084g2 = c6084g3;
                c6080c.f19788Y = c6087a;
                c6080c.f19789Z = objM6656h;
                c6080c.f19792q0 = 3;
                if (c6084g2.m6659k(objM6656h, c6080c) == enumC19250a) {
                    return enumC19250a;
                }
                return objM6656h;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c6087a = (C6087a) c6080c.f19789Z;
                c6084g2 = (C6084G) c6080c.f19788Y;
                AbstractC9233X.m9807c(objM6656h);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = c6080c.f19789Z;
                c6087a2 = (C6087a) c6080c.f19788Y;
                try {
                    AbstractC9233X.m9807c(objM6656h);
                    return obj;
                } catch (IOException e11) {
                    e = e11;
                }
            }
            AbstractC9221V.m9789a(c6087a2, e);
            throw c6087a2;
        }
        c6084g = (C6084G) c6080c.f19788Y;
        try {
            AbstractC9233X.m9807c(objM6656h);
        } catch (C6087a e12) {
            e = e12;
            InterfaceC6088b interfaceC6088b2 = c6084g.f19813c;
            c6080c.f19788Y = c6084g;
            c6080c.f19789Z = e;
            c6080c.f19792q0 = 2;
            objMo6660e = interfaceC6088b2.mo6660e(e);
            if (objMo6660e == enumC19250a) {
                return enumC19250a;
            }
            C6084G c6084g4 = c6084g;
            c6087a = e;
            objM6656h = objMo6660e;
            c6084g2 = c6084g4;
            c6080c.f19788Y = c6087a;
            c6080c.f19789Z = objM6656h;
            c6080c.f19792q0 = 3;
            if (c6084g2.m6659k(objM6656h, c6080c) == enumC19250a) {
                return enumC19250a;
            }
            return objM6656h;
        }
        try {
            c6080c.f19788Y = c6087a;
            c6080c.f19789Z = objM6656h;
            c6080c.f19792q0 = 3;
            if (c6084g2.m6659k(objM6656h, c6080c) == enumC19250a) {
                return enumC19250a;
            }
            return objM6656h;
        } catch (IOException e13) {
            e = e13;
            c6087a2 = c6087a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m6658j(InterfaceC1439n interfaceC1439n, InterfaceC18776i interfaceC18776i, AbstractC19687c abstractC19687c) throws Throwable {
        C6081D c6081d;
        C6084G c6084g;
        C6089c c6089c;
        Object obj;
        C6084G c6084g2;
        if (abstractC19687c instanceof C6081D) {
            c6081d = (C6081D) abstractC19687c;
            int i10 = c6081d.f19798r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6081d.f19798r0 = i10 - Integer.MIN_VALUE;
            } else {
                c6081d = new C6081D(this, abstractC19687c);
            }
        } else {
            c6081d = new C6081D(this, abstractC19687c);
        }
        Object obj2 = c6081d.f19796p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6081d.f19798r0;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = c6081d.f19795o0;
                c6089c = (C6089c) c6081d.f19794Z;
                c6084g = c6081d.f19793Y;
                AbstractC9233X.m9807c(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c6081d.f19794Z;
                c6084g2 = c6081d.f19793Y;
                AbstractC9233X.m9807c(obj2);
            }
            C2153Q0 c2153q0 = c6084g2.f19817g;
            C6089c c6089c2 = new C6089c(obj, obj != null ? obj.hashCode() : 0);
            c2153q0.getClass();
            c2153q0.m3251l(null, c6089c2);
            return obj;
        }
        AbstractC9233X.m9807c(obj2);
        C6089c c6089c3 = (C6089c) this.f19817g.getValue();
        Object obj3 = c6089c3.f19821a;
        if ((obj3 != null ? obj3.hashCode() : 0) != c6089c3.f19822b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj4 = c6089c3.f19821a;
        C6082E c6082e = new C6082E(interfaceC1439n, obj4, null);
        c6081d.f19793Y = this;
        c6081d.f19794Z = c6089c3;
        c6081d.f19795o0 = obj4;
        c6081d.f19798r0 = 1;
        Object objM1168P = AbstractC0575H.m1168P(interfaceC18776i, c6082e, c6081d);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        c6084g = this;
        c6089c = c6089c3;
        obj2 = objM1168P;
        obj = obj4;
        Object obj5 = c6089c.f19821a;
        if ((obj5 != null ? obj5.hashCode() : 0) != c6089c.f19822b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!AbstractC16544l.m18089b(obj, obj2)) {
            c6081d.f19793Y = c6084g;
            c6081d.f19794Z = obj2;
            c6081d.f19795o0 = null;
            c6081d.f19798r0 = 2;
            if (c6084g.m6659k(obj2, c6081d) == enumC19250a) {
                return enumC19250a;
            }
            obj = obj2;
            c6084g2 = c6084g;
            C2153Q0 c2153q1 = c6084g2.f19817g;
            C6089c c6089c4 = new C6089c(obj, obj != null ? obj.hashCode() : 0);
            c2153q1.getClass();
            c2153q1.m3251l(null, c6089c4);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: k */
    public final Object m6659k(Object obj, AbstractC19687c abstractC19687c) throws IOException {
        C6083F c6083f;
        File file;
        C15379d c15379d;
        C6084G c6084g;
        C15379d c15379d2;
        if (abstractC19687c instanceof C6083F) {
            c6083f = (C6083F) abstractC19687c;
            int i10 = c6083f.f19808s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6083f.f19808s0 = i10 - Integer.MIN_VALUE;
            } else {
                c6083f = new C6083F(this, abstractC19687c);
            }
        } else {
            c6083f = new C6083F(this, abstractC19687c);
        }
        Object obj2 = c6083f.f19806q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6083f.f19808s0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            File fileM6652d = m6652d();
            File parentFile = fileM6652d.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    throw new IOException(AbstractC16544l.m18100m(fileM6652d, "Unable to create parent directories of "));
                }
            }
            file = new File(AbstractC16544l.m18100m(this.f19815e, m6652d().getAbsolutePath()));
            try {
                C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
                try {
                    InterfaceC6097k interfaceC6097k = this.f19812b;
                    C6102p c6102p = new C6102p(c15379dM9509d);
                    c6083f.f19802Y = this;
                    c6083f.f19803Z = file;
                    c6083f.f19804o0 = c15379dM9509d;
                    c6083f.f19805p0 = c15379dM9509d;
                    c6083f.f19808s0 = 1;
                    interfaceC6097k.mo6662b(obj, c6102p);
                    if (c17296c == enumC19250a) {
                        return enumC19250a;
                    }
                    c6084g = this;
                    c15379d2 = c15379dM9509d;
                    c15379d = c15379d2;
                } catch (Throwable th2) {
                    th = th2;
                    c15379d = c15379dM9509d;
                    throw th;
                }
            } catch (IOException e10) {
                if (file.exists()) {
                    file.delete();
                }
                throw e10;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15379d2 = c6083f.f19805p0;
            c15379d = c6083f.f19804o0;
            file = c6083f.f19803Z;
            c6084g = c6083f.f19802Y;
            try {
                AbstractC9233X.m9807c(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AbstractC7942M5.m8232a(c15379d, th);
                    throw th4;
                }
            }
        }
        c15379d2.getFD().sync();
        AbstractC7942M5.m8232a(c15379d, null);
        if (file.renameTo(c6084g.m6652d())) {
            return c17296c;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
