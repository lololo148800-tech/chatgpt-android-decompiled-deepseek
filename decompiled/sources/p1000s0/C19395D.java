package p1000s0;

import mm.C17296C;
import p001A.C0042V0;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p571X9.AbstractC9233X;
import p860l0.InterfaceC16694M0;
import p953q0.C18561T;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: s0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C19395D extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61426Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19408d f61427Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f61428o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f61429p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19395D(C19408d c19408d, float f10, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61427Z = c19408d;
        this.f61428o0 = f10;
        this.f61429p0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19395D(this.f61427Z, this.f61428o0, this.f61429p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19395D) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f61426Y;
        C17296C c17296c = C17296C.f55119a;
        C19408d c19408d = this.f61427Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f61426Y = 1;
            Object objM19944a = c19408d.f61459v.m19944a(this);
            if (objM19944a != enumC19250a) {
                objM19944a = c17296c;
            }
            if (objM19944a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        float f10 = this.f61428o0;
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5").toString());
        }
        int iM20497i = c19408d.m20497i(this.f61429p0);
        C0042V0 c0042v0 = c19408d.f61440c;
        ((C5996c0) c0042v0.f206o0).m6413h(iM20497i);
        ((C18561T) c0042v0.f209r0).m19939c(iM20497i);
        ((C5994b0) c0042v0.f207p0).m6410h(f10);
        c0042v0.f208q0 = null;
        C21658D c21658d = (C21658D) c19408d.f61460w.getValue();
        if (c21658d != null) {
            c21658d.m22047l();
        }
        return c17296c;
    }
}
