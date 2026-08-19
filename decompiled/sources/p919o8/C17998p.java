package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C17998p {

    /* JADX INFO: renamed from: a */
    public final C17879A f57470a;

    /* JADX INFO: renamed from: b */
    public final C18001q f57471b;

    public C17998p(C17879A c17879a, C18001q c18001q) {
        this.f57470a = c17879a;
        this.f57471b = c18001q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17998p)) {
            return false;
        }
        C17998p c17998p = (C17998p) obj;
        return AbstractC16544l.m18089b(this.f57470a, c17998p.f57470a) && AbstractC16544l.m18089b(this.f57471b, c17998p.f57471b);
    }

    public final int hashCode() {
        C17879A c17879a = this.f57470a;
        int iHashCode = (c17879a == null ? 0 : c17879a.hashCode()) * 31;
        C18001q c18001q = this.f57471b;
        return iHashCode + (c18001q != null ? c18001q.hashCode() : 0);
    }

    public final String toString() {
        return "DdAction(position=" + this.f57470a + ", target=" + this.f57471b + Separators.RPAREN;
    }
}
