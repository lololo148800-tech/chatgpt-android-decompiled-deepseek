package p030B2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: B2.J */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0729J implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0794y0 f2089a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0783t f2091c;

    public ViewOnApplyWindowInsetsListenerC0729J(View view, InterfaceC0783t interfaceC0783t) {
        this.f2090b = view;
        this.f2091c = interfaceC0783t;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0794y0 c0794y0M1812g = C0794y0.m1812g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        InterfaceC0783t interfaceC0783t = this.f2091c;
        if (i10 < 30) {
            AbstractC0730K.m1544a(windowInsets, this.f2090b);
            if (c0794y0M1812g.equals(this.f2089a)) {
                return interfaceC0783t.mo1773l(view, c0794y0M1812g).m1817f();
            }
        }
        this.f2089a = c0794y0M1812g;
        C0794y0 c0794y0Mo1773l = interfaceC0783t.mo1773l(view, c0794y0M1812g);
        if (i10 >= 30) {
            return c0794y0Mo1773l.m1817f();
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(view);
        return c0794y0Mo1773l.m1817f();
    }
}
