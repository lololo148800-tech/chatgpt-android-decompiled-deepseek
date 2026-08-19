package p372P3;

import java.io.Serializable;

/* JADX INFO: renamed from: P3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6344z {

    /* JADX INFO: renamed from: a */
    public int f20595a;

    /* JADX INFO: renamed from: b */
    public int f20596b;

    /* JADX INFO: renamed from: c */
    public int f20597c;

    /* JADX INFO: renamed from: d */
    public int f20598d;

    /* JADX INFO: renamed from: e */
    public int f20599e;

    /* JADX INFO: renamed from: f */
    public int f20600f;

    /* JADX INFO: renamed from: g */
    public Serializable f20601g;

    /* JADX INFO: renamed from: a */
    public boolean m6959a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f20595a = i11;
        this.f20601g = AbstractC6320b.f20490s[3 - i12];
        int i15 = AbstractC6320b.f20491t[i14];
        this.f20597c = i15;
        if (i11 == 2) {
            this.f20597c = i15 / 2;
        } else if (i11 == 0) {
            this.f20597c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f20600f = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? AbstractC6320b.f20492u[i13 - 1] : AbstractC6320b.f20493v[i13 - 1];
            this.f20599e = i18;
            this.f20596b = (((i18 * 12) / this.f20597c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? AbstractC6320b.f20494w[i13 - 1] : AbstractC6320b.f20495x[i13 - 1];
                this.f20599e = i19;
                this.f20596b = ((i19 * 144) / this.f20597c) + i16;
            } else {
                int i20 = AbstractC6320b.f20496y[i13 - 1];
                this.f20599e = i20;
                this.f20596b = (((i12 == 1 ? 72 : 144) * i20) / this.f20597c) + i16;
            }
        }
        this.f20598d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
