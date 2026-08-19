package p817j$.time.format;

import p817j$.time.ZoneId;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: j$.time.format.x */
/* JADX INFO: loaded from: classes4.dex */
final class C15604x implements TemporalAccessor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ChronoLocalDate f48719a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TemporalAccessor f48720b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC15555k f48721c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ZoneId f48722d;

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    C15604x(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, InterfaceC15555k interfaceC15555k, ZoneId zoneId) {
        this.f48719a = chronoLocalDate;
        this.f48720b = temporalAccessor;
        this.f48721c = interfaceC15555k;
        this.f48722d = zoneId;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        ChronoLocalDate chronoLocalDate = this.f48719a;
        if (chronoLocalDate != null && interfaceC15635o.mo17138A()) {
            return chronoLocalDate.mo16770f(interfaceC15635o);
        }
        return this.f48720b.mo16770f(interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        ChronoLocalDate chronoLocalDate = this.f48719a;
        if (chronoLocalDate != null && interfaceC15635o.mo17138A()) {
            return chronoLocalDate.mo16772r(interfaceC15635o);
        }
        return this.f48720b.mo16772r(interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        ChronoLocalDate chronoLocalDate = this.f48719a;
        if (chronoLocalDate != null && interfaceC15635o.mo17138A()) {
            return chronoLocalDate.mo16773u(interfaceC15635o);
        }
        return this.f48720b.mo16773u(interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return this.f48721c;
        }
        if (temporalQuery == AbstractC15632l.m17166l()) {
            return this.f48722d;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return this.f48720b.mo16774y(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        InterfaceC15555k interfaceC15555k = this.f48721c;
        if (interfaceC15555k != null) {
            str = " with chronology " + interfaceC15555k;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f48722d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f48720b + str + str2;
    }
}
