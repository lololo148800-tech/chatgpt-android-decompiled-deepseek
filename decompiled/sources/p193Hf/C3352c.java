package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Hf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3352c implements InterfaceC3364g {

    /* JADX INFO: renamed from: a */
    public final Throwable f10241a;

    public C3352c(Throwable exception) {
        AbstractC16544l.m18094g(exception, "exception");
        this.f10241a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3352c) && AbstractC16544l.m18089b(this.f10241a, ((C3352c) obj).f10241a);
    }

    public final int hashCode() {
        return this.f10241a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
