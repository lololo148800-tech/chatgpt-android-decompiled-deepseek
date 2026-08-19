package p071Ch;

import android.content.Context;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1009s9.C19506i;
import p425Ra.AbstractC6829b;
import p425Ra.C6830c;
import p425Ra.C6832e;
import p425Ra.C6836i;
import p425Ra.C6841n;
import p477Tb.C7296c;
import p544W9.AbstractC8728v3;
import p571X9.AbstractC9233X;
import p572Xa.C9408b;
import p572Xa.C9418l;
import p572Xa.C9429w;
import p746fa.AbstractC13600i;
import p746fa.C13599h;
import p746fa.C13603l;
import p746fa.C13606o;
import p746fa.ExecutorC13605n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662B extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f4696Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1663C f4697Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662B(C1663C c1663c, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f4697Z = c1663c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C1662B(this.f4697Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C1662B) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Exception {
        C7296c c7296c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4696Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1663C c1663c = this.f4697Z;
            c1663c.f4706g++;
            Context context = c1663c.f4700a;
            synchronized (AbstractC6829b.class) {
                try {
                    if (AbstractC6829b.f21909a == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        AbstractC6829b.f21909a = new C7296c(context);
                    }
                    c7296c = AbstractC6829b.f21909a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C6830c c6830c = (C6830c) ((C9418l) c7296c.f23104Z).mo3447d();
            byte b = (byte) (((byte) 2) | 1);
            if (b != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b & 1) == 0) {
                    sb2.append(" cloudProjectNumber");
                }
                if ((b & 2) == 0) {
                    sb2.append(" webViewRequestMode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            C6841n c6841n = new C6841n();
            c6830c.getClass();
            C6836i c6836i = c6830c.f21911a;
            c6836i.f21928a.m10000b("warmUpIntegrityToken(%s)", 4906872596L);
            C13599h c13599h = new C13599h();
            C6832e c6832e = new C6832e(c6836i, c13599h, c13599h);
            C9408b c9408b = c6836i.f21932e;
            c9408b.getClass();
            c9408b.m9985a().post(new C9429w(c9408b, c13599h, c13599h, c6832e));
            C19506i c19506i = new C19506i(c6830c, c6841n);
            C13606o c13606o = c13599h.f42961a;
            c13606o.getClass();
            ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
            C13606o c13606o2 = new C13606o();
            c13606o.f42983b.m338B(new C13603l(executorC13605n, c19506i, c13606o2));
            c13606o.m15139r();
            this.f4696Y = 1;
            obj = AbstractC8728v3.m9451a(c13606o2, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f4697Z.f4706g = 0;
        return obj;
    }
}
