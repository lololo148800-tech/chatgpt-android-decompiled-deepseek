package p833jc;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: jc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16190a {

    /* JADX INFO: renamed from: g */
    public static final C16190a f50256g;

    /* JADX INFO: renamed from: a */
    public final int[] f50257a;

    /* JADX INFO: renamed from: b */
    public final int[] f50258b;

    /* JADX INFO: renamed from: c */
    public final C16191b f50259c;

    /* JADX INFO: renamed from: d */
    public final int f50260d;

    /* JADX INFO: renamed from: e */
    public final int f50261e;

    /* JADX INFO: renamed from: f */
    public final int f50262f;

    static {
        new C16190a(4201, 4096, 1);
        new C16190a(1033, 1024, 1);
        new C16190a(67, 64, 1);
        new C16190a(19, 16, 1);
        f50256g = new C16190a(285, 256, 0);
        new C16190a(301, 256, 1);
    }

    public C16190a(int i10, int i11, int i12) {
        this.f50261e = i10;
        this.f50260d = i11;
        this.f50262f = i12;
        this.f50257a = new int[i11];
        this.f50258b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f50257a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f50258b[this.f50257a[i15]] = i15;
        }
        this.f50259c = new C16191b(this, new int[]{0});
    }

    /* JADX INFO: renamed from: a */
    public final int m17799a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f50258b;
        return this.f50257a[(iArr[i10] + iArr[i11]) % (this.f50260d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f50261e));
        sb2.append(',');
        return AbstractC12107L1.m13826q(sb2, this.f50260d, ')');
    }
}
