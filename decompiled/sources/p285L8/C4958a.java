package p285L8;

import java.nio.charset.StandardCharsets;
import livekit.org.webrtc.WebrtcBuildVersion;
import p309M8.AbstractC5306a;

/* JADX INFO: renamed from: L8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4958a extends AbstractC4960c {

    /* JADX INFO: renamed from: b */
    public final long f16181b;

    /* JADX INFO: renamed from: c */
    public final long f16182c;

    /* JADX INFO: renamed from: d */
    public String f16183d = null;

    /* JADX INFO: renamed from: e */
    public String f16184e;

    public C4958a(long j10, long j11) {
        this.f16181b = j10;
        this.f16182c = j11;
    }

    @Override // p285L8.AbstractC4960c
    /* JADX INFO: renamed from: a */
    public final String mo5605a() {
        String str = this.f16183d;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        AbstractC5306a.m5840a(this.f16181b, bArr, 0, 16);
        AbstractC5306a.m5840a(this.f16182c, bArr, 16, 16);
        String str2 = new String(bArr, StandardCharsets.US_ASCII);
        this.f16183d = str2;
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4958a)) {
            return false;
        }
        C4958a c4958a = (C4958a) obj;
        return this.f16181b == c4958a.f16181b && this.f16182c == c4958a.f16182c;
    }

    public final int hashCode() {
        long j10 = this.f16181b;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f16182c;
        return (int) ((j11 ^ j12) ^ (j12 >>> 32));
    }

    public final String toString() {
        String str = this.f16184e;
        if (str == null) {
            long j10 = this.f16182c;
            if (j10 == 0) {
                str = WebrtcBuildVersion.maint_version;
            } else if (j10 > 0) {
                str = Long.toString(j10, 10);
            } else {
                char[] cArr = new char[64];
                long j11 = (j10 >>> 1) / ((long) 5);
                long j12 = 10;
                int i10 = 63;
                cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                while (j11 > 0) {
                    i10--;
                    cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr, i10, 64 - i10);
            }
            this.f16184e = str;
        }
        return str;
    }
}
