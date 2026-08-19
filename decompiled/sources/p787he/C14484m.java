package p787he;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1126yd.C21471f0;
import p1126yd.InterfaceC21409C;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C14484m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45633Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f45634Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14459O f45635o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC21409C f45636p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14484m(C14459O c14459o, InterfaceC21409C interfaceC21409C, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45635o0 = c14459o;
        this.f45636p0 = interfaceC21409C;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14484m c14484m = new C14484m(this.f45635o0, this.f45636p0, interfaceC18770c);
        c14484m.f45634Z = obj;
        return c14484m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14484m) create((C6636i) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45633Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6636i c6636i = (C6636i) this.f45634Z;
            C14473b0 c14473b0 = this.f45635o0.f45512k;
            C21471f0 c21471f0 = (C21471f0) this.f45636p0;
            this.f45633Y = 1;
            obj = c14473b0.m15995b(c6636i, c21471f0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
