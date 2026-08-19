package p625Zh;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p273Kl.C4721G0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10395a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C4721G0 f30802Y;

    /* JADX INFO: renamed from: Z */
    public int f30803Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ boolean f30804o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ConnectivityManager f30805p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ NetworkRequest f30806q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C10396b f30807r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10395a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, C10396b c10396b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30805p0 = connectivityManager;
        this.f30806q0 = networkRequest;
        this.f30807r0 = c10396b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C10395a c10395a = new C10395a(this.f30805p0, this.f30806q0, this.f30807r0, interfaceC18770c);
        c10395a.f30804o0 = ((Boolean) obj).booleanValue();
        return c10395a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C10395a) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4721G0 c4721g0;
        Throwable th2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30803Z;
        ConnectivityManager connectivityManager = this.f30805p0;
        C10396b c10396b = this.f30807r0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            if (!this.f30804o0) {
                return C17296C.f55119a;
            }
            C4721G0 c4721g1 = new C4721G0(c10396b, 2);
            try {
                connectivityManager.registerNetworkCallback(this.f30806q0, c4721g1);
            } catch (RuntimeException e10) {
                AbstractC8160o6.m8731f(c10396b.f30810o0, "Unable to register connectivity callbacks. Features that rely on ConnectivityChecker may not work properly", e10, null, 4);
            }
            try {
                this.f30802Y = c4721g1;
                this.f30803Z = 1;
                AbstractC0575H.m1179h(this);
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                return enumC19250a;
            } catch (Throwable th3) {
                c4721g0 = c4721g1;
                th2 = th3;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4721g0 = this.f30802Y;
            try {
                AbstractC9233X.m9807c(obj);
                throw new C0644w();
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        try {
            connectivityManager.unregisterNetworkCallback(c4721g0);
        } catch (IllegalArgumentException e11) {
            AbstractC8160o6.m8731f(c10396b.f30810o0, "Failed to unregister network callback", e11, null, 4);
        }
        throw th2;
    }
}
