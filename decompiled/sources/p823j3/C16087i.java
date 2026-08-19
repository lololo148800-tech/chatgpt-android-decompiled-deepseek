package p823j3;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16087i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49818Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16524A f49819Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16524A f49820o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16089k f49821p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f49822q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16087i(C16524A c16524a, C16524A c16524a2, C16089k c16089k, long j10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49819Z = c16524a;
        this.f49820o0 = c16524a2;
        this.f49821p0 = c16089k;
        this.f49822q0 = j10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16087i(this.f49819Z, this.f49820o0, this.f49821p0, this.f49822q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16087i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long j10;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49818Y;
        C16089k c16089k = this.f49821p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j11 = this.f49819Z.f51261Y;
            long j12 = this.f49820o0.f51261Y;
            if (j11 >= j12) {
                this.f49818Y = 1;
                if (AbstractC0575H.m1171S(this) == enumC19250a) {
                    return enumC19250a;
                }
                j10 = this.f49822q0;
                c16089k.f49830r0.m6475c(j10);
                synchronized (c16089k.f49831s0) {
                    c16089k.f49833u0 = j10;
                }
            } else {
                this.f49818Y = 2;
                if (AbstractC0575H.m1184m((j12 - j11) / 1000000, this) == enumC19250a) {
                    return enumC19250a;
                }
                C16089k.m17648b(c16089k, ((Number) c16089k.f49829q0.invoke()).longValue());
            }
        } else if (i10 == 1) {
            AbstractC9233X.m9807c(obj);
            j10 = this.f49822q0;
            c16089k.f49830r0.m6475c(j10);
            synchronized (c16089k.f49831s0) {
                c16089k.f49833u0 = j10;
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            C16089k.m17648b(c16089k, ((Number) c16089k.f49829q0.invoke()).longValue());
        }
        return C17296C.f55119a;
    }
}
