package p837ji;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import ao.C11158d;
import bo.C11527o;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: ji.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16213b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1436k f50305Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ double f50306Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f50307o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f50308p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ float f50309q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Double f50310r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Double f50311s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16213b(InterfaceC1436k interfaceC1436k, double d10, ArrayList arrayList, boolean z6, float f10, Double d11, Double d12) {
        super(1);
        this.f50305Y = interfaceC1436k;
        this.f50306Z = d10;
        this.f50307o0 = arrayList;
        this.f50308p0 = z6;
        this.f50309q0 = f10;
        this.f50310r0 = d11;
        this.f50311s0 = d12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Double d10;
        Context context = (Context) obj;
        AbstractC16544l.m18094g(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.addJavascriptInterface(new C16219h(this.f50305Y), "AndroidInterface");
        Uri.Builder builderBuildUpon = Uri.parse("file:///android_asset/mapbox.html").buildUpon();
        Double d11 = this.f50310r0;
        if (d11 != null && (d10 = this.f50311s0) != null) {
            builderBuildUpon.appendQueryParameter("latitude", d11.toString());
            builderBuildUpon.appendQueryParameter("longitude", d10.toString());
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("zoom", String.valueOf(this.f50306Z));
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        webView.loadUrl(builderAppendQueryParameter.appendQueryParameter("markers", Uri.encode(c11527o.m12905d(new C11158d(C16218g.Companion.serializer(), 0), this.f50307o0))).appendQueryParameter("interactive", String.valueOf(this.f50308p0)).appendQueryParameter("bottomPadding", String.valueOf(this.f50309q0)).build().toString());
        return webView;
    }
}
