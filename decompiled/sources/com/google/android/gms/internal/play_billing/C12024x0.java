package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12024x0 {

    /* JADX INFO: renamed from: a */
    public final C11967j f36352a = new C11967j();

    /* JADX INFO: renamed from: b */
    public final String f36353b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f36354c;

    public C12024x0(Class cls) {
        this.f36353b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m13556a() {
        Logger logger = this.f36354c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f36352a) {
            try {
                Logger logger2 = this.f36354c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f36353b);
                this.f36354c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
