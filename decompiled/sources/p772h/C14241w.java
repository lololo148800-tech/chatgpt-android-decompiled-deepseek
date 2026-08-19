package p772h;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.AbstractActivityC10817a;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: h.w */
/* JADX INFO: loaded from: classes.dex */
public final class C14241w implements InterfaceC11110s {

    /* JADX INFO: renamed from: Z */
    public static final C17314q f44694Z = AbstractC9227W.m9800c(C14238t.f44689Y);

    /* JADX INFO: renamed from: Y */
    public final AbstractActivityC10817a f44695Y;

    public C14241w(AbstractActivityC10817a abstractActivityC10817a) {
        this.f44695Y = abstractActivityC10817a;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        if (enumC11103l != EnumC11103l.ON_DESTROY) {
            return;
        }
        Object systemService = this.f44695Y.getSystemService("input_method");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC14237s abstractC14237s = (AbstractC14237s) f44694Z.getValue();
        Object objMo15538b = abstractC14237s.mo15538b(inputMethodManager);
        if (objMo15538b == null) {
            return;
        }
        synchronized (objMo15538b) {
            View viewMo15539c = abstractC14237s.mo15539c(inputMethodManager);
            if (viewMo15539c == null) {
                return;
            }
            if (viewMo15539c.isAttachedToWindow()) {
                return;
            }
            boolean zMo15537a = abstractC14237s.mo15537a(inputMethodManager);
            if (zMo15537a) {
                inputMethodManager.isActive();
            }
        }
    }
}
