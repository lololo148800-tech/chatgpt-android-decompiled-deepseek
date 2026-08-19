package p329N3;

import java.util.Arrays;

/* JADX INFO: renamed from: N3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5617g {

    /* JADX INFO: renamed from: a */
    public long f18190a;

    /* JADX INFO: renamed from: b */
    public long f18191b;

    /* JADX INFO: renamed from: c */
    public long f18192c;

    /* JADX INFO: renamed from: d */
    public long f18193d;

    /* JADX INFO: renamed from: e */
    public long f18194e;

    /* JADX INFO: renamed from: f */
    public long f18195f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f18196g = new boolean[15];

    /* JADX INFO: renamed from: h */
    public int f18197h;

    /* JADX INFO: renamed from: a */
    public final boolean m6006a() {
        return this.f18193d > 15 && this.f18197h == 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m6007b(long j10) {
        long j11 = this.f18193d;
        if (j11 == 0) {
            this.f18190a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f18190a;
            this.f18191b = j12;
            this.f18195f = j12;
            this.f18194e = 1L;
        } else {
            long j13 = j10 - this.f18192c;
            int i10 = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f18191b);
            boolean[] zArr = this.f18196g;
            if (jAbs <= 1000000) {
                this.f18194e++;
                this.f18195f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f18197h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f18197h++;
            }
        }
        this.f18193d++;
        this.f18192c = j10;
    }

    /* JADX INFO: renamed from: c */
    public final void m6008c() {
        this.f18193d = 0L;
        this.f18194e = 0L;
        this.f18195f = 0L;
        this.f18197h = 0;
        Arrays.fill(this.f18196g, false);
    }
}
