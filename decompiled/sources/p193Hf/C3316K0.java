package p193Hf;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8160o6;

/* JADX INFO: renamed from: Hf.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3316K0 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3324O0 f10101a;

    public C3316K0(C3324O0 c3324o0) {
        this.f10101a = c3324o0;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC16544l.m18094g(consoleMessage, "consoleMessage");
        AbstractC8160o6.m8726a(this.f10101a.f10137p0, "Console message: " + consoleMessage.message(), null, 6);
        return true;
    }
}
