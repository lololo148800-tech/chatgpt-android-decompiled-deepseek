package p893n;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p523V9.AbstractC8162p0;
import p658b5.C11234e;

/* JADX INFO: renamed from: n.C */
/* JADX INFO: loaded from: classes.dex */
public final class C17366C extends AbstractC8162p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C17368E f55404b;

    public /* synthetic */ C17366C(C17368E c17368e, int i10) {
        this.f55403a = i10;
        this.f55404b = c17368e;
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: c */
    public final void mo1609c() {
        View view;
        C17368E c17368e = this.f55404b;
        switch (this.f55403a) {
            case 0:
                if (c17368e.f55426o && (view = c17368e.f55418g) != null) {
                    view.setTranslationY(0.0f);
                    c17368e.f55415d.setTranslationY(0.0f);
                }
                c17368e.f55415d.setVisibility(8);
                c17368e.f55415d.setTransitioning(false);
                c17368e.f55431t = null;
                C11234e c11234e = c17368e.f55422k;
                if (c11234e != null) {
                    c11234e.m12501E(c17368e.f55421j);
                    c17368e.f55421j = null;
                    c17368e.f55422k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c17368e.f55414c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    AbstractC0728I.m1543c(actionBarOverlayLayout);
                }
                break;
            default:
                c17368e.f55431t = null;
                c17368e.f55415d.requestLayout();
                break;
        }
    }
}
