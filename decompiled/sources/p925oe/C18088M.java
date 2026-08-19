package p925oe;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p041Be.C1221N;
import p041Be.C1222O;
import p049Bm.InterfaceC1439n;
import p1111xl.C21296a;
import p1155zi.C21999e0;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p269Kh.C4688o;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C18088M extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f57708Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18089N f57709Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f57710o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f57711p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4688o f57712q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18088M(C18089N c18089n, String str, String str2, C4688o c4688o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57709Z = c18089n;
        this.f57710o0 = str;
        this.f57711p0 = str2;
        this.f57712q0 = c4688o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18088M(this.f57709Z, this.f57710o0, this.f57711p0, this.f57712q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18088M) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f57708Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C1222O c1222o = this.f57709Z.f57713a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C4688o c4688o = this.f57712q0;
            String str = c4688o != null ? c4688o.f15253b : null;
            this.f57708Y = 1;
            C1221N c1221n = new C1221N(this.f57710o0, this.f57711p0, str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21999e0.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C21999e0.class);
            } catch (Throwable unused) {
            }
            obj = AbstractC9144I.m9690b(c1222o.f3229a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1221n, this);
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
