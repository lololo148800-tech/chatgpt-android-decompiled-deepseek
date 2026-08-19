package p324Mn;

import p001A.AbstractC0010F;
import p463Sn.C7160m;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Mn.m */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7160m.class)
public final class C5543m extends AbstractC5539i {
    public static final C5542l Companion = new C5542l();

    /* JADX INFO: renamed from: c */
    public final int f17993c;

    public C5543m(int i10) {
        this.f17993c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Unit duration must be positive, but was ", " months.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5543m) {
                if (this.f17993c == ((C5543m) obj).f17993c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17993c ^ 131072;
    }

    public final String toString() {
        int i10 = this.f17993c;
        if (i10 % 1200 == 0) {
            return AbstractC5546p.m5941a(i10 / 1200, "CENTURY");
        }
        if (i10 % 12 == 0) {
            return AbstractC5546p.m5941a(i10 / 12, "YEAR");
        }
        return i10 % 3 == 0 ? AbstractC5546p.m5941a(i10 / 3, "QUARTER") : AbstractC5546p.m5941a(i10, "MONTH");
    }
}
