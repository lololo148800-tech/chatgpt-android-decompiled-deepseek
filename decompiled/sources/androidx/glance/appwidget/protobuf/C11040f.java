package androidx.glance.appwidget.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11040f extends C11042g {

    /* JADX INFO: renamed from: q0 */
    public final int f33291q0;

    /* JADX INFO: renamed from: r0 */
    public final int f33292r0;

    public C11040f(byte[] bArr, int i10, int i11) {
        super(bArr);
        C11042g.m12019i(i10, i10 + i11, bArr.length);
        this.f33291q0 = i10;
        this.f33292r0 = i11;
    }

    @Override // androidx.glance.appwidget.protobuf.C11042g
    /* JADX INFO: renamed from: f */
    public final byte mo12001f(int i10) {
        int i11 = this.f33292r0;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f33303Z[this.f33291q0 + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC10763a.m11048f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC17792x.m19534q("Index > length: ", i10, i11, ", "));
    }

    @Override // androidx.glance.appwidget.protobuf.C11042g
    /* JADX INFO: renamed from: m */
    public final int mo12002m() {
        return this.f33291q0;
    }

    @Override // androidx.glance.appwidget.protobuf.C11042g
    /* JADX INFO: renamed from: p */
    public final byte mo12003p(int i10) {
        return this.f33303Z[this.f33291q0 + i10];
    }

    @Override // androidx.glance.appwidget.protobuf.C11042g
    public final int size() {
        return this.f33292r0;
    }
}
