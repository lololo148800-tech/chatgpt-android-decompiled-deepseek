package p095Df;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p988rc.C18919g;

/* JADX INFO: renamed from: Df.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2043m {

    /* JADX INFO: renamed from: a */
    public static final C2042l f6253a = new C2042l(null);

    /* JADX INFO: renamed from: b */
    public static final C2041k f6254b = new C2041k(null);

    /* JADX INFO: renamed from: a */
    public static final void m3177a(C18919g c18919g, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(c18919g, "<this>");
        if (!z6) {
            interfaceC1436k.invoke(c18919g);
            return;
        }
        int iM20271d = c18919g.m20271d(z10 ? f6254b : f6253a);
        interfaceC1436k.invoke(c18919g);
        c18919g.m20270c(iM20271d);
    }
}
