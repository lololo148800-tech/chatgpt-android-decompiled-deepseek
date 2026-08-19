package p778h5;

import java.util.Arrays;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p290Ld.C5002e;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p801i5.AbstractC14929a;
import p801i5.C14930b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14411b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f45281Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9683j f45282Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f45283o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f45284p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC14929a[] f45285q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14411b(long j10, long j11, C9683j c9683j, InterfaceC18770c interfaceC18770c, AbstractC14929a[] abstractC14929aArr) {
        super(2, interfaceC18770c);
        this.f45282Z = c9683j;
        this.f45283o0 = j10;
        this.f45284p0 = j11;
        this.f45285q0 = abstractC14929aArr;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14411b(this.f45283o0, this.f45284p0, this.f45282Z, interfaceC18770c, this.f45285q0);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C14411b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [Bm.k, sm.j] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f45281Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC14929a[] abstractC14929aArr = this.f45285q0;
            ?? r11 = ((C14930b) C5002e.f16319a.mo1904a(this.f45282Z, this.f45283o0, this.f45284p0, (AbstractC14929a[]) Arrays.copyOf(abstractC14929aArr, abstractC14929aArr.length))).f46520b;
            this.f45281Y = 1;
            if (r11.invoke(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
