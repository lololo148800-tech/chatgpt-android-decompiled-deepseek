package p054C0;

import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;

/* JADX INFO: renamed from: C0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1499l {

    /* JADX INFO: renamed from: a */
    public final C3590f f3977a;

    /* JADX INFO: renamed from: b */
    public C3590f f3978b;

    /* JADX INFO: renamed from: c */
    public boolean f3979c = false;

    /* JADX INFO: renamed from: d */
    public C1491d f3980d = null;

    public C1499l(C3590f c3590f, C3590f c3590f2) {
        this.f3977a = c3590f;
        this.f3978b = c3590f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1499l)) {
            return false;
        }
        C1499l c1499l = (C1499l) obj;
        return AbstractC16544l.m18089b(this.f3977a, c1499l.f3977a) && AbstractC16544l.m18089b(this.f3978b, c1499l.f3978b) && this.f3979c == c1499l.f3979c && AbstractC16544l.m18089b(this.f3980d, c1499l.f3980d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f3978b.hashCode() + (this.f3977a.hashCode() * 31)) * 31) + (this.f3979c ? 1231 : 1237)) * 31;
        C1491d c1491d = this.f3980d;
        return iHashCode + (c1491d == null ? 0 : c1491d.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f3977a) + ", substitution=" + ((Object) this.f3978b) + ", isShowingSubstitution=" + this.f3979c + ", layoutCache=" + this.f3980d + ')';
    }
}
