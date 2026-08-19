package co;

import livekit.org.webrtc.WebrtcBuildVersion;
import p001A.C0095w0;
import p826j6.C16137F;

/* JADX INFO: renamed from: co.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C11820j extends C0095w0 {

    /* JADX INFO: renamed from: p0 */
    public final boolean f35828p0;

    public C11820j(C16137F c16137f, boolean z6) {
        super(c16137f);
        this.f35828p0 = z6;
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: p */
    public final void mo379p(byte b) {
        if (this.f35828p0) {
            mo387y(String.valueOf(b & 255));
        } else {
            m385w(String.valueOf(b & 255));
        }
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: s */
    public final void mo382s(int i10) {
        if (this.f35828p0) {
            mo387y(Long.toString(4294967295L & ((long) i10), 10));
        } else {
            m385w(Long.toString(4294967295L & ((long) i10), 10));
        }
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: t */
    public final void mo383t(long j10) {
        boolean z6 = this.f35828p0;
        int i10 = 63;
        String str = WebrtcBuildVersion.maint_version;
        if (z6) {
            if (j10 != 0) {
                if (j10 > 0) {
                    str = Long.toString(j10, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (j10 >>> 1) / ((long) 5);
                    long j12 = 10;
                    cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            mo387y(str);
            return;
        }
        if (j10 != 0) {
            if (j10 > 0) {
                str = Long.toString(j10, 10);
            } else {
                char[] cArr2 = new char[64];
                long j13 = (j10 >>> 1) / ((long) 5);
                long j14 = 10;
                cArr2[63] = Character.forDigit((int) (j10 - (j13 * j14)), 10);
                while (j13 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j13 % j14), 10);
                    j13 /= j14;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        m385w(str);
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: x */
    public final void mo386x(short s10) {
        if (this.f35828p0) {
            mo387y(String.valueOf(s10 & 65535));
        } else {
            m385w(String.valueOf(s10 & 65535));
        }
    }
}
