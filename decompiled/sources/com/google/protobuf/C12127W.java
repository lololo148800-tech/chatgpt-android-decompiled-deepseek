package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C12127W implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final int f36983Y;

    /* JADX INFO: renamed from: Z */
    public final EnumC12101J1 f36984Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f36985o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f36986p0;

    public C12127W(InterfaceC12154g0 interfaceC12154g0, int i10, EnumC12101J1 enumC12101J1, boolean z6, boolean z10) {
        this.f36983Y = i10;
        this.f36984Z = enumC12101J1;
        this.f36985o0 = z6;
        this.f36986p0 = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f36983Y - ((C12127W) obj).f36983Y;
    }
}
