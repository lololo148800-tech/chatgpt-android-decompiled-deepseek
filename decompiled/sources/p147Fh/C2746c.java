package p147Fh;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p195Hh.C3430e;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8160o6;

/* JADX INFO: renamed from: Fh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2746c extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5985X f8422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3430e f8423b;

    public C2746c(C3430e c3430e, InterfaceC5985X interfaceC5985X) {
        this.f8422a = interfaceC5985X;
        this.f8423b = c3430e;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(url, "url");
        this.f8422a.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(error, "error");
        CharSequence description = error.getDescription();
        AbstractC8160o6.m8728c(this.f8423b, "Unable to load latex: " + ((Object) description) + " (" + error.getErrorCode() + ").", null, null, 6);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        String path;
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(request, "request");
        Uri url = request.getUrl();
        if (AbstractC16544l.m18089b(url.getHost(), "cdn.jsdelivr.net") && (path = url.getPath()) != null && AbstractC21329w.m21734u(path, "/npm/katex", false)) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", null);
    }
}
