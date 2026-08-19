package p502Uc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9812U;
import p635a1.C10444b;
import p635a1.InterfaceC10460r;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7623g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f24093Y;

    /* JADX INFO: renamed from: Z */
    public int f24094Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f24095o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f24096p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f24097q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f24098r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f24099s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC5985X f24100t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7623g(boolean z6, List list, long j10, long j11, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24096p0 = z6;
        this.f24097q0 = list;
        this.f24098r0 = j10;
        this.f24099s0 = j11;
        this.f24100t0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7623g c7623g = new C7623g(this.f24096p0, this.f24097q0, this.f24098r0, this.f24099s0, this.f24100t0, interfaceC18770c);
        c7623g.f24095o0 = obj;
        return c7623g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7623g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0060 -> B:25:0x0063). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0571F interfaceC0571F;
        int i10;
        InterfaceC10460r interfaceC10460r;
        float fMo814W;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f24094Z;
        List list = this.f24097q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            interfaceC0571F = (InterfaceC0571F) this.f24095o0;
            i10 = 1;
            InterfaceC18776i coroutineContext = interfaceC0571F.getCoroutineContext();
            AbstractC16544l.m18094g(coroutineContext, "<this>");
            interfaceC10460r = (InterfaceC10460r) coroutineContext.get(C10444b.f30933B0);
            if (interfaceC10460r != null) {
                fMo814W = interfaceC10460r.mo814W();
            } else {
                fMo814W = 1.0f;
            }
            if (fMo814W > 0.0f || (!this.f24096p0 && i10 >= list.size())) {
                return C17296C.f55119a;
            }
            long j10 = i10 == 1 ? this.f24098r0 : this.f24099s0;
            this.f24095o0 = interfaceC0571F;
            this.f24093Y = i10;
            this.f24094Z = 1;
            if (AbstractC9812U.m10440a(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f24093Y;
            interfaceC0571F = (InterfaceC0571F) this.f24095o0;
            AbstractC9233X.m9807c(obj);
        }
        int i12 = i10 + 1;
        Object obj2 = list.get(i10 % list.size());
        int i13 = AbstractC7625i.f24110c;
        this.f24100t0.setValue(obj2);
        i10 = i12;
        InterfaceC18776i coroutineContext2 = interfaceC0571F.getCoroutineContext();
        AbstractC16544l.m18094g(coroutineContext2, "<this>");
        interfaceC10460r = (InterfaceC10460r) coroutineContext2.get(C10444b.f30933B0);
        if (interfaceC10460r != null) {
            fMo814W = interfaceC10460r.mo814W();
        } else {
            fMo814W = 1.0f;
        }
        if (fMo814W > 0.0f) {
        }
        return C17296C.f55119a;
    }
}
