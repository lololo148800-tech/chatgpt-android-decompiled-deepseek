package p791hj;

import android.view.View;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8559T2;

/* JADX INFO: renamed from: hj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14520c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C14520c f45760Y = new C14520c(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC11112u interfaceC11112uM9219b;
        View v2 = (View) obj;
        AbstractC16544l.m18094g(v2, "v");
        Object parent = v2.getParent();
        AbstractC11105n abstractC11105nMo7809i = null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null && (interfaceC11112uM9219b = AbstractC8559T2.m9219b(view)) != null) {
            abstractC11105nMo7809i = interfaceC11112uM9219b.mo7809i();
        }
        if (abstractC11105nMo7809i != null) {
            return abstractC11105nMo7809i;
        }
        throw new IllegalStateException(("Expected parent or context of " + v2 + " to have or be a ViewTreeLifecycleOwner").toString());
    }
}
