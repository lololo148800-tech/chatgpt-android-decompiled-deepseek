package p324Mn;

import p001A.AbstractC0010F;
import p463Sn.C7154g;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Mn.k */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7154g.class)
public final class C5541k extends AbstractC5539i {
    public static final C5540j Companion = new C5540j();

    /* JADX INFO: renamed from: c */
    public final int f17992c;

    public C5541k(int i10) {
        this.f17992c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Unit duration must be positive, but was ", " days.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5541k) {
                if (this.f17992c == ((C5541k) obj).f17992c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17992c ^ 65536;
    }

    public final String toString() {
        int i10 = this.f17992c;
        return i10 % 7 == 0 ? AbstractC5546p.m5941a(i10 / 7, "WEEK") : AbstractC5546p.m5941a(i10, "DAY");
    }
}
