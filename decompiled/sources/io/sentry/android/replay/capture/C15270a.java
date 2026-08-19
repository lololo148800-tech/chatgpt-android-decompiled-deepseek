package io.sentry.android.replay.capture;

import io.sentry.ThreadFactoryC15522y;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15270a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public static final C15270a f47688Y = new C15270a(0);

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15522y(4));
    }
}
