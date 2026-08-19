package p1016t3;

import android.net.Uri;
import java.util.Arrays;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C19774a {

    /* JADX INFO: renamed from: a */
    public final int f62655a;

    /* JADX INFO: renamed from: b */
    public final int f62656b;

    /* JADX INFO: renamed from: c */
    public final Uri[] f62657c;

    /* JADX INFO: renamed from: d */
    public final C19797x[] f62658d;

    /* JADX INFO: renamed from: e */
    public final int[] f62659e;

    /* JADX INFO: renamed from: f */
    public final long[] f62660f;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC20817s.m21425z(5);
        AbstractC20817s.m21425z(6);
        AbstractC20817s.m21425z(7);
        AbstractC20817s.m21425z(8);
    }

    public C19774a(int i10, int i11, int[] iArr, C19797x[] c19797xArr, long[] jArr) {
        Uri uri;
        int i12 = 0;
        AbstractC20800b.m21316d(iArr.length == c19797xArr.length);
        this.f62655a = i10;
        this.f62656b = i11;
        this.f62659e = iArr;
        this.f62658d = c19797xArr;
        this.f62660f = jArr;
        this.f62657c = new Uri[c19797xArr.length];
        while (true) {
            Uri[] uriArr = this.f62657c;
            if (i12 >= uriArr.length) {
                return;
            }
            C19797x c19797x = c19797xArr[i12];
            if (c19797x == null) {
                uri = null;
            } else {
                C19794u c19794u = c19797x.f62786b;
                c19794u.getClass();
                uri = c19794u.f62779a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m20731a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f62659e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19774a.class != obj.getClass()) {
            return false;
        }
        C19774a c19774a = (C19774a) obj;
        return this.f62655a == c19774a.f62655a && this.f62656b == c19774a.f62656b && Arrays.equals(this.f62658d, c19774a.f62658d) && Arrays.equals(this.f62659e, c19774a.f62659e) && Arrays.equals(this.f62660f, c19774a.f62660f);
    }

    public final int hashCode() {
        int i10 = ((this.f62655a * 31) + this.f62656b) * 31;
        int i11 = (int) 0;
        return (((Arrays.hashCode(this.f62660f) + ((Arrays.hashCode(this.f62659e) + ((Arrays.hashCode(this.f62658d) + ((i10 + i11) * 31)) * 31)) * 31)) * 31) + i11) * 31;
    }
}
