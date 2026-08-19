package mo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p1113xn.AbstractC21322p;
import p712dp.C13187c;

/* JADX INFO: renamed from: mo.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C17349p {

    /* JADX INFO: renamed from: k */
    public static final char[] f55285k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f55286a;

    /* JADX INFO: renamed from: b */
    public final String f55287b;

    /* JADX INFO: renamed from: c */
    public final String f55288c;

    /* JADX INFO: renamed from: d */
    public final String f55289d;

    /* JADX INFO: renamed from: e */
    public final int f55290e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f55291f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f55292g;

    /* JADX INFO: renamed from: h */
    public final String f55293h;

    /* JADX INFO: renamed from: i */
    public final String f55294i;

    /* JADX INFO: renamed from: j */
    public final boolean f55295j;

    public C17349p(String scheme, String str, String str2, String host, int i10, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        AbstractC16544l.m18094g(scheme, "scheme");
        AbstractC16544l.m18094g(host, "host");
        this.f55286a = scheme;
        this.f55287b = str;
        this.f55288c = str2;
        this.f55289d = host;
        this.f55290e = i10;
        this.f55291f = arrayList;
        this.f55292g = arrayList2;
        this.f55293h = str3;
        this.f55294i = str4;
        this.f55295j = scheme.equals("https");
    }

    /* JADX INFO: renamed from: a */
    public final String m19020a() {
        if (this.f55288c.length() == 0) {
            return "";
        }
        int length = this.f55286a.length() + 3;
        String str = this.f55294i;
        String strSubstring = str.substring(AbstractC21322p.m21678L(str, ':', length, false, 4) + 1, AbstractC21322p.m21678L(str, '@', 0, false, 6));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public final String m19021b() {
        int length = this.f55286a.length() + 3;
        String str = this.f55294i;
        int iM21678L = AbstractC21322p.m21678L(str, '/', length, false, 4);
        String strSubstring = str.substring(iM21678L, AbstractC17708b.m19415g(str, iM21678L, str.length(), "?#"));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m19022c() {
        int length = this.f55286a.length() + 3;
        String str = this.f55294i;
        int iM21678L = AbstractC21322p.m21678L(str, '/', length, false, 4);
        int iM19415g = AbstractC17708b.m19415g(str, iM21678L, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM21678L < iM19415g) {
            int i10 = iM21678L + 1;
            int iM19414f = AbstractC17708b.m19414f(str, '/', i10, iM19415g);
            String strSubstring = str.substring(i10, iM19414f);
            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM21678L = iM19414f;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m19023d() {
        if (this.f55292g == null) {
            return null;
        }
        String str = this.f55294i;
        int iM21678L = AbstractC21322p.m21678L(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iM21678L, AbstractC17708b.m19414f(str, '#', iM21678L, str.length()));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final String m19024e() {
        if (this.f55287b.length() == 0) {
            return "";
        }
        int length = this.f55286a.length() + 3;
        String str = this.f55294i;
        String strSubstring = str.substring(length, AbstractC17708b.m19415g(str, length, str.length(), ":@"));
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17349p) && AbstractC16544l.m18089b(((C17349p) obj).f55294i, this.f55294i);
    }

    /* JADX INFO: renamed from: f */
    public final C13187c m19025f() {
        int i10;
        C13187c c13187c = new C13187c(1);
        String scheme = this.f55286a;
        c13187c.f41847e = scheme;
        c13187c.f41848f = m19024e();
        c13187c.f41849g = m19020a();
        c13187c.f41850h = this.f55289d;
        AbstractC16544l.m18094g(scheme, "scheme");
        if (scheme.equals("http")) {
            i10 = 80;
        } else {
            i10 = scheme.equals("https") ? 443 : -1;
        }
        int i11 = this.f55290e;
        c13187c.f41844b = i11 != i10 ? i11 : -1;
        ArrayList arrayList = c13187c.f41845c;
        arrayList.clear();
        arrayList.addAll(m19022c());
        String strM19023d = m19023d();
        String strSubstring = null;
        c13187c.f41846d = strM19023d != null ? C17335b.m18997g(C17335b.m18994c(strM19023d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f55293h != null) {
            String str = this.f55294i;
            strSubstring = str.substring(AbstractC21322p.m21678L(str, '#', 0, false, 6) + 1);
            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        c13187c.f41851i = strSubstring;
        return c13187c;
    }

    /* JADX INFO: renamed from: g */
    public final C13187c m19026g(String link) {
        AbstractC16544l.m18094g(link, "link");
        try {
            C13187c c13187c = new C13187c(1);
            c13187c.m14844f(this, link);
            return c13187c;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m19027h() {
        C13187c c13187cM19026g = m19026g("/...");
        AbstractC16544l.m18091d(c13187cM19026g);
        c13187cM19026g.f41848f = C17335b.m18994c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        c13187cM19026g.f41849g = C17335b.m18994c("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return c13187cM19026g.m14841c().f55294i;
    }

    public final int hashCode() {
        return this.f55294i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final URI m19028i() {
        String strReplaceAll;
        C13187c c13187cM19025f = m19025f();
        String str = (String) c13187cM19025f.f41850h;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC16544l.m18093f(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c13187cM19025f.f41850h = strReplaceAll;
        ArrayList arrayList = c13187cM19025f.f41845c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, C17335b.m18994c((String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = c13187cM19025f.f41846d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = (String) arrayList2.get(i11);
                arrayList2.set(i11, str2 != null ? C17335b.m18994c(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = (String) c13187cM19025f.f41851i;
        c13187cM19025f.f41851i = str3 != null ? C17335b.m18994c(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = c13187cM19025f.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC16544l.m18093f(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC16544l.m18093f(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC16544l.m18093f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f55294i;
    }
}
