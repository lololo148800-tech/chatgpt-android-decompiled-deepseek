package p449S9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: S9.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7060b0 extends AbstractC7072h0 {

    /* JADX INFO: renamed from: Y */
    public final C7054X f22537Y;

    public C7060b0(C7054X c7054x) {
        this.f22537Y = c7054x;
    }

    @Override // p449S9.AbstractC7072h0
    /* JADX INFO: renamed from: a */
    public final int mo7454a() {
        return AbstractC7072h0.m7475d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC7072h0 abstractC7072h0 = (AbstractC7072h0) obj;
        int iMo7454a = abstractC7072h0.mo7454a();
        int iM7475d = AbstractC7072h0.m7475d((byte) 64);
        if (iM7475d != iMo7454a) {
            return iM7475d - abstractC7072h0.mo7454a();
        }
        C7054X c7054x = this.f22537Y;
        byte[] bArr = c7054x.f22527Z;
        int length = bArr.length;
        C7054X c7054x2 = ((C7060b0) abstractC7072h0).f22537Y;
        byte[] bArr2 = c7054x2.f22527Z;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return AbstractC7050T.f22517a.compare(c7054x.m7453t(), c7054x2.m7453t());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7060b0.class == obj.getClass()) {
            return this.f22537Y.equals(((C7060b0) obj).f22537Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC7072h0.m7475d((byte) 64)), this.f22537Y});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C7044M c7044m;
        int i10;
        boolean z6;
        C7045N c7045n = C7047P.f22510d;
        C7047P c7045n2 = c7045n.f22513c;
        if (c7045n2 == null) {
            C7044M c7044m2 = c7045n.f22511a;
            int i11 = 0;
            while (true) {
                char[] cArr = c7044m2.f22502b;
                if (i11 >= cArr.length) {
                    c7044m = c7044m2;
                    break;
                }
                char c9 = cArr[i11];
                if (c9 >= 'a' && c9 <= 'z') {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= cArr.length) {
                            z6 = false;
                            break;
                        }
                        char c10 = cArr[i12];
                        if (c10 >= 'A' && c10 <= 'Z') {
                            z6 = true;
                            break;
                        }
                        i12++;
                    }
                    if (!z6) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i13 = 0; i13 < cArr.length; i13++) {
                            char c11 = cArr[i13];
                            if (c11 >= 97 && c11 <= 122) {
                                c11 ^= 32;
                            }
                            cArr2[i13] = (char) c11;
                        }
                        c7044m = new C7044M(c7044m2.f22501a.concat(".upperCase()"), cArr2);
                        if (!c7044m2.f22508h || c7044m.f22508h) {
                            break;
                            break;
                        }
                        byte[] bArr = c7044m.f22507g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i10 = 65; i10 <= 90; i10++) {
                            int i14 = i10 | 32;
                            byte b = bArr[i10];
                            byte b10 = bArr[i14];
                            if (b == -1) {
                                bArrCopyOf[i10] = b10;
                            } else {
                                char c12 = (char) i10;
                                char c13 = (char) i14;
                                if (b10 != -1) {
                                    throw new IllegalStateException(AbstractC7057a.m7459d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                }
                                bArrCopyOf[i14] = b;
                            }
                        }
                        c7044m = new C7044M(c7044m.f22501a.concat(MMVKXkcLpuHFDi.dftlUQ), c7044m.f22502b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i11++;
            }
            c7045n2 = c7044m == c7044m2 ? c7045n : new C7045N(c7044m);
            c7045n.f22513c = c7045n2;
        }
        byte[] bArrM7453t = this.f22537Y.m7453t();
        return AbstractC10763a.m11054l("h'", c7045n2.m7444c(bArrM7453t.length, bArrM7453t), Separators.QUOTE);
    }
}
