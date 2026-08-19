package p772h;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: h.C */
/* JADX INFO: loaded from: classes.dex */
public final class C14212C {

    /* JADX INFO: renamed from: a */
    public static final C14212C f44634a = new C14212C();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m15515a(InterfaceC1436k onBackStarted, InterfaceC1436k onBackProgressed, InterfaceC1426a onBackInvoked, InterfaceC1426a onBackCancelled) {
        AbstractC16544l.m18094g(onBackStarted, "onBackStarted");
        AbstractC16544l.m18094g(onBackProgressed, "onBackProgressed");
        AbstractC16544l.m18094g(onBackInvoked, "onBackInvoked");
        AbstractC16544l.m18094g(onBackCancelled, "onBackCancelled");
        return new C14211B(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
