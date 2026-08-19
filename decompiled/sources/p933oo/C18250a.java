package p933oo;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import mo.C17326C;
import mo.C17327D;

/* JADX INFO: renamed from: oo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18250a {
    /* JADX INFO: renamed from: a */
    public static final C17327D m19771a(C17327D c17327d) {
        if ((c17327d != null ? c17327d.f55179s0 : null) == null) {
            return c17327d;
        }
        C17326C c17326cM18986e = c17327d.m18986e();
        c17326cM18986e.f55166g = null;
        return c17326cM18986e.m18984a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19772b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || SIPHeaderNames.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || SIPHeaderNames.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
