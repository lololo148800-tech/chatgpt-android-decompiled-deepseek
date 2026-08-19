package ni;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ni.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C17633g extends Throwable {

    /* JADX INFO: renamed from: Y */
    public final String f56421Y;

    public C17633g(String message) {
        AbstractC16544l.m18094g(message, "message");
        this.f56421Y = message;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f56421Y;
    }
}
