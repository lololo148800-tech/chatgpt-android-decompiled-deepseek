package p066Cc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.openai.chatgpt.MainActivity;
import com.openai.feature.rootviewmodel.RootViewModel;
import mm.C17296C;
import ni.C17632f;
import ni.C17633g;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p092Dc.C1998o;
import p103Dn.C2153Q0;
import p1071w0.AbstractC20734X;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Cc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1626c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4612Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MainActivity f4613Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f4614o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626c(MainActivity mainActivity, C8410b c8410b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4613Z = mainActivity;
        this.f4614o0 = c8410b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1626c(this.f4613Z, this.f4614o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C1626c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        return EnumC19250a.f61036Y;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4612Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC20734X.m21252w(obj);
        }
        AbstractC9233X.m9807c(obj);
        Object objM19235b = C17632f.f56419a.m19235b(C1998o.class);
        if (objM19235b == null) {
            throw new C17633g(AbstractC10763a.m11055m("No ", C1998o.class.getName(), " in ", C17632f.m19233c()));
        }
        C1998o c1998o = (C1998o) objM19235b;
        C2153Q0 c2153q0 = ((RootViewModel) c1998o.f6055l0.get()).f40343c;
        C1625b c1625b = new C1625b(c1998o, this.f4613Z, this.f4614o0, 0);
        this.f4612Y = 1;
        c2153q0.mo3141d(c1625b, this);
        return enumC19250a;
    }
}
