package p722e8;

import p902n8.C17522i;
import p902n8.InterfaceC17523j;

/* JADX INFO: renamed from: e8.T */
/* JADX INFO: loaded from: classes.dex */
public final class C13309T implements InterfaceC17523j {

    /* JADX INFO: renamed from: a */
    public double f42121a = Double.NaN;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13315Z f42122b;

    public C13309T(C13315Z c13315z) {
        this.f42122b = c13315z;
    }

    @Override // p902n8.InterfaceC17523j
    /* JADX INFO: renamed from: a */
    public final void mo14930a(C17522i c17522i) {
        boolean zIsNaN = Double.isNaN(this.f42121a);
        double d10 = c17522i.f56050c;
        if (zIsNaN) {
            this.f42121a = d10;
        } else {
            this.f42122b.f42174M = Double.valueOf(d10 - this.f42121a);
        }
    }
}
