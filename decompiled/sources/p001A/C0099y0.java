package p001A;

import android.content.Context;
import android.content.SharedPreferences;
import p277L.ExecutorC4836i;
import p523V9.AbstractC7861C4;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p746fa.InterfaceC13596e;
import p999s.InterfaceC19324V0;

/* JADX INFO: renamed from: A.y0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0099y0 implements InterfaceC10143j, InterfaceC13596e, InterfaceC19324V0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f425Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f426Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f427o0;

    public /* synthetic */ C0099y0(Object obj, boolean z6, int i10) {
        this.f425Y = i10;
        this.f427o0 = obj;
        this.f426Z = z6;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f425Y) {
            case 0:
                C0007D0 c0007d0 = (C0007D0) this.f427o0;
                c0007d0.getClass();
                c0007d0.f24b.execute(new RunnableC0101z0(c0007d0, this.f426Z, c10142i, 0));
                return "enableExternalFlashAeMode";
            default:
                C0036S0 c0036s0 = (C0036S0) this.f427o0;
                c0036s0.getClass();
                boolean z6 = this.f426Z;
                ((ExecutorC4836i) c0036s0.f192r0).execute(new RunnableC0101z0(c0036s0, c10142i, z6));
                return "enableTorch: " + z6;
        }
    }

    @Override // p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = AbstractC7861C4.m8134b((Context) this.f427o0).edit();
        editorEdit.putBoolean("proxy_retention", this.f426Z);
        editorEdit.apply();
    }
}
