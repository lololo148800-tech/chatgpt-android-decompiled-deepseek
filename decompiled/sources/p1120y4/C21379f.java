package p1120y4;

import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: y4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21379f extends C21378e {

    /* JADX INFO: renamed from: f */
    public long f67870f;

    /* JADX INFO: renamed from: g */
    public long f67871g;

    @Override // p1120y4.C21378e, p1120y4.C21377d
    public final boolean equals(Object obj) {
        if ((obj instanceof C21379f) && super.equals(obj)) {
            C21379f c21379f = (C21379f) obj;
            if (this.f67870f == c21379f.f67870f && this.f67871g == c21379f.f67871g) {
                return true;
            }
        }
        return false;
    }

    @Override // p1120y4.C21378e, p1120y4.C21377d
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j10 = this.f67870f;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) * 31) + iHashCode;
        long j11 = this.f67871g;
        return i10 + ((int) ((j11 >>> 32) ^ j11));
    }

    @Override // p1120y4.C21378e, p1120y4.C21377d
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.f67866b + ", frameDurationUiNanos=" + this.f67867c + ", frameDurationCpuNanos=" + this.f67869e + ", frameDurationTotalNanos=" + this.f67870f + bQBnquXS.IEbnEql + this.f67871g + ", isJank=" + this.f67868d + ", states=" + this.f67865a + ')';
    }
}
