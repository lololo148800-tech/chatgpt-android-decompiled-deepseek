package p296Lk;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import p200Hm.C3507f;
import p200Hm.C3508g;

/* JADX INFO: renamed from: Lk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5115l {

    /* JADX INFO: renamed from: a */
    public final ArrayList f16714a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f16715b;

    public C5115l(ArrayList arrayList, ArrayList arrayList2) {
        this.f16714a = arrayList;
        this.f16715b = arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public static float m5673a(ArrayList arrayList, C3508g c3508g) {
        C3507f it = c3508g.iterator();
        double dFloatValue = 0.0d;
        while (it.f10596o0) {
            dFloatValue += (double) ((Number) arrayList.get(it.mo4199a())).floatValue();
        }
        return (float) dFloatValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5115l)) {
            return false;
        }
        C5115l c5115l = (C5115l) obj;
        return this.f16714a.equals(c5115l.f16714a) && this.f16715b.equals(c5115l.f16715b);
    }

    public final int hashCode() {
        return this.f16715b.hashCode() + (this.f16714a.hashCode() * 31);
    }

    public final String toString() {
        return "LazyTablePxDimensions(columnsSize=" + this.f16714a + ", rowsSize=" + this.f16715b + Separators.RPAREN;
    }
}
