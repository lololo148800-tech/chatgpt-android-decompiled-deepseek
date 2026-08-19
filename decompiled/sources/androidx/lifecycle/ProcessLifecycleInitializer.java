package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p282L4.C4933a;
import p282L4.InterfaceC4934b;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LL4/b;", "Landroidx/lifecycle/u;", "<init>", "()V", "lifecycle-process_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ProcessLifecycleInitializer implements InterfaceC4934b {
    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: a */
    public final List mo5546a() {
        return C17689w.f56480Y;
    }

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: b */
    public final Object mo5547b(Context context) {
        AbstractC16544l.m18094g(context, "context");
        C4933a c4933aM5543c = C4933a.m5543c(context);
        AbstractC16544l.m18093f(c4933aM5543c, "getInstance(context)");
        if (!c4933aM5543c.f16104b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC11109r.f33485a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC16544l.m18092e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C11108q());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f33399u0;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f33404q0 = new Handler();
        processLifecycleOwner.f33405r0.m12170f(EnumC11103l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC16544l.m18092e(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C11073I(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
