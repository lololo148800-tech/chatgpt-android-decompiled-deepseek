package p1137yp;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17312o;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p078Co.InterfaceC1760b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.EnumC21320n;
import p1113xn.InterfaceC21310d;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8192s6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: yp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C21564b implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C21564b f68279b = new C21564b(0);

    /* JADX INFO: renamed from: c */
    public static final C21564b f68280c = new C21564b(1);

    /* JADX INFO: renamed from: d */
    public static final C21564b f68281d = new C21564b(2);

    /* JADX INFO: renamed from: e */
    public static final C21564b f68282e = new C21564b(3);

    /* JADX INFO: renamed from: f */
    public static final C21564b f68283f = new C21564b(4);

    /* JADX INFO: renamed from: g */
    public static final C21564b f68284g = new C21564b(5);

    /* JADX INFO: renamed from: h */
    public static final C21564b f68285h = new C21564b(6);

    /* JADX INFO: renamed from: i */
    public static final C21564b f68286i = new C21564b(7);

    /* JADX INFO: renamed from: j */
    public static final C21564b f68287j = new C21564b(8);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68288a;

    public /* synthetic */ C21564b(int i10) {
        this.f68288a = i10;
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        Object objM9806b;
        boolean zMatches;
        Object objM9806b2;
        InterfaceC1426a c21565c;
        Object objM9806b3;
        String strM21712t0;
        C21570h c21570h;
        boolean z6 = true;
        switch (this.f68288a) {
            case 0:
                String strM8750c = AbstractC8168p6.m8750c(obj);
                if (strM8750c == null) {
                    return null;
                }
                if (strM8750c.length() <= 0) {
                    return strM8750c;
                }
                StringBuilder sb2 = new StringBuilder();
                String strValueOf = String.valueOf(strM8750c.charAt(0));
                AbstractC16544l.m18092e(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                sb2.append((Object) upperCase);
                String strSubstring = strM8750c.substring(1);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                return sb2.toString();
            case 1:
                String strM8750c2 = AbstractC8168p6.m8750c(obj);
                if (strM8750c2 != null) {
                    return Boolean.valueOf(AbstractC21322p.m21681O(strM8750c2));
                }
                return null;
            case 2:
                String strM8750c3 = AbstractC8168p6.m8750c(obj);
                if (strM8750c3 != null) {
                    return Integer.valueOf(strM8750c3.length());
                }
                return null;
            case 3:
                String strM8750c4 = AbstractC8168p6.m8750c(obj);
                if (strM8750c4 == null) {
                    return null;
                }
                String lowerCase = strM8750c4.toLowerCase(Locale.ROOT);
                AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            case 4:
                List list = AbstractC8038Z3.m8396e(obj).f2015Y;
                try {
                    Object obj3 = list.get(0);
                    AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.String");
                    Object obj4 = list.get(1);
                    AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.String");
                    Object obj5 = list.get(2);
                    AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                    objM9806b = new C21566d((String) obj3, (String) obj4, (List) obj5);
                    break;
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                C21566d c21566d = C17312o.m18979a(objM9806b) == null ? (C21566d) objM9806b : null;
                if (c21566d == null) {
                    return null;
                }
                List list2 = c21566d.f68293c;
                String str = c21566d.f68292b;
                boolean zIsEmpty = list2.isEmpty();
                String str2 = c21566d.f68291a;
                if (zIsEmpty) {
                    Pattern patternCompile = Pattern.compile(str);
                    AbstractC16544l.m18093f(patternCompile, "compile(...)");
                    zMatches = patternCompile.matcher(str2).matches();
                } else {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                    for (Object obj6 : list3) {
                        AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.String");
                        arrayList.add(EnumC21320n.valueOf((String) obj6));
                    }
                    Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
                    Iterator it = setM19328G0.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        i10 |= ((EnumC21320n) ((InterfaceC21310d) it.next())).f67761Y;
                    }
                    if ((i10 & 2) != 0) {
                        i10 |= 64;
                    }
                    Pattern patternCompile2 = Pattern.compile(str, i10);
                    AbstractC16544l.m18093f(patternCompile2, "compile(...)");
                    if ((setM19328G0 instanceof Collection) && setM19328G0.isEmpty()) {
                        zMatches = patternCompile2.matcher(str2).matches();
                    } else {
                        Iterator it2 = setM19328G0.iterator();
                        while (it2.hasNext()) {
                            if (((EnumC21320n) it2.next()) == EnumC21320n.MULTILINE) {
                                List<String> listM21697e0 = AbstractC21322p.m21697e0(str2, new String[]{Separators.RETURN}, 0, 6);
                                if (!(listM21697e0 instanceof Collection) || !listM21697e0.isEmpty()) {
                                    for (String input : listM21697e0) {
                                        AbstractC16544l.m18094g(input, "input");
                                        if (!patternCompile2.matcher(input).matches()) {
                                            z6 = false;
                                        }
                                    }
                                }
                                zMatches = z6;
                            }
                        }
                        zMatches = patternCompile2.matcher(str2).matches();
                    }
                }
                return Boolean.valueOf(zMatches);
            case 5:
                List list4 = AbstractC8038Z3.m8396e(obj).f2015Y;
                try {
                    Object obj7 = list4.get(0);
                    AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type kotlin.String");
                    Object obj8 = list4.get(1);
                    AbstractC16544l.m18092e(obj8, "null cannot be cast to non-null type kotlin.String");
                    Object obj9 = list4.get(2);
                    AbstractC16544l.m18092e(obj9, "null cannot be cast to non-null type kotlin.String");
                    C21567e c21567e = new C21567e((String) obj7, (String) obj8, (String) obj9);
                    Object obj10 = list4.get(3);
                    AbstractC16544l.m18092e(obj10, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) obj10;
                    if (str3.equals("all")) {
                        c21565c = new C21563a(c21567e);
                    } else {
                        if (AbstractC21329w.m21736w(str3) == null) {
                            throw new IllegalArgumentException(str3);
                        }
                        c21565c = new C21565c(c21567e, Integer.parseInt(str3));
                    }
                    objM9806b2 = c21565c.invoke();
                } catch (Throwable th3) {
                    objM9806b2 = AbstractC9233X.m9806b(th3);
                }
                if (C17312o.m18979a(objM9806b2) == null) {
                    return objM9806b2;
                }
                return null;
            case 6:
                Object objM19343S = AbstractC17680n.m19343S(AbstractC8038Z3.m8396e(obj));
                String str4 = objM19343S instanceof String ? (String) objM19343S : null;
                if (str4 != null) {
                    return AbstractC17680n.m19337M(1, AbstractC17680n.m19336L(AbstractC21322p.m21697e0(str4, new String[]{""}, 0, 6), 1));
                }
                return null;
            case 7:
                C21570h c21570h2 = C21570h.f68301b;
                C21570h c21570h3 = C21570h.f68302c;
                C21570h c21570h4 = C21570h.f68300a;
                List list5 = AbstractC8038Z3.m8396e(obj).f2015Y;
                try {
                    Object obj11 = list5.get(0);
                    AbstractC16544l.m18092e(obj11, "null cannot be cast to non-null type kotlin.String");
                    String str5 = (String) obj11;
                    Object obj12 = list5.get(1);
                    AbstractC16544l.m18092e(obj12, "null cannot be cast to non-null type kotlin.String");
                    char cM21694b0 = AbstractC21322p.m21694b0((String) obj12);
                    Object obj13 = list5.get(2);
                    AbstractC16544l.m18092e(obj13, "null cannot be cast to non-null type kotlin.String");
                    String str6 = (String) obj13;
                    int iHashCode = str6.hashCode();
                    if (iHashCode == 100571) {
                        if (str6.equals("end")) {
                            c21570h = c21570h2;
                            objM9806b3 = new C21569g(str5, cM21694b0, c21570h);
                        }
                        throw new IllegalStateException("Invalid TrimMode value");
                    }
                    if (iHashCode == 109757538) {
                        if (str6.equals("start")) {
                            c21570h = c21570h3;
                            objM9806b3 = new C21569g(str5, cM21694b0, c21570h);
                        }
                        throw new IllegalStateException("Invalid TrimMode value");
                    }
                    if (iHashCode == 2144573977 && str6.equals("bothEnds")) {
                        c21570h = c21570h4;
                        objM9806b3 = new C21569g(str5, cM21694b0, c21570h);
                    }
                    throw new IllegalStateException("Invalid TrimMode value");
                } catch (Throwable th4) {
                    objM9806b3 = AbstractC9233X.m9806b(th4);
                }
                C21569g c21569g = C17312o.m18979a(objM9806b3) == null ? (C21569g) objM9806b3 : null;
                if (c21569g == null) {
                    return null;
                }
                AbstractC8192s6 abstractC8192s6 = c21569g.f68299c;
                boolean zEquals = abstractC8192s6.equals(c21570h3);
                String str7 = c21569g.f68297a;
                char c9 = c21569g.f68298b;
                if (zEquals) {
                    strM21712t0 = AbstractC21322p.m21715w0(str7, c9);
                } else if (abstractC8192s6.equals(c21570h2)) {
                    strM21712t0 = AbstractC21322p.m21713u0(str7, c9);
                } else {
                    if (!abstractC8192s6.equals(c21570h4)) {
                        throw new C0644w();
                    }
                    strM21712t0 = AbstractC21322p.m21712t0(str7, c9);
                }
                return strM21712t0;
            default:
                String strM8750c5 = AbstractC8168p6.m8750c(obj);
                if (strM8750c5 == null) {
                    return null;
                }
                String upperCase2 = strM8750c5.toUpperCase(Locale.ROOT);
                AbstractC16544l.m18093f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase2;
        }
    }
}
