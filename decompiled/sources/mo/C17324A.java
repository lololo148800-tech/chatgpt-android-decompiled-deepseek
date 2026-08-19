package mo;

import p026Ao.InterfaceC0676j;

/* JADX INFO: renamed from: mo.A */
/* JADX INFO: loaded from: classes2.dex */
public final class C17324A extends AbstractC17325B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C17352s f55156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte[] f55158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f55159d;

    public C17324A(C17352s c17352s, int i10, byte[] bArr, int i11) {
        this.f55156a = c17352s;
        this.f55157b = i10;
        this.f55158c = bArr;
        this.f55159d = i11;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: a */
    public final long mo4142a() {
        return this.f55157b;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: b */
    public final C17352s mo4143b() {
        return this.f55156a;
    }

    @Override // mo.AbstractC17325B
    /* JADX INFO: renamed from: d */
    public final void mo4145d(InterfaceC0676j interfaceC0676j) {
        interfaceC0676j.mo1336h0(this.f55158c, this.f55159d, this.f55157b);
    }
}
