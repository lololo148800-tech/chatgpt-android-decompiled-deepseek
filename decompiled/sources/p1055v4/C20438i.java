package p1055v4;

import java.util.Arrays;

/* JADX INFO: renamed from: v4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C20438i {

    /* JADX INFO: renamed from: f */
    public static final byte[] f64724f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f64725a;

    /* JADX INFO: renamed from: b */
    public int f64726b;

    /* JADX INFO: renamed from: c */
    public int f64727c;

    /* JADX INFO: renamed from: d */
    public int f64728d;

    /* JADX INFO: renamed from: e */
    public byte[] f64729e;

    /* JADX INFO: renamed from: a */
    public final void m21097a(byte[] bArr, int i10, int i11) {
        if (this.f64725a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f64729e;
            int length = bArr2.length;
            int i13 = this.f64727c + i12;
            if (length < i13) {
                this.f64729e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f64729e, this.f64727c, i12);
            this.f64727c += i12;
        }
    }
}
