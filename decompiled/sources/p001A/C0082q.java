package p001A;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p140Fa.C2685e;
import p228J.AbstractC3842j;
import p228J.InterfaceC3854p;
import p228J.InterfaceC3866v;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0082q extends AbstractC3842j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f327a = 0;

    /* JADX INFO: renamed from: b */
    public Object f328b;

    /* JADX INFO: renamed from: c */
    public Object f329c;

    public /* synthetic */ C0082q() {
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: a */
    public void mo7a(int i10) {
        switch (this.f327a) {
            case 0:
                for (AbstractC3842j abstractC3842j : (HashSet) this.f328b) {
                    try {
                        ((Executor) ((ArrayMap) this.f329c).get(abstractC3842j)).execute(new RunnableC0080p(abstractC3842j, i10, 0));
                    } catch (RejectedExecutionException e10) {
                        AbstractC8072d6.m8488e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                    }
                }
                break;
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: b */
    public final void mo8b(int i10, InterfaceC3854p interfaceC3854p) {
        switch (this.f327a) {
            case 0:
                for (AbstractC3842j abstractC3842j : (HashSet) this.f328b) {
                    try {
                        ((Executor) ((ArrayMap) this.f329c).get(abstractC3842j)).execute(new RunnableC0078o(abstractC3842j, i10, interfaceC3854p, 1));
                    } catch (RejectedExecutionException e10) {
                        AbstractC8072d6.m8488e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                    }
                }
                break;
            default:
                ((C10142i) this.f328b).m10747a(null);
                ((InterfaceC3866v) this.f329c).mo140e(this);
                break;
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: c */
    public void mo9c(int i10, C2685e c2685e) {
        switch (this.f327a) {
            case 0:
                for (AbstractC3842j abstractC3842j : (HashSet) this.f328b) {
                    try {
                        ((Executor) ((ArrayMap) this.f329c).get(abstractC3842j)).execute(new RunnableC0078o(abstractC3842j, i10, c2685e, 0));
                    } catch (RejectedExecutionException e10) {
                        AbstractC8072d6.m8488e("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                    }
                }
                break;
        }
    }

    public C0082q(C10142i c10142i, InterfaceC3866v interfaceC3866v) {
        this.f328b = c10142i;
        this.f329c = interfaceC3866v;
    }
}
