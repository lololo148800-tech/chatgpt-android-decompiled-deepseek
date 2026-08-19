package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4765c0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15546Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15102a f15547Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SessionDescription f15548o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4765c0(C15102a c15102a, SessionDescription sessionDescription, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15547Z = c15102a;
        this.f15548o0 = sessionDescription;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4765c0(this.f15547Z, this.f15548o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4765c0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC8394f c8393e;
        EnumC8397i enumC8397i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15546Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26118o0;
            AbstractC8396h.Companion.getClass();
            int iCompareTo = enumC8397i2.compareTo(AbstractC8396h.f26115a);
            SessionDescription sessionDescription = this.f15548o0;
            if (iCompareTo >= 0 && AbstractC22225a.m22419a() > 0) {
                sessionDescription.toString();
                AbstractC22225a.f70470a.getClass();
                C16831c.m18569g(new Object[0]);
            }
            C4808y c4808y = this.f15547Z.f46958r;
            if (c4808y != null) {
                this.f15546Y = 1;
                obj = c4808y.m5442f(sessionDescription, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                c8393e = null;
            }
            if (c8393e == null) {
                c8393e = new C8393e("null");
            }
            if (!(c8393e instanceof C8392d) && (c8393e instanceof C8393e)) {
                C8395g c8395g2 = AbstractC8396h.Companion;
                enumC8397i = EnumC8397i.f26120q0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18568f(new Object[0]);
                }
            }
            return C17296C.f55119a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        c8393e = (AbstractC8394f) obj;
        if (c8393e == null) {
            c8393e = new C8393e("null");
        }
        if (!(c8393e instanceof C8392d)) {
            C8395g c8395g3 = AbstractC8396h.Companion;
            enumC8397i = EnumC8397i.f26120q0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18568f(new Object[0]);
            }
        }
        return C17296C.f55119a;
    }
}
