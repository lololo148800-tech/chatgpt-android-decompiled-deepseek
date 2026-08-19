package p449S9;

/* JADX INFO: renamed from: S9.O */
/* JADX INFO: loaded from: classes.dex */
public final class C7046O extends C7047P {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7046O(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new C7044M(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p449S9.C7047P
    /* JADX INFO: renamed from: a */
    public final void mo7442a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        AbstractC7057a.m7468m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            C7044M c7044m = this.f22511a;
            sb2.append(c7044m.f22502b[i13 >>> 18]);
            char[] cArr = c7044m.f22502b;
            sb2.append(cArr[(i13 >>> 12) & 63]);
            sb2.append(cArr[(i13 >>> 6) & 63]);
            sb2.append(cArr[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            m7443b(sb2, bArr, i11, i10 - i11);
        }
    }
}
