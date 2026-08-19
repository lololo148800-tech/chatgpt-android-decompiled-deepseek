package p820j0;

import p796i0.C14898e;
import p796i0.InterfaceC14896c;

/* JADX INFO: renamed from: j0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16030a implements InterfaceC14896c {

    /* JADX INFO: renamed from: a */
    public int f49465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16031b f49466b;

    public C16030a(C16031b c16031b) {
        this.f49466b = c16031b;
    }

    @Override // p796i0.InterfaceC14896c
    /* JADX INFO: renamed from: a */
    public final C14898e mo9531a(C14898e c14898e) {
        C16031b c16031b = this.f49466b;
        C14898e c14898eMo9531a = c16031b.f49467a.f46389B0.mo9531a(c14898e);
        if (c14898eMo9531a == null) {
            return null;
        }
        C16031b c16031bM17588a = AbstractC16033d.m17588a(c16031b.f49467a);
        C16030a c16030a = c16031bM17588a != null ? c16031bM17588a.f49468b : null;
        return c16030a == null ? c14898eMo9531a : c16030a.mo9531a(c14898eMo9531a);
    }

    @Override // p796i0.InterfaceC14896c
    /* JADX INFO: renamed from: b */
    public final void mo9532b() {
        this.f49465a = 0;
        this.f49466b.f49467a.f46389B0.mo9532b();
    }

    @Override // p796i0.InterfaceC14896c
    /* JADX INFO: renamed from: c */
    public final void mo9533c() {
        int i10 = this.f49465a;
        int i11 = i10 - 1;
        if (i11 < 0) {
            i11 = 0;
        }
        this.f49465a = i11;
        C16031b c16031b = this.f49466b;
        if (i11 == 0 && i10 > 0) {
            c16031b.f49467a.f46389B0.mo9533c();
        }
        C16031b c16031bM17588a = AbstractC16033d.m17588a(c16031b.f49467a);
        C16030a c16030a = c16031bM17588a != null ? c16031bM17588a.f49468b : null;
        if (c16030a != null) {
            c16030a.mo9533c();
        }
    }

    @Override // p796i0.InterfaceC14896c
    /* JADX INFO: renamed from: d */
    public final void mo9534d() {
        int i10 = this.f49465a + 1;
        this.f49465a = i10;
        C16031b c16031b = this.f49466b;
        if (i10 == 1) {
            c16031b.f49467a.f46389B0.mo9534d();
        }
        C16031b c16031bM17588a = AbstractC16033d.m17588a(c16031b.f49467a);
        C16030a c16030a = c16031bM17588a != null ? c16031bM17588a.f49468b : null;
        if (c16030a != null) {
            c16030a.mo9534d();
        }
    }

    @Override // p796i0.InterfaceC14896c
    /* JADX INFO: renamed from: e */
    public final void mo9535e() {
        this.f49466b.f49467a.f46389B0.mo9535e();
        this.f49465a = 0;
    }
}
