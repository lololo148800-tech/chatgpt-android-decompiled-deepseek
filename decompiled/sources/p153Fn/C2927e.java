package p153Fn;

import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Fn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2927e extends RuntimeException {

    /* JADX INFO: renamed from: Y */
    public final transient InterfaceC18776i f8771Y;

    public C2927e(InterfaceC18776i interfaceC18776i) {
        this.f8771Y = interfaceC18776i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f8771Y);
    }
}
