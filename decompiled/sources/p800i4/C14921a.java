package p800i4;

import p372P3.C6329k;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14921a extends C6329k implements InterfaceC14926f {

    /* JADX INFO: renamed from: h */
    public final int f46478h;

    /* JADX INFO: renamed from: i */
    public final long f46479i;

    public C14921a(long j10, long j11, int i10, int i11, boolean z6) {
        super(j10, j11, i10, i11, z6);
        this.f46478h = i10;
        this.f46479i = j10 == -1 ? -1L : j10;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: b */
    public final long mo16087b() {
        return this.f46479i;
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: e */
    public final long mo16088e(long j10) {
        return (Math.max(0L, j10 - this.f20539b) * 8000000) / ((long) this.f20542e);
    }

    @Override // p800i4.InterfaceC14926f
    /* JADX INFO: renamed from: k */
    public final int mo16089k() {
        return this.f46478h;
    }
}
