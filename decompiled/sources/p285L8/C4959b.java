package p285L8;

import java.nio.charset.StandardCharsets;
import livekit.org.webrtc.WebrtcBuildVersion;
import p309M8.AbstractC5306a;

/* JADX INFO: renamed from: L8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4959b extends AbstractC4960c {

    /* JADX INFO: renamed from: e */
    public static final C4959b f16185e = new C4959b(-1, "18446744073709551615");

    /* JADX INFO: renamed from: b */
    public final long f16186b;

    /* JADX INFO: renamed from: c */
    public String f16187c;

    /* JADX INFO: renamed from: d */
    public String f16188d;

    public C4959b(long j10, String str) {
        this.f16186b = j10;
        this.f16187c = str;
    }

    /* JADX INFO: renamed from: b */
    public static C4959b m5606b(long j10) {
        C4959b c4959b;
        if (j10 != 0 || (c4959b = AbstractC4960c.f16189a) == null) {
            return j10 == -1 ? f16185e : new C4959b(j10, null);
        }
        return c4959b;
    }

    @Override // p285L8.AbstractC4960c
    /* JADX INFO: renamed from: a */
    public final String mo5605a() {
        String str = this.f16188d;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        AbstractC5306a.m5840a(this.f16186b, bArr, 0, 32);
        String str2 = new String(bArr, StandardCharsets.US_ASCII);
        this.f16188d = str2;
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4959b) && this.f16186b == ((C4959b) obj).f16186b;
    }

    public final int hashCode() {
        long j10 = this.f16186b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        String str = this.f16187c;
        if (str == null) {
            long j10 = this.f16186b;
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
            this.f16187c = str;
        }
        return str;
    }
}
