package p1143z4;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.C15524y1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17314q;
import mm.EnumC17307j;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: z4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C21786p {

    /* JADX INFO: renamed from: m */
    public static final Pattern f69105m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n */
    public static final Pattern f69106n = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a */
    public final String f69107a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f69108b;

    /* JADX INFO: renamed from: c */
    public final String f69109c;

    /* JADX INFO: renamed from: d */
    public final C17314q f69110d;

    /* JADX INFO: renamed from: e */
    public final C17314q f69111e;

    /* JADX INFO: renamed from: f */
    public final Object f69112f;

    /* JADX INFO: renamed from: g */
    public boolean f69113g;

    /* JADX INFO: renamed from: h */
    public final Object f69114h;

    /* JADX INFO: renamed from: i */
    public final Object f69115i;

    /* JADX INFO: renamed from: j */
    public final Object f69116j;

    /* JADX INFO: renamed from: k */
    public final C17314q f69117k;

    /* JADX INFO: renamed from: l */
    public final boolean f69118l;

    public C21786p(String str) {
        this.f69107a = str;
        ArrayList arrayList = new ArrayList();
        this.f69108b = arrayList;
        this.f69110d = AbstractC9227W.m9800c(new C21784n(this, 6));
        this.f69111e = AbstractC9227W.m9800c(new C21784n(this, 4));
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        this.f69112f = AbstractC9227W.m9799b(enumC17307j, new C21784n(this, 7));
        this.f69114h = AbstractC9227W.m9799b(enumC17307j, new C21784n(this, 1));
        this.f69115i = AbstractC9227W.m9799b(enumC17307j, new C21784n(this, 0));
        this.f69116j = AbstractC9227W.m9799b(enumC17307j, new C21784n(this, 3));
        this.f69117k = AbstractC9227W.m9800c(new C21784n(this, 2));
        AbstractC9227W.m9800c(new C21784n(this, 5));
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f69105m.matcher(str).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z6 = false;
        String strSubstring = str.substring(0, matcher.start());
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        m22273a(strSubstring, arrayList, sb2);
        if (!AbstractC21322p.m21667A(sb2, C15524y1.DEFAULT_PROPAGATION_TARGETS, false) && !AbstractC21322p.m21667A(sb2, "([^/]+?)", false)) {
            z6 = true;
        }
        this.f69118l = z6;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "uriRegex.toString()");
        this.f69109c = AbstractC21329w.m21731r(string, C15524y1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
    }

    /* JADX INFO: renamed from: a */
    public static void m22273a(String str, ArrayList arrayList, StringBuilder sb2) {
        Matcher matcher = f69106n.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            AbstractC16544l.m18092e(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(strSubstring));
            }
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(strSubstring2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22274d(Bundle bundle, String key, String str, C21776f c21776f) {
        if (c21776f == null) {
            bundle.putString(key, str);
            return;
        }
        AbstractC21767I abstractC21767I = c21776f.f69067a;
        AbstractC16544l.m18094g(key, "key");
        abstractC21767I.mo5896e(bundle, key, abstractC21767I.mo5895c(str));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22275b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f69108b;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            C21776f c21776f = (C21776f) linkedHashMap.get(str);
            try {
                AbstractC16544l.m18093f(value, "value");
                m22274d(bundle, str, value, c21776f);
                arrayList2.add(C17296C.f55119a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: c */
    public final boolean m22276c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        String query;
        C21786p c21786p = this;
        for (Map.Entry entry : ((Map) c21786p.f69112f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C21783m c21783m = (C21783m) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (c21786p.f69113g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = AbstractC9393x3.m9974d(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = c21783m.f69099a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i10 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = c21783m.f69100b;
                        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                        for (Object obj : arrayList) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC17681o.m19388q();
                                throw null;
                            }
                            String str4 = (String) obj;
                            String strGroup = matcher.group(i11);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            try {
                                C21776f c21776f = (C21776f) linkedHashMap.get(str4);
                                if (!bundle.containsKey(str4)) {
                                    if (!strGroup.equals('{' + str4 + '}')) {
                                        m22274d(bundle2, str4, strGroup, c21776f);
                                    }
                                } else if (c21776f != null) {
                                    AbstractC21767I abstractC21767I = c21776f.f69067a;
                                    Object objMo5893a = abstractC21767I.mo5893a(str4, bundle);
                                    if (!bundle.containsKey(str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    abstractC21767I.mo5896e(bundle, str4, abstractC21767I.mo22255d(strGroup, objMo5893a));
                                } else {
                                    continue;
                                }
                                arrayList2.add(C17296C.f55119a);
                                i10 = i11;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            c21786p = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C21786p)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f69107a, ((C21786p) obj).f69107a) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        String str = this.f69107a;
        return (str != null ? str.hashCode() : 0) * 961;
    }
}
