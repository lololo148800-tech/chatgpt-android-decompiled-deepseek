package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.A */
/* JADX INFO: loaded from: classes.dex */
public final class C11853A extends AbstractC11857B {

    /* JADX INFO: renamed from: o0 */
    public final transient int f36093o0;

    /* JADX INFO: renamed from: p0 */
    public final transient int f36094p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC11857B f36095q0;

    public C11853A(AbstractC11857B abstractC11857B, int i10, int i11) {
        this.f36095q0 = abstractC11857B;
        this.f36093o0 = i10;
        this.f36094p0 = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC11957g1.m13447i(i10, this.f36094p0);
        return this.f36095q0.get(i10 + this.f36093o0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: i */
    public final int mo13212i() {
        return this.f36095q0.mo13213j() + this.f36093o0 + this.f36094p0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: j */
    public final int mo13213j() {
        return this.f36095q0.mo13213j() + this.f36093o0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: p */
    public final boolean mo13214p() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: q */
    public final Object[] mo13215q() {
        return this.f36095q0.mo13215q();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC11857B, java.util.List
    /* JADX INFO: renamed from: s */
    public final AbstractC11857B subList(int i10, int i11) {
        AbstractC11957g1.m13430F(i10, i11, this.f36094p0);
        int i12 = this.f36093o0;
        return this.f36095q0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36094p0;
    }
}
