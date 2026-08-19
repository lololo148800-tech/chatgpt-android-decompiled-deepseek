package pf;

import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.C19723A;
import p349O0.InterfaceC5985X;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pf.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18409y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f58729Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f58730Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f58731o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f58732p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f58733q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC5985X f58734r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18409y(InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2, InterfaceC5985X interfaceC5985X3, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58731o0 = interfaceC5985X;
        this.f58732p0 = interfaceC1436k;
        this.f58733q0 = interfaceC5985X2;
        this.f58734r0 = interfaceC5985X3;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        InterfaceC5985X interfaceC5985X = this.f58733q0;
        C18409y c18409y = new C18409y(this.f58732p0, this.f58731o0, interfaceC5985X, this.f58734r0, interfaceC18770c);
        c18409y.f58730Z = obj;
        return c18409y;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18409y) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19723A c19723a;
        C18408x c18408x;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f58729Y;
        InterfaceC5985X interfaceC5985X = this.f58731o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a2 = (C19723A) this.f58730Z;
            List list = AbstractC18384B.f58664a;
            if (((int) (((C7545j) interfaceC5985X.getValue()).f23903a >> 32)) == 0) {
                return C17296C.f55119a;
            }
            c19723a = c19723a2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c19723a = (C19723A) this.f58730Z;
            AbstractC9233X.m9807c(obj);
        }
        do {
            c18408x = new C18408x(this.f58732p0, interfaceC5985X, this.f58733q0, this.f58734r0, null);
            this.f58730Z = c19723a;
            this.f58729Y = 1;
        } while (c19723a.m20667K0(c18408x, this) != enumC19250a);
        return enumC19250a;
    }
}
