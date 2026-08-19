package p817j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Duration;
import p817j$.time.LocalDateTime;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.AbstractC15551g;

/* JADX INFO: renamed from: j$.time.zone.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C15642b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a */
    private final long f48819a;

    /* JADX INFO: renamed from: b */
    private final LocalDateTime f48820b;

    /* JADX INFO: renamed from: c */
    private final ZoneOffset f48821c;

    /* JADX INFO: renamed from: d */
    private final ZoneOffset f48822d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f48819a, ((C15642b) obj).f48819a);
    }

    C15642b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f48819a = AbstractC15551g.m16962n(localDateTime, zoneOffset);
        this.f48820b = localDateTime;
        this.f48821c = zoneOffset;
        this.f48822d = zoneOffset2;
    }

    C15642b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f48819a = j10;
        this.f48820b = LocalDateTime.m16826W(j10, 0, zoneOffset);
        this.f48821c = zoneOffset;
        this.f48822d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15641a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C15641a.m17213c(this.f48819a, objectOutput);
        C15641a.m17214d(this.f48821c, objectOutput);
        C15641a.m17214d(this.f48822d, objectOutput);
    }

    /* JADX INFO: renamed from: O */
    public final long m17216O() {
        return this.f48819a;
    }

    /* JADX INFO: renamed from: o */
    public final LocalDateTime m17218o() {
        return this.f48820b;
    }

    /* JADX INFO: renamed from: u */
    public final ZoneOffset m17221u() {
        return this.f48821c;
    }

    /* JADX INFO: renamed from: r */
    public final ZoneOffset m17220r() {
        return this.f48822d;
    }

    /* JADX INFO: renamed from: m */
    public final LocalDateTime m17217m() {
        return this.f48820b.m16839a0(this.f48822d.getTotalSeconds() - this.f48821c.getTotalSeconds());
    }

    /* JADX INFO: renamed from: q */
    public final Duration m17219q() {
        return Duration.m16776r(this.f48822d.getTotalSeconds() - this.f48821c.getTotalSeconds());
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17215A() {
        return this.f48822d.getTotalSeconds() > this.f48821c.getTotalSeconds();
    }

    /* JADX INFO: renamed from: y */
    final List m17222y() {
        return m17215A() ? Collections.emptyList() : AbstractC15529a.m16747k(new Object[]{this.f48821c, this.f48822d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15642b)) {
            return false;
        }
        C15642b c15642b = (C15642b) obj;
        return this.f48819a == c15642b.f48819a && this.f48821c.equals(c15642b.f48821c) && this.f48822d.equals(c15642b.f48822d);
    }

    public final int hashCode() {
        return (this.f48820b.hashCode() ^ this.f48821c.hashCode()) ^ Integer.rotateLeft(this.f48822d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(m17215A() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f48820b);
        sb2.append(this.f48821c);
        sb2.append(" to ");
        sb2.append(this.f48822d);
        sb2.append(']');
        return sb2.toString();
    }
}
