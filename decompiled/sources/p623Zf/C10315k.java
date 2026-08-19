package p623Zf;

import ec.AbstractC13361c;
import ga.C13834b;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10315k extends AbstractC10316l {

    /* JADX INFO: renamed from: a */
    public final AbstractC13361c f30628a;

    /* JADX INFO: renamed from: b */
    public final C13834b f30629b;

    public C10315k(AbstractC13361c abstractC13361c, C13834b c13834b) {
        this.f30628a = abstractC13361c;
        this.f30629b = c13834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10315k)) {
            return false;
        }
        C10315k c10315k = (C10315k) obj;
        return AbstractC16544l.m18089b(this.f30628a, c10315k.f30628a) && AbstractC16544l.m18089b(this.f30629b, c10315k.f30629b);
    }

    public final int hashCode() {
        int iHashCode = this.f30628a.hashCode() * 31;
        C13834b c13834b = this.f30629b;
        return iHashCode + (c13834b == null ? 0 : c13834b.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
