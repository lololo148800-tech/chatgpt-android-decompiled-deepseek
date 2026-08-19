package p824j4;

import p1073w3.AbstractC20800b;
import p372P3.C6315G;

/* JADX INFO: renamed from: j4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C16121q {

    /* JADX INFO: renamed from: a */
    public final boolean f50005a;

    /* JADX INFO: renamed from: b */
    public final String f50006b;

    /* JADX INFO: renamed from: c */
    public final C6315G f50007c;

    /* JADX INFO: renamed from: d */
    public final int f50008d;

    /* JADX INFO: renamed from: e */
    public final byte[] f50009e;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C16121q(boolean z6, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 2;
        byte b = 0;
        AbstractC20800b.m21316d((i10 == 0) ^ (bArr2 == null));
        this.f50005a = z6;
        this.f50006b = str;
        this.f50008d = i10;
        this.f50009e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    break;
                default:
                    AbstractC20800b.m21332t("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i13 = 1;
                    break;
            }
        } else {
            i13 = 1;
        }
        this.f50007c = new C6315G(i13, i11, i12, bArr);
    }
}
