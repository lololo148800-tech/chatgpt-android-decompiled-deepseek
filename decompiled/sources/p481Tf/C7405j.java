package p481Tf;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p505Uf.C7653n;
import p505Uf.C7656q;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7405j extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23455Y;

    /* JADX INFO: renamed from: Z */
    public int f23456Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7409n f23457o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f23458p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7405j(C7409n c7409n, String str, InterfaceC18770c interfaceC18770c, int i10) {
        super(3, interfaceC18770c);
        this.f23455Y = i10;
        this.f23457o0 = c7409n;
        this.f23458p0 = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f23455Y;
        ((Number) obj).intValue();
        InterfaceC18770c interfaceC18770c = (InterfaceC18770c) obj3;
        switch (i10) {
            case 0:
                return new C7405j(this.f23457o0, this.f23458p0, interfaceC18770c, 0).invokeSuspend(C17296C.f55119a);
            default:
                return new C7405j(this.f23457o0, this.f23458p0, interfaceC18770c, 1).invokeSuspend(C17296C.f55119a);
        }
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23455Y) {
            case 0:
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f23456Z;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C7401f c7401f = this.f23457o0.f23470a;
                    C7653n c7653n = new C7653n(this.f23458p0);
                    this.f23456Z = 1;
                    InterfaceC3777y interfaceC3777yM18075c = null;
                    C7397b c7397b = new C7397b(c7653n, null);
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                    try {
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        break;
                    } catch (Throwable unused) {
                    }
                    obj = AbstractC9144I.m9690b(c7401f.f23449a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c7397b, this);
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
            default:
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i11 = this.f23456Z;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    C7401f c7401f2 = this.f23457o0.f23470a;
                    C7656q c7656q = new C7656q(this.f23458p0);
                    this.f23456Z = 1;
                    InterfaceC3777y interfaceC3777yM18075c2 = null;
                    C7399d c7399d = new C7399d(c7656q, null);
                    InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                    try {
                        interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C17296C.class);
                        break;
                    } catch (Throwable unused2) {
                    }
                    obj = AbstractC9144I.m9690b(c7401f2.f23449a, new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2), c7399d, this);
                    if (obj == enumC19250a2) {
                        return enumC19250a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return obj;
        }
    }
}
