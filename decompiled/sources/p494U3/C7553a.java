package p494U3;

import p372P3.AbstractC6327i;

/* JADX INFO: renamed from: U3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7553a extends AbstractC6327i {
    /* JADX INFO: renamed from: I */
    public static int m7908I(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
