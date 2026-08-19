package p556Wk;

import ml.AbstractC17285c;
import p857kl.AbstractC16457e;
import p857kl.C16460h;

/* JADX INFO: renamed from: Wk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C8930l extends AbstractC17285c {

    /* JADX INFO: renamed from: a */
    public final C16460h f27307a;

    /* JADX INFO: renamed from: b */
    public final long f27308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f27309c;

    public C8930l(C16460h c16460h, Object obj) {
        this.f27309c = obj;
        if (c16460h == null) {
            C16460h c16460h2 = AbstractC16457e.f51060a;
            c16460h = AbstractC16457e.f51061b;
        }
        this.f27307a = c16460h;
        this.f27308b = ((byte[]) obj).length;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        return Long.valueOf(this.f27308b);
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        return this.f27307a;
    }

    @Override // ml.AbstractC17285c
    /* JADX INFO: renamed from: e */
    public final byte[] mo9568e() {
        return (byte[]) this.f27309c;
    }
}
