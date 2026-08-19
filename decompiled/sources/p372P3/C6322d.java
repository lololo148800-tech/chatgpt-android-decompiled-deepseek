package p372P3;

/* JADX INFO: renamed from: P3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6322d implements InterfaceC6310B {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6324f f20509a;

    /* JADX INFO: renamed from: b */
    public final long f20510b;

    /* JADX INFO: renamed from: c */
    public final long f20511c;

    /* JADX INFO: renamed from: d */
    public final long f20512d;

    /* JADX INFO: renamed from: e */
    public final long f20513e;

    /* JADX INFO: renamed from: f */
    public final long f20514f;

    public C6322d(InterfaceC6324f interfaceC6324f, long j10, long j11, long j12, long j13, long j14) {
        this.f20509a = interfaceC6324f;
        this.f20510b = j10;
        this.f20511c = j11;
        this.f20512d = j12;
        this.f20513e = j13;
        this.f20514f = j14;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        C6311C c6311c = new C6311C(j10, C6323e.m6906a(this.f20509a.mo3666c(j10), 0L, this.f20511c, this.f20512d, this.f20513e, this.f20514f));
        return new C6309A(c6311c, c6311c);
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f20510b;
    }
}
