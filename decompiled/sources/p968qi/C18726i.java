package p968qi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p492U1.C7545j;

/* JADX INFO: renamed from: qi.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18726i {

    /* JADX INFO: renamed from: a */
    public final long f59568a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18726i) {
            return C7545j.m7886a(this.f59568a, ((C18726i) obj).f59568a);
        }
        return false;
    }

    public final int hashCode() {
        return C7545j.m7889d(this.f59568a);
    }

    public final String toString() {
        return AbstractC10763a.m11054l("SelectedCell(value=", C7545j.m7890e(this.f59568a), Separators.RPAREN);
    }
}
