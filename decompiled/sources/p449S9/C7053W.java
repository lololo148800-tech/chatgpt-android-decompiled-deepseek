package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: S9.W */
/* JADX INFO: loaded from: classes.dex */
public final class C7053W extends C7054X {

    /* JADX INFO: renamed from: p0 */
    public final int f22523p0;

    /* JADX INFO: renamed from: q0 */
    public final int f22524q0;

    public C7053W(byte[] bArr, int i10, int i11) {
        super(bArr);
        C7054X.m7450r(i10, i10 + i11, bArr.length);
        this.f22523p0 = i10;
        this.f22524q0 = i11;
    }

    @Override // p449S9.C7054X
    /* JADX INFO: renamed from: f */
    public final byte mo7445f(int i10) {
        int i11 = this.f22524q0;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f22527Z[this.f22523p0 + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC10763a.m11048f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC17792x.m19534q("Index > length: ", i10, i11, ", "));
    }

    @Override // p449S9.C7054X
    /* JADX INFO: renamed from: i */
    public final byte mo7446i(int i10) {
        return this.f22527Z[this.f22523p0 + i10];
    }

    @Override // p449S9.C7054X
    /* JADX INFO: renamed from: j */
    public final int mo7447j() {
        return this.f22523p0;
    }

    @Override // p449S9.C7054X
    /* JADX INFO: renamed from: m */
    public final int mo7448m() {
        return this.f22524q0;
    }

    @Override // p449S9.C7054X
    /* JADX INFO: renamed from: p */
    public final void mo7449p(int i10, byte[] bArr) {
        System.arraycopy(this.f22527Z, this.f22523p0, bArr, 0, i10);
    }
}
