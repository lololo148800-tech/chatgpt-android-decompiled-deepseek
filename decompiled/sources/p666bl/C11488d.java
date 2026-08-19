package p666bl;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0631p0;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11488d {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34766f = AtomicIntegerFieldUpdater.newUpdater(C11488d.class, "requestLogged");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34767g = AtomicIntegerFieldUpdater.newUpdater(C11488d.class, "responseLogged");

    /* JADX INFO: renamed from: a */
    public final InterfaceC11491g f34768a;

    /* JADX INFO: renamed from: b */
    public final StringBuilder f34769b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public final StringBuilder f34770c = new StringBuilder();

    /* JADX INFO: renamed from: d */
    public final C0631p0 f34771d = AbstractC0575H.m1175d();

    /* JADX INFO: renamed from: e */
    public final C0631p0 f34772e = AbstractC0575H.m1175d();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public C11488d(InterfaceC11491g interfaceC11491g) {
        this.f34768a = interfaceC11491g;
    }

    /* JADX INFO: renamed from: a */
    public final void m12888a() {
        C0631p0 c0631p0 = this.f34771d;
        if (f34766f.compareAndSet(this, 0, 1)) {
            try {
                String string = AbstractC21322p.m21711s0(this.f34769b).toString();
                if (string.length() > 0) {
                    this.f34768a.mo12523y(string);
                }
            } finally {
                c0631p0.m1279g0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m12889b(AbstractC19687c abstractC19687c) {
        C11485a c11485a;
        C11488d c11488d;
        if (abstractC19687c instanceof C11485a) {
            c11485a = (C11485a) abstractC19687c;
            int i10 = c11485a.f34755p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11485a.f34755p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11485a = new C11485a(this, abstractC19687c);
            }
        } else {
            c11485a = new C11485a(this, abstractC19687c);
        }
        Object obj = c11485a.f34753Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11485a.f34755p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!f34767g.compareAndSet(this, 0, 1)) {
                return c17296c;
            }
            C0631p0 c0631p0 = this.f34771d;
            c11485a.f34752Y = this;
            c11485a.f34755p0 = 1;
            if (c0631p0.mo1272P(c11485a) == enumC19250a) {
                return enumC19250a;
            }
            c11488d = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11488d = c11485a.f34752Y;
            AbstractC9233X.m9807c(obj);
        }
        String string = AbstractC21322p.m21711s0(c11488d.f34770c).toString();
        if (string.length() > 0) {
            c11488d.f34768a.mo12523y(string);
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: c */
    public final void m12890c(String str) {
        String string = AbstractC21322p.m21711s0(str).toString();
        StringBuilder sb2 = this.f34769b;
        sb2.append(string);
        sb2.append('\n');
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m12891d(String str, AbstractC19687c abstractC19687c) {
        C11486b c11486b;
        C11488d c11488d;
        if (abstractC19687c instanceof C11486b) {
            c11486b = (C11486b) abstractC19687c;
            int i10 = c11486b.f34760q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11486b.f34760q0 = i10 - Integer.MIN_VALUE;
            } else {
                c11486b = new C11486b(this, abstractC19687c);
            }
        } else {
            c11486b = new C11486b(this, abstractC19687c);
        }
        Object obj = c11486b.f34758o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11486b.f34760q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C0631p0 c0631p0 = this.f34772e;
            c11486b.f34756Y = this;
            c11486b.f34757Z = str;
            c11486b.f34760q0 = 1;
            if (c0631p0.mo1272P(c11486b) == enumC19250a) {
                return enumC19250a;
            }
            c11488d = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c11486b.f34757Z;
            c11488d = c11486b.f34756Y;
            AbstractC9233X.m9807c(obj);
        }
        c11488d.f34770c.append(str);
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m12892e(String str, AbstractC19687c abstractC19687c) {
        C11487c c11487c;
        C11488d c11488d;
        if (abstractC19687c instanceof C11487c) {
            c11487c = (C11487c) abstractC19687c;
            int i10 = c11487c.f34765q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11487c.f34765q0 = i10 - Integer.MIN_VALUE;
            } else {
                c11487c = new C11487c(this, abstractC19687c);
            }
        } else {
            c11487c = new C11487c(this, abstractC19687c);
        }
        Object obj = c11487c.f34763o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11487c.f34765q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C0631p0 c0631p0 = this.f34771d;
            c11487c.f34761Y = this;
            c11487c.f34762Z = str;
            c11487c.f34765q0 = 1;
            if (c0631p0.mo1272P(c11487c) == enumC19250a) {
                return enumC19250a;
            }
            c11488d = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c11487c.f34762Z;
            c11488d = c11487c.f34761Y;
            AbstractC9233X.m9807c(obj);
        }
        c11488d.f34768a.mo12523y(AbstractC21322p.m21711s0(str).toString());
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: f */
    public final void m12893f(String str) {
        String string = AbstractC21322p.m21711s0(str).toString();
        StringBuilder sb2 = this.f34770c;
        sb2.append(string);
        sb2.append('\n');
        this.f34772e.m1279g0();
    }
}
