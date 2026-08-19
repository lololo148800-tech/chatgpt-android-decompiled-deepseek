package p193Hf;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import mm.C17312o;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17352s;
import mo.C17355v;
import mo.C17356w;
import p1113xn.AbstractC21322p;
import p195Hh.C3430e;
import p200Hm.C3508g;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p791hj.C14522e;
import p857kl.C16440G;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Hf.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3314J0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3324O0 f10097a;

    public C3314J0(C3324O0 c3324o0) {
        this.f10097a = c3324o0;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(error, "error");
        String string = request.getUrl().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        C3324O0 c3324o0 = this.f10097a;
        boolean zEquals = string.equals(c3324o0.f10139r0);
        C3430e c3430e = c3324o0.f10137p0;
        if (!zEquals && !AbstractC21322p.m21667A(string, c3324o0.f10138q0, false)) {
            CharSequence description = error.getDescription();
            AbstractC8160o6.m8726a(c3430e, "onReceivedError: " + ((Object) description) + " (" + error.getErrorCode() + ").", null, 6);
            return;
        }
        C3324O0.m4166a(c3324o0, new IllegalStateException(error.getDescription().toString()));
        CharSequence description2 = error.getDescription();
        AbstractC8160o6.m8728c(c3430e, "onReceivedError: " + ((Object) description2) + " (" + error.getErrorCode() + ").", null, null, 6);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Object objM9806b;
        Charset charsetM19029a;
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(request, "request");
        String string = request.getUrl().toString();
        C3324O0 c3324o0 = this.f10097a;
        if (!AbstractC16544l.m18089b(string, c3324o0.f10139r0)) {
            return null;
        }
        String str = c3324o0.f10142u0;
        if (str == null) {
            C3324O0.m4166a(c3324o0, new IllegalStateException("No auth token provided"));
            return null;
        }
        String str2 = c3324o0.f10143v0;
        if (str2 == null) {
            C3324O0.m4166a(c3324o0, new IllegalStateException("No id token provided"));
            return null;
        }
        C17356w c17356w = new C17356w(new C17355v());
        C14522e c14522e = new C14522e(3);
        String string2 = request.getUrl().toString();
        AbstractC16544l.m18093f(string2, "toString(...)");
        c14522e.m16010B(string2);
        Map<String, String> requestHeaders = request.getRequestHeaders();
        AbstractC16544l.m18093f(requestHeaders, "getRequestHeaders(...)");
        for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC16544l.m18091d(key);
            AbstractC16544l.m18091d(value);
            c14522e.m16024r(key, value);
        }
        c14522e.m16024r(SIPHeaderNames.AUTHORIZATION, "Bearer ".concat(str));
        c14522e.m16024r("Authorization-ID-Token", str2);
        try {
            objM9806b = c17356w.m19035b(c14522e.m16017i()).m20063e();
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        C17327D c17327d = (C17327D) (objM9806b instanceof C17311n ? null : objM9806b);
        if (c17327d == null) {
            Throwable thM18979a = C17312o.m18979a(objM9806b);
            if (thM18979a == null) {
                thM18979a = new RuntimeException("Unknown error");
            }
            C3324O0.m4166a(c3324o0, thM18979a);
            return null;
        }
        int i10 = C16440G.f51010x0.f51013Y;
        int i11 = c17327d.f55176p0;
        if (i11 != i10) {
            C3508g c3508g = (C3508g) AbstractC3333T0.f10184a.getValue();
            int i12 = c3508g.f10591Y;
            if (i11 > c3508g.f10592Z || i12 > i11) {
                AbstractC17329F abstractC17329F = c17327d.f55179s0;
                C17352s c17352sMo18990e = abstractC17329F != null ? abstractC17329F.mo18990e() : null;
                String str3 = c17352sMo18990e == null ? null : c17352sMo18990e.f55299b + Separators.SLASH + c17352sMo18990e.f55300c;
                String strName = (c17352sMo18990e == null || (charsetM19029a = c17352sMo18990e.m19029a(Charset.defaultCharset())) == null) ? null : charsetM19029a.name();
                String str4 = c17327d.f55175o0;
                return new WebResourceResponse(str3, strName, i11, AbstractC21322p.m21681O(str4) ? "Unknown error" : str4, AbstractC17659D.m19253o(c17327d.f55178r0), abstractC17329F != null ? abstractC17329F.mo18988O0().mo1349T0() : null);
            }
        }
        C16440G c16440g = (C16440G) C16440G.f51012z0.get(Integer.valueOf(i11));
        if (c16440g == null) {
            c16440g = new C16440G(i11, "Unknown Status Code");
        }
        C3324O0.m4166a(c3324o0, new IllegalStateException(c16440g.f51014Z));
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(request, "request");
        C3324O0.m4166a(this.f10097a, new IllegalStateException("WebView cannot navigate to " + request.getUrl()));
        return true;
    }
}
