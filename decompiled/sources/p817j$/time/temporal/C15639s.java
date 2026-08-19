package p817j$.time.temporal;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.time.DayOfWeek;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.temporal.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C15639s implements Serializable {

    /* JADX INFO: renamed from: g */
    private static final ConcurrentHashMap f48796g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h */
    public static final TemporalUnit f48797h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a */
    private final DayOfWeek f48798a;

    /* JADX INFO: renamed from: b */
    private final int f48799b;

    /* JADX INFO: renamed from: c */
    private final transient InterfaceC15635o f48800c = C15638r.m17182e(this);

    /* JADX INFO: renamed from: d */
    private final transient InterfaceC15635o f48801d = C15638r.m17185h(this);

    /* JADX INFO: renamed from: e */
    private final transient InterfaceC15635o f48802e;

    /* JADX INFO: renamed from: f */
    private final transient InterfaceC15635o f48803f;

    static {
        new C15639s(DayOfWeek.MONDAY, 4);
        m17193g(DayOfWeek.SUNDAY, 1);
        f48797h = AbstractC15629i.f48767d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static C15639s m17193g(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f48796g;
        C15639s c15639s = (C15639s) concurrentHashMap.get(str);
        if (c15639s != null) {
            return c15639s;
        }
        concurrentHashMap.putIfAbsent(str, new C15639s(dayOfWeek, i10));
        return (C15639s) concurrentHashMap.get(str);
    }

    private C15639s(DayOfWeek dayOfWeek, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f48802e = C15638r.m17186i(this);
        this.f48803f = C15638r.m17184g(this);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f48798a = dayOfWeek;
        this.f48799b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f48798a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f48799b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m17193g(this.f48798a, this.f48799b);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public final DayOfWeek m17195e() {
        return this.f48798a;
    }

    /* JADX INFO: renamed from: f */
    public final int m17196f() {
        return this.f48799b;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC15635o m17194d() {
        return this.f48800c;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC15635o m17198i() {
        return this.f48801d;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC15635o m17199j() {
        return this.f48802e;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC15635o m17197h() {
        return this.f48803f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15639s) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f48798a.ordinal() * 7) + this.f48799b;
    }

    public final String toString() {
        return "WeekFields[" + this.f48798a + Separators.COMMA + this.f48799b + "]";
    }
}
