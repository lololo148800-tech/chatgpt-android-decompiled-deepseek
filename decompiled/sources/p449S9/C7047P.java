package p449S9;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.io.IOException;
import java.math.RoundingMode;
import p817j$.util.Objects;

/* JADX INFO: renamed from: S9.P */
/* JADX INFO: loaded from: classes.dex */
public class C7047P {

    /* JADX INFO: renamed from: d */
    public static final C7045N f22510d;

    /* JADX INFO: renamed from: a */
    public final C7044M f22511a;

    /* JADX INFO: renamed from: b */
    public final Character f22512b;

    /* JADX INFO: renamed from: c */
    public volatile C7047P f22513c;

    public C7047P(C7044M c7044m, Character ch2) {
        this.f22511a = c7044m;
        if (ch2 != null) {
            byte[] bArr = c7044m.f22507g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC7057a.m7459d("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f22512b = ch2;
    }

    /* JADX INFO: renamed from: a */
    public void mo7442a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        AbstractC7057a.m7468m(0, i10, bArr.length);
        while (i11 < i10) {
            C7044M c7044m = this.f22511a;
            m7443b(sb2, bArr, i11, Math.min(c7044m.f22506f, i10 - i11));
            i11 += c7044m.f22506f;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7443b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        int i12;
        AbstractC7057a.m7468m(i10, i10 + i11, bArr.length);
        C7044M c7044m = this.f22511a;
        if (i11 > c7044m.f22506f) {
            throw new IllegalArgumentException();
        }
        int i13 = 0;
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        while (true) {
            int i16 = i11 * 8;
            i12 = c7044m.f22504d;
            if (i13 >= i16) {
                break;
            }
            sb2.append(c7044m.f22502b[((int) (j10 >>> ((i15 - i12) - i13))) & c7044m.f22503c]);
            i13 += i12;
        }
        if (this.f22512b != null) {
            while (i13 < c7044m.f22506f * 8) {
                sb2.append('=');
                i13 += i12;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m7444c(int i10, byte[] bArr) {
        AbstractC7057a.m7468m(0, i10, bArr.length);
        C7044M c7044m = this.f22511a;
        StringBuilder sb2 = new StringBuilder(c7044m.f22505e * AbstractC7057a.m7456a(i10, c7044m.f22506f, RoundingMode.CEILING));
        try {
            mo7442a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7047P) {
            C7047P c7047p = (C7047P) obj;
            if (this.f22511a.equals(c7047p.f22511a) && Objects.equals(this.f22512b, c7047p.f22512b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22511a.hashCode() ^ Objects.hashCode(this.f22512b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        C7044M c7044m = this.f22511a;
        sb2.append(c7044m);
        if (8 % c7044m.f22504d != 0) {
            Character ch2 = this.f22512b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    static {
        new C7046O("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C7046O("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C7047P("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C7047P(wNrQXvwLiB.BATZdphdjDT, "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f22510d = new C7045N(new C7044M("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C7047P(String str, String str2) {
        this(new C7044M(str, str2.toCharArray()), (Character) '=');
    }
}
