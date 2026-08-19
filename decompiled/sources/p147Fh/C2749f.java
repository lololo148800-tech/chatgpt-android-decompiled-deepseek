package p147Fh;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: Fh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2749f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2751h f8430a;

    public C2749f(C2751h c2751h) {
        this.f8430a = c2751h;
    }

    @JavascriptInterface
    public final void onSizeChanged(int i10, int i11) {
        C2751h c2751h = this.f8430a;
        c2751h.post(new RunnableC2748e(c2751h, i10, i11, 0));
    }
}
