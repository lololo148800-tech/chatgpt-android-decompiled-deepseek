package p588Y2;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: Y2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9627k extends AbstractC9639w {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C9631o f29010Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC9628l f29011Z;

    public C9627k(DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l, C9631o c9631o) {
        this.f29011Z = dialogInterfaceOnCancelListenerC9628l;
        this.f29010Y = c9631o;
    }

    @Override // p588Y2.AbstractC9639w
    /* JADX INFO: renamed from: c */
    public final View mo10173c(int i10) {
        C9631o c9631o = this.f29010Y;
        if (c9631o.mo10174f()) {
            return c9631o.mo10173c(i10);
        }
        Dialog dialog = this.f29011Z.f29021q1;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // p588Y2.AbstractC9639w
    /* JADX INFO: renamed from: f */
    public final boolean mo10174f() {
        return this.f29010Y.mo10174f() || this.f29011Z.f29025u1;
    }
}
