package p182H3;

import android.media.MediaCodecInfo;
import bb.C11294T;
import java.util.List;
import p056C2.AbstractC1510d;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8096g6;

/* JADX INFO: renamed from: H3.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3214o {
    /* JADX WARN: Code duplicated, block: B:20:0x0040 A[EDGE_INSN: B:20:0x0040->B:45:0x00bb BREAK  A[LOOP:1: B:24:0x0060->B:44:0x00b8]] */
    /* JADX INFO: renamed from: a */
    public static int m4083a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        char c9;
        boolean z6;
        int i12;
        List supportedPerformancePoints;
        List supportedPerformancePoints2 = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints2 == null || supportedPerformancePoints2.isEmpty()) {
            return 0;
        }
        AbstractC1510d.m2195l();
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM2189f = AbstractC1510d.m2189f(i10, i11, (int) d10);
        int i13 = 0;
        while (true) {
            c9 = 2;
            z6 = true;
            if (i13 >= supportedPerformancePoints2.size()) {
                i12 = 1;
                break;
            }
            if (AbstractC1510d.m2190g(supportedPerformancePoints2.get(i13)).covers(performancePointM2189f)) {
                i12 = 2;
                break;
            }
            i13++;
        }
        if (i12 == 1 && AbstractC8096g6.f25433a == null) {
            if (AbstractC20817s.f66106a >= 35) {
                z6 = false;
                break;
            }
            try {
                C19787n c19787n = new C19787n();
                c19787n.f62714l = AbstractC19754D.m20711i("video/avc");
                C19788o c19788o = new C19788o(c19787n);
                if (c19788o.f62752m != null) {
                    C11294T c11294tM4050g = AbstractC3199A.m4050g(C3221v.f9786Z, c19788o, false, false);
                    for (int i14 = 0; i14 < c11294tM4050g.f34187p0; i14++) {
                        if (((C3213n) c11294tM4050g.get(i14)).f9706d != null && ((C3213n) c11294tM4050g.get(i14)).f9706d.getVideoCapabilities() != null && (supportedPerformancePoints = ((C3213n) c11294tM4050g.get(i14)).f9706d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            AbstractC1510d.m2195l();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM2188e = AbstractC1510d.m2188e();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= supportedPerformancePoints.size()) {
                                    c9 = 1;
                                    break;
                                }
                                if (AbstractC1510d.m2190g(supportedPerformancePoints.get(i15)).covers(performancePointM2188e)) {
                                    break;
                                }
                                i15++;
                            }
                            if (c9 == 1) {
                                break;
                            }
                            z6 = false;
                            break;
                        }
                    }
                }
            } catch (C3223x unused) {
            }
            AbstractC8096g6.f25433a = Boolean.valueOf(z6);
            if (z6) {
                return 0;
            }
        }
        return i12;
    }
}
