package p228J;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Size;
import p001A.AbstractC0010F;
import p391Q.AbstractC6542b;

/* JADX INFO: renamed from: J.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3838h {

    /* JADX INFO: renamed from: a */
    public final int f11612a;

    /* JADX INFO: renamed from: b */
    public final EnumC3873y0 f11613b;

    /* JADX INFO: renamed from: c */
    public final long f11614c;

    public C3838h(int i10, EnumC3873y0 enumC3873y0, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null configType");
        }
        this.f11612a = i10;
        this.f11613b = enumC3873y0;
        this.f11614c = j10;
    }

    /* JADX INFO: renamed from: a */
    public static int m4570a(int i10) {
        if (i10 == 35) {
            return 2;
        }
        if (i10 == 256) {
            return 3;
        }
        if (i10 == 4101) {
            return 4;
        }
        return i10 == 32 ? 5 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static C3838h m4571b(int i10, int i11, Size size, C3840i c3840i) {
        int iM4570a = m4570a(i11);
        EnumC3873y0 enumC3873y0 = EnumC3873y0.NOT_SUPPORT;
        int iM7097a = AbstractC6542b.m7097a(size);
        if (i10 == 1) {
            if (iM7097a <= AbstractC6542b.m7097a((Size) c3840i.f11616b.get(Integer.valueOf(i11)))) {
                enumC3873y0 = EnumC3873y0.s720p;
            } else {
                if (iM7097a <= AbstractC6542b.m7097a((Size) c3840i.f11618d.get(Integer.valueOf(i11)))) {
                    enumC3873y0 = EnumC3873y0.s1440p;
                }
            }
        } else if (iM7097a <= AbstractC6542b.m7097a(c3840i.f11615a)) {
            enumC3873y0 = EnumC3873y0.VGA;
        } else if (iM7097a <= AbstractC6542b.m7097a(c3840i.f11617c)) {
            enumC3873y0 = EnumC3873y0.PREVIEW;
        } else if (iM7097a <= AbstractC6542b.m7097a(c3840i.f11619e)) {
            enumC3873y0 = EnumC3873y0.RECORD;
        } else {
            if (iM7097a <= AbstractC6542b.m7097a((Size) c3840i.f11620f.get(Integer.valueOf(i11)))) {
                enumC3873y0 = EnumC3873y0.MAXIMUM;
            } else {
                Size size2 = (Size) c3840i.f11621g.get(Integer.valueOf(i11));
                if (size2 != null) {
                    if (iM7097a <= size2.getHeight() * size2.getWidth()) {
                        enumC3873y0 = EnumC3873y0.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C3838h(iM4570a, enumC3873y0, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3838h)) {
            return false;
        }
        C3838h c3838h = (C3838h) obj;
        return AbstractC0010F.m17a(this.f11612a, c3838h.f11612a) && this.f11613b.equals(c3838h.f11613b) && this.f11614c == c3838h.f11614c;
    }

    public final int hashCode() {
        int iM24h = (((AbstractC0010F.m24h(this.f11612a) ^ 1000003) * 1000003) ^ this.f11613b.hashCode()) * 1000003;
        long j10 = this.f11614c;
        return iM24h ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("SurfaceConfig{configType=");
        int i10 = this.f11612a;
        if (i10 == 1) {
            str = "PRIV";
        } else if (i10 == 2) {
            str = "YUV";
        } else if (i10 == 3) {
            str = "JPEG";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "RAW";
        } else {
            str = "JPEG_R";
        }
        sb2.append(str);
        sb2.append(", configSize=");
        sb2.append(this.f11613b);
        sb2.append(", streamUseCase=");
        return AbstractC10763a.m11050h(this.f11614c, "}", sb2);
    }
}
