package nc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p923oc.C18064t;

/* JADX INFO: renamed from: nc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17556c {

    /* JADX INFO: renamed from: a */
    public final C18064t f56163a;

    /* JADX INFO: renamed from: b */
    public final boolean f56164b;

    /* JADX INFO: renamed from: c */
    public final Integer f56165c;

    public C17556c(C18064t astNode, boolean z6, Integer num) {
        AbstractC16544l.m18094g(astNode, "astNode");
        this.f56163a = astNode;
        this.f56164b = z6;
        this.f56165c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17556c)) {
            return false;
        }
        C17556c c17556c = (C17556c) obj;
        return AbstractC16544l.m18089b(this.f56163a, c17556c.f56163a) && this.f56164b == c17556c.f56164b && AbstractC16544l.m18089b(this.f56165c, c17556c.f56165c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f56163a.hashCode() * 31) + (this.f56164b ? 1231 : 1237)) * 31;
        Integer num = this.f56165c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AstNodeTraversalEntry(astNode=" + this.f56163a + ", isVisited=" + this.f56164b + ", formatIndex=" + this.f56165c + Separators.RPAREN;
    }
}
