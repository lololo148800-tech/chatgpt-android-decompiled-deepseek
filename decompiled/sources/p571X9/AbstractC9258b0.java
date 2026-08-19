package p571X9;

import com.openai.chatgpt.R;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17344k;
import no.AbstractC17708b;
import p003A1.AbstractC0168G;
import p003A1.C0257i0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p229J0.AbstractC3984T1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p360Od.C6172d;
import p360Od.EnumC6173e;
import p362Of.C6194i;
import p363Og.C6207k;
import p382Pf.AbstractC6403f;
import p382Pf.C6398a;
import p382Pf.C6399b;
import p382Pf.C6400c;
import p382Pf.C6401d;
import p451Sb.C7102a;
import p507Uh.C7677c;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9849a0;

/* JADX INFO: renamed from: X9.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9258b0 {
    /* JADX INFO: renamed from: a */
    public static final void m9831a(List list, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        c6021p.m6526U(-723931148);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C7677c c7677cM10499b = AbstractC9849a0.m10499b(list, c6021p, i11 & 14);
            c6021p.m6524S(-349446402);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.valueOf(c7677cM10499b.f24208b), c5975s2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            boolean z10 = c7677cM10499b.f24208b;
            C17296C c17296c = C17296C.f55119a;
            if (z10) {
                c6021p.m6524S(2052195209);
                if (!((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                    InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1426a, c6021p);
                    c6021p.m6524S(-349437029);
                    boolean zM6542f = c6021p.m6542f(interfaceC5985XM6435V);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f || objM6514H2 == c5975s) {
                        objM6514H2 = new C6398a(interfaceC5985XM6435V, null);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
                }
                c6021p.m6553p(false);
            } else if (c7677cM10499b.f24209c) {
                c6021p.m6524S(2052508340);
                c6021p.m6524S(-349431715);
                Object objM6514H3 = c6021p.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = C5997d.m6430Q(Boolean.TRUE, c5975s2);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-349429841);
                if (((Boolean) interfaceC5985X2.getValue()).booleanValue()) {
                    c6021p.m6524S(-349427144);
                    Object objM6514H4 = c6021p.m6514H();
                    if (objM6514H4 == c5975s) {
                        objM6514H4 = new C6194i(interfaceC5985X2, 2);
                        c6021p.m6537c0(objM6514H4);
                    }
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H4;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-349425135);
                    boolean zM6542f2 = c6021p.m6542f(c7677cM10499b);
                    Object objM6514H5 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H5 == c5975s) {
                        objM6514H5 = new C6399b(c7677cM10499b, 0);
                        c6021p.m6537c0(objM6514H5);
                    }
                    c6021p.m6553p(false);
                    z6 = false;
                    AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H5, AbstractC8142m4.m8676d(R.string.tool_local_permission, c6021p), AbstractC8142m4.m8676d(R.string.tool_local_permission_grant_access, c6021p), 0L, null, false, null, c6021p, 6, 240);
                } else {
                    z6 = false;
                }
                Object objM530s = AbstractC0168G.m530s(-349415369, c6021p, z6);
                if (objM530s == c5975s) {
                    objM530s = new C6207k(interfaceC5985X2, 1);
                    c6021p.m6537c0(objM530s);
                }
                c6021p.m6553p(z6);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM530s, null, false, null, null, null, null, null, null, AbstractC6403f.f20834a, c6021p, 805306374, 510);
                c6021p.m6553p(z6);
            } else {
                c6021p.m6524S(2053199206);
                c6021p.m6524S(-349409039);
                boolean zM6542f3 = c6021p.m6542f(c7677cM10499b);
                Object objM6514H6 = c6021p.m6514H();
                if (zM6542f3 || objM6514H6 == c5975s) {
                    objM6514H6 = new C6399b(c7677cM10499b, 1);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H6, null, false, null, null, null, null, null, null, AbstractC6403f.f20835b, c6021p, 805306368, 510);
                c6021p.m6524S(-349402675);
                boolean zM6542f4 = c6021p.m6542f(c7677cM10499b);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6542f4 || objM6514H7 == c5975s) {
                    objM6514H7 = new C6400c(c7677cM10499b, null);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H7, c6021p, c17296c);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(list, interfaceC1426a, i10, 29);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9832b(C6172d customAction, InterfaceC1426a onPermissionsGrant, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(customAction, "customAction");
        AbstractC16544l.m18094g(onPermissionsGrant, "onPermissionsGrant");
        c6021p.m6526U(231018547);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(customAction) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onPermissionsGrant) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C7102a c7102a = EnumC6173e.f20099o0;
            String str = customAction.f20091a.f28482d;
            c7102a.getClass();
            EnumC6173e enumC6173eM7512r = C7102a.m7512r(str);
            if (customAction.f20095e && enumC6173eM7512r != null) {
                List list = enumC6173eM7512r.f20112Z;
                if (!list.isEmpty()) {
                    m9831a(list, onPermissionsGrant, c6021p, i11 & 112);
                }
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(customAction, onPermissionsGrant, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m9833c(int i10, int i11, String str, boolean z6) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z6)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX INFO: renamed from: d */
    public static long m9834d(int i10, String str) {
        int iM9833c = m9833c(0, i10, str, false);
        Matcher matcher = C17344k.f55266m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iM21679M = -1;
        int i14 = -1;
        int i15 = -1;
        while (iM9833c < i10) {
            int iM9833c2 = m9833c(iM9833c + 1, i10, str, true);
            matcher.region(iM9833c, iM9833c2);
            if (i12 == -1 && matcher.usePattern(C17344k.f55266m).matches()) {
                String strGroup = matcher.group(1);
                AbstractC16544l.m18093f(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                AbstractC16544l.m18093f(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                AbstractC16544l.m18093f(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(C17344k.f55265l).matches()) {
                String strGroup4 = matcher.group(1);
                AbstractC16544l.m18093f(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iM21679M == -1) {
                Pattern pattern = C17344k.f55264k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC16544l.m18093f(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strM534w = AbstractC0168G.m534w(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    AbstractC16544l.m18093f(strPattern, "MONTH_PATTERN.pattern()");
                    iM21679M = AbstractC21322p.m21679M(strPattern, strM534w, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(C17344k.f55263j).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC16544l.m18093f(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iM9833c = m9833c(iM9833c2 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iM21679M == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC17708b.f56540e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iM21679M - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
