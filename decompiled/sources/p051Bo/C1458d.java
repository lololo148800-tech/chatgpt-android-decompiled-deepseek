package p051Bo;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: Bo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1458d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3832a;

    /* JADX INFO: renamed from: b */
    public long f3833b;

    /* JADX INFO: renamed from: c */
    public long f3834c;

    public C1458d(long j10, long j11) {
        this.f3832a = 1;
        this.f3833b = j10;
        this.f3834c = j11;
    }

    public String toString() {
        switch (this.f3832a) {
            case 1:
                return this.f3833b + Separators.SLASH + this.f3834c;
            default:
                return super.toString();
        }
    }

    public C1458d() {
        this.f3832a = 2;
        this.f3833b = -9223372036854775807L;
        this.f3834c = -9223372036854775807L;
    }

    public C1458d(long j10, int i10, long j11) {
        this.f3832a = 0;
        this.f3833b = j10;
        this.f3834c = j11;
    }
}
