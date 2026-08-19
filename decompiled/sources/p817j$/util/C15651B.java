package p817j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.B */
/* JADX INFO: loaded from: classes4.dex */
public final class C15651B {

    /* JADX INFO: renamed from: c */
    private static final C15651B f48842c = new C15651B();

    /* JADX INFO: renamed from: a */
    private final boolean f48843a;

    /* JADX INFO: renamed from: b */
    private final long f48844b;

    private C15651B() {
        this.f48843a = false;
        this.f48844b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static C15651B m17234a() {
        return f48842c;
    }

    private C15651B(long j10) {
        this.f48843a = true;
        this.f48844b = j10;
    }

    /* JADX INFO: renamed from: d */
    public static C15651B m17235d(long j10) {
        return new C15651B(j10);
    }

    /* JADX INFO: renamed from: b */
    public final long m17236b() {
        if (!this.f48843a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f48844b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17237c() {
        return this.f48843a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15651B)) {
            return false;
        }
        C15651B c15651b = (C15651B) obj;
        boolean z6 = this.f48843a;
        if (z6 && c15651b.f48843a) {
            if (this.f48844b == c15651b.f48844b) {
                return true;
            }
        } else if (z6 == c15651b.f48843a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f48843a) {
            return 0;
        }
        long j10 = this.f48844b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        if (this.f48843a) {
            return "OptionalLong[" + this.f48844b + "]";
        }
        return "OptionalLong.empty";
    }
}
