package p1016t3;

import java.util.Arrays;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: t3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19775b {

    /* JADX INFO: renamed from: c */
    public static final C19775b f62661c = new C19775b(new C19774a[0]);

    /* JADX INFO: renamed from: d */
    public static final C19774a f62662d;

    /* JADX INFO: renamed from: a */
    public final int f62663a;

    /* JADX INFO: renamed from: b */
    public final C19774a[] f62664b;

    static {
        C19774a c19774a = new C19774a(-1, -1, new int[0], new C19797x[0], new long[0]);
        int[] iArr = c19774a.f62659e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c19774a.f62660f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f62662d = new C19774a(0, c19774a.f62656b, iArrCopyOf, (C19797x[]) Arrays.copyOf(c19774a.f62658d, 0), jArrCopyOf);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
    }

    public C19775b(C19774a[] c19774aArr) {
        this.f62663a = c19774aArr.length;
        this.f62664b = c19774aArr;
    }

    /* JADX INFO: renamed from: a */
    public final C19774a m20732a(int i10) {
        return i10 < 0 ? f62662d : this.f62664b[i10];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20733b(int i10) {
        if (i10 != this.f62663a - 1) {
            return false;
        }
        m20732a(i10).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19775b.class != obj.getClass()) {
            return false;
        }
        C19775b c19775b = (C19775b) obj;
        return AbstractC20817s.m21400a(null, null) && this.f62663a == c19775b.f62663a && Arrays.equals(this.f62664b, c19775b.f62664b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f62664b) + (((((this.f62663a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            C19774a[] c19774aArr = this.f62664b;
            if (i10 >= c19774aArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            c19774aArr[i10].getClass();
            for (int i11 = 0; i11 < c19774aArr[i10].f62659e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = c19774aArr[i10].f62659e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(c19774aArr[i10].f62660f[i11]);
                sb2.append(')');
                if (i11 < c19774aArr[i10].f62659e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < c19774aArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
