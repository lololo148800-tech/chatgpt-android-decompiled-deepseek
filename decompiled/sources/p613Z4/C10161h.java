package p613Z4;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC16544l;
import p273Kl.C4721G0;
import p444S4.C7011q;
import p674c5.AbstractC11652e;
import p674c5.AbstractC11654g;
import p719e5.C13285a;

/* JADX INFO: renamed from: Z4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10161h extends AbstractC10159f {

    /* JADX INFO: renamed from: f */
    public final ConnectivityManager f30095f;

    /* JADX INFO: renamed from: g */
    public final C4721G0 f30096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10161h(Context context, C13285a taskExecutor) {
        super(context, taskExecutor);
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        Object systemService = ((Context) this.f30090b).getSystemService("connectivity");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f30095f = (ConnectivityManager) systemService;
        this.f30096g = new C4721G0(this, 1);
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: a */
    public final Object mo10755a() {
        return AbstractC10162i.m10761a(this.f30095f);
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: c */
    public final void mo10758c() {
        try {
            C7011q.m7408d().m7410a(AbstractC10162i.f30097a, "Registering network callback");
            AbstractC11654g.m13017a(this.f30095f, this.f30096g);
        } catch (IllegalArgumentException e10) {
            C7011q.m7408d().m7412c(AbstractC10162i.f30097a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            C7011q.m7408d().m7412c(AbstractC10162i.f30097a, "Received exception while registering network callback", e11);
        }
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: d */
    public final void mo10759d() {
        try {
            C7011q.m7408d().m7410a(AbstractC10162i.f30097a, "Unregistering network callback");
            AbstractC11652e.m13015c(this.f30095f, this.f30096g);
        } catch (IllegalArgumentException e10) {
            C7011q.m7408d().m7412c(AbstractC10162i.f30097a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            C7011q.m7408d().m7412c(AbstractC10162i.f30097a, "Received exception while unregistering network callback", e11);
        }
    }
}
