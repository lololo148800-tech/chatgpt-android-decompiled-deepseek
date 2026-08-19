package p773h0;

import kotlin.jvm.internal.C16525B;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21702l;
import p547Wc.C8816z;
import p635a1.AbstractC10458p;
import p953q0.C18562U;

/* JADX INFO: renamed from: h0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C14257L extends AbstractC10458p implements InterfaceC21702l, InterfaceC21681a0 {

    /* JADX INFO: renamed from: A0 */
    public boolean f44743A0;

    /* JADX INFO: renamed from: z0 */
    public C18562U f44744z0;

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: E0 */
    public final void mo10929E0() {
        C18562U c18562u = this.f44744z0;
        if (c18562u != null) {
            c18562u.m19941b();
        }
        this.f44744z0 = null;
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        C16525B c16525b = new C16525B();
        AbstractC21690f.m22214s(this, new C8816z(c16525b, 27, this));
        C18562U c18562u = (C18562U) c16525b.f51262Y;
        if (this.f44743A0) {
            C18562U c18562u2 = this.f44744z0;
            if (c18562u2 != null) {
                c18562u2.m19941b();
            }
            if (c18562u != null) {
                c18562u.m19940a();
            } else {
                c18562u = null;
            }
            this.f44744z0 = c18562u;
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
