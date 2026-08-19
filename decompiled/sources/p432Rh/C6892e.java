package p432Rh;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0292u;
import p030B2.C0742X;
import p049Bm.InterfaceC1436k;
import p1155zi.C21988b1;
import p1155zi.EnumC22000e1;
import p364Oh.AbstractC6249w;
import p364Oh.C6228b;
import p364Oh.InterfaceC6247u;
import p556Wk.C8915b0;
import p556Wk.C8920e;
import p571X9.AbstractC9233X;
import p857kl.C16440G;
import p905nd.C17570C;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import tm.C20007b;

/* JADX INFO: renamed from: Rh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6892e implements InterfaceC6247u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6247u f22094a;

    /* JADX INFO: renamed from: b */
    public final C17570C f22095b;

    public C6892e(InterfaceC6247u interfaceC6247u, C17570C c17570c) {
        this.f22094a = interfaceC6247u;
        this.f22095b = c17570c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p364Oh.InterfaceC6247u
    /* JADX INFO: renamed from: a */
    public final Object mo6741a(Throwable th2, AbstractC19687c abstractC19687c) {
        C6890c c6890c;
        C6892e c6892e;
        if (abstractC19687c instanceof C6890c) {
            c6890c = (C6890c) abstractC19687c;
            int i10 = c6890c.f22088q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6890c.f22088q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6890c = new C6890c(this, abstractC19687c);
            }
        } else {
            c6890c = new C6890c(this, abstractC19687c);
        }
        Object objM7287b = c6890c.f22086o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6890c.f22088q0;
        if (i11 != 0) {
            if (i11 == 1) {
                th2 = c6890c.f22085Z;
                c6892e = c6890c.f22084Y;
                AbstractC9233X.m9807c(objM7287b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM7287b);
            }
            return objM7287b;
        }
        AbstractC9233X.m9807c(objM7287b);
        C0292u c0292u = new C0292u(1, this.f22095b, C17570C.class, "onMismatchAuth", "onMismatchAuth(Lcom/openai/types/MismatchAuth;)V", 0, 25);
        c6890c.f22084Y = this;
        c6890c.f22085Z = th2;
        c6890c.f22088q0 = 1;
        objM7287b = m7287b(th2, c0292u, c6890c);
        if (objM7287b == enumC19250a) {
            return enumC19250a;
        }
        c6892e = this;
        objM7287b = (AbstractC6249w) objM7287b;
        if (objM7287b == null) {
            InterfaceC6247u interfaceC6247u = c6892e.f22094a;
            c6890c.f22084Y = null;
            c6890c.f22085Z = null;
            c6890c.f22088q0 = 2;
            objM7287b = interfaceC6247u.mo6741a(th2, c6890c);
            if (objM7287b == enumC19250a) {
                return enumC19250a;
            }
        }
        return objM7287b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final EnumC19250a m7287b(Throwable th2, C0292u c0292u, AbstractC19687c abstractC19687c) {
        C6891d c6891d;
        InterfaceC1436k interfaceC1436k;
        Object next;
        if (abstractC19687c instanceof C6891d) {
            c6891d = (C6891d) abstractC19687c;
            int i10 = c6891d.f22093q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6891d.f22093q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6891d = new C6891d(this, abstractC19687c);
            }
        } else {
            c6891d = new C6891d(this, abstractC19687c);
        }
        Object objM7941L = c6891d.f22091o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6891d.f22093q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7941L);
            if (th2 instanceof C8920e) {
                c6891d.f22089Y = th2;
                c6891d.f22090Z = c0292u;
                c6891d.f22093q0 = 1;
                objM7941L = C6228b.f20281q0.m7941L((C8915b0) th2, c6891d);
                if (objM7941L == enumC19250a) {
                    interfaceC1436k = c0292u;
                    return enumC19250a;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC1436k interfaceC1436k2 = c6891d.f22090Z;
        th2 = c6891d.f22089Y;
        AbstractC9233X.m9807c(objM7941L);
        interfaceC1436k = interfaceC1436k2;
        interfaceC1436k = c0292u;
        C6228b c6228b = (C6228b) objM7941L;
        C20007b c20007b = EnumC22000e1.f69633o0;
        c20007b.getClass();
        C0742X c0742x = new C0742X(c20007b, 8);
        do {
            if (!c0742x.hasNext()) {
                next = null;
                break;
            }
            next = c0742x.next();
        } while (!((EnumC22000e1) next).f69634Y.equals(c6228b != null ? c6228b.f20284Z : null));
        EnumC22000e1 enumC22000e1 = (EnumC22000e1) next;
        if (AbstractC16544l.m18089b(((C8920e) th2).f27285Y.mo7307f(), C16440G.f51008v0) && enumC22000e1 != null) {
            interfaceC1436k.invoke(new C21988b1(enumC22000e1));
        }
        return null;
    }
}
