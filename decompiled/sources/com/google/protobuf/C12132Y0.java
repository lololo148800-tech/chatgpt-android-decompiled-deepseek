package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12132Y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12091G0 f37005a;

    /* JADX INFO: renamed from: b */
    public final String f37006b;

    /* JADX INFO: renamed from: c */
    public final Object[] f37007c;

    /* JADX INFO: renamed from: d */
    public final int f37008d;

    public C12132Y0(InterfaceC12091G0 interfaceC12091G0, String str, Object[] objArr) {
        this.f37005a = interfaceC12091G0;
        this.f37006b = str;
        this.f37007c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37008d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f37008d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC12091G0 m13873a() {
        return this.f37005a;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m13874b() {
        return this.f37007c;
    }

    /* JADX INFO: renamed from: c */
    public final String m13875c() {
        return this.f37006b;
    }

    /* JADX INFO: renamed from: d */
    public final int m13876d() {
        return (this.f37008d & 1) == 1 ? 1 : 2;
    }
}
