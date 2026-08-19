package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.protobuf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C12165k extends C12168l {

    /* JADX INFO: renamed from: q0 */
    public final int f37042q0;

    /* JADX INFO: renamed from: r0 */
    public final int f37043r0;

    public C12165k(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC12171m.m14009i(i10, i10 + i11, bArr.length);
        this.f37042q0 = i10;
        this.f37043r0 = i11;
    }

    @Override // com.google.protobuf.C12168l, com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: f */
    public final byte mo13999f(int i10) {
        int i11 = this.f37043r0;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f37046p0[this.f37042q0 + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC10763a.m11048f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC17792x.m19534q("Index > length: ", i10, i11, ", "));
    }

    @Override // com.google.protobuf.C12168l, com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: p */
    public final void mo14000p(int i10, byte[] bArr) {
        System.arraycopy(this.f37046p0, this.f37042q0, bArr, 0, i10);
    }

    @Override // com.google.protobuf.C12168l, com.google.protobuf.AbstractC12171m
    /* JADX INFO: renamed from: q */
    public final byte mo14001q(int i10) {
        return this.f37046p0[this.f37042q0 + i10];
    }

    @Override // com.google.protobuf.C12168l, com.google.protobuf.AbstractC12171m
    public final int size() {
        return this.f37043r0;
    }

    @Override // com.google.protobuf.C12168l
    /* JADX INFO: renamed from: y */
    public final int mo14002y() {
        return this.f37042q0;
    }
}
