package io.sentry;

import io.sentry.android.core.internal.util.C15231c;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.x */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC15519x implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48473a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f48473a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return C15231c.f47528b.m16439a();
        }
    }
}
