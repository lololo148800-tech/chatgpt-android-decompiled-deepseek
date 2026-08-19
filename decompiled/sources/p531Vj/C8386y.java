package p531Vj;

import android.location.LocationManager;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8215v5;
import p571X9.AbstractC9233X;
import p729ej.C13421l;
import p729ej.InterfaceC13410a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8386y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8387z f26101Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f26102Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8383v f26103o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8386y(C8387z c8387z, C13421l c13421l, C8383v c8383v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f26101Y = c8387z;
        this.f26102Z = c13421l;
        this.f26103o0 = c8383v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8386y(this.f26101Y, this.f26102Z, this.f26103o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C8386y c8386y = (C8386y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c8386y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8387z c8387z = this.f26101Y;
        Object systemService = c8387z.f26104a.getSystemService("location");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        boolean zIsProviderEnabled = ((LocationManager) systemService).isProviderEnabled("gps");
        InterfaceC13410a interfaceC13410a = this.f26102Z.f42503Y;
        if (zIsProviderEnabled) {
            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8387z, new C8384w(c8387z, this.f26103o0, 0)));
        } else {
            interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8387z, C8385x.f26092Z));
        }
        return C17296C.f55119a;
    }
}
