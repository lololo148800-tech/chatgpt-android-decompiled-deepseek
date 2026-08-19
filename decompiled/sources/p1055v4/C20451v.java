package p1055v4;

import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p372P3.C6330l;

/* JADX INFO: renamed from: v4.v */
/* JADX INFO: loaded from: classes.dex */
public final class C20451v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64898a;

    /* JADX INFO: renamed from: b */
    public final C20816r f64899b;

    /* JADX INFO: renamed from: c */
    public final C20811m f64900c;

    /* JADX INFO: renamed from: d */
    public boolean f64901d;

    /* JADX INFO: renamed from: e */
    public boolean f64902e;

    /* JADX INFO: renamed from: f */
    public boolean f64903f;

    /* JADX INFO: renamed from: g */
    public long f64904g;

    /* JADX INFO: renamed from: h */
    public long f64905h;

    /* JADX INFO: renamed from: i */
    public long f64906i;

    public C20451v(int i10) {
        this.f64898a = i10;
        switch (i10) {
            case 1:
                this.f64899b = new C20816r(0L);
                this.f64904g = -9223372036854775807L;
                this.f64905h = -9223372036854775807L;
                this.f64906i = -9223372036854775807L;
                this.f64900c = new C20811m();
                break;
            default:
                this.f64899b = new C20816r(0L);
                this.f64904g = -9223372036854775807L;
                this.f64905h = -9223372036854775807L;
                this.f64906i = -9223372036854775807L;
                this.f64900c = new C20811m();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21105b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m21106c(C20811m c20811m) {
        int i10 = c20811m.f66093b;
        if (c20811m.m21346a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c20811m.m21350e(bArr, 0, 9);
        c20811m.m21344F(i10);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b;
                    long j11 = b10;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m21107a(C6330l c6330l) {
        switch (this.f64898a) {
            case 0:
                byte[] bArr = AbstractC20817s.f66111f;
                C20811m c20811m = this.f64900c;
                c20811m.getClass();
                c20811m.m21342D(bArr.length, bArr);
                this.f64901d = true;
                c6330l.f20550r0 = 0;
                break;
            default:
                byte[] bArr2 = AbstractC20817s.f66111f;
                C20811m c20811m2 = this.f64900c;
                c20811m2.getClass();
                c20811m2.m21342D(bArr2.length, bArr2);
                this.f64901d = true;
                c6330l.f20550r0 = 0;
                break;
        }
    }
}
