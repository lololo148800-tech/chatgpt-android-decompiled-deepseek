package p968qi;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17691y;

/* JADX INFO: renamed from: qi.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C18739v {

    /* JADX INFO: renamed from: a */
    public final int f59609a;

    /* JADX INFO: renamed from: b */
    public final Set f59610b;

    /* JADX INFO: renamed from: c */
    public final Set f59611c;

    /* JADX INFO: renamed from: d */
    public final Set f59612d;

    public C18739v(int i10, Set selectedColumns, Set selectedRows, Set selectedCells) {
        AbstractC16544l.m18094g(selectedColumns, "selectedColumns");
        AbstractC16544l.m18094g(selectedRows, "selectedRows");
        AbstractC16544l.m18094g(selectedCells, "selectedCells");
        this.f59609a = i10;
        this.f59610b = selectedColumns;
        this.f59611c = selectedRows;
        this.f59612d = selectedCells;
    }

    /* JADX INFO: renamed from: a */
    public static C18739v m20045a(C18739v c18739v, Set selectedColumns, Set selectedRows, Set set, int i10) {
        int i11 = c18739v.f59609a;
        if ((i10 & 2) != 0) {
            selectedColumns = c18739v.f59610b;
        }
        if ((i10 & 4) != 0) {
            selectedRows = c18739v.f59611c;
        }
        c18739v.getClass();
        AbstractC16544l.m18094g(selectedColumns, "selectedColumns");
        AbstractC16544l.m18094g(selectedRows, "selectedRows");
        return new C18739v(i11, selectedColumns, selectedRows, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18739v)) {
            return false;
        }
        C18739v c18739v = (C18739v) obj;
        return this.f59609a == c18739v.f59609a && AbstractC16544l.m18089b(this.f59610b, c18739v.f59610b) && AbstractC16544l.m18089b(this.f59611c, c18739v.f59611c) && AbstractC16544l.m18089b(this.f59612d, c18739v.f59612d);
    }

    public final int hashCode() {
        return this.f59612d.hashCode() + ((this.f59611c.hashCode() + ((this.f59610b.hashCode() + (this.f59609a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C18739v(int i10, int i11) {
        i10 = (i11 & 1) != 0 ? 0 : i10;
        C17691y c17691y = C17691y.f56482Y;
        this(i10, c17691y, c17691y, c17691y);
    }
}
