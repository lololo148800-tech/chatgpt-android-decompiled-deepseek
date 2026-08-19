package p1145z7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: z7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21809f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C21809f f69171Y = new C21809f(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String property = System.getProperty("os.arch");
        return property == null ? "unknown" : property;
    }
}
