package p084D4;

import android.javax.sip.C10808o;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p030B2.C0781s;
import p167Gb.C3032c;

/* JADX INFO: renamed from: D4.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1897V {

    /* JADX INFO: renamed from: a */
    public C10808o f5532a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5533b;

    /* JADX INFO: renamed from: c */
    public long f5534c;

    /* JADX INFO: renamed from: d */
    public long f5535d;

    /* JADX INFO: renamed from: e */
    public long f5536e;

    /* JADX INFO: renamed from: f */
    public long f5537f;

    /* JADX INFO: renamed from: b */
    public static void m2909b(AbstractC1933p0 abstractC1933p0) {
        RecyclerView recyclerView;
        int i10 = abstractC1933p0.f5689j;
        if (abstractC1933p0.m3093h() || (i10 & 4) != 0 || (recyclerView = abstractC1933p0.f5697r) == null) {
            return;
        }
        recyclerView.m12261I(abstractC1933p0);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2910a(AbstractC1933p0 abstractC1933p0, AbstractC1933p0 abstractC1933p1, C0781s c0781s, C0781s c0781s2);

    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0082, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m2911c(AbstractC1933p0 abstractC1933p0) {
        C10808o c10808o = this.f5532a;
        if (c10808o != null) {
            boolean z6 = true;
            abstractC1933p0.m3101p(true);
            if (abstractC1933p0.f5687h != null && abstractC1933p0.f5688i == null) {
                abstractC1933p0.f5687h = null;
            }
            abstractC1933p0.f5688i = null;
            if ((abstractC1933p0.f5689j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) c10808o.f32040Z;
            recyclerView.m12289j0();
            C1920j c1920j = recyclerView.f33650t0;
            C1918i c1918i = (C1918i) c1920j.f5619q0;
            C3032c c3032c = (C3032c) c1920j.f5618p0;
            int i10 = c1920j.f5617o0;
            View view = abstractC1933p0.f5680a;
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c1920j.f5617o0 = 2;
                    int iIndexOfChild = ((RecyclerView) c3032c.f9127Z).indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        c1920j.m3078m(view);
                    } else if (c1918i.m3058p(iIndexOfChild)) {
                        c1918i.m3062t(iIndexOfChild);
                        c1920j.m3078m(view);
                        c3032c.m3921m(iIndexOfChild);
                    } else {
                        c1920j.f5617o0 = 0;
                    }
                    c1920j.f5617o0 = 0;
                    if (z6) {
                        AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(view);
                        C1911e0 c1911e0 = recyclerView.f33644q0;
                        c1911e0.m3037l(abstractC1933p0M12244L);
                        c1911e0.m3034i(abstractC1933p0M12244L);
                        if (RecyclerView.f33581L1) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m12291k0(!z6);
                    if (z6 && abstractC1933p0.m3097l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th2) {
                    c1920j.f5617o0 = 0;
                    throw th2;
                }
            }
            if (((View) c1920j.f5620r0) != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z6 = false;
            if (z6) {
                AbstractC1933p0 abstractC1933p0M12244L2 = RecyclerView.m12244L(view);
                C1911e0 c1911e1 = recyclerView.f33644q0;
                c1911e1.m3037l(abstractC1933p0M12244L2);
                c1911e1.m3034i(abstractC1933p0M12244L2);
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.m12291k0(!z6);
            if (z6) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2912d(AbstractC1933p0 abstractC1933p0);

    /* JADX INFO: renamed from: e */
    public abstract void mo2913e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2914f();
}
