package p949pj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: pj.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C18446T implements InterfaceC18449W {

    /* JADX INFO: renamed from: a */
    public final C18440M f58860a;

    public C18446T(C18440M c18440m) {
        this.f58860a = c18440m;
    }

    @Override // p949pj.InterfaceC18449W
    /* JADX INFO: renamed from: a */
    public final C18440M mo19877a() {
        return this.f58860a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18446T) && AbstractC16544l.m18089b(this.f58860a, ((C18446T) obj).f58860a);
    }

    public final int hashCode() {
        C18440M c18440m = this.f58860a;
        if (c18440m == null) {
            return 0;
        }
        return c18440m.hashCode();
    }

    public final String toString() {
        return "None(imageLightCondition=" + this.f58860a + Separators.RPAREN;
    }
}
