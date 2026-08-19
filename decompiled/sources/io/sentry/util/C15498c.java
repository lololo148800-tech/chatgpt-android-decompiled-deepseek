package io.sentry.util;

/* JADX INFO: renamed from: io.sentry.util.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15498c {

    /* JADX INFO: renamed from: a */
    public volatile Object f48416a = null;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15497b f48417b;

    public C15498c(InterfaceC15497b interfaceC15497b) {
        this.f48417b = interfaceC15497b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m16684a() {
        if (this.f48416a == null) {
            synchronized (this) {
                try {
                    if (this.f48416a == null) {
                        this.f48416a = this.f48417b.mo5056g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48416a;
    }
}
