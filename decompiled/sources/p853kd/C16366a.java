package p853kd;

import android.app.Activity;
import mm.C17296C;
import p003A1.C0307z;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: kd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16366a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f50832Y;

    /* JADX INFO: renamed from: Z */
    public int f50833Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16368c f50834o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Activity f50835p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16366a(Activity activity, C16368c c16368c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50834o0 = c16368c;
        this.f50835p0 = activity;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16366a(this.f50835p0, this.f50834o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16366a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f50833Z;
        C16368c c16368c = this.f50834o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f50832Y;
                AbstractC9233X.m9807c(obj);
            }
            if (i10 == 5) {
                c16368c.getClass();
                AbstractC0575H.m1156D(c16368c.f50840a, null, null, new C16367b(this.f50835p0, c16368c, null), 3);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C16372g c16372g = c16368c.f50841b;
        this.f50833Z = 1;
        obj = AbstractC2124C.m3221t(c16372g.f64176f, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        int i12 = ((C16371f) obj).f50845a + 1;
        C16372g c16372g2 = c16368c.f50841b;
        C0307z c0307z = new C0307z(i12, 4);
        this.f50832Y = i12;
        this.f50833Z = 2;
        if (c16372g2.m21029b(c0307z, this) == enumC19250a) {
            return enumC19250a;
        }
        i10 = i12;
        if (i10 == 5) {
            c16368c.getClass();
            AbstractC0575H.m1156D(c16368c.f50840a, null, null, new C16367b(this.f50835p0, c16368c, null), 3);
        }
        return C17296C.f55119a;
    }
}
