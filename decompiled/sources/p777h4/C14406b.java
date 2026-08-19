package p777h4;

import java.util.ArrayDeque;
import p372P3.C6330l;
import p588Y2.C9642z;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14406b {

    /* JADX INFO: renamed from: a */
    public final byte[] f45154a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f45155b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final C14409e f45156c = new C14409e();

    /* JADX INFO: renamed from: d */
    public C9642z f45157d;

    /* JADX INFO: renamed from: e */
    public int f45158e;

    /* JADX INFO: renamed from: f */
    public int f45159f;

    /* JADX INFO: renamed from: g */
    public long f45160g;

    /* JADX INFO: renamed from: a */
    public final long m15898a(C6330l c6330l, int i10) {
        byte[] bArr = this.f45154a;
        c6330l.mo3046b(bArr, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }
}
