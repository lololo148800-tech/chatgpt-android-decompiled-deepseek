package p588Y2;

import android.javax.sip.C10808o;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import java.util.concurrent.atomic.AtomicReference;
import p772h.C14227i;
import p841k.InterfaceC16282b;
import p859l.AbstractC16651b;

/* JADX INFO: renamed from: Y2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9632p extends AbstractC9634r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10808o f29030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f29031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC16651b f29032c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC16282b f29033d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractComponentCallbacksC11000a f29034e;

    public C9632p(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, C10808o c10808o, AtomicReference atomicReference, AbstractC16651b abstractC16651b, InterfaceC16282b interfaceC16282b) {
        this.f29034e = abstractComponentCallbacksC11000a;
        this.f29030a = c10808o;
        this.f29031b = atomicReference;
        this.f29032c = abstractC16651b;
        this.f29033d = interfaceC16282b;
    }

    @Override // p588Y2.AbstractC9634r
    /* JADX INFO: renamed from: a */
    public final void mo10189a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f29034e;
        sb2.append(abstractComponentCallbacksC11000a.f33155q0);
        sb2.append("_rq#");
        sb2.append(abstractComponentCallbacksC11000a.f33150d1.getAndIncrement());
        this.f29031b.set(((C14227i) this.f29030a.mo22421apply(null)).m15530c(sb2.toString(), abstractComponentCallbacksC11000a, this.f29032c, this.f29033d));
    }
}
