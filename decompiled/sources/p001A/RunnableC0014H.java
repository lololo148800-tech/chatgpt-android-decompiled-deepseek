package p001A;

import android.view.View;
import androidx.lifecycle.C11114w;
import androidx.lifecycle.EnumC11103l;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0738T;
import p277L.ExecutorC4836i;
import p304M2.C5280c;
import p720e6.C13287b;

/* JADX INFO: renamed from: A.H */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0014H implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53Y;

    /* JADX INFO: renamed from: Z */
    public boolean f54Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f55o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f56p0;

    public RunnableC0014H(C11114w registry, EnumC11103l event) {
        this.f53Y = 1;
        AbstractC16544l.m18094g(registry, "registry");
        AbstractC16544l.m18094g(event, "event");
        this.f55o0 = registry;
        this.f56p0 = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13287b c13287b;
        Object obj = this.f56p0;
        Object obj2 = this.f55o0;
        switch (this.f53Y) {
            case 0:
                ((ExecutorC4836i) obj2).execute(new RunnableC0000A(this, 2));
                break;
            case 1:
                if (!this.f54Z) {
                    ((C11114w) obj2).m12170f((EnumC11103l) obj);
                    this.f54Z = true;
                }
                break;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                C5280c c5280c = swipeDismissBehavior.f36403a;
                View view = (View) obj2;
                if (c5280c != null && c5280c.m5811f()) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    view.postOnAnimation(this);
                    break;
                } else if (this.f54Z && (c13287b = swipeDismissBehavior.f36404b) != null) {
                    c13287b.m14906n(view);
                    break;
                }
                break;
        }
    }

    public RunnableC0014H(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z6) {
        this.f53Y = 2;
        this.f56p0 = swipeDismissBehavior;
        this.f55o0 = view;
        this.f54Z = z6;
    }

    public RunnableC0014H(C0016I c0016i, ExecutorC4836i executorC4836i) {
        this.f53Y = 0;
        this.f56p0 = c0016i;
        this.f54Z = false;
        this.f55o0 = executorC4836i;
    }
}
