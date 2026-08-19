package p290Ld;

import java.util.ArrayList;
import java.util.Iterator;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p228J.AbstractC3794B0;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.AbstractC14929a;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ld.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5000c extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f16310Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f16311Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC14929a[] f16312o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f16313p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C9683j f16314q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5000c(long j10, long j11, C9683j c9683j, InterfaceC18770c interfaceC18770c, AbstractC14929a[] abstractC14929aArr) {
        super(1, interfaceC18770c);
        this.f16311Z = j10;
        this.f16312o0 = abstractC14929aArr;
        this.f16313p0 = j11;
        this.f16314q0 = c9683j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C5000c(this.f16311Z, this.f16313p0, this.f16314q0, interfaceC18770c, this.f16312o0);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((C5000c) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f16310Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ArrayList arrayList = new ArrayList();
            AbstractC14929a[] abstractC14929aArr = this.f16312o0;
            if (abstractC14929aArr.length > 0) {
                AbstractC14929a abstractC14929a = abstractC14929aArr[0];
                throw null;
            }
            Iterator it = AbstractC17680n.m19370t0(arrayList, new C4999b()).iterator();
            if (it.hasNext()) {
                throw AbstractC3794B0.m4497v(it);
            }
            long j10 = this.f16311Z;
            long j11 = this.f16313p0;
            if (j10 < j11) {
                C5001d c5001d = new C5001d(j10, j11, this.f16314q0, null);
                this.f16310Y = 2;
                if (c5001d.invoke(this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                throw null;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
