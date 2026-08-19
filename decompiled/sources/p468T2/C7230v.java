package p468T2;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import p493U2.C7551a;
import p493U2.C7552b;
import p658b5.C11238i;

/* JADX INFO: renamed from: T2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7230v {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f22932d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f22933a;

    /* JADX INFO: renamed from: b */
    public final C11238i f22934b;

    /* JADX INFO: renamed from: c */
    public volatile int f22935c = 0;

    public C7230v(C11238i c11238i, int i10) {
        this.f22934b = c11238i;
        this.f22933a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m7631a(int i10) {
        C7551a c7551aM7633c = m7633c();
        int iM1537a = c7551aM7633c.m1537a(16);
        if (iM1537a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c7551aM7633c.f2088p0;
        int i11 = iM1537a + c7551aM7633c.f2085Y;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final int m7632b() {
        C7551a c7551aM7633c = m7633c();
        int iM1537a = c7551aM7633c.m1537a(16);
        if (iM1537a == 0) {
            return 0;
        }
        int i10 = iM1537a + c7551aM7633c.f2085Y;
        return ((ByteBuffer) c7551aM7633c.f2088p0).getInt(((ByteBuffer) c7551aM7633c.f2088p0).getInt(i10) + i10);
    }

    /* JADX INFO: renamed from: c */
    public final C7551a m7633c() {
        ThreadLocal threadLocal = f22932d;
        C7551a c7551a = (C7551a) threadLocal.get();
        if (c7551a == null) {
            c7551a = new C7551a();
            threadLocal.set(c7551a);
        }
        C7552b c7552b = (C7552b) this.f22934b.f34008Y;
        int iM1537a = c7552b.m1537a(6);
        if (iM1537a != 0) {
            int i10 = iM1537a + c7552b.f2085Y;
            int i11 = (this.f22933a * 4) + ((ByteBuffer) c7552b.f2088p0).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) c7552b.f2088p0).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) c7552b.f2088p0;
            c7551a.f2088p0 = byteBuffer;
            if (byteBuffer != null) {
                c7551a.f2085Y = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                c7551a.f2086Z = i13;
                c7551a.f2087o0 = ((ByteBuffer) c7551a.f2088p0).getShort(i13);
            } else {
                c7551a.f2085Y = 0;
                c7551a.f2086Z = 0;
                c7551a.f2087o0 = 0;
            }
        }
        return c7551a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        C7551a c7551aM7633c = m7633c();
        int iM1537a = c7551aM7633c.m1537a(4);
        sb2.append(Integer.toHexString(iM1537a != 0 ? ((ByteBuffer) c7551aM7633c.f2088p0).getInt(iM1537a + c7551aM7633c.f2085Y) : 0));
        sb2.append(", codepoints:");
        int iM7632b = m7632b();
        for (int i10 = 0; i10 < iM7632b; i10++) {
            sb2.append(Integer.toHexString(m7631a(i10)));
            sb2.append(Separators.f31991SP);
        }
        return sb2.toString();
    }
}
