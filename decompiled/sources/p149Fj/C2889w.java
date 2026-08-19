package p149Fj;

import java.util.ArrayList;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1027tp.C20048M;
import p1131yj.InterfaceC21546a;
import p320Mj.C5461n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C2889w extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f8679Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2891y f8680Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f8681o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2889w(C2891y c2891y, ArrayList arrayList, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f8680Z = c2891y;
        this.f8681o0 = arrayList;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2889w(this.f8680Z, this.f8681o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2889w) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8679Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                return (C20048M) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return (C20048M) obj;
        }
        AbstractC9233X.m9807c(obj);
        C2891y c2891y = this.f8680Z;
        InterfaceC21546a interfaceC21546a = c2891y.f8694j;
        boolean z6 = ((C5461n) interfaceC21546a).f17833d != null;
        ArrayList arrayList = this.f8681o0;
        String str = c2891y.f8687c;
        if (z6) {
            this.f8679Y = 1;
            obj = ((C5461n) interfaceC21546a).m5909b(str, arrayList, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            return (C20048M) obj;
        }
        this.f8679Y = 2;
        obj = c2891y.f8691g.m3719a(str, c2891y.f8688d, arrayList, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return (C20048M) obj;
    }
}
