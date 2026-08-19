package p593Y8;

import java.util.Arrays;
import p522V8.C7836c;

/* JADX INFO: renamed from: Y8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9685l {

    /* JADX INFO: renamed from: a */
    public final C7836c f29198a;

    /* JADX INFO: renamed from: b */
    public final byte[] f29199b;

    public C9685l(C7836c c7836c, byte[] bArr) {
        if (c7836c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f29198a = c7836c;
        this.f29199b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9685l)) {
            return false;
        }
        C9685l c9685l = (C9685l) obj;
        if (this.f29198a.equals(c9685l.f29198a)) {
            return Arrays.equals(this.f29199b, c9685l.f29199b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29198a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29199b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f29198a + ", bytes=[...]}";
    }
}
