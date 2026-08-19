package p291Lf;

import java.util.ArrayList;

/* JADX INFO: renamed from: Lf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C5019p {

    /* JADX INFO: renamed from: a */
    public final ArrayList f16382a;

    public C5019p(ArrayList arrayList) {
        this.f16382a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5019p) && this.f16382a.equals(((C5019p) obj).f16382a);
    }

    public final int hashCode() {
        return this.f16382a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
