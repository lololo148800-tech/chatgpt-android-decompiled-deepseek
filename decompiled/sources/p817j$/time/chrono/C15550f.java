package p817j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAmount;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.f */
/* JADX INFO: loaded from: classes4.dex */
final class C15550f implements TemporalAmount, Serializable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f48564e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a */
    private final InterfaceC15555k f48565a;

    /* JADX INFO: renamed from: b */
    final int f48566b;

    /* JADX INFO: renamed from: c */
    final int f48567c;

    /* JADX INFO: renamed from: d */
    final int f48568d;

    static {
        AbstractC15529a.m16747k(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C15550f(InterfaceC15555k interfaceC15555k, int i10, int i11, int i12) {
        Objects.requireNonNull(interfaceC15555k, "chrono");
        this.f48565a = interfaceC15555k;
        this.f48566b = i10;
        this.f48567c = i11;
        this.f48568d = i12;
    }

    public final String toString() {
        InterfaceC15555k interfaceC15555k = this.f48565a;
        int i10 = this.f48568d;
        int i11 = this.f48567c;
        int i12 = this.f48566b;
        if (i12 == 0 && i11 == 0 && i10 == 0) {
            return interfaceC15555k.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC15555k.toString());
        sb2.append(" P");
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('Y');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // p817j$.time.temporal.TemporalAmount
    /* JADX INFO: renamed from: m */
    public final Temporal mo16778m(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        InterfaceC15555k interfaceC15555k = (InterfaceC15555k) temporal.mo16774y(AbstractC15632l.m17159e());
        InterfaceC15555k interfaceC15555k2 = this.f48565a;
        if (interfaceC15555k == null || interfaceC15555k2.equals(interfaceC15555k)) {
            int i10 = this.f48566b;
            int i11 = this.f48567c;
            if (i11 != 0) {
                C15637q c15637qMo16916H = interfaceC15555k2.mo16916H(EnumC15621a.MONTH_OF_YEAR);
                long jM17172d = (c15637qMo16916H.m17175g() && c15637qMo16916H.m17176h()) ? (c15637qMo16916H.m17172d() - c15637qMo16916H.m17173e()) + 1 : -1L;
                if (jM17172d > 0) {
                    temporal = temporal.mo16788e((((long) i10) * jM17172d) + ((long) i11), ChronoUnit.MONTHS);
                } else {
                    if (i10 != 0) {
                        temporal = temporal.mo16788e(i10, ChronoUnit.YEARS);
                    }
                    temporal = temporal.mo16788e(i11, ChronoUnit.MONTHS);
                }
            } else if (i10 != 0) {
                temporal = temporal.mo16788e(i10, ChronoUnit.YEARS);
            }
            int i12 = this.f48568d;
            return i12 != 0 ? temporal.mo16788e(i12, ChronoUnit.DAYS) : temporal;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + interfaceC15555k2.getId() + ", actual: " + interfaceC15555k.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15550f)) {
            return false;
        }
        C15550f c15550f = (C15550f) obj;
        return this.f48566b == c15550f.f48566b && this.f48567c == c15550f.f48567c && this.f48568d == c15550f.f48568d && this.f48565a.equals(c15550f.f48565a);
    }

    public final int hashCode() {
        return this.f48565a.hashCode() ^ (Integer.rotateLeft(this.f48568d, 16) + (Integer.rotateLeft(this.f48567c, 8) + this.f48566b));
    }

    protected Object writeReplace() {
        return new C15539D((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f48565a.getId());
        objectOutput.writeInt(this.f48566b);
        objectOutput.writeInt(this.f48567c);
        objectOutput.writeInt(this.f48568d);
    }
}
