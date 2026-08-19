package p946pc;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: renamed from: pc.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C18331P {

    /* JADX INFO: renamed from: a */
    public final ArrayList f58516a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f58517b;

    public C18331P(ArrayList arrayList, ArrayList arrayList2) {
        this.f58516a = arrayList;
        this.f58517b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18331P)) {
            return false;
        }
        C18331P c18331p = (C18331P) obj;
        return this.f58516a.equals(c18331p.f58516a) && this.f58517b.equals(c18331p.f58517b);
    }

    public final int hashCode() {
        return this.f58517b.hashCode() + (this.f58516a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.f58516a + ", columnOffsets=" + this.f58517b + Separators.RPAREN;
    }
}
