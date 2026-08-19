package p1099x6;

import mm.C17296C;
import p032B4.C0806a;
import p1034u6.C20126d;
import p103Dn.InterfaceC2186j;
import p136F6.AbstractC2674a;
import p571X9.AbstractC9233X;
import p917o6.C17853f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: x6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21141i implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2186j f67182Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f67183Z;

    public C21141i(InterfaceC2186j interfaceC2186j, long j10) {
        this.f67182Y = interfaceC2186j;
        this.f67183Z = j10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C21140h c21140h;
        if (interfaceC18770c instanceof C21140h) {
            c21140h = (C21140h) interfaceC18770c;
            int i10 = c21140h.f67180Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21140h.f67180Z = i10 - Integer.MIN_VALUE;
            } else {
                c21140h = new C21140h(this, interfaceC18770c);
            }
        } else {
            c21140h = new C21140h(this, interfaceC18770c);
        }
        Object obj2 = c21140h.f67179Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21140h.f67180Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            C17853f c17853f = (C17853f) obj;
            C0806a c0806aM19598a = c17853f.m19598a();
            int i12 = AbstractC2674a.f8212a;
            c0806aM19598a.m1842a(new C20126d(0L, 0L, this.f67183Z, System.currentTimeMillis(), false, c17853f.f56935e));
            C17853f c17853fM1843b = c0806aM19598a.m1843b();
            c21140h.f67180Z = 1;
            if (this.f67182Y.mo395a(c17853fM1843b, c21140h) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj2);
        }
        return C17296C.f55119a;
    }
}
