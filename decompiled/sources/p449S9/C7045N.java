package p449S9;

/* JADX INFO: renamed from: S9.N */
/* JADX INFO: loaded from: classes.dex */
public final class C7045N extends C7047P {

    /* JADX INFO: renamed from: e */
    public final char[] f22509e;

    public C7045N(C7044M c7044m) {
        super(c7044m, (Character) null);
        this.f22509e = new char[512];
        char[] cArr = c7044m.f22502b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f22509e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override // p449S9.C7047P
    /* JADX INFO: renamed from: a */
    public final void mo7442a(StringBuilder sb2, byte[] bArr, int i10) {
        AbstractC7057a.m7468m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f22509e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
