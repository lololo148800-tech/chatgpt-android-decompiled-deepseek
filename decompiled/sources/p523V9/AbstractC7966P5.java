package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p169Gf.C3037a;
import p200Hm.C3508g;
import p257K3.C4535c;
import p349O0.C6018n0;
import p349O0.C6021p;
import p380Pd.AbstractC6389f;
import p380Pd.C6384a;
import p380Pd.C6386c;
import p380Pd.C6387d;
import p380Pd.C6388e;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6612S;
import p403Qd.EnumC6606L;
import p544W9.AbstractC8699q4;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p857kl.C16448O;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: V9.P5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7966P5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25207a;

    /* JADX INFO: renamed from: a */
    public static final void m8253a(C6600F c6600f, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        String strM8677e;
        int i12;
        int i13 = 0;
        c6021p.m6526U(-806756755);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c6600f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i14 = i11;
        if ((i14 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-481564971);
            EnumC6606L enumC6606L = c6600f.f21311c;
            int iOrdinal = enumC6606L.ordinal();
            AbstractC6653q0 abstractC6653q0 = c6600f.f21314f;
            if (iOrdinal == 0) {
                c6021p.m6524S(2032755190);
                AbstractC6389f abstractC6389f = (AbstractC6389f) AbstractC17680n.m19353c0(((C6612S) abstractC6653q0).f21339b);
                C6386c c6386c = AbstractC6389f.Companion;
                c6021p.m6524S(1846760517);
                if (abstractC6389f == null) {
                    strM8677e = AbstractC17792x.m19533p(c6021p, -619735519, R.string.browsing_active, c6021p, false);
                } else if (abstractC6389f instanceof C6387d) {
                    strM8677e = AbstractC17792x.m19533p(c6021p, -619733040, R.string.browsing_active_reading_no_url, c6021p, false);
                } else if (abstractC6389f instanceof C6388e) {
                    c6021p.m6524S(-2031759140);
                    String str = ((C6388e) abstractC6389f).f20805b;
                    boolean zM21681O = AbstractC21322p.m21681O(str);
                    if (zM21681O) {
                        strM8677e = AbstractC17792x.m19533p(c6021p, -619728607, R.string.browsing_active, c6021p, false);
                    } else {
                        if (zM21681O) {
                            c6021p.m6524S(-619807975);
                            c6021p.m6553p(false);
                            throw new C0644w();
                        }
                        c6021p.m6524S(-619726608);
                        strM8677e = AbstractC8142m4.m8677e(R.string.browsing_active_search, new Object[]{str}, c6021p);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(false);
                } else {
                    if (!(abstractC6389f instanceof C6384a)) {
                        c6021p.m6524S(-619807975);
                        c6021p.m6553p(false);
                        throw new C0644w();
                    }
                    c6021p.m6524S(-2031547906);
                    String str2 = ((C6384a) abstractC6389f).f20801b;
                    if (str2 == null) {
                        strM8677e = AbstractC17792x.m19533p(c6021p, -619721200, R.string.browsing_active_reading_no_url, c6021p, false);
                    } else {
                        c6021p.m6524S(-619718630);
                        String str3 = "";
                        try {
                            String str4 = AbstractC8699q4.m9401a(str2).m18021b().f51035a;
                            if (str4 != null) {
                                str3 = str4;
                            }
                        } catch (C16448O e10) {
                            AbstractC8160o6.m8731f(AbstractC8168p6.m8749b("urlHost", null), "URL failed to parse: ".concat(str2), e10, null, 4);
                        }
                        strM8677e = AbstractC8142m4.m8677e(R.string.browsing_active_reading_url, new Object[]{str3}, c6021p);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(false);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i12 = 2032749168;
                } else {
                    if (iOrdinal != 3) {
                        c6021p.m6524S(2032687047);
                        c6021p.m6553p(false);
                        throw new C0644w();
                    }
                    i12 = 2032746352;
                }
                strM8677e = AbstractC17792x.m19533p(c6021p, i12, R.string.browsing_stopped, c6021p, false);
            } else {
                c6021p.m6524S(2032752371);
                List list = ((C6612S) abstractC6653q0).f21339b;
                c6021p.m6524S(353675945);
                if (list.size() == 0) {
                    strM8677e = AbstractC17792x.m19533p(c6021p, -1892238446, R.string.browsing_finished, c6021p, false);
                } else {
                    c6021p.m6524S(-1892236521);
                    strM8677e = AbstractC8134l4.m8653c(c6021p).getQuantityString(R.plurals.browsing_finished_n_sites, m8256d(list), Arrays.copyOf(new Object[]{Integer.valueOf(m8256d(list))}, 1));
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(false);
            AbstractC8011V4.m8325a(strM8677e, enumC6606L == EnumC6606L.f21327Y, interfaceC10459q, 0, c6021p, (i14 << 3) & 896, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3037a(c6600f, interfaceC10459q, i10, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8254b(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "radix ", " was not in valid range ");
            sbM11057o.append(new C3508g(2, 36, 1));
            throw new IllegalArgumentException(sbM11057o.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8255c(char c9, char c10, boolean z6) {
        if (c9 == c10) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: d */
    public static final int m8256d(List list) {
        List<AbstractC6389f> list2 = list;
        int i10 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (AbstractC6389f abstractC6389f : list2) {
                if (!(abstractC6389f instanceof C6388e)) {
                    if (!(abstractC6389f instanceof C6384a)) {
                        if (!(abstractC6389f instanceof C6387d)) {
                            throw new C0644w();
                        }
                        if (((C6387d) abstractC6389f).f20804b == null) {
                            continue;
                        }
                    } else if (((C6384a) abstractC6389f).f20801b == null) {
                        continue;
                    }
                }
                i10++;
                if (i10 < 0) {
                    AbstractC17681o.m19387p();
                    throw null;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public static final C17425e m8257e() {
        C17425e c17425e = f25207a;
        if (c17425e != null) {
            return c17425e;
        }
        float f10 = (float) 24.0d;
        C17424d c17424d = new C17424d("ThumbDown", f10, f10, 24.0f, 24.0f, 0L, 0, false, 224);
        C14341T c14341t = new C14341T(AbstractC14334L.m15625c(0));
        C14341T c14341t2 = new C14341T(AbstractC14334L.m15626d(4278190080L));
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(16.0f, 14.0f);
        c4535c.m5288n(11.0f, 21.0f);
        c4535c.m5288n(10.5463f, 20.9433f);
        c4535c.m5283i(8.6959f, 20.712f, 7.5026f, 18.8665f, 8.051f, 17.0842f);
        c4535c.m5288n(9.0f, 14.0f);
        c4535c.m5286l(6.9278f);
        c4535c.m5283i(4.9496f, 14.0f, 3.513f, 12.1191f, 4.0335f, 10.2107f);
        c4535c.m5288n(5.3971f, 5.2107f);
        c4535c.m5283i(5.7531f, 3.9055f, 6.9385f, 3.0f, 8.2914f, 3.0f);
        c4535c.m5286l(17.0f);
        c4535c.m5283i(18.6569f, 3.0f, 20.0f, 4.3432f, 20.0f, 6.0f);
        c4535c.m5288n(20.0f, 11.0f);
        c4535c.m5283i(20.0f, 12.6569f, 18.6569f, 14.0f, 17.0f, 14.0f);
        c4535c.m5286l(16.0f);
        c4535c.m5282h();
        c4535c.m5290p(16.0f, 14.0f);
        c4535c.m5293s(8.5f);
        c4535c.m5293s(6.0f);
        c4535c.m5283i(16.0f, 4.3432f, 14.6569f, 3.0f, 13.0f, 3.0f);
        c4535c.m5286l(9.0f);
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, c14341t2, 2.0f, 0, 1, 4.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25207a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8258f(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    /* JADX INFO: renamed from: g */
    public static String m8259g(char c9, Locale locale) {
        String strValueOf = String.valueOf(c9);
        AbstractC16544l.m18092e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC16544l.m18093f(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c9);
            AbstractC16544l.m18092e(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            AbstractC16544l.m18093f(upperCase2, "toUpperCase(...)");
            return !upperCase.equals(upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c9));
        }
        if (c9 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
