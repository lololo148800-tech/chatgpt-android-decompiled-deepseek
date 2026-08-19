package p159G4;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: G4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2991b {

    /* JADX INFO: renamed from: a */
    public final String f8999a;

    /* JADX INFO: renamed from: b */
    public final String f9000b;

    /* JADX INFO: renamed from: c */
    public final String f9001c;

    /* JADX INFO: renamed from: d */
    public final List f9002d;

    /* JADX INFO: renamed from: e */
    public final List f9003e;

    public C2991b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        AbstractC16544l.m18094g(columnNames, "columnNames");
        AbstractC16544l.m18094g(referenceColumnNames, "referenceColumnNames");
        this.f8999a = str;
        this.f9000b = str2;
        this.f9001c = str3;
        this.f9002d = columnNames;
        this.f9003e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2991b)) {
            return false;
        }
        C2991b c2991b = (C2991b) obj;
        if (AbstractC16544l.m18089b(this.f8999a, c2991b.f8999a) && AbstractC16544l.m18089b(this.f9000b, c2991b.f9000b) && AbstractC16544l.m18089b(this.f9001c, c2991b.f9001c) && AbstractC16544l.m18089b(this.f9002d, c2991b.f9002d)) {
            return AbstractC16544l.m18089b(this.f9003e, c2991b.f9003e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9003e.hashCode() + AbstractC14376f.m15858x(this.f9002d, AbstractC0168G.m527p(AbstractC0168G.m527p(this.f8999a.hashCode() * 31, 31, this.f9000b), 31, this.f9001c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f8999a + "', onDelete='" + this.f9000b + " +', onUpdate='" + this.f9001c + "', columnNames=" + this.f9002d + ", referenceColumnNames=" + this.f9003e + '}';
    }
}
