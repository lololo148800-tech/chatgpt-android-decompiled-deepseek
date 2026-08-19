package p817j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAmount;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C15614n implements TemporalAmount, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C15614n f48736d = new C15614n(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a */
    private final int f48737a;

    /* JADX INFO: renamed from: b */
    private final int f48738b;

    /* JADX INFO: renamed from: c */
    private final int f48739c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC15529a.m16747k(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* JADX INFO: renamed from: b */
    public static C15614n m17115b(int i10) {
        if (i10 == 0) {
            return f48736d;
        }
        return new C15614n(0, 0, i10);
    }

    private C15614n(int i10, int i11, int i12) {
        this.f48737a = i10;
        this.f48738b = i11;
        this.f48739c = i12;
    }

    /* JADX INFO: renamed from: a */
    public final int m17117a() {
        return this.f48739c;
    }

    /* JADX INFO: renamed from: d */
    public final long m17118d() {
        return (((long) this.f48737a) * 12) + ((long) this.f48738b);
    }

    @Override // p817j$.time.temporal.TemporalAmount
    /* JADX INFO: renamed from: m */
    public final Temporal mo16778m(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        InterfaceC15555k interfaceC15555k = (InterfaceC15555k) temporal.mo16774y(AbstractC15632l.m17159e());
        if (interfaceC15555k == null || C15562r.f48594d.equals(interfaceC15555k)) {
            if (this.f48738b == 0) {
                int i10 = this.f48737a;
                if (i10 != 0) {
                    temporal = temporal.mo16788e(i10, ChronoUnit.YEARS);
                }
            } else {
                long jM17118d = m17118d();
                if (jM17118d != 0) {
                    temporal = temporal.mo16788e(jM17118d, ChronoUnit.MONTHS);
                }
            }
            int i11 = this.f48739c;
            return i11 != 0 ? temporal.mo16788e(i11, ChronoUnit.DAYS) : temporal;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + interfaceC15555k.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15614n)) {
            return false;
        }
        C15614n c15614n = (C15614n) obj;
        return this.f48737a == c15614n.f48737a && this.f48738b == c15614n.f48738b && this.f48739c == c15614n.f48739c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f48739c, 16) + Integer.rotateLeft(this.f48738b, 8) + this.f48737a;
    }

    public final String toString() {
        if (this == f48736d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f48737a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f48738b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f48739c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f48737a);
        objectOutput.writeInt(this.f48738b);
        objectOutput.writeInt(this.f48739c);
    }

    /* JADX INFO: renamed from: c */
    static C15614n m17116c(ObjectInput objectInput) throws IOException {
        int i10 = objectInput.readInt();
        int i11 = objectInput.readInt();
        int i12 = objectInput.readInt();
        if ((i10 | i11 | i12) == 0) {
            return f48736d;
        }
        return new C15614n(i10, i11, i12);
    }
}
