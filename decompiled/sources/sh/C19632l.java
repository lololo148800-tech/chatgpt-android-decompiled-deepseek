package sh;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: sh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19632l {

    /* JADX INFO: renamed from: a */
    public final C19626i f62267a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f62268b;

    /* JADX INFO: renamed from: c */
    public final C19640r f62269c;

    public C19632l(C19626i c19626i, ArrayList arrayList, C19640r c19640r) {
        this.f62267a = c19626i;
        this.f62268b = arrayList;
        this.f62269c = c19640r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19632l)) {
            return false;
        }
        C19632l c19632l = (C19632l) obj;
        return this.f62267a.equals(c19632l.f62267a) && this.f62268b.equals(c19632l.f62268b) && AbstractC16544l.m18089b(this.f62269c, c19632l.f62269c);
    }

    public final int hashCode() {
        int iHashCode = (this.f62268b.hashCode() + (this.f62267a.hashCode() * 31)) * 31;
        C19640r c19640r = this.f62269c;
        return iHashCode + (c19640r == null ? 0 : c19640r.f62288a.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
