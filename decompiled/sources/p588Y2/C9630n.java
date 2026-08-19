package p588Y2;

import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.AbstractC11085V;

/* JADX INFO: renamed from: Y2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9630n extends AbstractC9634r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC11000a f29028a;

    public C9630n(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        this.f29028a = abstractComponentCallbacksC11000a;
    }

    @Override // p588Y2.AbstractC9634r
    /* JADX INFO: renamed from: a */
    public final void mo10189a() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f29028a;
        abstractComponentCallbacksC11000a.f33149c1.m348r();
        AbstractC11085V.m12138b(abstractComponentCallbacksC11000a);
        Bundle bundle = abstractComponentCallbacksC11000a.f33145Z;
        abstractComponentCallbacksC11000a.f33149c1.m349s(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
