package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.layout.AbstractC10868a;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p017Af.C0470a;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1135yn.AbstractC21556c;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p193Hf.AbstractC3365g0;
import p193Hf.C3325P;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p544W9.AbstractC8443A;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.k6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8128k6 {
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m8635a(InterfaceC1436k onClick, boolean z6, C8410b c8410b, C8410b c8410b2, InterfaceC10459q interfaceC10459q, C8410b c8410b3, C6021p c6021p, int i10) {
        int i11;
        C21694h c21694h;
        InterfaceC10459q interfaceC10459qM8501a;
        ?? r6;
        Object objM530s;
        int i12;
        boolean z10;
        Object objM6514H;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(543049201);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(c8410b3) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C20416d c20416dM21079a = AbstractC20417e.m21079a(AbstractC7313q.f23200e);
            c6021p.m6524S(404653508);
            Object objM6514H2 = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
            C17756f c17756f = AbstractC17770m.f56726c;
            C10449g c10449g = C10444b.f30946y0;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h2 = C21698j.f68873f;
            C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
            C21694h c21694h3 = C21698j.f68872e;
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h4 = C21698j.f68874g;
            if (c6021p.f19563O) {
                c21694h = c21694h2;
            } else {
                c21694h = c21694h2;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                }
                C21694h c21694h5 = C21698j.f68871d;
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
                c6021p.m6524S(78609619);
                interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC8443A.m9045a(AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), RCHTTPStatusCodes.UNSUCCESSFUL), 1, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A, c20416dM21079a), c20416dM21079a);
                if (z6) {
                    c6021p.m6524S(-1069481429);
                    if ((i11 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z10 || objM6514H == obj) {
                        objM6514H = new C3325P(onClick, interfaceC5985X, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    r6 = 0;
                    c6021p.m6553p(false);
                    interfaceC10459qM8501a = AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7);
                } else {
                    r6 = 0;
                }
                objM530s = AbstractC0168G.m530s(78615388, c6021p, r6);
                if (objM530s == obj) {
                    objM530s = new C0248f0(interfaceC5985X, 13);
                    c6021p.m6537c0(objM530s);
                }
                c6021p.m6553p(r6);
                InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC10868a.m11318d(interfaceC10459qM8501a, (InterfaceC1436k) objM530s), AbstractC3365g0.m4182b(c6021p), AbstractC14334L.f44973a);
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, r6);
                i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                }
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
                c8410b.invoke(c6021p, Integer.valueOf((i11 >> 6) & 14));
                AbstractC17792x.m19538u((i11 >> 15) & 14, c8410b3, c6021p, true);
                AbstractC17792x.m19538u((i11 >> 9) & 14, c8410b2, c6021p, true);
            }
            AbstractC0168G.m537z(i13, c6021p, i13, c21694h4);
            C21694h c21694h6 = C21698j.f68871d;
            C5997d.m6439Z(c21694h6, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(78609619);
            interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC8443A.m9045a(AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), RCHTTPStatusCodes.UNSUCCESSFUL), 1, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A, c20416dM21079a), c20416dM21079a);
            if (z6) {
                c6021p.m6524S(-1069481429);
                if ((i11 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z10) {
                    objM6514H = new C3325P(onClick, interfaceC5985X, 0);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C3325P(onClick, interfaceC5985X, 0);
                    c6021p.m6537c0(objM6514H);
                }
                r6 = 0;
                c6021p.m6553p(false);
                interfaceC10459qM8501a = AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7);
            } else {
                r6 = 0;
            }
            objM530s = AbstractC0168G.m530s(78615388, c6021p, r6);
            if (objM530s == obj) {
                objM530s = new C0248f0(interfaceC5985X, 13);
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(r6);
            InterfaceC10459q interfaceC10459qM11207b2 = AbstractC10833a.m11207b(AbstractC10868a.m11318d(interfaceC10459qM8501a, (InterfaceC1436k) objM530s), AbstractC3365g0.m4182b(c6021p), AbstractC14334L.f44973a);
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, r6);
            i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a3);
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            } else {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
            }
            C5997d.m6439Z(c21694h6, c6021p, interfaceC10459qM10923d3);
            c8410b.invoke(c6021p, Integer.valueOf((i11 >> 6) & 14));
            AbstractC17792x.m19538u((i11 >> 15) & 14, c8410b3, c6021p, true);
            AbstractC17792x.m19538u((i11 >> 9) & 14, c8410b2, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(onClick, z6, c8410b, c8410b2, interfaceC10459q, c8410b3, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m8636b(String str) {
        EnumC21557d enumC21557d;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        C21554a c21554a = C21555b.f68260Z;
        char cCharAt2 = str.charAt(0);
        int i10 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z6 = (i10 > 0) && AbstractC21322p.m21698f0(str, '-');
        if (length <= i10) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i10) != 'P') {
            throw new IllegalArgumentException();
        }
        int i11 = i10 + 1;
        if (i11 == length) {
            throw new IllegalArgumentException();
        }
        EnumC21557d enumC21557d2 = null;
        long jM21839i = 0;
        boolean z10 = false;
        while (i11 < length) {
            if (str.charAt(i11) != 'T') {
                int i12 = i11;
                while (i12 < str.length() && (('0' <= (cCharAt = str.charAt(i12)) && cCharAt < ':') || AbstractC21322p.m21668B("+-.", cCharAt))) {
                    i12++;
                }
                String strSubstring = str.substring(i11, i12);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i11;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i13 = length2 + 1;
                if (z10) {
                    if (cCharAt3 == 'H') {
                        enumC21557d = EnumC21557d.HOURS;
                    } else if (cCharAt3 == 'M') {
                        enumC21557d = EnumC21557d.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        enumC21557d = EnumC21557d.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    enumC21557d = EnumC21557d.DAYS;
                }
                if (enumC21557d2 != null && enumC21557d2.compareTo(enumC21557d) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iM21678L = AbstractC21322p.m21678L(strSubstring, '.', 0, false, 6);
                if (enumC21557d != EnumC21557d.SECONDS || iM21678L <= 0) {
                    jM21839i = C21555b.m21839i(jM21839i, m8645k(m8640f(strSubstring), enumC21557d));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iM21678L);
                    AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                    long jM21839i2 = C21555b.m21839i(jM21839i, m8645k(m8640f(strSubstring2), enumC21557d));
                    String strSubstring3 = strSubstring.substring(iM21678L);
                    AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                    jM21839i = C21555b.m21839i(jM21839i2, m8643i(Double.parseDouble(strSubstring3), enumC21557d));
                }
                enumC21557d2 = enumC21557d;
                i11 = i13;
            } else {
                if (z10 || (i11 = i11 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z10 = true;
            }
        }
        return z6 ? C21555b.m21843m(jM21839i) : jM21839i;
    }

    /* JADX INFO: renamed from: c */
    public static final long m8637c(long j10) {
        long j11 = (j10 << 1) + 1;
        C21554a c21554a = C21555b.f68260Z;
        int i10 = AbstractC21556c.f68264a;
        return j11;
    }

    /* JADX INFO: renamed from: d */
    public static final long m8638d(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? m8637c(AbstractC8301I.m8922m(j10, -4611686018427387903L, 4611686018427387903L)) : m8639e(j10 * ((long) UtilsKt.MICROS_MULTIPLIER));
    }

    /* JADX INFO: renamed from: e */
    public static final long m8639e(long j10) {
        long j11 = j10 << 1;
        C21554a c21554a = C21555b.f68260Z;
        int i10 = AbstractC21556c.f68264a;
        return j11;
    }

    /* JADX INFO: renamed from: f */
    public static final long m8640f(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !AbstractC21322p.m21668B("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            Iterable c3508g = new C3508g(i10, AbstractC21322p.m21674H(str), 1);
            if (!(c3508g instanceof Collection) || !((Collection) c3508g).isEmpty()) {
                C3507f it = c3508g.iterator();
                while (true) {
                    if (it.f10596o0) {
                        char cCharAt = str.charAt(it.mo4199a());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (AbstractC21329w.m21734u(str, "+", false)) {
            str = AbstractC21322p.m21669C(1, str);
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: h */
    public static final String m8642h(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        return canonicalName == null ? view.getClass().getSimpleName() : canonicalName;
    }

    /* JADX INFO: renamed from: i */
    public static final long m8643i(double d10, EnumC21557d unit) {
        AbstractC16544l.m18094g(unit, "unit");
        double dM8662c = AbstractC8136l6.m8662c(d10, unit, EnumC21557d.NANOSECONDS);
        if (Double.isNaN(dM8662c)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM3196j = AbstractC2119a.m3196j(dM8662c);
        return (-4611686018426999999L > jM3196j || jM3196j >= 4611686018427000000L) ? m8638d(AbstractC2119a.m3196j(AbstractC8136l6.m8662c(d10, unit, EnumC21557d.MILLISECONDS))) : m8639e(jM3196j);
    }

    /* JADX INFO: renamed from: j */
    public static final long m8644j(int i10, EnumC21557d unit) {
        AbstractC16544l.m18094g(unit, "unit");
        return unit.compareTo(EnumC21557d.SECONDS) <= 0 ? m8639e(AbstractC8136l6.m8664e(i10, unit, EnumC21557d.NANOSECONDS)) : m8645k(i10, unit);
    }

    /* JADX INFO: renamed from: k */
    public static final long m8645k(long j10, EnumC21557d unit) {
        AbstractC16544l.m18094g(unit, "unit");
        EnumC21557d enumC21557d = EnumC21557d.NANOSECONDS;
        long jM8664e = AbstractC8136l6.m8664e(4611686018426999999L, enumC21557d, unit);
        return ((-jM8664e) > j10 || j10 > jM8664e) ? m8637c(AbstractC8301I.m8922m(AbstractC8136l6.m8663d(j10, unit, EnumC21557d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m8639e(AbstractC8136l6.m8664e(j10, unit, enumC21557d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final String m8641g(Context context, int i10) {
        String resourceEntryName;
        String str = MpoABj.QInXpdKuVf;
        if (context != null) {
            try {
                Resources resources = context.getResources();
                if (resources != null) {
                    resourceEntryName = resources.getResourceEntryName(i10);
                } else {
                    resourceEntryName = null;
                }
            } catch (Resources.NotFoundException unused) {
                AbstractC7966P5.m8254b(16);
                String string = Integer.toString(i10, 16);
                AbstractC16544l.m18093f(string, str);
                return "0x".concat(string);
            }
        } else {
            resourceEntryName = null;
        }
        if (resourceEntryName != null) {
            return resourceEntryName;
        }
        AbstractC7966P5.m8254b(16);
        String string2 = Integer.toString(i10, 16);
        AbstractC16544l.m18093f(string2, str);
        return "0x".concat(string2);
    }
}
