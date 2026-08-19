package p196Hi;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9405z3;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hi.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C3447q extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Context f10478Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractActivityC17375g f10479Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f10480o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3447q(Context context, AbstractActivityC17375g abstractActivityC17375g, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10478Y = context;
        this.f10479Z = abstractActivityC17375g;
        this.f10480o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3447q(this.f10478Y, this.f10479Z, this.f10480o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3447q c3447q = (C3447q) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3447q.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean zM18089b = AbstractC16544l.m18089b((Boolean) this.f10480o0.getValue(), Boolean.TRUE);
        C17296C c17296c = C17296C.f55119a;
        if (!zM18089b) {
            return c17296c;
        }
        String strM5902f = C5431w.m5902f(C5431w.f17746g, EnumC5421r.f17710Z, null, false, false, 14);
        List listM19382k = AbstractC17681o.m19382k(new Integer(268435456), new Integer(67108864), new Integer(32768));
        Context context = this.f10478Y;
        context.startActivity(AbstractC9405z3.m9981a(context, strM5902f, listM19382k));
        this.f10479Z.finish();
        return c17296c;
    }
}
