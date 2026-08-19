package p149Fj;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$SupplementaryData;
import java.util.ArrayList;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2876j extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f8642Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2878l f8643Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArrayList f8644o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876j(C2878l c2878l, ArrayList arrayList, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f8643Z = c2878l;
        this.f8644o0 = arrayList;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C2876j(this.f8643Z, this.f8644o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C2876j) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8642Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2878l c2878l = this.f8643Z;
            InterfaceC2881o interfaceC2881o = c2878l.f8653f;
            AutoClassifyWorker$SupplementaryData autoClassifyWorker$SupplementaryData = c2878l.f8656i;
            this.f8642Y = 1;
            obj = interfaceC2881o.m3720b(c2878l.f8649b, c2878l.f8650c, this.f8644o0, autoClassifyWorker$SupplementaryData, this);
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
