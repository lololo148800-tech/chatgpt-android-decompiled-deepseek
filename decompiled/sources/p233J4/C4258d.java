package p233J4;

import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: J4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4258d extends RuntimeException {

    /* JADX INFO: renamed from: Y */
    public final int f13907Y;

    /* JADX INFO: renamed from: Z */
    public final Throwable f13908Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4258d(int i10, Throwable th2) {
        super(th2);
        AbstractC14376f.m15825D(i10, "callbackName");
        this.f13907Y = i10;
        this.f13908Z = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f13908Z;
    }
}
