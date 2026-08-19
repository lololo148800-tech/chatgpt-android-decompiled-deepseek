package p538W2;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: W2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8420e {

    /* JADX INFO: renamed from: a */
    public final long f26179a;

    /* JADX INFO: renamed from: b */
    public final long f26180b;

    public C8420e(long j10, long j11) {
        if (j11 == 0) {
            this.f26179a = 0L;
            this.f26180b = 1L;
        } else {
            this.f26179a = j10;
            this.f26180b = j11;
        }
    }

    public final String toString() {
        return this.f26179a + Separators.SLASH + this.f26180b;
    }
}
