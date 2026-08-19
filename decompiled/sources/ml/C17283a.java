package ml;

import io.ktor.utils.p815io.InterfaceC15066B;
import mm.C17296C;
import p857kl.C16440G;
import p857kl.C16460h;
import p972qm.InterfaceC18770c;
import p995rl.C19247g;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: ml.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17283a extends AbstractC17287e {

    /* JADX INFO: renamed from: a */
    public final C19247g f55102a;

    /* JADX INFO: renamed from: b */
    public final C16460h f55103b;

    /* JADX INFO: renamed from: c */
    public final C16440G f55104c = null;

    /* JADX INFO: renamed from: d */
    public final Long f55105d = null;

    public C17283a(C19247g c19247g, C16460h c16460h) {
        this.f55102a = c19247g;
        this.f55103b = c16460h;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        return this.f55105d;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        return this.f55103b;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: d */
    public final C16440G mo7532d() {
        return this.f55104c;
    }

    @Override // ml.AbstractC17287e
    /* JADX INFO: renamed from: e */
    public final Object mo15508e(InterfaceC15066B interfaceC15066B, InterfaceC18770c interfaceC18770c) {
        Object objInvoke = this.f55102a.invoke(interfaceC15066B, interfaceC18770c);
        return objInvoke == EnumC19250a.f61036Y ? objInvoke : C17296C.f55119a;
    }
}
