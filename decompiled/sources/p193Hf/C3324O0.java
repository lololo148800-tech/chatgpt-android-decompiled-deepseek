package p193Hf;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Hf.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3324O0 extends WebView {

    /* JADX INFO: renamed from: o0 */
    public boolean f10136o0;

    /* JADX INFO: renamed from: p0 */
    public final C3430e f10137p0;

    /* JADX INFO: renamed from: q0 */
    public String f10138q0;

    /* JADX INFO: renamed from: r0 */
    public String f10139r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC1436k f10140s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC1436k f10141t0;

    /* JADX INFO: renamed from: u0 */
    public String f10142u0;

    /* JADX INFO: renamed from: v0 */
    public String f10143v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3324O0(Context context, boolean z6) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        this.f10136o0 = z6;
        this.f10137p0 = AbstractC8168p6.m8749b("CanmoreWebView", null);
        this.f10138q0 = "";
        this.f10139r0 = "";
        this.f10140s0 = C3317L.f10115w0;
        this.f10141t0 = C3317L.f10116x0;
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        setBackgroundColor(0);
        setWebViewClient(new C3314J0(this));
        setWebChromeClient(new C3316K0(this));
        addJavascriptInterface(new C3318L0(this), "CanmoreNative");
        loadUrl(this.f10139r0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4166a(C3324O0 c3324o0, Throwable th2) {
        AbstractC8160o6.m8726a(c3324o0.f10137p0, "WebView failure", th2, 4);
        c3324o0.f10140s0.invoke(th2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m4167b(boolean z6, String str, String str2, String str3, String str4, String str5, List list, InterfaceC18770c interfaceC18770c) {
        C3320M0 c3320m0;
        C3324O0 c3324o0;
        if (interfaceC18770c instanceof C3320M0) {
            c3320m0 = (C3320M0) interfaceC18770c;
            int i10 = c3320m0.f10126p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3320m0.f10126p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3320m0 = new C3320M0(this, interfaceC18770c);
            }
        } else {
            c3320m0 = new C3320M0(this, interfaceC18770c);
        }
        C3320M0 c3320m1 = c3320m0;
        Object obj = c3320m1.f10124Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3320m1.f10126p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f10136o0 = z6;
            this.f10142u0 = str2;
            this.f10143v0 = str3;
            this.f10138q0 = str5;
            this.f10141t0.invoke(C3370i.INSTANCE);
            C3516e c3516e = AbstractC0593T.f1824a;
            ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
            C3322N0 c3322n0 = new C3322N0(str5, this, str, str4, list, null);
            c3320m1.f10123Y = this;
            c3320m1.f10126p0 = 1;
            if (AbstractC0575H.m1168P(executorC3515d, c3322n0, c3320m1) == enumC19250a) {
                return enumC19250a;
            }
            c3324o0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3324o0 = c3320m1.f10123Y;
            AbstractC9233X.m9807c(obj);
        }
        c3324o0.loadUrl(c3324o0.f10139r0);
        return C17296C.f55119a;
    }

    public final InterfaceC1436k getOnFailure() {
        return this.f10140s0;
    }

    public final InterfaceC1436k getOnMessage() {
        return this.f10141t0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f10136o0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10136o0) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnFailure(InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC1436k, "<set-?>");
        this.f10140s0 = interfaceC1436k;
    }

    public final void setOnMessage(InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC1436k, "<set-?>");
        this.f10141t0 = interfaceC1436k;
    }
}
