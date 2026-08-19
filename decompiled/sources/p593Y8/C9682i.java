package p593Y8;

import android.gov.nist.core.Separators;
import android.util.Base64;
import fo.C13711h;
import java.util.Arrays;
import p522V8.EnumC7837d;

/* JADX INFO: renamed from: Y8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9682i {

    /* JADX INFO: renamed from: a */
    public final String f29188a;

    /* JADX INFO: renamed from: b */
    public final byte[] f29189b;

    /* JADX INFO: renamed from: c */
    public final EnumC7837d f29190c;

    public C9682i(String str, byte[] bArr, EnumC7837d enumC7837d) {
        this.f29188a = str;
        this.f29189b = bArr;
        this.f29190c = enumC7837d;
    }

    /* JADX INFO: renamed from: a */
    public static C13711h m10270a() {
        C13711h c13711h = new C13711h(17, false);
        c13711h.f43261p0 = EnumC7837d.f24731Y;
        return c13711h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9682i)) {
            return false;
        }
        C9682i c9682i = (C9682i) obj;
        return this.f29188a.equals(c9682i.f29188a) && Arrays.equals(this.f29189b, c9682i.f29189b) && this.f29190c.equals(c9682i.f29190c);
    }

    public final int hashCode() {
        return ((((this.f29188a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29189b)) * 1000003) ^ this.f29190c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f29189b;
        return "TransportContext(" + this.f29188a + ", " + this.f29190c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + Separators.RPAREN;
    }
}
