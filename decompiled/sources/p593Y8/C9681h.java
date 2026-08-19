package p593Y8;

import java.util.HashMap;
import p615Z6.C10252z0;

/* JADX INFO: renamed from: Y8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9681h {

    /* JADX INFO: renamed from: a */
    public final String f29182a;

    /* JADX INFO: renamed from: b */
    public final Integer f29183b;

    /* JADX INFO: renamed from: c */
    public final C9685l f29184c;

    /* JADX INFO: renamed from: d */
    public final long f29185d;

    /* JADX INFO: renamed from: e */
    public final long f29186e;

    /* JADX INFO: renamed from: f */
    public final HashMap f29187f;

    public C9681h(String str, Integer num, C9685l c9685l, long j10, long j11, HashMap map) {
        this.f29182a = str;
        this.f29183b = num;
        this.f29184c = c9685l;
        this.f29185d = j10;
        this.f29186e = j11;
        this.f29187f = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m10267a(String str) {
        String str2 = (String) this.f29187f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m10268b(String str) {
        String str2 = (String) this.f29187f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final C10252z0 m10269c() {
        C10252z0 c10252z0 = new C10252z0();
        String str = this.f29182a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c10252z0.f30454Y = str;
        c10252z0.f30455Z = this.f29183b;
        C9685l c9685l = this.f29184c;
        if (c9685l == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c10252z0.f30456o0 = c9685l;
        c10252z0.f30457p0 = Long.valueOf(this.f29185d);
        c10252z0.f30458q0 = Long.valueOf(this.f29186e);
        c10252z0.f30459r0 = new HashMap(this.f29187f);
        return c10252z0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9681h)) {
            return false;
        }
        C9681h c9681h = (C9681h) obj;
        if (this.f29182a.equals(c9681h.f29182a)) {
            Integer num = c9681h.f29183b;
            Integer num2 = this.f29183b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f29184c.equals(c9681h.f29184c) && this.f29185d == c9681h.f29185d && this.f29186e == c9681h.f29186e && this.f29187f.equals(c9681h.f29187f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29182a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f29183b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f29184c.hashCode()) * 1000003;
        long j10 = this.f29185d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f29186e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f29187f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f29182a + ", code=" + this.f29183b + ", encodedPayload=" + this.f29184c + ", eventMillis=" + this.f29185d + ", uptimeMillis=" + this.f29186e + ", autoMetadata=" + this.f29187f + "}";
    }
}
