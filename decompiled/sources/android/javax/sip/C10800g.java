package android.javax.sip;

import java.io.IOException;

/* JADX INFO: renamed from: android.javax.sip.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10800g extends Exception {

    /* JADX INFO: renamed from: Y */
    public IOException f32037Y;

    public C10800g(String str) {
        super(str);
        this.f32037Y = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f32037Y;
    }
}
