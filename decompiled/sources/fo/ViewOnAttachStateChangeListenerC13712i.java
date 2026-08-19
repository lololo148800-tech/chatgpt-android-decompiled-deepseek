package fo;

import android.os.Handler;
import android.view.View;
import androidx.lifecycle.C11114w;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.RunnableC0153B;
import p221Ii.C3727f;
import p771go.AbstractC14204c;
import p791hj.ViewOnAttachStateChangeListenerC14519b;
import p838jj.AbstractC16236q;
import p838jj.C16231l;

/* JADX INFO: renamed from: fo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC13712i implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43262Y;

    /* JADX INFO: renamed from: Z */
    public final Object f43263Z;

    /* JADX INFO: renamed from: o0 */
    public Object f43264o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ View f43265p0;

    public ViewOnAttachStateChangeListenerC13712i(C13713j c13713j, View view) {
        this.f43262Y = 0;
        this.f43264o0 = c13713j;
        this.f43265p0 = view;
        this.f43263Z = new RunnableC0153B(this, 20);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v2) {
        switch (this.f43262Y) {
            case 0:
                AbstractC16544l.m18095h(v2, "v");
                ((Handler) AbstractC14204c.f44617a.getValue()).removeCallbacks((RunnableC0153B) this.f43263Z);
                break;
            default:
                AbstractC16544l.m18094g(v2, "v");
                C11114w c11114w = ((ViewOnAttachStateChangeListenerC14519b) ((AbstractC16236q) this.f43265p0).getParentLifecycleOwner()).f45756o0;
                c11114w.mo7806a((C3727f) this.f43263Z);
                this.f43264o0 = c11114w;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        switch (this.f43262Y) {
            case 0:
                AbstractC16544l.m18095h(v2, "v");
                ((Handler) AbstractC14204c.f44617a.getValue()).post((RunnableC0153B) this.f43263Z);
                break;
            default:
                AbstractC16544l.m18094g(v2, "v");
                C11114w c11114w = (C11114w) this.f43264o0;
                if (c11114w != null) {
                    c11114w.mo7808c((C3727f) this.f43263Z);
                }
                this.f43264o0 = null;
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC13712i(C16231l c16231l, AbstractC16236q abstractC16236q) {
        this.f43262Y = 1;
        this.f43265p0 = abstractC16236q;
        this.f43263Z = new C3727f(c16231l, 3);
    }
}
