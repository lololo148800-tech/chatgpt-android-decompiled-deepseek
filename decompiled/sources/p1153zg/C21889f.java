package p1153zg;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p018Ag.C0502g;
import p018Ag.C0503h;
import p018Ag.C0507l;
import p018Ag.C0510o;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1111xl.C21296a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.C6222A;
import p364Oh.C6223B;
import p384Ph.C6421k;
import p384Ph.C6425o;
import p384Ph.EnumC6424n;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p972qm.InterfaceC18770c;
import p992ri.InterfaceC19018a;
import p996rm.EnumC19250a;
import si.C19653e;
import si.C19654f;
import si.C19655g;
import si.C19657i;
import si.C19658j;
import si.InterfaceC19652d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: zg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C21889f implements InterfaceC19018a, InterfaceC19652d {

    /* JADX INFO: renamed from: q0 */
    public static final long f69403q0;

    /* JADX INFO: renamed from: Y */
    public final C0503h f69404Y;

    /* JADX INFO: renamed from: Z */
    public final C3430e f69405Z = AbstractC8168p6.m8749b("ServerStatusService", null);

    /* JADX INFO: renamed from: o0 */
    public final C2153Q0 f69406o0;

    /* JADX INFO: renamed from: p0 */
    public final C2153Q0 f69407p0;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f69403q0 = AbstractC8128k6.m8644j(60, EnumC21557d.SECONDS);
    }

    public C21889f(C0503h c0503h) {
        this.f69404Y = c0503h;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C19654f(null, null, null));
        this.f69406o0 = c2153q0M3204c;
        this.f69407p0 = c2153q0M3204c;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: a */
    public final Object mo4158a(InterfaceC18770c interfaceC18770c) {
        return C17296C.f55119a;
    }

    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: b */
    public final C3516e mo4159b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p992ri.InterfaceC19018a
    /* JADX INFO: renamed from: c */
    public final java.lang.Object mo4160c(p972qm.InterfaceC18770c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p1153zg.C21887d
            if (r0 == 0) goto L13
            r0 = r8
            zg.d r0 = (p1153zg.C21887d) r0
            int r1 = r0.f69398p0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69398p0 = r1
            goto L1a
        L13:
            zg.d r0 = new zg.d
            sm.c r8 = (sm.AbstractC19687c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.f69396Z
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f69398p0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            zg.f r2 = r0.f69395Y
            p571X9.AbstractC9233X.m9807c(r8)
        L2d:
            r8 = r2
            goto L41
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            zg.f r2 = r0.f69395Y
            p571X9.AbstractC9233X.m9807c(r8)
            goto L4d
        L3d:
            p571X9.AbstractC9233X.m9807c(r8)
            r8 = r7
        L41:
            r0.f69395Y = r8
            r0.f69398p0 = r4
            java.lang.Object r2 = r8.m22321d(r0)
            if (r2 != r1) goto L4c
            return r1
        L4c:
            r2 = r8
        L4d:
            r0.f69395Y = r2
            r0.f69398p0 = r3
            long r5 = p1153zg.C21889f.f69403q0
            java.lang.Object r8 = p025An.AbstractC0575H.m1185n(r5, r0)
            if (r8 != r1) goto L2d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1153zg.C21889f.mo4160c(qm.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m22321d(AbstractC19687c abstractC19687c) {
        C21888e c21888e;
        InterfaceC3777y interfaceC3777yM18075c;
        C21889f c21889f;
        Object c19655g;
        if (abstractC19687c instanceof C21888e) {
            c21888e = (C21888e) abstractC19687c;
            int i10 = c21888e.f69402p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21888e.f69402p0 = i10 - Integer.MIN_VALUE;
            } else {
                c21888e = new C21888e(this, abstractC19687c);
            }
        } else {
            c21888e = new C21888e(this, abstractC19687c);
        }
        Object objM9690b = c21888e.f69400Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21888e.f69402p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            AbstractC8160o6.m8726a(this.f69405Z, "Checking server status", null, 6);
            C0507l c0507l = new C0507l();
            c21888e.f69399Y = this;
            c21888e.f69402p0 = 1;
            C0503h c0503h = this.f69404Y;
            C0502g c0502g = new C0502g(c0503h, c0507l, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C0510o.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C0510o.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c0503h.f1636a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c0502g, c21888e);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c21889f = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21889f = c21888e.f69399Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            C0510o c0510o = (C0510o) ((C6223B) abstractC6224C).f20258a;
            int iOrdinal = c0510o.f1645a.ordinal();
            String str = c0510o.f1648d;
            String str2 = c0510o.f1647c;
            String str3 = c0510o.f1646b;
            if (iOrdinal == 0) {
                c19655g = new C19655g(str3, str2, str);
            } else if (iOrdinal == 1) {
                c19655g = new C19653e(str3, str2, str);
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                c19655g = new C19654f(str3, str2, str);
            }
        } else {
            boolean z6 = abstractC6224C instanceof C6222A;
            C19657i c19657i = C19657i.f62311a;
            if (z6) {
                Throwable th2 = ((C6222A) abstractC6224C).f20328a;
                if (th2 instanceof C6425o) {
                    C6421k c6421k = ((C6425o) th2).f20878p0;
                    if (c6421k.f20872b == EnumC6424n.f20875Z) {
                        AbstractC8160o6.m8731f(c21889f.f69405Z, MMVKXkcLpuHFDi.lrSdvKjDl + c6421k, th2, null, 4);
                        c19655g = C19658j.f62312a;
                    } else {
                        c19655g = c19657i;
                    }
                } else {
                    c19655g = c19657i;
                }
            } else {
                c19655g = c19657i;
            }
        }
        C2153Q0 c2153q0 = c21889f.f69406o0;
        c2153q0.getClass();
        c2153q0.m3251l(null, c19655g);
        return C17296C.f55119a;
    }
}
