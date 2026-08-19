package p1055v4;

import java.util.Arrays;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C20436g {

    /* JADX INFO: renamed from: e */
    public static final byte[] f64702e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f64703a;

    /* JADX INFO: renamed from: b */
    public int f64704b;

    /* JADX INFO: renamed from: c */
    public int f64705c;

    /* JADX INFO: renamed from: d */
    public byte[] f64706d;

    /* JADX INFO: renamed from: a */
    public final void m21096a(byte[] bArr, int i10, int i11) {
        if (this.f64703a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f64706d;
            int length = bArr2.length;
            int i13 = this.f64704b + i12;
            if (length < i13) {
                this.f64706d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f64706d, this.f64704b, i12);
            this.f64704b += i12;
        }
    }
}
