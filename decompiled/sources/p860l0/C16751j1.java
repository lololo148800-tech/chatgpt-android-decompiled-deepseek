package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1001s1.C19434d;
import p492U1.C7550o;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: l0.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16751j1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public long f53730Y;

    /* JADX INFO: renamed from: Z */
    public int f53731Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ long f53732o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16757l1 f53733p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16751j1(C16757l1 c16757l1, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53733p0 = c16757l1;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16751j1 c16751j1 = new C16751j1(this.f53733p0, interfaceC18770c);
        c16751j1.f53732o0 = ((C7550o) obj).f23912a;
        return c16751j1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((C7550o) obj).f23912a;
        C16751j1 c16751j1 = new C16751j1(this.f53733p0, (InterfaceC18770c) obj2);
        c16751j1.f53732o0 = j10;
        return c16751j1.invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        long j10;
        Object objM20513b;
        Object objM18532b;
        long j11;
        long j12;
        Object objM20512a;
        long j13;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f53731Z;
        C16757l1 c16757l1 = this.f53733p0;
        if (i10 != 0) {
            if (i10 == 1) {
                j10 = this.f53732o0;
                AbstractC9233X.m9807c(obj);
                objM20513b = obj;
            } else if (i10 == 2) {
                j11 = this.f53730Y;
                j10 = this.f53732o0;
                AbstractC9233X.m9807c(obj);
                objM18532b = obj;
                j12 = ((C7550o) objM18532b).f23912a;
                C19434d c19434d = c16757l1.f53762f;
                long jM7904e = C7550o.m7904e(j11, j12);
                this.f53732o0 = j10;
                this.f53730Y = j12;
                this.f53731Z = 3;
                objM20512a = c19434d.m20512a(jM7904e, j12, this);
                if (objM20512a == enumC19250a) {
                    return enumC19250a;
                }
                j13 = j10;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j14 = this.f53730Y;
                j13 = this.f53732o0;
                AbstractC9233X.m9807c(obj);
                j12 = j14;
                objM20512a = obj;
            }
            return new C7550o(C7550o.m7904e(j13, C7550o.m7904e(j12, ((C7550o) objM20512a).f23912a)));
        }
        AbstractC9233X.m9807c(obj);
        j10 = this.f53732o0;
        C19434d c19434d2 = c16757l1.f53762f;
        this.f53732o0 = j10;
        this.f53731Z = 1;
        objM20513b = c19434d2.m20513b(j10, this);
        if (objM20513b == enumC19250a) {
            return enumC19250a;
        }
        long jM7904e2 = C7550o.m7904e(j10, ((C7550o) objM20513b).f23912a);
        this.f53732o0 = j10;
        this.f53730Y = jM7904e2;
        this.f53731Z = 2;
        objM18532b = c16757l1.m18532b(jM7904e2, this);
        if (objM18532b == enumC19250a) {
            return enumC19250a;
        }
        j11 = jM7904e2;
        j12 = ((C7550o) objM18532b).f23912a;
        C19434d c19434d3 = c16757l1.f53762f;
        long jM7904e3 = C7550o.m7904e(j11, j12);
        this.f53732o0 = j10;
        this.f53730Y = j12;
        this.f53731Z = 3;
        objM20512a = c19434d3.m20512a(jM7904e3, j12, this);
        if (objM20512a == enumC19250a) {
            return enumC19250a;
        }
        j13 = j10;
        return new C7550o(C7550o.m7904e(j13, C7550o.m7904e(j12, ((C7550o) objM20512a).f23912a)));
    }
}
