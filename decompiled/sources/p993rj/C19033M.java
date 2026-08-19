package p993rj;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rj.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C19033M {

    /* JADX INFO: renamed from: a */
    public final C19032L f60677a;

    /* JADX INFO: renamed from: b */
    public final List f60678b;

    public C19033M(C19032L primaryChoice, List list) {
        AbstractC16544l.m18094g(primaryChoice, "primaryChoice");
        this.f60677a = primaryChoice;
        this.f60678b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19033M)) {
            return false;
        }
        C19033M c19033m = (C19033M) obj;
        return AbstractC16544l.m18089b(this.f60677a, c19033m.f60677a) && AbstractC16544l.m18089b(this.f60678b, c19033m.f60678b);
    }

    public final int hashCode() {
        return this.f60678b.hashCode() + (this.f60677a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraChoices(primaryChoice=" + this.f60677a + ", backupChoices=" + this.f60678b + Separators.RPAREN;
    }
}
