package to;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0678l;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: to.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20013d {

    /* JADX INFO: renamed from: a */
    public static final C20011b[] f63348a;

    /* JADX INFO: renamed from: b */
    public static final Map f63349b;

    /* JADX INFO: renamed from: a */
    public static void m20812a(C0678l name) throws IOException {
        AbstractC16544l.m18094g(name, "name");
        int iMo1372d = name.mo1372d();
        for (int i10 = 0; i10 < iMo1372d; i10++) {
            byte bMo1376i = name.mo1376i(i10);
            if (65 <= bMo1376i && bMo1376i < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.m1452r()));
            }
        }
    }

    static {
        C20011b c20011b = new C20011b(C20011b.f63335i, "");
        C0678l c0678l = C20011b.f63332f;
        C20011b c20011b2 = new C20011b(c0678l, "GET");
        C20011b c20011b3 = new C20011b(c0678l, "POST");
        C0678l c0678l2 = C20011b.f63333g;
        C20011b c20011b4 = new C20011b(c0678l2, Separators.SLASH);
        C20011b c20011b5 = new C20011b(c0678l2, "/index.html");
        C0678l c0678l3 = C20011b.f63334h;
        C20011b c20011b6 = new C20011b(c0678l3, "http");
        C20011b c20011b7 = new C20011b(c0678l3, "https");
        C0678l c0678l4 = C20011b.f63331e;
        C20011b[] c20011bArr = {c20011b, c20011b2, c20011b3, c20011b4, c20011b5, c20011b6, c20011b7, new C20011b(c0678l4, "200"), new C20011b(c0678l4, "204"), new C20011b(c0678l4, "206"), new C20011b(c0678l4, "304"), new C20011b(c0678l4, "400"), new C20011b(c0678l4, "404"), new C20011b(c0678l4, "500"), new C20011b("accept-charset", ""), new C20011b(FpwNpGDhomXHZ.TSurmpdXQls, "gzip, deflate"), new C20011b("accept-language", ""), new C20011b("accept-ranges", ""), new C20011b("accept", ""), new C20011b("access-control-allow-origin", ""), new C20011b("age", ""), new C20011b("allow", ""), new C20011b("authorization", ""), new C20011b("cache-control", ""), new C20011b("content-disposition", ""), new C20011b("content-encoding", ""), new C20011b("content-language", ""), new C20011b("content-length", ""), new C20011b("content-location", ""), new C20011b("content-range", ""), new C20011b("content-type", ""), new C20011b(ParameterNames.COOKIE, ""), new C20011b("date", ""), new C20011b("etag", ""), new C20011b("expect", ""), new C20011b("expires", ""), new C20011b("from", ""), new C20011b("host", ""), new C20011b("if-match", ""), new C20011b("if-modified-since", ""), new C20011b("if-none-match", ""), new C20011b("if-range", ""), new C20011b("if-unmodified-since", ""), new C20011b("last-modified", ""), new C20011b("link", ""), new C20011b("location", ""), new C20011b("max-forwards", ""), new C20011b("proxy-authenticate", ""), new C20011b("proxy-authorization", ""), new C20011b("range", ""), new C20011b("referer", ""), new C20011b("refresh", ""), new C20011b("retry-after", ""), new C20011b("server", ""), new C20011b("set-cookie", ""), new C20011b("strict-transport-security", ""), new C20011b("transfer-encoding", ""), new C20011b("user-agent", ""), new C20011b("vary", ""), new C20011b("via", ""), new C20011b("www-authenticate", "")};
        f63348a = c20011bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(c20011bArr[i10].f63336a)) {
                linkedHashMap.put(c20011bArr[i10].f63336a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        AbstractC16544l.m18093f(mapUnmodifiableMap, "unmodifiableMap(result)");
        f63349b = mapUnmodifiableMap;
    }
}
