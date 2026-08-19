package p904nb;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16544l;
import p080D0.C1832u;
import p1020t7.C19809g;
import p1035u7.C20144b;
import p1073w3.C20810l;
import p113E7.InterfaceC2353a;
import p305M3.C5286f;
import p310M9.C5311e;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8230x4;
import p592Y7.InterfaceC9670e;
import p604Yk.C10077b;
import p613Z4.AbstractC10159f;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p888m8.C17196a;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p955q2.AbstractC18610b;
import p959q8.C18642d;
import p959q8.C18643e;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17544a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56126Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f56127Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f56128o0;

    public /* synthetic */ RunnableC17544a(Object obj, int i10, Object obj2) {
        this.f56126Y = i10;
        this.f56127Z = obj;
        this.f56128o0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56126Y) {
            case 0:
                ThreadFactoryC17545b threadFactoryC17545b = (ThreadFactoryC17545b) this.f56127Z;
                Process.setThreadPriority(threadFactoryC17545b.f56132c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC17545b.f56133d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f56128o0).run();
                return;
            case 1:
                Callable callable = (Callable) this.f56127Z;
                ScheduledFutureC17551h scheduledFutureC17551h = (ScheduledFutureC17551h) ((C10077b) this.f56128o0).f29833Z;
                try {
                    scheduledFutureC17551h.m10745k(callable.call());
                    return;
                } catch (Exception e10) {
                    scheduledFutureC17551h.mo10746l(e10);
                    return;
                }
            case 2:
                ((AbstractC18610b) this.f56127Z).mo2478j((Typeface) this.f56128o0);
                return;
            case 3:
                C18643e this$0 = (C18643e) this.f56127Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                Activity activity = (Activity) this.f56128o0;
                AbstractC16544l.m18094g(activity, "$activity");
                InterfaceC11256c interfaceC11256cM20003b = this$0.m20003b();
                if (this$0.f59385Z.accept(activity)) {
                    try {
                        InterfaceC9670e interfaceC9670e = (InterfaceC9670e) this$0.m20004c(C18642d.f59384Y);
                        if (interfaceC9670e != null) {
                            interfaceC9670e.mo10257m(C17690x.f56481Y, activity);
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        AbstractC7889G0.m8185c(interfaceC11256cM20003b, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C17196a.f54894Z, e11, 48);
                        return;
                    }
                }
                return;
            case 4:
                C5311e this$1 = (C5311e) this.f56127Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                Object obj = this.f56128o0;
                AbstractC10159f abstractC10159f = (AbstractC10159f) this$1.f17484Z;
                byte[] bArrM8864b = AbstractC8230x4.m8864b((InterfaceC2353a) abstractC10159f.f30090b, obj, (InterfaceC11256c) abstractC10159f.f30092d);
                if (bArrM8864b == null) {
                    return;
                }
                synchronized (abstractC10159f) {
                    int length = bArrM8864b.length;
                    if (length > 524288) {
                        AbstractC7889G0.m8185c((InterfaceC11256c) abstractC10159f.f30092d, 5, AbstractC17681o.m19382k(EnumC11255b.f34098Y, EnumC11255b.f34100o0), new C1832u(length, abstractC10159f, 5), null, 56);
                    } else {
                        File fileMo12596o = ((C20144b) abstractC10159f.f30089a).mo12596o(false);
                        if (fileMo12596o != null) {
                            ((C19809g) abstractC10159f.f30091c).mo20764a(fileMo12596o, bArrM8864b, false);
                        }
                    }
                }
                return;
            default:
                ((C5286f) this.f56128o0).m5825a(((C20810l) this.f56127Z).m21337c());
                return;
        }
    }
}
