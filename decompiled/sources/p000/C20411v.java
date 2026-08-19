package p000;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes.dex */
public final class C20411v extends Exception {

    /* JADX INFO: renamed from: Y */
    public final String f64532Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20411v(String message) {
        super(message);
        AbstractC16544l.m18094g(message, "message");
        this.f64532Y = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f64532Y;
    }
}
