package p837ji;

import android.webkit.WebView;
import ao.C11158d;
import bo.C11527o;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p929oi.AbstractC18201b;

/* JADX INFO: renamed from: ji.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C16214c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Double f50312Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Double f50313Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ double f50314o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ArrayList f50315p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16214c(Double d10, Double d11, double d12, ArrayList arrayList) {
        super(1);
        this.f50312Y = d10;
        this.f50313Z = d11;
        this.f50314o0 = d12;
        this.f50315p0 = arrayList;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Double d10;
        WebView webView = (WebView) obj;
        AbstractC16544l.m18094g(webView, "webView");
        Double d11 = this.f50312Y;
        if (d11 != null && (d10 = this.f50313Z) != null) {
            webView.loadUrl("javascript:updateCamera(" + d10 + ", " + d11 + ", " + this.f50314o0 + ");");
        }
        C11527o c11527o = AbstractC18201b.f58034a;
        c11527o.getClass();
        webView.loadUrl("javascript:updateMarkers(" + c11527o.m12905d(new C11158d(C16218g.Companion.serializer(), 0), this.f50315p0) + ");");
        return C17296C.f55119a;
    }
}
