package p817j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.a */
/* JADX INFO: loaded from: classes4.dex */
final class C15533a extends Clock implements Serializable {

    /* JADX INFO: renamed from: b */
    static final C15533a f48542b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a */
    private final ZoneId f48543a;

    static {
        System.currentTimeMillis();
        f48542b = new C15533a(ZoneOffset.UTC);
    }

    C15533a(ZoneId zoneId) {
        this.f48543a = zoneId;
    }

    @Override // p817j$.time.Clock
    /* JADX INFO: renamed from: a */
    public final ZoneId mo16765a() {
        return this.f48543a;
    }

    @Override // p817j$.time.Clock
    /* JADX INFO: renamed from: b */
    public final long mo16766b() {
        return System.currentTimeMillis();
    }

    @Override // p817j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15533a)) {
            return false;
        }
        return this.f48543a.equals(((C15533a) obj).f48543a);
    }

    public final int hashCode() {
        return this.f48543a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f48543a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
