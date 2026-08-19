package p640a6;

import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: a6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10507b {

    /* JADX INFO: renamed from: a */
    public String f31128a;

    /* JADX INFO: renamed from: b */
    public String f31129b;

    /* JADX INFO: renamed from: c */
    public float f31130c;

    /* JADX INFO: renamed from: d */
    public int f31131d;

    /* JADX INFO: renamed from: e */
    public int f31132e;

    /* JADX INFO: renamed from: f */
    public float f31133f;

    /* JADX INFO: renamed from: g */
    public float f31134g;

    /* JADX INFO: renamed from: h */
    public int f31135h;

    /* JADX INFO: renamed from: i */
    public int f31136i;

    /* JADX INFO: renamed from: j */
    public float f31137j;

    /* JADX INFO: renamed from: k */
    public boolean f31138k;

    /* JADX INFO: renamed from: l */
    public PointF f31139l;

    /* JADX INFO: renamed from: m */
    public PointF f31140m;

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f31131d, ((int) (AbstractC0168G.m527p(this.f31128a.hashCode() * 31, 31, this.f31129b) + this.f31130c)) * 31, 31) + this.f31132e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f31133f);
        return (((iM13820k * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f31135h;
    }
}
