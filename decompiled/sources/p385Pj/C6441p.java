package p385Pj;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: renamed from: Pj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C6441p extends AbstractC6442q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20906a;

    public C6441p(ArrayList arrayList) {
        this.f20906a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6441p) && this.f20906a.equals(((C6441p) obj).f20906a);
    }

    public final int hashCode() {
        return this.f20906a.hashCode();
    }

    public final String toString() {
        return "Success(absoluteFilePaths=" + this.f20906a + Separators.RPAREN;
    }
}
