package p001A;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import p028B.C0694a;
import p115E9.AbstractC2359a;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;

/* JADX INFO: renamed from: A.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0092v implements InterfaceC10143j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f400Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0018J f401Z;

    public /* synthetic */ C0092v(C0018J c0018j, int i10) {
        this.f400Y = i10;
        this.f401Z = c0018j;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        switch (this.f400Y) {
            case 0:
                C0018J c0018j = this.f401Z;
                c0018j.getClass();
                try {
                    c0018j.f92o0.execute(new RunnableC0074m(c0018j, 4, c10142i));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    c10142i.m10748b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                C0018J c0018j2 = this.f401Z;
                c0018j2.getClass();
                try {
                    ArrayList arrayList = new ArrayList(c0018j2.f90Y.m21926m().m4589b().f11679c);
                    arrayList.add((C0073l0) c0018j2.f79J0.f69r0);
                    arrayList.add(new C0004C(c0018j2, c10142i));
                    c0018j2.f91Z.f2058a.mo1484l(c0018j2.f98u0.f110a, c0018j2.f92o0, AbstractC2359a.m3442a(arrayList));
                    return "configAndCloseTask";
                } catch (C0694a | SecurityException e10) {
                    c0018j2.m126v("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
                    c10142i.m10748b(e10);
                    return "configAndCloseTask";
                }
        }
    }
}
