package p623Zf;

import ec.AbstractC13361c;
import ga.C13834b;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C10320p extends AbstractC10323s {

    /* JADX INFO: renamed from: a */
    public final AbstractC13361c f30633a;

    /* JADX INFO: renamed from: b */
    public final C13834b f30634b;

    public C10320p(AbstractC13361c abstractC13361c, C13834b c13834b) {
        this.f30633a = abstractC13361c;
        this.f30634b = c13834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10320p)) {
            return false;
        }
        C10320p c10320p = (C10320p) obj;
        return AbstractC16544l.m18089b(this.f30633a, c10320p.f30633a) && AbstractC16544l.m18089b(this.f30634b, c10320p.f30634b);
    }

    public final int hashCode() {
        int iHashCode = this.f30633a.hashCode() * 31;
        C13834b c13834b = this.f30634b;
        return iHashCode + (c13834b == null ? 0 : c13834b.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
