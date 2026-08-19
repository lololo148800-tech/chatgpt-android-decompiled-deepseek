package p926of;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C18139B implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final Set f57876a;

    public C18139B(Set set) {
        this.f57876a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18139B) && AbstractC16544l.m18089b(this.f57876a, ((C18139B) obj).f57876a);
    }

    public final int hashCode() {
        return this.f57876a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
