package p959q8;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p087D7.AbstractC1976c;
import p523V9.AbstractC7889G0;
import p571X9.AbstractC9227W;
import p592Y7.InterfaceC9670e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p887m7.C17176b;
import p888m8.C17196a;
import p904nb.RunnableC17544a;
import p909nm.AbstractC17681o;
import p909nm.C17690x;

/* JADX INFO: renamed from: q8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18643e extends AbstractC18641c implements InterfaceC18646h {

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18644f f59385Z;

    /* JADX INFO: renamed from: o0 */
    public final C17314q f59386o0;

    public C18643e(InterfaceC18644f componentPredicate) {
        AbstractC16544l.m18094g(componentPredicate, "componentPredicate");
        this.f59385Z = componentPredicate;
        this.f59386o0 = AbstractC9227W.m9800c(new C17176b(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18643e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.rum.tracking.ActivityViewTrackingStrategy");
        return AbstractC16544l.m18089b(this.f59385Z, ((C18643e) obj).f59385Z);
    }

    public final int hashCode() {
        return this.f59385Z.hashCode() + 38347;
    }

    @Override // p959q8.AbstractC18641c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        InterfaceC11256c interfaceC11256cM20003b = m20003b();
        InterfaceC18644f interfaceC18644f = this.f59385Z;
        if (interfaceC18644f.accept(activity)) {
            try {
                interfaceC18644f.mo8899f(activity);
                String canonicalName = activity.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = activity.getClass().getSimpleName();
                }
                C17690x c17690x = C17690x.f56481Y;
                InterfaceC9670e interfaceC9670e = (InterfaceC9670e) m20004c(C18642d.f59384Y);
                if (interfaceC9670e != null) {
                    interfaceC9670e.mo10256l(activity, canonicalName, c17690x);
                }
            } catch (Exception e10) {
                AbstractC7889G0.m8185c(interfaceC11256cM20003b, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C17196a.f54894Z, e10, 48);
            }
        }
    }

    @Override // p959q8.AbstractC18641c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC1976c.m3151h((ScheduledExecutorService) this.f59386o0.getValue(), "Delayed view stop", 200L, TimeUnit.MILLISECONDS, m20003b(), new RunnableC17544a(this, 3, activity));
    }
}
