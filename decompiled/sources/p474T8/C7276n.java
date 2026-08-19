package p474T8;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11110s;
import p349O0.InterfaceC5948E;

/* JADX INFO: renamed from: T8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7276n implements InterfaceC5948E {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC11105n f23066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC11110s f23067c;

    public /* synthetic */ C7276n(AbstractC11105n abstractC11105n, InterfaceC11110s interfaceC11110s, int i10) {
        this.f23065a = i10;
        this.f23066b = abstractC11105n;
        this.f23067c = interfaceC11110s;
    }

    @Override // p349O0.InterfaceC5948E
    public final void dispose() {
        switch (this.f23065a) {
            case 0:
                this.f23066b.mo7808c(this.f23067c);
                break;
            default:
                this.f23066b.mo7808c(this.f23067c);
                break;
        }
    }
}
