package p745f9;

import p593Y8.C9681h;
import p593Y8.C9682i;

/* JADX INFO: renamed from: f9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13584b {

    /* JADX INFO: renamed from: a */
    public final long f42944a;

    /* JADX INFO: renamed from: b */
    public final C9682i f42945b;

    /* JADX INFO: renamed from: c */
    public final C9681h f42946c;

    public C13584b(long j10, C9682i c9682i, C9681h c9681h) {
        this.f42944a = j10;
        this.f42945b = c9682i;
        this.f42946c = c9681h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13584b)) {
            return false;
        }
        C13584b c13584b = (C13584b) obj;
        return this.f42944a == c13584b.f42944a && this.f42945b.equals(c13584b.f42945b) && this.f42946c.equals(c13584b.f42946c);
    }

    public final int hashCode() {
        long j10 = this.f42944a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f42945b.hashCode()) * 1000003) ^ this.f42946c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42944a + ", transportContext=" + this.f42945b + ", event=" + this.f42946c + "}";
    }
}
