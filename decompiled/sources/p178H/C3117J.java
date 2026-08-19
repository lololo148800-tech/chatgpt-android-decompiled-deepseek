package p178H;

import java.lang.ref.WeakReference;
import p001A.RunnableC0000A;

/* JADX INFO: renamed from: H.J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3117J implements InterfaceC3181y {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9392Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f9393Z;

    public /* synthetic */ C3117J(Object obj, int i10) {
        this.f9392Y = i10;
        this.f9393Z = obj;
    }

    @Override // p178H.InterfaceC3181y
    /* JADX INFO: renamed from: a */
    public final void mo3953a(AbstractC3182z abstractC3182z) {
        InterfaceC3181y interfaceC3181y;
        switch (this.f9392Y) {
            case 0:
                C3119L c3119l = (C3119L) ((WeakReference) ((C3118K) this.f9393Z).f9395q0).get();
                if (c3119l != null) {
                    c3119l.f9396F0.execute(new RunnableC0000A(c3119l, 16));
                    return;
                }
                return;
            default:
                C3150i0 c3150i0 = (C3150i0) this.f9393Z;
                synchronized (c3150i0.f9475Y) {
                    try {
                        int i10 = c3150i0.f9476Z - 1;
                        c3150i0.f9476Z = i10;
                        if (c3150i0.f9477o0 && i10 == 0) {
                            c3150i0.close();
                        }
                        interfaceC3181y = c3150i0.f9480r0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (interfaceC3181y != null) {
                    interfaceC3181y.mo3953a(abstractC3182z);
                    return;
                }
                return;
        }
    }
}
