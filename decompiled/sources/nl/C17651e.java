package nl;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: nl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17651e extends IllegalArgumentException {

    /* JADX INFO: renamed from: Y */
    public final String f56438Y;

    /* JADX INFO: renamed from: Z */
    public final Throwable f56439Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17651e(String message) {
        super(message, null);
        AbstractC16544l.m18094g(message, "message");
        this.f56438Y = message;
        this.f56439Z = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f56439Z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f56438Y;
    }
}
