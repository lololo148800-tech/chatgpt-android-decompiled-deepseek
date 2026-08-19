package p993rj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p031B3.AbstractC0801e;

/* JADX INFO: renamed from: rj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C19051m implements InterfaceC19053o {

    /* JADX INFO: renamed from: a */
    public final AbstractC0801e f60713a;

    public C19051m(AbstractC0801e abstractC0801e) {
        this.f60713a = abstractC0801e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19051m) && AbstractC16544l.m18089b(this.f60713a, ((C19051m) obj).f60713a);
    }

    public final int hashCode() {
        return this.f60713a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f60713a + Separators.RPAREN;
    }
}
