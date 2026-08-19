package p1142z3;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9306j0;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: z3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C21738f extends AbstractC21735c {

    /* JADX INFO: renamed from: q0 */
    public C21743k f68958q0;

    /* JADX INFO: renamed from: r0 */
    public byte[] f68959r0;

    /* JADX INFO: renamed from: s0 */
    public int f68960s0;

    /* JADX INFO: renamed from: t0 */
    public int f68961t0;

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C19755E, C21741i {
        m22237m();
        this.f68958q0 = c21743k;
        Uri uriNormalizeScheme = c21743k.f68974a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC20800b.m21315c("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = AbstractC20817s.f66106a;
        String[] strArrSplit = schemeSpecificPart.split(Separators.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new C19755E("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f68959r0 = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new C19755E(AbstractC9306j0.m9889h("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f68959r0 = URLDecoder.decode(str, AbstractC10531d.f31240a.name()).getBytes(AbstractC10531d.f31242c);
        }
        byte[] bArr = this.f68959r0;
        long length = bArr.length;
        long j10 = c21743k.f68979f;
        if (j10 > length) {
            this.f68959r0 = null;
            throw new C21741i(2008);
        }
        int i11 = (int) j10;
        this.f68960s0 = i11;
        int length2 = bArr.length - i11;
        this.f68961t0 = length2;
        long j11 = c21743k.f68980g;
        if (j11 != -1) {
            this.f68961t0 = (int) Math.min(length2, j11);
        }
        m22238n(c21743k);
        return j11 != -1 ? j11 : this.f68961t0;
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        if (this.f68959r0 != null) {
            this.f68959r0 = null;
            m22236l();
        }
        this.f68958q0 = null;
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        C21743k c21743k = this.f68958q0;
        if (c21743k != null) {
            return c21743k.f68974a;
        }
        return null;
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f68961t0;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f68959r0;
        int i13 = AbstractC20817s.f66106a;
        System.arraycopy(bArr2, this.f68960s0, bArr, i10, iMin);
        this.f68960s0 += iMin;
        this.f68961t0 -= iMin;
        m22235g(iMin);
        return iMin;
    }
}
