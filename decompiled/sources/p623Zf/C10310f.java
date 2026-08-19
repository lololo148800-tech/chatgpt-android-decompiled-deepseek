package p623Zf;

import ec.AbstractC13361c;
import ga.C13834b;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10310f {

    /* JADX INFO: renamed from: a */
    public final AbstractC13361c f30611a;

    /* JADX INFO: renamed from: b */
    public final C13834b f30612b;

    public C10310f(AbstractC13361c abstractC13361c, C13834b c13834b) {
        this.f30611a = abstractC13361c;
        this.f30612b = c13834b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10310f)) {
            return false;
        }
        C10310f c10310f = (C10310f) obj;
        return AbstractC16544l.m18089b(this.f30611a, c10310f.f30611a) && AbstractC16544l.m18089b(this.f30612b, c10310f.f30612b);
    }

    public final int hashCode() {
        int iHashCode = this.f30611a.hashCode() * 31;
        C13834b c13834b = this.f30612b;
        return iHashCode + (c13834b == null ? 0 : c13834b.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
