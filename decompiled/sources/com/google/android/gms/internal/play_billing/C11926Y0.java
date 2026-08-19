package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11926Y0 extends C11929Z0 {

    /* JADX INFO: renamed from: p0 */
    public final int f36224p0;

    public C11926Y0(int i10, byte[] bArr) {
        super(bArr);
        C11929Z0.m13374m(0, i10, bArr.length);
        this.f36224p0 = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.C11929Z0
    /* JADX INFO: renamed from: f */
    public final byte mo13366f(int i10) {
        int i11 = this.f36224p0;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f36229Z[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC10763a.m11048f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC17792x.m19534q("Index > length: ", i10, i11, ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.C11929Z0
    /* JADX INFO: renamed from: i */
    public final byte mo13367i(int i10) {
        return this.f36229Z[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.C11929Z0
    /* JADX INFO: renamed from: j */
    public final int mo13368j() {
        return this.f36224p0;
    }
}
