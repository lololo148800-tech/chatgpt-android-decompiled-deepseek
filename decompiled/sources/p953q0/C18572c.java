package p953q0;

import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21063Q;
import p1140z1.AbstractC21678Y;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p972qm.C18778k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18572c implements InterfaceC21063Q {

    /* JADX INFO: renamed from: Y */
    public boolean f59163Y;

    /* JADX INFO: renamed from: Z */
    public C18778k f59164Z;

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19944a(AbstractC19687c abstractC19687c) {
        C18570b c18570b;
        C18778k c18778k;
        if (abstractC19687c instanceof C18570b) {
            c18570b = (C18570b) abstractC19687c;
            int i10 = c18570b.f59160p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18570b.f59160p0 = i10 - Integer.MIN_VALUE;
            } else {
                c18570b = new C18570b(this, abstractC19687c);
            }
        } else {
            c18570b = new C18570b(this, abstractC19687c);
        }
        Object obj = c18570b.f59158Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18570b.f59160p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!this.f59163Y) {
                C18778k c18778k2 = this.f59164Z;
                c18570b.f59157Y = c18778k2;
                c18570b.f59160p0 = 1;
                C18778k c18778k3 = new C18778k(AbstractC8154o0.m8714e(c18570b));
                this.f59164Z = c18778k3;
                if (c18778k3.m20051a() == enumC19250a) {
                    return enumC19250a;
                }
                c18778k = c18778k2;
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c18778k = c18570b.f59157Y;
        AbstractC9233X.m9807c(obj);
        if (c18778k != null) {
            c18778k.resumeWith(c17296c);
        }
        return c17296c;
    }

    @Override // p1095x1.InterfaceC21063Q
    /* JADX INFO: renamed from: c */
    public final void mo429c(AbstractC21678Y abstractC21678Y) {
        if (this.f59163Y) {
            return;
        }
        this.f59163Y = true;
        C18778k c18778k = this.f59164Z;
        if (c18778k != null) {
            c18778k.resumeWith(C17296C.f55119a);
        }
        this.f59164Z = null;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }
}
