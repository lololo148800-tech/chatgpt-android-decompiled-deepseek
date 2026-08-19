package p1089wl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import mm.C17312o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.InterfaceC19688d;

/* JADX INFO: renamed from: wl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21017k implements InterfaceC18770c, InterfaceC19688d {

    /* JADX INFO: renamed from: Y */
    public int f66877Y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21018l f66878Z;

    public C21017k(C21018l c21018l) {
        this.f66878Z = c21018l;
    }

    @Override // sm.InterfaceC19688d
    public final InterfaceC19688d getCallerFrame() {
        InterfaceC18770c interfaceC18770c = C21016j.f66876Y;
        int i10 = this.f66877Y;
        C21018l c21018l = this.f66878Z;
        if (i10 == Integer.MIN_VALUE) {
            this.f66877Y = c21018l.f66883r0;
        }
        int i11 = this.f66877Y;
        if (i11 < 0) {
            this.f66877Y = Integer.MIN_VALUE;
            interfaceC18770c = null;
        } else {
            try {
                InterfaceC18770c interfaceC18770c2 = c21018l.f66882q0[i11];
                if (interfaceC18770c2 != null) {
                    this.f66877Y = i11 - 1;
                    interfaceC18770c = interfaceC18770c2;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC18770c instanceof InterfaceC19688d) {
            return (InterfaceC19688d) interfaceC18770c;
        }
        return null;
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        C21018l c21018l = this.f66878Z;
        InterfaceC18770c[] interfaceC18770cArr = c21018l.f66882q0;
        int i10 = c21018l.f66883r0;
        InterfaceC18770c interfaceC18770c = interfaceC18770cArr[i10];
        if (interfaceC18770c != this && interfaceC18770c != null) {
            return interfaceC18770c.getContext();
        }
        int i11 = i10 - 1;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            InterfaceC18770c interfaceC18770c2 = c21018l.f66882q0[i11];
            if (interfaceC18770c2 != this && interfaceC18770c2 != null) {
                return interfaceC18770c2.getContext();
            }
            i11 = i12;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        boolean z6 = obj instanceof C17311n;
        C21018l c21018l = this.f66878Z;
        if (!z6) {
            c21018l.m21472e(false);
            return;
        }
        Throwable thM18979a = C17312o.m18979a(obj);
        AbstractC16544l.m18091d(thM18979a);
        c21018l.m21473f(AbstractC9233X.m9806b(thM18979a));
    }
}
