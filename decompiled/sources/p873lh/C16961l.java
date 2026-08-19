package p873lh;

import gd.C13840B;
import gd.C13969n2;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p072Ci.C1699d;
import p072Ci.C1708m;
import p103Dn.AbstractC2124C;
import p1081wc.C20862H;
import p1081wc.InterfaceC20904w;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p148Fi.C2786R0;
import p148Fi.C2850r0;
import p148Fi.C2854t0;
import p172Gi.C3067I;
import p201Hn.C3516e;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.AbstractC3794B0;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5533c;
import p324Mn.C5536f;
import p324Mn.C5551u;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p387Pl.EnumC6481b;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p708dh.C13132J;
import p708dh.C13133K;
import p817j$.time.DateTimeException;
import p817j$.time.ZoneId;
import p817j$.time.ZonedDateTime;
import p817j$.time.temporal.ChronoUnit;
import p854kf.C16389g;
import p858ko.C16482A;
import p909nm.AbstractC17660E;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C16961l implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final C2854t0 f54437Y;

    /* JADX INFO: renamed from: Z */
    public final C16950a f54438Z;

    /* JADX INFO: renamed from: o0 */
    public final C13132J f54439o0;

    /* JADX INFO: renamed from: p0 */
    public final C13133K f54440p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC20904w f54441q0;

    /* JADX INFO: renamed from: r0 */
    public final C13969n2 f54442r0;

    public C16961l(C2854t0 c2854t0, C16950a c16950a, C13132J c13132j, C13133K c13133k, InterfaceC20904w interfaceC20904w, C13969n2 c13969n2) {
        this.f54437Y = c2854t0;
        this.f54438Z = c16950a;
        this.f54439o0 = c13132j;
        this.f54440p0 = c13133k;
        this.f54441q0 = interfaceC20904w;
        this.f54442r0 = c13969n2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C16955f c16955f;
        C16961l c16961l;
        if (interfaceC18770c instanceof C16955f) {
            c16955f = (C16955f) interfaceC18770c;
            int i10 = c16955f.f54421p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16955f.f54421p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16955f = new C16955f(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c16955f = new C16955f(this, (AbstractC19687c) interfaceC18770c);
        }
        Object obj = c16955f.f54419Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16955f.f54421p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C13132J c13132j = this.f54439o0;
            C16956g c16956g = new C16956g(2, null);
            c16955f.f54418Y = this;
            c16955f.f54421p0 = 1;
            if (AbstractC2124C.m3220s(c13132j.f41695r0, c16956g, c16955f) == enumC19250a) {
                return enumC19250a;
            }
            c16961l = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16961l = c16955f.f54418Y;
            AbstractC9233X.m9807c(obj);
        }
        c16961l.f54440p0.m14817a(C16957h.f54423Y);
        return C17296C.f55119a;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m18592c(AbstractC19687c abstractC19687c) {
        C16952c c16952c;
        C16961l c16961l;
        C2786R0 c2786r0;
        if (abstractC19687c instanceof C16952c) {
            c16952c = (C16952c) abstractC19687c;
            int i10 = c16952c.f54408p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16952c.f54408p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16952c = new C16952c(this, abstractC19687c);
            }
        } else {
            c16952c = new C16952c(this, abstractC19687c);
        }
        Object objM3221t = c16952c.f54406Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16952c.f54408p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c16961l = c16952c.f54405Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                c16961l = c16952c.f54405Y;
                AbstractC9233X.m9807c(objM3221t);
                C16950a c16950a = c16961l.f54438Z;
                c16952c.f54405Y = null;
                c16952c.f54408p0 = 3;
                objM3221t = AbstractC2124C.m3221t(c16950a.f64176f, c16952c);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            c2786r0 = (C2786R0) objM3221t;
            if (c2786r0 != null) {
                return c2786r0.f8503b;
            }
            return null;
        }
        AbstractC9233X.m9807c(objM3221t);
        c16952c.f54405Y = this;
        c16952c.f54408p0 = 1;
        objM3221t = AbstractC2124C.m3221t(this.f54438Z.f64176f, c16952c);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c16961l = this;
        if (objM3221t == null) {
            c16952c.f54405Y = c16961l;
            c16952c.f54408p0 = 2;
            if (c16961l.m18594e(c16952c) == enumC19250a) {
                return enumC19250a;
            }
        }
        C16950a c16950a2 = c16961l.f54438Z;
        c16952c.f54405Y = null;
        c16952c.f54408p0 = 3;
        objM3221t = AbstractC2124C.m3221t(c16950a2.f64176f, c16952c);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c2786r0 = (C2786R0) objM3221t;
        if (c2786r0 != null) {
            return c2786r0.f8503b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m18593d(AbstractC19687c abstractC19687c) {
        C16953d c16953d;
        C16961l c16961l;
        if (abstractC19687c instanceof C16953d) {
            c16953d = (C16953d) abstractC19687c;
            int i10 = c16953d.f54412p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16953d.f54412p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16953d = new C16953d(this, abstractC19687c);
            }
        } else {
            c16953d = new C16953d(this, abstractC19687c);
        }
        Object objM3221t = c16953d.f54410Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16953d.f54412p0;
        Object objM18592c = null;
        if (i11 != 0) {
            if (i11 == 1) {
                c16961l = c16953d.f54409Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
                C1708m c1708m = (C1708m) objM3221t;
                if (c1708m != null) {
                    objM18592c = c1708m.f4890a;
                }
            }
            return (String) objM18592c;
        }
        AbstractC9233X.m9807c(objM3221t);
        C13132J c13132j = this.f54439o0;
        c16953d.f54409Y = this;
        c16953d.f54412p0 = 1;
        objM3221t = AbstractC2124C.m3221t(c13132j.f41695r0, c16953d);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c16961l = this;
        String str = ((C1699d) objM3221t).f4832f;
        if (str != null) {
            return str;
        }
        c16953d.f54409Y = null;
        c16953d.f54412p0 = 2;
        objM18592c = c16961l.m18592c(c16953d);
        if (objM18592c == enumC19250a) {
            return enumC19250a;
        }
        return (String) objM18592c;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m18594e(AbstractC19687c abstractC19687c) {
        C16954e c16954e;
        InterfaceC3777y interfaceC3777yM18075c;
        C16961l c16961l;
        AbstractC21955Q1 abstractC21955Q1M6734a;
        C3067I c3067i;
        C16950a c16950a;
        C16482A c16482a;
        AbstractC21955Q1 abstractC21955Q1;
        C2786R0 c2786r0;
        C2786R0 c2786r1;
        if (abstractC19687c instanceof C16954e) {
            c16954e = (C16954e) abstractC19687c;
            int i10 = c16954e.f54417q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16954e.f54417q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16954e = new C16954e(this, abstractC19687c);
            }
        } else {
            c16954e = new C16954e(this, abstractC19687c);
        }
        Object objM9690b = c16954e.f54415o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16954e.f54417q0;
        if (i11 != 0) {
            if (i11 == 1) {
                C16961l c16961l2 = (C16961l) c16954e.f54413Y;
                AbstractC9233X.m9807c(objM9690b);
                c16961l = c16961l2;
            } else if (i11 == 2) {
                c3067i = c16954e.f54414Z;
                c16961l = (C16961l) c16954e.f54413Y;
                AbstractC9233X.m9807c(objM9690b);
                c2786r0 = (C2786R0) objM9690b;
                if (c2786r0 != null) {
                    c2786r1 = C2786R0.m3709a(c2786r0, c3067i.f9245a, c3067i.f9246b, null, null, 28);
                } else {
                    List list = c3067i.f9245a;
                    EnumC6481b enumC6481b = EnumC6481b.f21035Z;
                    C5551u.Companion.getClass();
                    C5551u c5551u = C5551u.f18000Z;
                    c2786r1 = new C2786R0(list, c3067i.f9246b, enumC6481b, c5551u, c5551u);
                }
                abstractC21955Q1M6734a = new C21952P1(c2786r1);
                if (abstractC21955Q1M6734a instanceof C21952P1) {
                    return abstractC21955Q1M6734a;
                }
                C2786R0 c2786r2 = (C2786R0) ((C21952P1) abstractC21955Q1M6734a).f69511a;
                c16950a = c16961l.f54438Z;
                c16482a = new C16482A(c2786r2, 6);
                c16954e.f54413Y = abstractC21955Q1M6734a;
                c16954e.f54414Z = null;
                c16954e.f54417q0 = 3;
                if (c16950a.m21029b(c16482a, c16954e) == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = abstractC21955Q1M6734a;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c16954e.f54413Y;
                AbstractC9233X.m9807c(objM9690b);
            }
            return abstractC21955Q1;
        }
        AbstractC9233X.m9807c(objM9690b);
        c16954e.f54413Y = this;
        c16954e.f54417q0 = 1;
        C2854t0 c2854t0 = this.f54437Y;
        C2850r0 c2850r0 = new C2850r0(2, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C3067I.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C3067I.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        C6889b c6889b = c2854t0.f8612a;
        c6889b.getClass();
        objM9690b = AbstractC9144I.m9690b(c6889b, c21296a, c2850r0, c16954e);
        if (objM9690b == enumC19250a) {
            return enumC19250a;
        }
        c16961l = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            abstractC21955Q1M6734a = new C21952P1(((C6223B) abstractC6224C).f20258a);
        } else if (abstractC6224C instanceof C6248v) {
            abstractC21955Q1M6734a = C21929J1.f69476a;
        } else {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            c3067i = (C3067I) ((C21952P1) abstractC21955Q1M6734a).f69511a;
            C16950a c16950a2 = c16961l.f54438Z;
            c16954e.f54413Y = c16961l;
            c16954e.f54414Z = c3067i;
            c16954e.f54417q0 = 2;
            objM9690b = AbstractC2124C.m3221t(c16950a2.f64176f, c16954e);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
            c2786r0 = (C2786R0) objM9690b;
            if (c2786r0 != null) {
                c2786r1 = C2786R0.m3709a(c2786r0, c3067i.f9245a, c3067i.f9246b, null, null, 28);
            } else {
                List list2 = c3067i.f9245a;
                EnumC6481b enumC6481b2 = EnumC6481b.f21035Z;
                C5551u.Companion.getClass();
                C5551u c5551u2 = C5551u.f18000Z;
                c2786r1 = new C2786R0(list2, c3067i.f9246b, enumC6481b2, c5551u2, c5551u2);
            }
            abstractC21955Q1M6734a = new C21952P1(c2786r1);
        } else if (!(abstractC21955Q1M6734a instanceof C21929J1) && !(abstractC21955Q1M6734a instanceof AbstractC21933K1)) {
            throw new C0644w();
        }
        if (abstractC21955Q1M6734a instanceof C21952P1) {
            return abstractC21955Q1M6734a;
        }
        C2786R0 c2786r3 = (C2786R0) ((C21952P1) abstractC21955Q1M6734a).f69511a;
        c16950a = c16961l.f54438Z;
        c16482a = new C16482A(c2786r3, 6);
        c16954e.f54413Y = abstractC21955Q1M6734a;
        c16954e.f54414Z = null;
        c16954e.f54417q0 = 3;
        if (c16950a.m21029b(c16482a, c16954e) == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = abstractC21955Q1M6734a;
        return abstractC21955Q1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m18595f(String str, AbstractC19687c abstractC19687c) {
        C16958i c16958i;
        C16961l c16961l;
        if (abstractC19687c instanceof C16958i) {
            c16958i = (C16958i) abstractC19687c;
            int i10 = c16958i.f54428q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16958i.f54428q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16958i = new C16958i(this, abstractC19687c);
            }
        } else {
            c16958i = new C16958i(this, abstractC19687c);
        }
        Object obj = c16958i.f54426o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16958i.f54428q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c16958i.f54424Y = this;
            c16958i.f54425Z = str;
            c16958i.f54428q0 = 1;
            if (this.f54439o0.m14813j(str, c16958i) == enumC19250a) {
                return enumC19250a;
            }
            c16961l = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c16958i.f54425Z;
            c16961l = c16958i.f54424Y;
            AbstractC9233X.m9807c(obj);
        }
        c16961l.f54441q0.mo21447a(C20862H.f66404l, AbstractC17660E.m19258c(new C17309l("selected_voice_name", str)));
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m18596g(AbstractC19687c abstractC19687c) {
        C16959j c16959j;
        C5551u other;
        C16961l c16961l;
        C5551u c5551u;
        ZoneId zoneId;
        ZonedDateTime zonedDateTimeAtZone;
        if (abstractC19687c instanceof C16959j) {
            c16959j = (C16959j) abstractC19687c;
            int i10 = c16959j.f54433q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16959j.f54433q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16959j = new C16959j(this, abstractC19687c);
            }
        } else {
            c16959j = new C16959j(this, abstractC19687c);
        }
        Object objM3221t = c16959j.f54431o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16959j.f54433q0;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        other = c16959j.f54430Z;
                        c16961l = c16959j.f54429Y;
                        AbstractC9233X.m9807c(objM3221t);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM3221t);
                    }
                    return Boolean.TRUE;
                }
                AbstractC9233X.m9807c(objM3221t);
                C5551u.Companion.getClass();
                other = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c16959j.f54429Y = this;
                c16959j.f54430Z = other;
                c16959j.f54433q0 = 1;
                objM3221t = AbstractC2124C.m3221t(this.f54438Z.f64176f, c16959j);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                c16961l = this;
                ZonedDateTime zonedDateTimeAtZone2 = other.f18004Y.atZone(zoneId);
                AbstractC16544l.m18091d(zonedDateTimeAtZone2);
                long jUntil = zonedDateTimeAtZone.until(zonedDateTimeAtZone2, ChronoUnit.MONTHS);
                ZonedDateTime zonedDateTimePlusMonths = zonedDateTimeAtZone.plusMonths(jUntil);
                AbstractC16544l.m18093f(zonedDateTimePlusMonths, "plusMonths(...)");
                long jUntil2 = zonedDateTimePlusMonths.until(zonedDateTimeAtZone2, ChronoUnit.DAYS);
                ZonedDateTime zonedDateTimePlusDays = zonedDateTimePlusMonths.plusDays(jUntil2);
                AbstractC16544l.m18093f(zonedDateTimePlusDays, "plusDays(...)");
                long jUntil3 = zonedDateTimePlusDays.until(zonedDateTimeAtZone2, ChronoUnit.NANOS);
                if (jUntil > 2147483647L || jUntil < -2147483648L) {
                    String message = "The number of months between " + c5551u + " and " + other + " does not fit in an Int";
                    AbstractC16544l.m18094g(message, "message");
                    throw new C0644w(message);
                }
                int i12 = (int) jUntil;
                int i13 = (int) jUntil2;
                if ((jUntil3 != 0 ? new C5536f(jUntil3, i12, i13) : new C5533c(i12, i13)).mo5930a() <= ((Number) c16961l.f54442r0.m15477a(C13840B.f43876d)).intValue()) {
                    return Boolean.FALSE;
                }
                C16389g c16389g = new C16389g(1, other);
                c16959j.f54429Y = null;
                c16959j.f54430Z = null;
                c16959j.f54433q0 = 2;
                if (c16961l.f54438Z.m21029b(c16389g, c16959j) == enumC19250a) {
                    return enumC19250a;
                }
                return Boolean.TRUE;
            } catch (DateTimeException e10) {
                throw new C0644w(e10);
            }
            zonedDateTimeAtZone = c5551u.f18004Y.atZone(zoneId);
            AbstractC16544l.m18091d(zonedDateTimeAtZone);
        } catch (DateTimeException e11) {
            throw new C0644w(e11);
        }
        C2786R0 c2786r0 = (C2786R0) objM3221t;
        if (c2786r0 == null || (c5551u = c2786r0.f8506e) == null) {
            C5551u.Companion.getClass();
            c5551u = C5551u.f18000Z;
        }
        C5525F.Companion.getClass();
        zoneId = C5524E.m5924a().f17977a;
        AbstractC16544l.m18094g(c5551u, "<this>");
        AbstractC16544l.m18094g(other, "other");
    }
}
