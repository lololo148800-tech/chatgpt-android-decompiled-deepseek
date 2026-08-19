package p261K7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: K7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4548a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C4548a f14865Y = new C4548a(0);

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.";
    }
}
