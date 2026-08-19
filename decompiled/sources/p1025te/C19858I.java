package p1025te;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.I */
/* JADX INFO: loaded from: classes3.dex */
public final class C19858I implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final String f62950a;

    public C19858I(String message) {
        AbstractC16544l.m18094g(message, "message");
        this.f62950a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19858I) && AbstractC16544l.m18089b(this.f62950a, ((C19858I) obj).f62950a);
    }

    public final int hashCode() {
        return this.f62950a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
