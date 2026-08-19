package p946pc;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: renamed from: pc.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18332Q {

    /* JADX INFO: renamed from: a */
    public final Object f58518a;

    public C18332Q(List list) {
        this.f58518a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18332Q) && this.f58518a.equals(((C18332Q) obj).f58518a);
    }

    public final int hashCode() {
        return this.f58518a.hashCode();
    }

    public final String toString() {
        return "TableRow(cells=" + this.f58518a + Separators.RPAREN;
    }
}
