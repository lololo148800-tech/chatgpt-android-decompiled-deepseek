package p769gj;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p049Bm.InterfaceC1426a;
import p153Fn.C2925c;
import p749fd.C13628m;

/* JADX INFO: renamed from: gj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC14162d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final ArrayList f44534Y = new ArrayList();

    /* JADX INFO: renamed from: Z */
    public final C2925c f44535Z;

    public ViewOnAttachStateChangeListenerC14162d(C2925c c2925c) {
        C0631p0 c0631p0 = new C0631p0(AbstractC0575H.m1192u(c2925c.f8769Y));
        c0631p0.mo1271H0(new C13628m(this, 8));
        this.f44535Z = AbstractC0575H.m1158F(c2925c, c0631p0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        AbstractC16544l.m18094g(v2, "v");
        ArrayList arrayList = this.f44534Y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1426a) it.next()).invoke();
        }
        arrayList.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        AbstractC16544l.m18094g(v2, "v");
        AbstractC0575H.m1180i(this.f44535Z, AbstractC0575H.m1172a("View detached", null));
        v2.removeOnAttachStateChangeListener(this);
    }
}
