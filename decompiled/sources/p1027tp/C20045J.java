package p1027tp;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17335b;
import mo.C17348o;
import mo.C17349p;
import mo.C17352s;
import mo.C17353t;
import mo.C17354u;
import p228J.C3847l0;
import p571X9.AbstractC9282f0;
import p571X9.AbstractC9306j0;
import p658b5.C11232c;
import p658b5.C11242m;
import p712dp.C13187c;
import p791hj.C14522e;

/* JADX INFO: renamed from: tp.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C20045J {

    /* JADX INFO: renamed from: l */
    public static final char[] f63476l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f63477m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f63478a;

    /* JADX INFO: renamed from: b */
    public final C17349p f63479b;

    /* JADX INFO: renamed from: c */
    public String f63480c;

    /* JADX INFO: renamed from: d */
    public C13187c f63481d;

    /* JADX INFO: renamed from: e */
    public final C14522e f63482e = new C14522e(3);

    /* JADX INFO: renamed from: f */
    public final C3847l0 f63483f;

    /* JADX INFO: renamed from: g */
    public C17352s f63484g;

    /* JADX INFO: renamed from: h */
    public final boolean f63485h;

    /* JADX INFO: renamed from: i */
    public final C11242m f63486i;

    /* JADX INFO: renamed from: j */
    public final C11232c f63487j;

    /* JADX INFO: renamed from: k */
    public AbstractC17325B f63488k;

    public C20045J(String str, C17349p c17349p, String str2, C17348o c17348o, C17352s c17352s, boolean z6, boolean z10, boolean z11) {
        this.f63478a = str;
        this.f63479b = c17349p;
        this.f63480c = str2;
        this.f63484g = c17352s;
        this.f63485h = z6;
        if (c17348o != null) {
            this.f63483f = c17348o.m19016q();
        } else {
            this.f63483f = new C3847l0(3);
        }
        if (z10) {
            this.f63487j = new C11232c(14);
            return;
        }
        if (z11) {
            C11242m c11242m = new C11242m(24);
            this.f63486i = c11242m;
            C17352s type = C17354u.f55305f;
            AbstractC16544l.m18094g(type, "type");
            if (type.f55299b.equals("multipart")) {
                c11242m.f34019Z = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20861a(String name, String str, boolean z6) {
        C11232c c11232c = this.f63487j;
        if (z6) {
            c11232c.getClass();
            AbstractC16544l.m18094g(name, "name");
            ((ArrayList) c11232c.f33996Y).add(C17335b.m18994c(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            ((ArrayList) c11232c.f33997Z).add(C17335b.m18994c(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        c11232c.getClass();
        AbstractC16544l.m18094g(name, "name");
        ((ArrayList) c11232c.f33996Y).add(C17335b.m18994c(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        ((ArrayList) c11232c.f33997Z).add(C17335b.m18994c(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    /* JADX INFO: renamed from: b */
    public final void m20862b(String str, String str2) {
        if (!SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.f63483f.m4574a(str, str2);
            return;
        }
        try {
            Pattern pattern = C17352s.f55296e;
            this.f63484g = AbstractC9282f0.m9857c(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(AbstractC9306j0.m9889h("Malformed content type: ", str2), e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20863c(C17348o c17348o, AbstractC17325B body) {
        C11242m c11242m = this.f63486i;
        c11242m.getClass();
        AbstractC16544l.m18094g(body, "body");
        if (c17348o.m19012f(SIPHeaderNames.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c17348o.m19012f(SIPHeaderNames.CONTENT_LENGTH) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) c11242m.f34020o0).add(new C17353t(c17348o, body));
    }

    /* JADX INFO: renamed from: d */
    public final void m20864d(String encodedName, String str, boolean z6) {
        String str2 = this.f63480c;
        if (str2 != null) {
            C17349p c17349p = this.f63479b;
            C13187c c13187cM19026g = c17349p.m19026g(str2);
            this.f63481d = c13187cM19026g;
            if (c13187cM19026g == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c17349p + ", Relative: " + this.f63480c);
            }
            this.f63480c = null;
        }
        if (!z6) {
            this.f63481d.m14840b(encodedName, str);
            return;
        }
        C13187c c13187c = this.f63481d;
        c13187c.getClass();
        AbstractC16544l.m18094g(encodedName, "encodedName");
        if (c13187c.f41846d == null) {
            c13187c.f41846d = new ArrayList();
        }
        ArrayList arrayList = c13187c.f41846d;
        AbstractC16544l.m18091d(arrayList);
        arrayList.add(C17335b.m18994c(encodedName, 0, 0, wNrQXvwLiB.UsIAEJNOe, true, false, true, false, 211));
        ArrayList arrayList2 = c13187c.f41846d;
        AbstractC16544l.m18091d(arrayList2);
        arrayList2.add(str != null ? C17335b.m18994c(str, 0, 0, " \"'<>#&=", true, false, true, false, 211) : null);
    }
}
