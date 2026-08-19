package re;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p364Oh.AbstractC6224C;

/* JADX INFO: renamed from: re.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C18973z implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final AbstractC6224C f60527a;

    public C18973z(AbstractC6224C abstractC6224C) {
        this.f60527a = abstractC6224C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18973z) && AbstractC16544l.m18089b(this.f60527a, ((C18973z) obj).f60527a);
    }

    public final int hashCode() {
        AbstractC6224C abstractC6224C = this.f60527a;
        if (abstractC6224C == null) {
            return 0;
        }
        return abstractC6224C.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
