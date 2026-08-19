package p103Dn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.ktor.client.plugins.auth.C15058c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p003A1.C0205S1;
import p008A6.C0384d;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0625m0;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p059C5.C1592j;
import p077Cn.C1746n;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1747o;
import p129En.AbstractC2592c;
import p129En.AbstractC2596g;
import p129En.C2581A;
import p129En.C2590a;
import p129En.C2599j;
import p129En.C2604o;
import p129En.InterfaceC2614y;
import p153Fn.C2942t;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p985r9.C18903m;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Dn.C */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2124C {

    /* JADX INFO: renamed from: a */
    public static final C15058c f6494a = new C15058c(18);

    /* JADX INFO: renamed from: b */
    public static final C0384d f6495b = new C0384d(4);

    /* JADX INFO: renamed from: c */
    public static final C2942t f6496c = new C2942t("NO_VALUE", 0);

    /* JADX INFO: renamed from: d */
    public static final C2942t f6497d = new C2942t("NONE", 0);

    /* JADX INFO: renamed from: e */
    public static final C2942t f6498e = new C2942t("PENDING", 0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public static final Object m3197A(InterfaceC2184i interfaceC2184i, AbstractC19687c abstractC19687c) {
        C2191l0 c2191l0;
        C16525B c16525b;
        if (abstractC19687c instanceof C2191l0) {
            c2191l0 = (C2191l0) abstractC19687c;
            int i10 = c2191l0.f6715o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2191l0.f6715o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2191l0 = new C2191l0(abstractC19687c);
            }
        } else {
            c2191l0 = new C2191l0(abstractC19687c);
        }
        Object obj = c2191l0.f6714Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2191l0.f6715o0;
        Object obj3 = AbstractC2592c.f8037b;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            c16525b2.f51262Y = obj3;
            InterfaceC2186j c2175d0 = new C2175d0(c16525b2, 2);
            c2191l0.f6713Y = c16525b2;
            c2191l0.f6715o0 = 1;
            if (interfaceC2184i.mo3141d(c2175d0, c2191l0) != obj2) {
                c16525b = c16525b2;
            }
            return obj2;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16525b = c2191l0.f6713Y;
        AbstractC9233X.m9807c(obj);
        obj2 = c16525b.f51262Y;
        if (obj2 == obj3) {
            throw new NoSuchElementException("Flow is empty");
        }
        return obj2;
    }

    /* JADX INFO: renamed from: B */
    public static final C2217y0 m3198B(InterfaceC2184i interfaceC2184i, InterfaceC0571F interfaceC0571F, InterfaceC2135H0 interfaceC2135H0, Object obj) {
        C18903m c18903mM3213l = m3213l(interfaceC2184i, 1);
        C2153Q0 c2153q0M3204c = m3204c(obj);
        AbstractC0575H.m1155C(interfaceC0571F, (InterfaceC18776i) c18903mM3213l.f60270d, interfaceC2135H0.equals(C2133G0.f6536a) ? EnumC0573G.f1790Y : EnumC0573G.f1793p0, new C2197o0(interfaceC2135H0, (InterfaceC2184i) c18903mM3213l.f60268b, c2153q0M3204c, obj, null));
        return new C2217y0(c2153q0M3204c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public static final Object m3199C(InterfaceC2184i interfaceC2184i, Collection collection, AbstractC19687c abstractC19687c) {
        C2196o c2196o;
        if (abstractC19687c instanceof C2196o) {
            c2196o = (C2196o) abstractC19687c;
            int i10 = c2196o.f6732o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2196o.f6732o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2196o = new C2196o(abstractC19687c);
            }
        } else {
            c2196o = new C2196o(abstractC19687c);
        }
        Object obj = c2196o.f6731Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2196o.f6732o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j c0205s1 = new C0205S1(collection, 1);
            c2196o.f6730Y = collection;
            c2196o.f6732o0 = 1;
            if (interfaceC2184i.mo3141d(c0205s1, c2196o) == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c2196o.f6730Y;
            AbstractC9233X.m9807c(obj);
        }
        return collection;
    }

    /* JADX INFO: renamed from: D */
    public static Object m3200D(InterfaceC2184i interfaceC2184i, AbstractC19687c abstractC19687c) {
        return m3199C(interfaceC2184i, new ArrayList(), abstractC19687c);
    }

    /* JADX INFO: renamed from: E */
    public static final C2604o m3201E(InterfaceC2184i interfaceC2184i, InterfaceC1440o interfaceC1440o) {
        int i10 = AbstractC2173c0.f6659a;
        return new C2604o(interfaceC1440o, interfaceC2184i, C18777j.f59682Y, -2, EnumC1733a.f4961Y);
    }

    /* JADX INFO: renamed from: a */
    public static final C2127D0 m3202a(int i10, int i11, EnumC1733a enumC1733a) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && enumC1733a != EnumC1733a.f4961Y) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC1733a).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new C2127D0(i10, i12, enumC1733a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2127D0 m3203b(int i10, int i11, EnumC1733a enumC1733a, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC1733a = EnumC1733a.f4961Y;
        }
        return m3202a(i10, i11, enumC1733a);
    }

    /* JADX INFO: renamed from: c */
    public static final C2153Q0 m3204c(Object obj) {
        if (obj == null) {
            obj = AbstractC2592c.f8037b;
        }
        return new C2153Q0(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final void m3205d(InterfaceC2186j interfaceC2186j, Object obj, Object obj2, AbstractC19687c abstractC19687c) {
        C2152Q c2152q;
        if (abstractC19687c instanceof C2152Q) {
            c2152q = (C2152Q) abstractC19687c;
            int i10 = c2152q.f6597o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2152q.f6597o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2152q = new C2152Q(abstractC19687c);
            }
        } else {
            c2152q = new C2152Q(abstractC19687c);
        }
        Object obj3 = c2152q.f6596Z;
        Object obj4 = EnumC19250a.f61036Y;
        int i11 = c2152q.f6597o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj3);
            c2152q.f6595Y = obj2;
            c2152q.f6597o0 = 1;
            if (interfaceC2186j.mo395a(obj, c2152q) == obj4) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c2152q.f6595Y;
            AbstractC9233X.m9807c(obj3);
        }
        throw new C2590a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m3206e(C2164W0 c2164w0, InterfaceC1440o interfaceC1440o, Throwable th2, AbstractC19687c abstractC19687c) {
        C2126D c2126d;
        if (abstractC19687c instanceof C2126D) {
            c2126d = (C2126D) abstractC19687c;
            int i10 = c2126d.f6508o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2126d.f6508o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2126d = new C2126D(abstractC19687c);
            }
        } else {
            c2126d = new C2126D(abstractC19687c);
        }
        Object obj = c2126d.f6507Z;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2126d.f6508o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                c2126d.f6506Y = th2;
                c2126d.f6508o0 = 1;
                if (interfaceC1440o.invoke(c2164w0, th2, c2126d) == obj2) {
                    return obj2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = c2126d.f6506Y;
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                AbstractC9221V.m9789a(th3, th2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3207f(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC2184i m3208g(InterfaceC2184i interfaceC2184i, int i10) {
        EnumC1733a enumC1733a = EnumC1733a.f4961Y;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            enumC1733a = EnumC1733a.f4962Z;
            i10 = 0;
        }
        int i11 = i10;
        EnumC1733a enumC1733a2 = enumC1733a;
        return interfaceC2184i instanceof InterfaceC2614y ? AbstractC2592c.m3614b((InterfaceC2614y) interfaceC2184i, null, i11, enumC1733a2, 1) : new C2599j(interfaceC2184i, null, i11, enumC1733a2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Serializable m3209h(InterfaceC2184i interfaceC2184i, InterfaceC2186j interfaceC2186j, AbstractC19687c abstractC19687c) throws Throwable {
        C2138J c2138j;
        Throwable th2;
        C16525B c16525b;
        Throwable th3;
        InterfaceC0627n0 interfaceC0627n0;
        CancellationException cancellationExceptionMo1273T;
        if (abstractC19687c instanceof C2138J) {
            c2138j = (C2138J) abstractC19687c;
            int i10 = c2138j.f6549o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2138j.f6549o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2138j = new C2138J(abstractC19687c);
            }
        } else {
            c2138j = new C2138J(abstractC19687c);
        }
        Object obj = c2138j.f6548Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2138j.f6549o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            try {
                InterfaceC2186j c2142l = new C2142L(interfaceC2186j, c16525b2, 0);
                c2138j.f6547Y = c16525b2;
                c2138j.f6549o0 = 1;
                if (interfaceC2184i.mo3141d(c2142l, c2138j) == enumC19250a) {
                    return enumC19250a;
                }
                return null;
            } catch (Throwable th4) {
                th2 = th4;
                c16525b = c16525b2;
                th3 = (Throwable) c16525b.f51262Y;
                if (th3 == null) {
                }
                interfaceC0627n0 = (InterfaceC0627n0) c2138j.getContext().get(C0625m0.f1875Y);
                if (interfaceC0627n0 == null) {
                }
                if (th3 == null) {
                    return th2;
                }
                if (th2 instanceof CancellationException) {
                    AbstractC9221V.m9789a(th3, th2);
                    throw th3;
                }
                AbstractC9221V.m9789a(th2, th3);
                throw th2;
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c16525b = c2138j.f6547Y;
        try {
            AbstractC9233X.m9807c(obj);
            return null;
        } catch (Throwable th5) {
            th2 = th5;
            th3 = (Throwable) c16525b.f51262Y;
            if (th3 == null && th3.equals(th2)) {
                throw th2;
            }
            interfaceC0627n0 = (InterfaceC0627n0) c2138j.getContext().get(C0625m0.f1875Y);
            if (interfaceC0627n0 == null && interfaceC0627n0.isCancelled() && (cancellationExceptionMo1273T = interfaceC0627n0.mo1273T()) != null && cancellationExceptionMo1273T.equals(th2)) {
                throw th2;
            }
            if (th3 == null) {
                return th2;
            }
            if (th2 instanceof CancellationException) {
                AbstractC9221V.m9789a(th3, th2);
                throw th3;
            }
            AbstractC9221V.m9789a(th2, th3);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C2176e m3210i(InterfaceC1439n interfaceC1439n) {
        return new C2176e(interfaceC1439n, C18777j.f59682Y, -2, EnumC1733a.f4961Y);
    }

    /* JADX INFO: renamed from: j */
    public static final Object m3211j(InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = interfaceC2184i.mo3141d(C2581A.f8015Y, interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: k */
    public static final Object m3212k(InterfaceC2184i interfaceC2184i, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        Object objM3211j = m3211j(m3208g(m3227z(interfaceC1439n, interfaceC2184i), 0), interfaceC18770c);
        return objM3211j == EnumC19250a.f61036Y ? objM3211j : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX INFO: renamed from: l */
    public static final C18903m m3213l(InterfaceC2184i interfaceC2184i, int i10) {
        AbstractC2596g abstractC2596g;
        InterfaceC2184i interfaceC2184iMo3256j;
        InterfaceC1747o.f5018a.getClass();
        int i11 = C1746n.f5017b;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = i11 - i10;
        if (!(interfaceC2184i instanceof AbstractC2596g) || (interfaceC2184iMo3256j = (abstractC2596g = (AbstractC2596g) interfaceC2184i).mo3256j()) == null) {
            return new C18903m(i12, EnumC1733a.f4961Y, interfaceC2184i, C18777j.f59682Y);
        }
        EnumC1733a enumC1733a = abstractC2596g.f8049o0;
        int i13 = abstractC2596g.f8048Z;
        if (i13 != -3 && i13 != -2 && i13 != 0) {
            i12 = i13;
        } else if (enumC1733a == EnumC1733a.f4961Y) {
            if (i13 == 0) {
                i12 = 0;
            }
        } else if (i10 == 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new C18903m(i12, enumC1733a, interfaceC2184iMo3256j, abstractC2596g.f8047Y);
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2184i m3214m(InterfaceC2184i interfaceC2184i, long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC2184i : new C2219z0(new C2210v(new C2198p(j10), interfaceC2184i, (InterfaceC18770c) null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC2184i m3215n(InterfaceC2184i interfaceC2184i) {
        return interfaceC2184i instanceof InterfaceC2149O0 ? interfaceC2184i : m3216o(interfaceC2184i, f6494a, f6495b);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    /* JADX INFO: renamed from: o */
    public static final C2180g m3216o(InterfaceC2184i interfaceC2184i, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n) {
        if (interfaceC2184i instanceof C2180g) {
            C2180g c2180g = (C2180g) interfaceC2184i;
            if (c2180g.f6677Z != interfaceC1436k || c2180g.f6678o0 != interfaceC1439n) {
                interfaceC2184i = new C2180g(interfaceC2184i, interfaceC1436k, interfaceC1439n);
            }
        } else {
            interfaceC2184i = new C2180g(interfaceC2184i, interfaceC1436k, interfaceC1439n);
        }
        return (C2180g) interfaceC2184i;
    }

    /* JADX INFO: renamed from: p */
    public static final Object m3217p(InterfaceC2186j interfaceC2186j, InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) throws Throwable {
        m3219r(interfaceC2186j);
        Object objMo3141d = interfaceC2184i.mo3141d(interfaceC2186j, interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0054, B:28:0x0069, B:30:0x0071, B:20:0x0046, B:23:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: q */
    public static final java.lang.Object m3218q(p103Dn.InterfaceC2186j r6, p077Cn.InterfaceC1730B r7, boolean r8, p972qm.InterfaceC18770c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p103Dn.C2192m
            if (r0 == 0) goto L13
            r0 = r9
            Dn.m r0 = (p103Dn.C2192m) r0
            int r1 = r0.f6721r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6721r0 = r1
            goto L18
        L13:
            Dn.m r0 = new Dn.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6720q0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f6721r0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f6719p0
            Cn.d r6 = r0.f6718o0
            Cn.B r7 = r0.f6717Z
            Dn.j r2 = r0.f6716Y
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f6719p0
            Cn.d r6 = r0.f6718o0
            Cn.B r7 = r0.f6717Z
            Dn.j r2 = r0.f6716Y
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L4a:
            p571X9.AbstractC9233X.m9807c(r9)
            m3219r(r6)
            Cn.d r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.f6716Y = r6     // Catch: java.lang.Throwable -> L34
            r0.f6717Z = r7     // Catch: java.lang.Throwable -> L34
            r0.f6718o0 = r9     // Catch: java.lang.Throwable -> L34
            r0.f6719p0 = r8     // Catch: java.lang.Throwable -> L34
            r0.f6721r0 = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.m2525b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.m2526c()     // Catch: java.lang.Throwable -> L34
            r0.f6716Y = r2     // Catch: java.lang.Throwable -> L34
            r0.f6717Z = r7     // Catch: java.lang.Throwable -> L34
            r0.f6718o0 = r6     // Catch: java.lang.Throwable -> L34
            r0.f6719p0 = r8     // Catch: java.lang.Throwable -> L34
            r0.f6721r0 = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.mo395a(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            r7.mo2516e(r6)
        L8c:
            mm.C r6 = mm.C17296C.f55119a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            p523V9.AbstractC8024X3.m8364b(r7, r6)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p103Dn.AbstractC2124C.m3218q(Dn.j, Cn.B, boolean, qm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: r */
    public static final void m3219r(InterfaceC2186j interfaceC2186j) throws Throwable {
        if (interfaceC2186j instanceof C2164W0) {
            throw ((C2164W0) interfaceC2186j).f6632Y;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public static final Object m3220s(InterfaceC2184i interfaceC2184i, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        C2183h0 c2183h0;
        C16525B c16525b;
        C2590a e10;
        C2179f0 c2179f0;
        if (interfaceC18770c instanceof C2183h0) {
            c2183h0 = (C2183h0) interfaceC18770c;
            int i10 = c2183h0.f6687p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2183h0.f6687p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2183h0 = new C2183h0(interfaceC18770c);
            }
        } else {
            c2183h0 = new C2183h0(interfaceC18770c);
        }
        Object obj = c2183h0.f6686o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2183h0.f6687p0;
        Object obj3 = AbstractC2592c.f8037b;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            c16525b2.f51262Y = obj3;
            C2179f0 c2179f1 = new C2179f0(interfaceC1439n, c16525b2, 0);
            try {
                c2183h0.f6684Y = c16525b2;
                c2183h0.f6685Z = c2179f1;
                c2183h0.f6687p0 = 1;
                if (interfaceC2184i.mo3141d(c2179f1, c2183h0) != obj2) {
                    c16525b = c16525b2;
                    obj2 = c16525b.f51262Y;
                    if (obj2 == obj3) {
                        throw new NoSuchElementException("Expected at least one element matching the predicate");
                    }
                }
            } catch (C2590a e11) {
                c16525b = c16525b2;
                e10 = e11;
                c2179f0 = c2179f1;
                if (e10.f8031Y == c2179f0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2183h0.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2179f0 = c2183h0.f6685Z;
            c16525b = c2183h0.f6684Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2590a e12) {
                e10 = e12;
                if (e10.f8031Y == c2179f0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2183h0.getContext());
            }
            obj2 = c16525b.f51262Y;
            if (obj2 == obj3) {
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public static final Object m3221t(InterfaceC2184i interfaceC2184i, InterfaceC18770c interfaceC18770c) {
        C2181g0 c2181g0;
        C16525B c16525b;
        C2590a e10;
        C2175d0 c2175d0;
        if (interfaceC18770c instanceof C2181g0) {
            c2181g0 = (C2181g0) interfaceC18770c;
            int i10 = c2181g0.f6682p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2181g0.f6682p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2181g0 = new C2181g0(interfaceC18770c);
            }
        } else {
            c2181g0 = new C2181g0(interfaceC18770c);
        }
        Object obj = c2181g0.f6681o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2181g0.f6682p0;
        Object obj3 = AbstractC2592c.f8037b;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            c16525b2.f51262Y = obj3;
            C2175d0 c2175d1 = new C2175d0(c16525b2, 0);
            try {
                c2181g0.f6679Y = c16525b2;
                c2181g0.f6680Z = c2175d1;
                c2181g0.f6682p0 = 1;
                if (interfaceC2184i.mo3141d(c2175d1, c2181g0) != obj2) {
                    c16525b = c16525b2;
                    obj2 = c16525b.f51262Y;
                    if (obj2 == obj3) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (C2590a e11) {
                c16525b = c16525b2;
                e10 = e11;
                c2175d0 = c2175d1;
                if (e10.f8031Y == c2175d0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2181g0.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2175d0 = c2181g0.f6680Z;
            c16525b = c2181g0.f6679Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2590a e12) {
                e10 = e12;
                if (e10.f8031Y == c2175d0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2181g0.getContext());
            }
            obj2 = c16525b.f51262Y;
            if (obj2 == obj3) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public static final Object m3222u(InterfaceC2184i interfaceC2184i, InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C2189k0 c2189k0;
        C16525B c16525b;
        C2590a e10;
        C2179f0 c2179f0;
        if (abstractC19687c instanceof C2189k0) {
            c2189k0 = (C2189k0) abstractC19687c;
            int i10 = c2189k0.f6705p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2189k0.f6705p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2189k0 = new C2189k0(abstractC19687c);
            }
        } else {
            c2189k0 = new C2189k0(abstractC19687c);
        }
        Object obj = c2189k0.f6704o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2189k0.f6705p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            C2179f0 c2179f1 = new C2179f0(interfaceC1439n, c16525b2, 1);
            try {
                c2189k0.f6702Y = c16525b2;
                c2189k0.f6703Z = c2179f1;
                c2189k0.f6705p0 = 1;
                if (interfaceC2184i.mo3141d(c2179f1, c2189k0) == obj2) {
                    return obj2;
                }
                c16525b = c16525b2;
            } catch (C2590a e11) {
                c16525b = c16525b2;
                e10 = e11;
                c2179f0 = c2179f1;
                if (e10.f8031Y == c2179f0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2189k0.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2179f0 = c2189k0.f6703Z;
            c16525b = c2189k0.f6702Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2590a e12) {
                e10 = e12;
                if (e10.f8031Y == c2179f0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2189k0.getContext());
            }
        }
        return c16525b.f51262Y;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public static final Object m3223v(InterfaceC2184i interfaceC2184i, AbstractC19687c abstractC19687c) {
        C2187j0 c2187j0;
        C16525B c16525b;
        C2590a e10;
        C2175d0 c2175d0;
        if (abstractC19687c instanceof C2187j0) {
            c2187j0 = (C2187j0) abstractC19687c;
            int i10 = c2187j0.f6696p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2187j0.f6696p0 = i10 - Integer.MIN_VALUE;
            } else {
                c2187j0 = new C2187j0(abstractC19687c);
            }
        } else {
            c2187j0 = new C2187j0(abstractC19687c);
        }
        Object obj = c2187j0.f6695o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c2187j0.f6696p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b2 = new C16525B();
            C2175d0 c2175d1 = new C2175d0(c16525b2, 1);
            try {
                c2187j0.f6693Y = c16525b2;
                c2187j0.f6694Z = c2175d1;
                c2187j0.f6696p0 = 1;
                if (interfaceC2184i.mo3141d(c2175d1, c2187j0) == obj2) {
                    return obj2;
                }
                c16525b = c16525b2;
            } catch (C2590a e11) {
                c16525b = c16525b2;
                e10 = e11;
                c2175d0 = c2175d1;
                if (e10.f8031Y == c2175d0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2187j0.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2175d0 = c2187j0.f6694Z;
            c16525b = c2187j0.f6693Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (C2590a e12) {
                e10 = e12;
                if (e10.f8031Y == c2175d0) {
                    throw e10;
                }
                AbstractC0575H.m1187p(c2187j0.getContext());
            }
        }
        return c16525b.f51262Y;
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC2184i m3224w(InterfaceC2184i interfaceC2184i, AbstractC0563B abstractC0563B) {
        if (abstractC0563B.get(C0625m0.f1875Y) == null) {
            if (abstractC0563B.equals(C18777j.f59682Y)) {
                return interfaceC2184i;
            }
            return interfaceC2184i instanceof InterfaceC2614y ? AbstractC2592c.m3614b((InterfaceC2614y) interfaceC2184i, abstractC0563B, 0, null, 6) : new C2599j(interfaceC2184i, abstractC0563B, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + abstractC0563B).toString());
    }

    /* JADX INFO: renamed from: x */
    public static final InterfaceC2184i m3225x(InterfaceC2121A0 interfaceC2121A0, InterfaceC18776i interfaceC18776i, int i10, EnumC1733a enumC1733a) {
        return ((i10 == 0 || i10 == -3) && enumC1733a == EnumC1733a.f4961Y) ? interfaceC2121A0 : new C2599j(i10, enumC1733a, interfaceC2121A0, interfaceC18776i);
    }

    /* JADX INFO: renamed from: y */
    public static final C0564B0 m3226y(InterfaceC2184i interfaceC2184i, InterfaceC0571F interfaceC0571F) {
        return AbstractC0575H.m1156D(interfaceC0571F, null, null, new C2194n(interfaceC2184i, null), 3);
    }

    /* JADX INFO: renamed from: z */
    public static final C2604o m3227z(InterfaceC1439n interfaceC1439n, InterfaceC2184i interfaceC2184i) {
        int i10 = AbstractC2173c0.f6659a;
        return m3201E(interfaceC2184i, new C1592j(interfaceC1439n, (InterfaceC18770c) null));
    }
}
