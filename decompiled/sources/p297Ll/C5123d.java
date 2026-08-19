package p297Ll;

import io.livekit.android.room.C15102a;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p273Kl.C4727J0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ll.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5123d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f16748Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4727J0 f16749Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15102a f16750o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5123d(C4727J0 c4727j0, C15102a c15102a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16749Z = c4727j0;
        this.f16750o0 = c15102a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C5123d c5123d = new C5123d(this.f16749Z, this.f16750o0, interfaceC18770c);
        c5123d.f16748Y = obj;
        return c5123d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5123d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f16748Y;
        C4727J0 c4727j0 = this.f16749Z;
        C15102a c15102a = this.f16750o0;
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5121b(c4727j0, c15102a, null), 3);
        return AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5122c(c4727j0, c15102a, null), 3);
    }
}
