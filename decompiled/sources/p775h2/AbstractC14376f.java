package p775h2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bb.AbstractC11278C;
import bb.C11333z;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.config.InterfaceC15343d;
import io.sentry.util.C15504i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import np.InterfaceC17710b;
import p017Af.C0485p;
import p1140z1.C21660F;
import p523V9.AbstractC8112i6;
import p658b5.C11248s;
import p758g0.AbstractC13758e;
import p758g0.InterfaceC13772l;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.AbstractC14360p;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.InterfaceC14333K;
import p817j$.util.concurrent.ConcurrentHashMap;
import p821j1.AbstractC16040e;
import p821j1.C16037b;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p858ko.C16484C;
import p858ko.C16490I;
import p858ko.InterfaceC16496O;
import p878lo.C17097f;
import p885m4.C17154d;
import p885m4.C17162l;
import p885m4.InterfaceC17163m;
import p998rp.C19265d;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC14376f {
    /* JADX INFO: renamed from: B */
    public static String m15823B(StringBuilder sb2, boolean z6, String str) {
        sb2.append(z6);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15824C(int i10) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC16544l.m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m15825D(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC16544l.m18097j(str));
        AbstractC16544l.m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: E */
    public static void m15826E(HashMap map, String str, C11248s c11248s, String str2, InterfaceC15127H interfaceC15127H) {
        Object obj = map.get(str);
        c11248s.m12668o(str2);
        c11248s.m12677z(interfaceC15127H, obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m15827F(ConcurrentHashMap concurrentHashMap, String str, C11248s c11248s, String str2, InterfaceC15127H interfaceC15127H) {
        Object obj = concurrentHashMap.get(str);
        c11248s.m12668o(str2);
        c11248s.m12677z(interfaceC15127H, obj);
    }

    /* JADX INFO: renamed from: G */
    public static float m15828G(float f10, float f11, C19265d c19265d, long j10, float f12, float f13) {
        c19265d.m20341c(f10 + f11, j10);
        return f12 + f13;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m15829H(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC10763a.m11052j(str, " must not be null"));
        AbstractC16544l.m18099l(nullPointerException, AbstractC16544l.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: I */
    public static float m15830I(float f10, float f11, C19265d c19265d, long j10, float f12, float f13) {
        c19265d.m20341c(f10 - f11, j10);
        return f12 - f13;
    }

    /* JADX INFO: renamed from: J */
    public static float m15831J(float f10, float f11, C19265d c19265d, long j10, float f12, float f13) {
        c19265d.m20341c(f10 + f11, j10);
        return f12 - f13;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ String m15832K(int i10) {
        if (i10 == 1) {
            return "FREQUENT";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "RARE";
        }
        return "AVERAGE";
    }

    /* JADX INFO: renamed from: L */
    public static void m15833L(C17097f c17097f, float f10, long j10, long j11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 8) != 0) {
            j11 = 0;
        }
        ((C0485p) c17097f.f54639a.f34008Y).mo985d(Float.valueOf(f10), new C13800b(j10), Float.valueOf(0.0f), new C13800b(j11));
    }

    /* JADX INFO: renamed from: M */
    public static Object m15834M(InterfaceC16496O interfaceC16496O, float f10, long j10, InterfaceC13772l interfaceC13772l, C16490I c16490i, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 9205357640488583168L;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            interfaceC13772l = AbstractC13758e.m15254s(0.0f, 400.0f, null, 5);
        }
        return ((C16484C) interfaceC16496O).m18059l(f10, j11, interfaceC13772l, c16490i);
    }

    /* JADX INFO: renamed from: a */
    public static List m15835a(InterfaceC15343d interfaceC15343d, String str) {
        String strMo16569a = interfaceC15343d.mo16569a(str);
        return strMo16569a != null ? Arrays.asList(strMo16569a.split(Separators.COMMA)) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15836b(String str, InterfaceC15127H interfaceC15127H) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        interfaceC15127H.mo16298o(EnumC15375i1.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15837c(InterfaceC17710b interfaceC17710b, int i10) {
        char c9;
        String str;
        if (i10 == 1) {
            c9 = '(';
        } else if (i10 == 2) {
            c9 = 30;
        } else if (i10 == 3) {
            c9 = 20;
        } else if (i10 == 4) {
            c9 = '\n';
        } else {
            if (i10 != 5) {
                throw null;
            }
            c9 = 0;
        }
        if (c9 == 0) {
            return interfaceC17710b.mo19440e();
        }
        if (c9 == '\n') {
            return interfaceC17710b.mo19437b();
        }
        if (c9 == 20) {
            return interfaceC17710b.mo19439d();
        }
        if (c9 == 30) {
            return interfaceC17710b.mo19436a();
        }
        if (c9 == '(') {
            return interfaceC17710b.mo19438c();
        }
        StringBuilder sb2 = new StringBuilder("Level [");
        if (i10 == 1) {
            str = "ERROR";
        } else if (i10 == 2) {
            str = "WARN";
        } else if (i10 == 3) {
            str = "INFO";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        sb2.append(str);
        sb2.append("] not recognized.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: d */
    public static C17154d m15838d(InterfaceC17163m interfaceC17163m, byte[] bArr, int i10) {
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        interfaceC17163m.mo3519o(bArr, 0, i10, C17162l.f54833c, new C15504i(c11333zM12690s, 6));
        return new C17154d(c11333zM12690s.m12768j());
    }

    /* JADX INFO: renamed from: e */
    public static long m15839e(long j10, long j11) {
        return AbstractC8112i6.m8603a(C13803e.m15333e(j10) - C13800b.m15306g(j11), C13803e.m15331c(j10) - C13800b.m15307h(j11));
    }

    /* JADX INFO: renamed from: i */
    public static void m15843i(InterfaceC16039d interfaceC16039d, C14351g c14351g, long j10, long j11, long j12, float f10, C14356l c14356l, int i10, int i11) {
        interfaceC16039d.mo17590I(c14351g, (i11 & 2) != 0 ? 0L : j10, j11, 0L, (i11 & 16) != 0 ? j11 : j12, (i11 & 32) != 0 ? 1.0f : f10, C16042g.f49483a, c14356l, 3, (i11 & 512) != 0 ? 1 : i10);
    }

    /* JADX INFO: renamed from: j */
    public static void m15844j(C21660F c21660f, C14351g c14351g, C14356l c14356l) {
        C16042g c16042g = C16042g.f49483a;
        C16037b c16037b = c21660f.f68674Y;
        c16037b.f49478Y.f49476c.mo15712k(c14351g, 0L, c16037b.m17595b(null, c16042g, 1.0f, c14356l, 3, 1));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m15847m(InterfaceC16039d interfaceC16039d, InterfaceC14333K interfaceC14333K, AbstractC14360p abstractC14360p, float f10, C16043h c16043h, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        AbstractC16040e abstractC16040e = c16043h;
        if ((i10 & 8) != 0) {
            abstractC16040e = C16042g.f49483a;
        }
        interfaceC16039d.mo17603m(interfaceC14333K, abstractC14360p, f11, abstractC16040e, null, (i10 & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m15848n(InterfaceC16039d interfaceC16039d, InterfaceC14333K interfaceC14333K, long j10, float f10, AbstractC16040e abstractC16040e, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            abstractC16040e = C16042g.f49483a;
        }
        interfaceC16039d.mo17605r(interfaceC14333K, j10, f11, abstractC16040e, null, 3);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15849o(InterfaceC16039d interfaceC16039d, AbstractC14360p abstractC14360p, long j10, long j11, float f10, AbstractC16040e abstractC16040e, int i10, int i11) {
        long j12 = (i11 & 2) != 0 ? 0L : j10;
        interfaceC16039d.mo17599d0(abstractC14360p, j12, (i11 & 4) != 0 ? m15839e(interfaceC16039d.mo17602i(), j12) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? C16042g.f49483a : abstractC16040e, null, (i11 & 64) != 0 ? 3 : i10);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m15850p(InterfaceC16039d interfaceC16039d, long j10, long j11, long j12, float f10, int i10) {
        long j13 = (i10 & 2) != 0 ? 0L : j11;
        interfaceC16039d.mo17597c0(j10, j13, (i10 & 4) != 0 ? m15839e(interfaceC16039d.mo17602i(), j13) : j12, (i10 & 8) != 0 ? 1.0f : f10, C16042g.f49483a, null, (i10 & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: q */
    public static void m15851q(InterfaceC16039d interfaceC16039d, AbstractC14360p abstractC14360p, long j10, long j11, long j12, AbstractC16040e abstractC16040e, int i10) {
        long j13 = (i10 & 2) != 0 ? 0L : j10;
        interfaceC16039d.mo17592W(abstractC14360p, j13, (i10 & 4) != 0 ? m15839e(interfaceC16039d.mo17602i(), j13) : j11, j12, 1.0f, (i10 & 32) != 0 ? C16042g.f49483a : abstractC16040e, null, 3);
    }

    /* JADX INFO: renamed from: r */
    public static void m15852r(InterfaceC16039d interfaceC16039d, long j10, long j11, long j12, long j13, AbstractC16040e abstractC16040e, int i10) {
        interfaceC16039d.mo17593Y(j10, (i10 & 2) != 0 ? 0L : j11, j12, j13, (i10 & 16) != 0 ? C16042g.f49483a : abstractC16040e, 1.0f, null, 3);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ long m15853s(int i10) {
        if (i10 == 1) {
            return 500L;
        }
        if (i10 == 2) {
            return 2000L;
        }
        if (i10 == 3) {
            return 5000L;
        }
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m15854t(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 3) {
            return 100;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ long m15855u(int i10) {
        if (i10 == 1) {
            return 3000L;
        }
        if (i10 == 2) {
            return 10000L;
        }
        if (i10 == 3) {
            return 35000L;
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static float m15856v(float f10, float f11, C19265d c19265d, long j10, float f12, float f13) {
        c19265d.m20341c(f10 - f11, j10);
        return f12 + f13;
    }

    /* JADX INFO: renamed from: w */
    public static int m15857w(long j10, int i10, int i11) {
        return (C17321x.m18981a(j10) + i10) * i11;
    }

    /* JADX INFO: renamed from: x */
    public static int m15858x(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: z */
    public static ClassCastException m15860z(int i10, ArrayList arrayList) {
        arrayList.get(i10).getClass();
        return new ClassCastException();
    }
}
