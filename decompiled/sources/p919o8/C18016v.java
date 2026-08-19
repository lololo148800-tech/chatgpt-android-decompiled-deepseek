package p919o8;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: renamed from: o8.v */
/* JADX INFO: loaded from: classes.dex */
public final class C18016v {

    /* JADX INFO: renamed from: a */
    public final ArrayList f57511a;

    public C18016v(ArrayList arrayList) {
        this.f57511a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18016v) && this.f57511a.equals(((C18016v) obj).f57511a);
    }

    public final int hashCode() {
        return this.f57511a.hashCode();
    }

    public final String toString() {
        return "Frustration(type=" + this.f57511a + Separators.RPAREN;
    }
}
