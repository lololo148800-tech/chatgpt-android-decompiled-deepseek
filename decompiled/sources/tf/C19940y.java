package tf;

import com.revenuecat.purchases.common.UtilsKt;
import io.C15050f;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p523V9.AbstractC8128k6;
import p553Wh.C8865a;
import p553Wh.C8870f;
import p571X9.AbstractC9233X;
import p772h.C14215F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: tf.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C19940y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f63202Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f63203Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15050f f63204o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14215F f63205p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19940y(C8870f c8870f, C15050f c15050f, C14215F c14215f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f63203Z = c8870f;
        this.f63204o0 = c15050f;
        this.f63205p0 = c14215f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C19940y(this.f63203Z, this.f63204o0, this.f63205p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19940y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long jM8637c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f63202Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C8870f c8870f = this.f63203Z;
            c8870f.getClass();
            AbstractC0575H.m1156D(c8870f.f27153f, null, null, new C8865a(c8870f, null), 3);
            long j10 = this.f63204o0.f46777a;
            C21554a c21554a = C21555b.f68260Z;
            if ((((int) j10) & 1) == 0) {
                jM8637c = AbstractC8128k6.m8639e((j10 >> 1) / ((long) 2));
            } else if (C21555b.m21838h(j10)) {
                jM8637c = C21555b.m21840j(Integer.signum(2), j10);
            } else {
                long j11 = j10 >> 1;
                long j12 = 2;
                long j13 = j11 / j12;
                if (-4611686018426L > j13 || j13 >= 4611686018427L) {
                    jM8637c = AbstractC8128k6.m8637c(j13);
                } else {
                    long j14 = UtilsKt.MICROS_MULTIPLIER;
                    jM8637c = AbstractC8128k6.m8639e((j13 * j14) + (((j11 - (j13 * j12)) * j14) / j12));
                }
            }
            this.f63202Y = 1;
            if (AbstractC0575H.m1185n(jM8637c, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C14215F c14215f = this.f63205p0;
        if (c14215f != null) {
            c14215f.m15518c();
        }
        return C17296C.f55119a;
    }
}
