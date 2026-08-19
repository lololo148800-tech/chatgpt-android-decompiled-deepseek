package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C18183t implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f57997a;

    public C18183t(C7351f0 message) {
        AbstractC16544l.m18094g(message, "message");
        this.f57997a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18183t) && AbstractC16544l.m18089b(this.f57997a, ((C18183t) obj).f57997a);
    }

    public final int hashCode() {
        return this.f57997a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
