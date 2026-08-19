package p1030u1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: u1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20095b {

    /* JADX INFO: renamed from: a */
    public int f63624a;

    /* JADX INFO: renamed from: b */
    public long[] f63625b = new long[32];

    /* JADX INFO: renamed from: a */
    public void m20921a(long j10) {
        int i10 = this.f63624a;
        long[] jArr = this.f63625b;
        if (i10 == jArr.length) {
            this.f63625b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f63625b;
        int i11 = this.f63624a;
        this.f63624a = i11 + 1;
        jArr2[i11] = j10;
    }

    /* JADX INFO: renamed from: b */
    public void m20922b(long j10) {
        if (m20923c(j10)) {
            return;
        }
        int i10 = this.f63624a;
        long[] jArr = this.f63625b;
        if (i10 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            AbstractC16544l.m18093f(jArrCopyOf, "copyOf(this, newSize)");
            this.f63625b = jArrCopyOf;
        }
        this.f63625b[i10] = j10;
        if (i10 >= this.f63624a) {
            this.f63624a = i10 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m20923c(long j10) {
        int i10 = this.f63624a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f63625b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long m20924d(int i10) {
        if (i10 >= 0 && i10 < this.f63624a) {
            return this.f63625b[i10];
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Invalid index ", ", size is ");
        sbM11057o.append(this.f63624a);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: e */
    public void m20925e(int i10) {
        int i11 = this.f63624a;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f63625b;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f63624a--;
        }
    }
}
