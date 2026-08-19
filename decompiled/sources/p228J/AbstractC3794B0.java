package p228J;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import p225Im.InterfaceC3773u;
import p326N.InterfaceC5569k;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6021p;
import p349O0.C6037x;
import p386Pk.C6452d;
import p386Pk.C6453e;
import p467T1.C7192b;
import p467T1.C7203m;
import p467T1.InterfaceC7204n;
import p492U1.C7542g;
import p492U1.C7548m;
import p492U1.C7549n;
import p492U1.InterfaceC7537b;
import p516V1.AbstractC7738b;
import p516V1.InterfaceC7737a;
import p523V9.AbstractC8112i6;
import p523V9.C7952O;
import p544W9.C8598a;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9393x3;
import p571X9.AbstractC9400y4;
import p571X9.C9096A;
import p759g1.C13803e;
import p774h1.C14365u;
import p817j$.time.Clock;
import p817j$.time.Instant;
import p817j$.util.DesugarCollections;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: J.B0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3794B0 {
    /* JADX INFO: renamed from: A */
    public static HashMap m4466A(Class cls, C7952O c7952o) {
        HashMap map = new HashMap();
        map.put(cls, c7952o);
        return map;
    }

    /* JADX INFO: renamed from: B */
    public static HashMap m4467B(Class cls, C8598a c8598a) {
        HashMap map = new HashMap();
        map.put(cls, c8598a);
        return map;
    }

    /* JADX INFO: renamed from: C */
    public static HashMap m4468C(Class cls, C9096A c9096a) {
        HashMap map = new HashMap();
        map.put(cls, c9096a);
        return map;
    }

    /* JADX INFO: renamed from: D */
    public static List m4469D(String str, String str2) {
        return AbstractC9393x3.m9974d(new C6453e(str, str2));
    }

    /* JADX INFO: renamed from: E */
    public static List m4470E(String str, String str2, String str3) {
        return AbstractC9393x3.m9974d(new C6452d(str, str2, str3));
    }

    /* JADX INFO: renamed from: F */
    public static void m4471F(C6021p c6021p, boolean z6, boolean z10, boolean z11) {
        c6021p.m6553p(z6);
        c6021p.m6553p(z10);
        c6021p.m6553p(z11);
    }

    /* JADX INFO: renamed from: G */
    public static void m4472G(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        C5997d.m6445c0(sb2.toString());
        throw null;
    }

    /* JADX INFO: renamed from: H */
    public static void m4473H(HashMap map) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ String m4474I(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ String m4475J(int i10) {
        switch (i10) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static EnumC3804G0 m4476a(InterfaceC3800E0 interfaceC3800E0) {
        return (EnumC3804G0) interfaceC3800E0.mo39b(InterfaceC3800E0.f11493G);
    }

    /* JADX INFO: renamed from: b */
    public static int m4477b(InterfaceC3800E0 interfaceC3800E0) {
        return ((Integer) interfaceC3800E0.mo36M(InterfaceC3800E0.f11494H, 0)).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m4478c(InterfaceC3800E0 interfaceC3800E0) {
        return ((Integer) interfaceC3800E0.mo36M(InterfaceC3800E0.f11500z, 0)).intValue();
    }

    /* JADX INFO: renamed from: d */
    public static String m4479d(InterfaceC3800E0 interfaceC3800E0) {
        return (String) interfaceC3800E0.mo39b(InterfaceC5569k.f18064W);
    }

    /* JADX INFO: renamed from: e */
    public static String m4480e(InterfaceC3800E0 interfaceC3800E0, String str) {
        return (String) interfaceC3800E0.mo36M(InterfaceC5569k.f18064W, str);
    }

    /* JADX INFO: renamed from: f */
    public static int m4481f(InterfaceC3800E0 interfaceC3800E0) {
        return ((Integer) interfaceC3800E0.mo36M(InterfaceC3800E0.f11495J, 0)).intValue();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4482g(InterfaceC3800E0 interfaceC3800E0) {
        return ((Boolean) interfaceC3800E0.mo36M(InterfaceC3800E0.f11492D, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4483h(InterfaceC3800E0 interfaceC3800E0) {
        return ((Boolean) interfaceC3800E0.mo36M(InterfaceC3800E0.f11491B, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC7204n m4484i(InterfaceC7204n interfaceC7204n, InterfaceC7204n interfaceC7204n2) {
        boolean z6 = interfaceC7204n2 instanceof C7192b;
        if (!z6 || !(interfaceC7204n instanceof C7192b)) {
            if (!z6 || (interfaceC7204n instanceof C7192b)) {
                return (z6 || !(interfaceC7204n instanceof C7192b)) ? interfaceC7204n2.mo7589c(new C7203m(interfaceC7204n, 1)) : interfaceC7204n;
            }
            return interfaceC7204n2;
        }
        C7192b c7192b = (C7192b) interfaceC7204n2;
        C7203m c7203m = new C7203m(interfaceC7204n, 0);
        float fFloatValue = ((C7192b) interfaceC7204n2).f22848b;
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) c7203m.invoke()).floatValue();
        }
        return new C7192b(c7192b.f22847a, fFloatValue);
    }

    /* JADX INFO: renamed from: j */
    public static int m4485j(InterfaceC7537b interfaceC7537b, float f10) {
        float fMo7864b0 = interfaceC7537b.mo7864b0(f10);
        if (Float.isInfinite(fMo7864b0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo7864b0);
    }

    /* JADX INFO: renamed from: k */
    public static float m4486k(long j10, InterfaceC7537b interfaceC7537b) {
        if (!C7549n.m7898a(C7548m.m7894b(j10), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC7738b.f24403a;
        if (interfaceC7537b.mo7863X() < 1.03f) {
            return interfaceC7537b.mo7863X() * C7548m.m7895c(j10);
        }
        InterfaceC7737a interfaceC7737aM8002a = AbstractC7738b.m8002a(interfaceC7537b.mo7863X());
        float fM7895c = C7548m.m7895c(j10);
        return interfaceC7737aM8002a == null ? interfaceC7537b.mo7863X() * fM7895c : interfaceC7737aM8002a.mo7892b(fM7895c);
    }

    /* JADX INFO: renamed from: l */
    public static long m4487l(long j10, InterfaceC7537b interfaceC7537b) {
        if (j10 != 9205357640488583168L) {
            return AbstractC9400y4.m9979b(interfaceC7537b.mo7862P(C13803e.m15333e(j10)), interfaceC7537b.mo7862P(C13803e.m15331c(j10)));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: n */
    public static long m4489n(long j10, InterfaceC7537b interfaceC7537b) {
        if (j10 != 9205357640488583168L) {
            return AbstractC8112i6.m8603a(interfaceC7537b.mo7864b0(C7542g.m7877b(j10)), interfaceC7537b.mo7864b0(C7542g.m7876a(j10)));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: o */
    public static long m4490o(InterfaceC7537b interfaceC7537b, float f10) {
        float[] fArr = AbstractC7738b.f24403a;
        if (!(interfaceC7537b.mo7863X() >= 1.03f)) {
            return AbstractC9119D4.m9652e(f10 / interfaceC7537b.mo7863X(), 4294967296L);
        }
        InterfaceC7737a interfaceC7737aM8002a = AbstractC7738b.m8002a(interfaceC7537b.mo7863X());
        return AbstractC9119D4.m9652e(interfaceC7737aM8002a != null ? interfaceC7737aM8002a.mo7891a(f10) : f10 / interfaceC7537b.mo7863X(), 4294967296L);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m4491p(int i10) {
        switch (i10) {
            case 1:
                return "segment.userId";
            case 2:
                return "segment.traits";
            case 3:
                return "segment.anonymousId";
            case 4:
                return "segment.settings";
            case 5:
                return "segment.events";
            case 6:
                return "segment.app.version";
            case 7:
                return "segment.app.build";
            case 8:
                return "build";
            case 9:
                return "segment.device.id";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m4492q(float f10, float f11, float f12) {
        return Math.round((f10 + f11) * f12);
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC3773u m4493r(Class cls, String str, String str2, int i10, C16527D c16527d) {
        return c16527d.mo5699h(new C16553u(cls, str, str2, i10));
    }

    /* JADX INFO: renamed from: s */
    public static C6014l0 m4494s(long j10, C6037x c6037x) {
        return c6037x.mo6405a(new C14365u(j10));
    }

    /* JADX INFO: renamed from: t */
    public static C7952O m4495t(HashMap map, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C7952O(i10);
    }

    /* JADX INFO: renamed from: u */
    public static C8598a m4496u(HashMap map, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
        return new C8598a(i10);
    }

    /* JADX INFO: renamed from: v */
    public static ClassCastException m4497v(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: w */
    public static String m4498w(String str) {
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, str);
        return string;
    }

    /* JADX INFO: renamed from: x */
    public static String m4499x(StringBuilder sb2, boolean z6, char c9) {
        sb2.append(z6);
        sb2.append(c9);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: y */
    public static StringBuilder m4500y(String str, String str2) {
        AbstractC16544l.m18093f(str, str2);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: z */
    public static Instant m4501z(String str) {
        Instant instant = Clock.systemUTC().instant();
        AbstractC16544l.m18093f(instant, str);
        return instant;
    }

    /* JADX INFO: renamed from: m */
    public static float m4488m(long j10, InterfaceC7537b interfaceC7537b) {
        if (C7549n.m7898a(C7548m.m7894b(j10), 4294967296L)) {
            return interfaceC7537b.mo7864b0(interfaceC7537b.mo7870w(j10));
        }
        throw new IllegalStateException(CsqksqyPE.qBXoEofVuA);
    }
}
