package p147Fh;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p195Hh.C3430e;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8160o6;

/* JADX INFO: renamed from: Fh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2747d extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3430e f8424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5985X f8425b;

    public C2747d(C3430e c3430e, InterfaceC5985X interfaceC5985X) {
        this.f8424a = c3430e;
        this.f8425b = interfaceC5985X;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC16544l.m18094g(consoleMessage, "consoleMessage");
        String strMessage = consoleMessage.message();
        AbstractC16544l.m18093f(strMessage, "message(...)");
        AbstractC8160o6.m8726a(this.f8424a, strMessage, null, 6);
        String strMessage2 = consoleMessage.message();
        AbstractC16544l.m18093f(strMessage2, "message(...)");
        if (!AbstractC21322p.m21667A(strMessage2, "KaTeX parse error", false)) {
            return true;
        }
        this.f8425b.setValue(Boolean.TRUE);
        return true;
    }
}
