package p556Wk;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0566C0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p485Tk.AbstractC7498g;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p857kl.C16447N;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C8909X extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27262Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Long f27263Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13693c f27264o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0566C0 f27265p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8909X(Long l4, C13693c c13693c, C0566C0 c0566c0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27263Z = l4;
        this.f27264o0 = c13693c;
        this.f27265p0 = c0566c0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8909X(this.f27263Z, this.f27264o0, this.f27265p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8909X) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27262Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long jLongValue = this.f27263Z.longValue();
            this.f27262Y = 1;
            if (AbstractC0575H.m1184m(jLongValue, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C13693c request = this.f27264o0;
        AbstractC16544l.m18094g(request, "request");
        C16447N c16447n = request.f43195a;
        String strM18022c = c16447n.m18022c();
        C8906U c8906u = C8906U.f27257a;
        Map map = (Map) request.f43200f.m20651e(AbstractC7498g.f23799a);
        C8907V c8907v = (C8907V) (map != null ? map.get(c8906u) : null);
        C8901O c8901o = new C8901O(strM18022c, c8907v != null ? c8907v.f27258a : null, null);
        AbstractC8910Y.f27266a.mo19442g("Request timeout: " + c16447n);
        String message = c8901o.getMessage();
        AbstractC16544l.m18091d(message);
        this.f27265p0.mo1275e(AbstractC0575H.m1172a(message, c8901o));
        return C17296C.f55119a;
    }
}
