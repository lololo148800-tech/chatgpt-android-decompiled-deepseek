package p268Kf;

import android.content.Intent;
import android.net.Uri;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p403Qd.C6617X;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C4656k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15143Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15144Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4653h f15145o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4666u f15146p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C6617X f15147q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4656k(C4653h c4653h, C4666u c4666u, C6617X c6617x, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15145o0 = c4653h;
        this.f15146p0 = c4666u;
        this.f15147q0 = c6617x;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4656k c4656k = new C4656k(this.f15145o0, this.f15146p0, this.f15147q0, interfaceC18770c);
        c4656k.f15144Z = obj;
        return c4656k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4656k) create((String) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15143Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return (C7351f0) obj;
        }
        AbstractC9233X.m9807c(obj);
        String str = (String) this.f15144Z;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        this.f15143Y = 1;
        this.f15145o0.invoke(intent, this);
        obj = Boolean.TRUE;
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        this.f15143Y = 2;
        obj = C4666u.m5375i(this.f15146p0, this.f15147q0, "Call started", 0, this, 12);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return (C7351f0) obj;
    }
}
