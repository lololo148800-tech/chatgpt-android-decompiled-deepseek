package p588Y2;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;

/* JADX INFO: renamed from: Y2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9631o extends AbstractC9639w {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractComponentCallbacksC11000a f29029Y;

    public C9631o(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        this.f29029Y = abstractComponentCallbacksC11000a;
    }

    @Override // p588Y2.AbstractC9639w
    /* JADX INFO: renamed from: c */
    public final View mo10173c(int i10) {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f29029Y;
        View view = abstractComponentCallbacksC11000a.f33135Q0;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC11000a + " does not have a view");
    }

    @Override // p588Y2.AbstractC9639w
    /* JADX INFO: renamed from: f */
    public final boolean mo10174f() {
        return this.f29029Y.f33135Q0 != null;
    }
}
