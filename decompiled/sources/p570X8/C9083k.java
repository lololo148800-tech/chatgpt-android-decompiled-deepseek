package p570X8;

import java.util.Arrays;

/* JADX INFO: renamed from: X8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9083k extends AbstractC9090r {

    /* JADX INFO: renamed from: a */
    public final long f27838a;

    /* JADX INFO: renamed from: b */
    public final Integer f27839b;

    /* JADX INFO: renamed from: c */
    public final long f27840c;

    /* JADX INFO: renamed from: d */
    public final byte[] f27841d;

    /* JADX INFO: renamed from: e */
    public final String f27842e;

    /* JADX INFO: renamed from: f */
    public final long f27843f;

    /* JADX INFO: renamed from: g */
    public final C9086n f27844g;

    public C9083k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, C9086n c9086n) {
        this.f27838a = j10;
        this.f27839b = num;
        this.f27840c = j11;
        this.f27841d = bArr;
        this.f27842e = str;
        this.f27843f = j12;
        this.f27844g = c9086n;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9090r)) {
            return false;
        }
        AbstractC9090r abstractC9090r = (AbstractC9090r) obj;
        C9083k c9083k = (C9083k) abstractC9090r;
        if (this.f27838a == c9083k.f27838a && ((num = this.f27839b) != null ? num.equals(c9083k.f27839b) : c9083k.f27839b == null)) {
            if (this.f27840c == c9083k.f27840c) {
                if (Arrays.equals(this.f27841d, abstractC9090r instanceof C9083k ? ((C9083k) abstractC9090r).f27841d : c9083k.f27841d)) {
                    String str = c9083k.f27842e;
                    String str2 = this.f27842e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f27843f == c9083k.f27843f) {
                            C9086n c9086n = c9083k.f27844g;
                            C9086n c9086n2 = this.f27844g;
                            if (c9086n2 == null) {
                                if (c9086n == null) {
                                    return true;
                                }
                            } else if (c9086n2.equals(c9086n)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f27838a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f27839b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f27840c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f27841d)) * 1000003;
        String str = this.f27842e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f27843f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        C9086n c9086n = this.f27844g;
        return i11 ^ (c9086n != null ? c9086n.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f27838a + ", eventCode=" + this.f27839b + ", eventUptimeMs=" + this.f27840c + ", sourceExtension=" + Arrays.toString(this.f27841d) + ", sourceExtensionJsonProto3=" + this.f27842e + ", timezoneOffsetSeconds=" + this.f27843f + ", networkConnectionInfo=" + this.f27844g + "}";
    }
}
