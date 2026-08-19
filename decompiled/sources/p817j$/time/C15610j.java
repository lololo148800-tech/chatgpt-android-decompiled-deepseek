package p817j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import livekit.org.webrtc.WebrtcBuildVersion;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.format.DateTimeFormatterBuilder;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C15610j implements TemporalAccessor, TemporalAdjuster, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a */
    private final int f48730a;

    /* JADX INFO: renamed from: b */
    private final int f48731b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15610j c15610j = (C15610j) obj;
        int i10 = this.f48730a - c15610j.f48730a;
        return i10 == 0 ? this.f48731b - c15610j.f48731b : i10;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17033f("--");
        dateTimeFormatterBuilder.m17040n(EnumC15621a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.m17032e('-');
        dateTimeFormatterBuilder.m17040n(EnumC15621a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private C15610j(int i10, int i11) {
        this.f48730a = i10;
        this.f48731b = i11;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.MONTH_OF_YEAR || interfaceC15635o == EnumC15621a.DAY_OF_MONTH;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        int i10;
        if (interfaceC15635o == EnumC15621a.MONTH_OF_YEAR) {
            return interfaceC15635o.mo17142m();
        }
        if (interfaceC15635o != EnumC15621a.DAY_OF_MONTH) {
            return AbstractC15632l.m17158d(this, interfaceC15635o);
        }
        int i11 = this.f48730a;
        Month monthM16866S = Month.m16866S(i11);
        monthM16866S.getClass();
        int i12 = AbstractC15608h.f48728a[monthM16866S.ordinal()];
        if (i12 != 1) {
            i10 = (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) ? 30 : 31;
        } else {
            i10 = 28;
        }
        return C15637q.m17169k(1L, i10, Month.m16866S(i11).m16869R());
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        return mo16772r(interfaceC15635o).m17170a(mo16773u(interfaceC15635o), interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        int i10;
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i11 = AbstractC15609i.f48729a[((EnumC15621a) interfaceC15635o).ordinal()];
        if (i11 == 1) {
            i10 = this.f48731b;
        } else {
            if (i11 != 2) {
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
            }
            i10 = this.f48730a;
        }
        return i10;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return C15562r.f48594d;
        }
        return AbstractC15632l.m17157c(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        if (!AbstractC15551g.m16964p(temporal).equals(C15562r.f48594d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalMo16787d = temporal.mo16787d(this.f48730a, EnumC15621a.MONTH_OF_YEAR);
        EnumC15621a enumC15621a = EnumC15621a.DAY_OF_MONTH;
        return temporalMo16787d.mo16787d(Math.min(temporalMo16787d.mo16772r(enumC15621a).m17172d(), this.f48731b), enumC15621a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15610j)) {
            return false;
        }
        C15610j c15610j = (C15610j) obj;
        return this.f48730a == c15610j.f48730a && this.f48731b == c15610j.f48731b;
    }

    public final int hashCode() {
        return (this.f48730a << 6) + this.f48731b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i10 = this.f48730a;
        sb2.append(i10 < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append(i10);
        int i11 = this.f48731b;
        sb2.append(i11 < 10 ? "-0" : "-");
        sb2.append(i11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: Q */
    final void m17109Q(DataOutput dataOutput) {
        dataOutput.writeByte(this.f48730a);
        dataOutput.writeByte(this.f48731b);
    }

    /* JADX INFO: renamed from: P */
    static C15610j m17108P(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        byte b10 = objectInput.readByte();
        Month monthM16866S = Month.m16866S(b);
        Objects.requireNonNull(monthM16866S, "month");
        EnumC15621a.DAY_OF_MONTH.m17140Q(b10);
        if (b10 > monthM16866S.m16869R()) {
            throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b10) + " is not valid for month " + monthM16866S.name());
        }
        return new C15610j(monthM16866S.getValue(), b10);
    }
}
