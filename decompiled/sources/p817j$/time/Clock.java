package p817j$.time;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Clock {
    /* JADX INFO: renamed from: a */
    public abstract ZoneId mo16765a();

    public abstract Instant instant();

    public static Clock systemUTC() {
        return C15533a.f48542b;
    }

    public static Clock systemDefaultZone() {
        return new C15533a(ZoneId.systemDefault());
    }

    protected Clock() {
    }

    /* JADX INFO: renamed from: b */
    public long mo16766b() {
        return instant().toEpochMilli();
    }
}
