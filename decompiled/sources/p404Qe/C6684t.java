package p404Qe;

import kotlin.jvm.internal.AbstractC16544l;
import p1040ue.InterfaceC20203a;

/* JADX INFO: renamed from: Qe.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6684t implements InterfaceC20203a {

    /* JADX INFO: renamed from: a */
    public final String f21494a;

    public C6684t(String fileId) {
        AbstractC16544l.m18094g(fileId, "fileId");
        this.f21494a = fileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6684t) {
            return AbstractC16544l.m18089b(this.f21494a, ((C6684t) obj).f21494a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21494a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
