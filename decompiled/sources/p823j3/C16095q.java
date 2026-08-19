package p823j3;

import android.content.Context;
import android.os.Build;
import androidx.glance.session.SessionWorker;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kp.AbstractC16648c;
import mm.C17296C;
import mm.C17309l;
import p114E8.C2354a;
import p310M9.C5311e;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.C7020z;
import p444S4.EnumC7019y;
import p470T4.C7247l;
import p470T4.C7253r;
import p519V4.RunnableC7757e;
import p571X9.AbstractC9233X;
import p658b5.C11232c;
import p658b5.C11245p;
import p672c3.C11617m;
import p697d5.C13027j;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17691y;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C16095q {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f49858a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16096r f49859b;

    public C16095q(C16096r c16096r) {
        this.f49859b = c16096r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m17650a(Context context, String str, AbstractC19687c abstractC19687c) {
        C16093o c16093o;
        C16095q c16095q;
        boolean z6;
        boolean z10 = false;
        if (abstractC19687c instanceof C16093o) {
            c16093o = (C16093o) abstractC19687c;
            int i10 = c16093o.f49852q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16093o.f49852q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16093o = new C16093o(this, abstractC19687c);
            }
        } else {
            c16093o = new C16093o(this, abstractC19687c);
        }
        Object objM18465b = c16093o.f49850o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16093o.f49852q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18465b);
            C7253r c7253rM7690f = C7253r.m7690f(context);
            RunnableC7757e runnableC7757e = new RunnableC7757e(c7253rM7690f, str);
            c7253rM7690f.f22999d.f41990a.execute(runnableC7757e);
            c16093o.f49848Y = this;
            c16093o.f49849Z = str;
            c16093o.f49852q0 = 1;
            objM18465b = AbstractC16648c.m18465b((C13027j) runnableC7757e.f24464Z, c16093o);
            if (objM18465b == enumC19250a) {
                return enumC19250a;
            }
            c16095q = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c16093o.f49849Z;
            c16095q = c16093o.f49848Y;
            AbstractC9233X.m9807c(objM18465b);
        }
        Iterable iterable = (Iterable) objM18465b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                if (AbstractC17681o.m19382k(EnumC7019y.f22433Z, EnumC7019y.f22432Y).contains(((C7020z) it.next()).f22440b)) {
                    z6 = true;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        C11617m c11617m = (C11617m) c16095q.f49858a.get(str);
        if ((c11617m != null ? c11617m.f35167b.get() : false) && z6) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public final Object m17651b(Context context, C11617m c11617m, AbstractC19687c abstractC19687c) throws Throwable {
        C16094p c16094p;
        C16095q c16095q;
        if (abstractC19687c instanceof C16094p) {
            c16094p = (C16094p) abstractC19687c;
            int i10 = c16094p.f49857q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16094p.f49857q0 = i10 - Integer.MIN_VALUE;
            } else {
                c16094p = new C16094p(this, abstractC19687c);
            }
        } else {
            c16094p = new C16094p(this, abstractC19687c);
        }
        Object obj = c16094p.f49855o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16094p.f49857q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C11617m c11617m2 = (C11617m) this.f49858a.put(c11617m.f35166a, c11617m);
            if (c11617m2 != null) {
                c11617m2.f35168c.mo2522l(null);
                c11617m2.f35167b.set(false);
                c11617m2.f35178m.mo1275e(null);
            }
            this.f49859b.getClass();
            C5311e c5311e = new C5311e(SessionWorker.class);
            String str = c11617m.f35166a;
            C17309l[] c17309lArr = {new C17309l("KEY", str)};
            C2354a c2354a = new C2354a(1);
            C17309l c17309l = c17309lArr[0];
            c2354a.m3440c(c17309l.f55137Z, (String) c17309l.f55136Y);
            C7001g c7001g = new C7001g(c2354a.f7308b);
            C7001g.m7402b(c7001g);
            ((C11245p) c5311e.f17485o0).f34045e = c7001g;
            C13027j c13027j = (C13027j) ((C11232c) new C7247l(C7253r.m7690f(context), str, 1, Collections.singletonList(c5311e.m5861p())).m7657b()).f33997Z;
            c16094p.f49853Y = this;
            c16094p.f49854Z = context;
            c16094p.f49857q0 = 1;
            if (AbstractC16648c.m18465b(c13027j, c16094p) == enumC19250a) {
                return enumC19250a;
            }
            c16095q = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = c16094p.f49854Z;
            c16095q = c16094p.f49853Y;
            AbstractC9233X.m9807c(obj);
        }
        c16095q.f49859b.getClass();
        C7253r c7253rM7690f = C7253r.m7690f(context);
        C5311e c5311e2 = new C5311e(SessionWorker.class);
        c5311e2.m5870z(3650L, TimeUnit.DAYS);
        ((C11245p) c5311e2.f17485o0).f34050j = new C6998d(1, true, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC17680n.m19328G0(new LinkedHashSet()) : C17691y.f56482Y);
        new C7247l(c7253rM7690f, "sessionWorkerKeepEnabled", 2, Collections.singletonList(c5311e2.m5861p())).m7657b();
        return C17296C.f55119a;
    }
}
