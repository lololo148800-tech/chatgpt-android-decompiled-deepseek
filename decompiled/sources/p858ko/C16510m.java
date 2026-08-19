package p858ko;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p861l1.xapn.suYVq;
import p878lo.C17094c;

/* JADX INFO: renamed from: ko.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C16510m {

    /* JADX INFO: renamed from: a */
    public final boolean f51209a;

    /* JADX INFO: renamed from: b */
    public final C17094c f51210b;

    public C16510m(int i10) {
        boolean z6 = (i10 & 1) != 0;
        C17094c c17094c = C17094c.f54630a;
        this.f51209a = z6;
        this.f51210b = c17094c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16510m)) {
            return false;
        }
        C16510m c16510m = (C16510m) obj;
        return this.f51209a == c16510m.f51209a && AbstractC16544l.m18089b(this.f51210b, c16510m.f51210b);
    }

    public final int hashCode() {
        return this.f51210b.hashCode() + ((this.f51209a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "HardwareShortcutsSpec(enabled=" + this.f51209a + suYVq.vWGGK + this.f51210b + Separators.RPAREN;
    }
}
