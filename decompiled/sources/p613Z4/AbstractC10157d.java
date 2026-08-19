package p613Z4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC16544l;
import p109E3.C2285i;
import p444S4.C7011q;
import p719e5.C13285a;

/* JADX INFO: renamed from: Z4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10157d extends AbstractC10159f {

    /* JADX INFO: renamed from: f */
    public final C2285i f30087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10157d(Context context, C13285a taskExecutor) {
        super(context, taskExecutor);
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        this.f30087f = new C2285i(this, 2);
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: c */
    public final void mo10758c() {
        C7011q.m7408d().m7410a(AbstractC10158e.f30088a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.f30090b).registerReceiver(this.f30087f, mo10756e());
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: d */
    public final void mo10759d() {
        C7011q.m7408d().m7410a(AbstractC10158e.f30088a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.f30090b).unregisterReceiver(this.f30087f);
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo10756e();

    /* JADX INFO: renamed from: f */
    public abstract void mo10757f(Intent intent);
}
