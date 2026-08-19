package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C18155S implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57906a;

    public C18155S(C7351f0 c7351f0) {
        this.f57906a = c7351f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18155S) && AbstractC16544l.m18089b(this.f57906a, ((C18155S) obj).f57906a);
    }

    public final int hashCode() {
        C7351f0 c7351f0 = this.f57906a;
        if (c7351f0 == null) {
            return 0;
        }
        return c7351f0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
