package p1087wj;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17353t;
import p049Bm.InterfaceC1436k;
import p1044uj.C20336g;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9294h0;
import p909nm.AbstractC17681o;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C20998s extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f66835Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21001v f66836Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20979J f66837o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20998s(C21001v c21001v, C20979J c20979j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f66836Z = c21001v;
        this.f66837o0 = c20979j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C20998s(this.f66836Z, this.f66837o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C20998s) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66835Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21001v c21001v = this.f66836Z;
            InterfaceC20971B interfaceC20971B = c21001v.f66845c;
            C17353t c17353tM9874c = AbstractC9294h0.m9874c("data[type]", "document-file");
            C17353t c17353tM9874c2 = AbstractC9294h0.m9874c("data[attributes][document-id]", c21001v.f66846d);
            C20336g c20336g = c21001v.f66847e;
            C17353t c17353tM9874c3 = AbstractC9294h0.m9874c("data[attributes][capture-method]", c20336g.f64302Z.f64262Y);
            C17353t c17353tM9875d = AbstractC9294h0.m9875d("data[attributes][originals][]", c20336g.f64301Y, this.f66837o0);
            String name = new File(c20336g.f64301Y).getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            List<C17353t> listM19382k = AbstractC17681o.m19382k(c17353tM9874c, c17353tM9874c2, c17353tM9874c3, c17353tM9875d, AbstractC9294h0.m9874c("data[attributes][name]", name));
            this.f66835Y = 1;
            obj = interfaceC20971B.m21460d(c21001v.f66844b, listM19382k, this);
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
