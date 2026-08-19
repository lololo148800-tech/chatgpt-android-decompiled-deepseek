package p1126yd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yd.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C21454Z implements InterfaceC21409C {

    /* JADX INFO: renamed from: a */
    public final Throwable f68045a;

    public C21454Z(Throwable cause) {
        AbstractC16544l.m18094g(cause, "cause");
        this.f68045a = cause;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21454Z) && AbstractC16544l.m18089b(this.f68045a, ((C21454Z) obj).f68045a);
    }

    public final int hashCode() {
        return this.f68045a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
