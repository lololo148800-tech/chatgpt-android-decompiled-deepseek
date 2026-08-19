package p385Pj;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: renamed from: Pj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6440o extends AbstractC6442q {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20904a;

    /* JADX INFO: renamed from: b */
    public final EnumC6437l f20905b;

    public C6440o(ArrayList arrayList, EnumC6437l enumC6437l) {
        this.f20904a = arrayList;
        this.f20905b = enumC6437l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6440o)) {
            return false;
        }
        C6440o c6440o = (C6440o) obj;
        return this.f20904a.equals(c6440o.f20904a) && this.f20905b == c6440o.f20905b;
    }

    public final int hashCode() {
        return this.f20905b.hashCode() + (this.f20904a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(absoluteFilePaths=" + this.f20904a + ", reason=" + this.f20905b + Separators.RPAREN;
    }
}
