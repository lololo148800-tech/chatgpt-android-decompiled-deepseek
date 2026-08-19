package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C18151N implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57899a;

    public C18151N(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f57899a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18151N) && AbstractC16544l.m18089b(this.f57899a, ((C18151N) obj).f57899a);
    }

    public final int hashCode() {
        return this.f57899a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
