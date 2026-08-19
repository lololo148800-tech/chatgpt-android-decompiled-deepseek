package p324Mn;

import cn.UfGr.EhBykzn;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p369On.AbstractC6273b;
import p463Sn.C7161n;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Mn.o */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8975g(with = C7161n.class)
public final class C5545o extends AbstractC5546p {
    public static final C5544n Companion = new C5544n();

    /* JADX INFO: renamed from: c */
    public final long f17994c;

    /* JADX INFO: renamed from: d */
    public final String f17995d;

    /* JADX INFO: renamed from: e */
    public final long f17996e;

    /* JADX INFO: renamed from: b */
    public final C5545o m5940b(int i10) {
        return new C5545o(AbstractC6273b.m6756c(this.f17994c, i10));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5545o) {
                if (this.f17994c == ((C5545o) obj).f17994c) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f17994c;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    public final String toString() {
        String unit = this.f17995d;
        AbstractC16544l.m18094g(unit, "unit");
        long j10 = this.f17996e;
        if (j10 == 1) {
            return unit;
        }
        return j10 + '-' + unit;
    }

    public C5545o(long j10) {
        this.f17994c = j10;
        if (j10 > 0) {
            if (j10 % 3600000000000L == 0) {
                this.f17995d = "HOUR";
                this.f17996e = j10 / 3600000000000L;
                return;
            }
            if (j10 % 60000000000L == 0) {
                this.f17995d = "MINUTE";
                this.f17996e = j10 / 60000000000L;
                return;
            }
            long j11 = 1000000000;
            if (j10 % j11 == 0) {
                this.f17995d = "SECOND";
                this.f17996e = j10 / j11;
                return;
            }
            long j12 = UtilsKt.MICROS_MULTIPLIER;
            if (j10 % j12 == 0) {
                this.f17995d = "MILLISECOND";
                this.f17996e = j10 / j12;
                return;
            }
            long j13 = 1000;
            if (j10 % j13 == 0) {
                this.f17995d = "MICROSECOND";
                this.f17996e = j10 / j13;
                return;
            } else {
                this.f17995d = EhBykzn.GZHG;
                this.f17996e = j10;
                return;
            }
        }
        throw new IllegalArgumentException(AbstractC0168G.m533v("Unit duration must be positive, but was ", j10, " ns.").toString());
    }
}
