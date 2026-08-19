package p1142z3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p1016t3.AbstractC19798y;
import p1073w3.AbstractC20800b;
import p817j$.util.DesugarCollections;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: z3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C21743k {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f68973j = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f68974a;

    /* JADX INFO: renamed from: b */
    public final long f68975b;

    /* JADX INFO: renamed from: c */
    public final int f68976c;

    /* JADX INFO: renamed from: d */
    public final byte[] f68977d;

    /* JADX INFO: renamed from: e */
    public final Map f68978e;

    /* JADX INFO: renamed from: f */
    public final long f68979f;

    /* JADX INFO: renamed from: g */
    public final long f68980g;

    /* JADX INFO: renamed from: h */
    public final String f68981h;

    /* JADX INFO: renamed from: i */
    public final int f68982i;

    static {
        AbstractC19798y.m20754a("media3.datasource");
    }

    public C21743k(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11) {
        byte[] bArr2 = bArr;
        AbstractC20800b.m21316d(j10 + j11 >= 0);
        AbstractC20800b.m21316d(j11 >= 0);
        AbstractC20800b.m21316d(j12 > 0 || j12 == -1);
        uri.getClass();
        this.f68974a = uri;
        this.f68975b = j10;
        this.f68976c = i10;
        this.f68977d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f68978e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f68979f = j11;
        this.f68980g = j12;
        this.f68981h = str;
        this.f68982i = i11;
    }

    /* JADX INFO: renamed from: a */
    public final C21742j m22240a() {
        C21742j c21742j = new C21742j();
        c21742j.f68964a = this.f68974a;
        c21742j.f68965b = this.f68975b;
        c21742j.f68966c = this.f68976c;
        c21742j.f68967d = this.f68977d;
        c21742j.f68968e = this.f68978e;
        c21742j.f68969f = this.f68979f;
        c21742j.f68970g = this.f68980g;
        c21742j.f68971h = this.f68981h;
        c21742j.f68972i = this.f68982i;
        return c21742j;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f68976c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(Separators.f31991SP);
        sb2.append(this.f68974a);
        sb2.append(", ");
        sb2.append(this.f68979f);
        sb2.append(", ");
        sb2.append(this.f68980g);
        sb2.append(", ");
        sb2.append(this.f68981h);
        sb2.append(", ");
        return AbstractC10763a.m11056n(sb2, this.f68982i, sVDIzpC.ERYEAN);
    }
}
