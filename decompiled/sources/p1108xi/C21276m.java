package p1108xi;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8160o6;

/* JADX INFO: renamed from: xi.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C21276m extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f67666a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5985X f67667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5985X f67668c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3430e f67669d;

    public C21276m(long j10, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, C3430e c3430e) {
        this.f67666a = j10;
        this.f67667b = interfaceC5985X;
        this.f67668c = interfaceC5985X2;
        this.f67669d = c3430e;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(url, "url");
        this.f67667b.setValue(Long.valueOf(System.currentTimeMillis() - this.f67666a));
        this.f67668c.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(failingUrl, "failingUrl");
        AbstractC8160o6.m8728c(this.f67669d, "Unable to load syntax highlighting: " + description + " (" + i10 + ").", null, null, 6);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest request, WebResourceError error) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(error, "error");
        CharSequence description = error.getDescription();
        AbstractC8160o6.m8728c(this.f67669d, "Unable to load syntax highlighting: " + ((Object) description) + " (" + error.getErrorCode() + ").", null, null, 6);
    }
}
