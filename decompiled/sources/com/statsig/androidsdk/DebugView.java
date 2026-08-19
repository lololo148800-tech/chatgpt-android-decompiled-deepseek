package com.statsig.androidsdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.gov.nist.core.Separators;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p214Ib.C3669l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m18067d2 = {"Lcom/statsig/androidsdk/DebugView;", "", "()V", "Companion", "DebugWebChromeClient", "DebugWebViewClient", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DebugView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m18067d2 = {"Lcom/statsig/androidsdk/DebugView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "client", "Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "chromeClient", "Landroid/webkit/WebView;", "getConfiguredWebView", "(Landroid/content/Context;Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;)Landroid/webkit/WebView;", "", "sdkKey", "", "state", "Lkotlin/Function1;", "", "Lmm/C;", "Lcom/statsig/androidsdk/DebugViewCallback;", "callback", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;LBm/k;)V", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WebView getConfiguredWebView(Context context, DebugWebViewClient client, DebugWebChromeClient chromeClient) {
            WebView webView = new WebView(context);
            webView.setWebViewClient(client);
            webView.setWebChromeClient(chromeClient);
            webView.setSystemUiVisibility(2);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setJavaScriptEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            return webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: show$lambda-0, reason: not valid java name */
        public static final boolean m22533show$lambda0(WebView webView, Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            String str;
            AbstractC16544l.m18094g(webView, "$webView");
            AbstractC16544l.m18094g(dialog, "$dialog");
            if (i10 != 4 || keyEvent.getAction() != 1 || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            String url = webView.getUrl();
            Boolean boolValueOf = null;
            List listM21697e0 = url == null ? null : AbstractC21322p.m21697e0(url, new String[]{Separators.SLASH}, 0, 6);
            if (listM21697e0 != null && (str = (String) AbstractC17680n.m19351a0(listM21697e0)) != null) {
                boolValueOf = Boolean.valueOf(AbstractC21329w.m21734u(str, "client_sdk_debugger", false));
            }
            if (AbstractC16544l.m18089b(boolValueOf, Boolean.TRUE)) {
                dialog.dismiss();
            }
            return true;
        }

        public final void show(Context context, String sdkKey, Map<String, ? extends Object> state, InterfaceC1436k callback) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(sdkKey, "sdkKey");
            AbstractC16544l.m18094g(state, "state");
            final Dialog dialog = new Dialog(context, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
            String strM4375i = new C3669l().m4375i(state);
            AbstractC16544l.m18093f(strM4375i, "Gson().toJson(state)");
            final WebView configuredWebView = getConfiguredWebView(context, new DebugWebViewClient(strM4375i), new DebugWebChromeClient(dialog, callback));
            dialog.requestWindowFeature(1);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.statsig.androidsdk.a
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    return DebugView.Companion.m22533show$lambda0(configuredWebView, dialog, dialogInterface, i10, keyEvent);
                }
            });
            configuredWebView.loadUrl(AbstractC16544l.m18100m(sdkKey, "https://console.statsig.com/client_sdk_debugger_redirect?sdkKey="));
            dialog.setContentView(configuredWebView);
            dialog.show();
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setLayout(-1, -1);
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m18067d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/app/Dialog;", "dialog", "Lkotlin/Function1;", "", "Lmm/C;", "Lcom/statsig/androidsdk/DebugViewCallback;", "callback", "<init>", "(Landroid/app/Dialog;LBm/k;)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/app/Dialog;", "LBm/k;", "", "closeAction", "Ljava/lang/String;", "reloadRequired", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DebugWebChromeClient extends WebChromeClient {
        private final InterfaceC1436k callback;
        private final String closeAction;
        private final Dialog dialog;
        private final String reloadRequired;

        public DebugWebChromeClient(Dialog dialog, InterfaceC1436k interfaceC1436k) {
            AbstractC16544l.m18094g(dialog, "dialog");
            this.dialog = dialog;
            this.callback = interfaceC1436k;
            this.closeAction = "STATSIG_ANDROID_DEBUG_CLOSE_DIALOG";
            this.reloadRequired = "STATSIG_ANDROID_DEBUG_RELOAD_REQUIRED";
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String strMessage;
            InterfaceC1436k interfaceC1436k;
            if (consoleMessage != null && (strMessage = consoleMessage.message()) != null) {
                if (AbstractC21329w.m21723j(this.closeAction, strMessage)) {
                    this.dialog.dismiss();
                }
                if (AbstractC21329w.m21723j(this.reloadRequired, strMessage) && (interfaceC1436k = this.callback) != null) {
                    interfaceC1436k.invoke(Boolean.TRUE);
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "Landroid/webkit/WebViewClient;", "", "json", "<init>", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "url", "Lmm/C;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Ljava/lang/String;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DebugWebViewClient extends WebViewClient {
        private final String json;

        public DebugWebViewClient(String json) {
            AbstractC16544l.m18094g(json, "json");
            this.json = json;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (view != null) {
                view.evaluateJavascript("window.__StatsigAndroidDebug=true;", null);
            }
            String strM9892k = AbstractC9306j0.m9892k(new StringBuilder("window.__StatsigClientState = "), this.json, ';');
            if (view == null) {
                return;
            }
            view.evaluateJavascript(strM9892k, null);
        }
    }
}
