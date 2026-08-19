package p1084wg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import vg.EnumC20615b;

/* JADX INFO: renamed from: wg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20952g implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final EnumC20615b f66733a;

    public C20952g(EnumC20615b sanctionStatus) {
        AbstractC16544l.m18094g(sanctionStatus, "sanctionStatus");
        this.f66733a = sanctionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20952g) && this.f66733a == ((C20952g) obj).f66733a;
    }

    public final int hashCode() {
        return this.f66733a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
