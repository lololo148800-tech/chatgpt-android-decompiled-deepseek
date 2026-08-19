package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C18158V implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57909a;

    public C18158V(C7351f0 c7351f0) {
        this.f57909a = c7351f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18158V) && AbstractC16544l.m18089b(this.f57909a, ((C18158V) obj).f57909a);
    }

    public final int hashCode() {
        C7351f0 c7351f0 = this.f57909a;
        if (c7351f0 == null) {
            return 0;
        }
        return c7351f0.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
