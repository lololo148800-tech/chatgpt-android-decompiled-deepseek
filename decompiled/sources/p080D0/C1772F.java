package p080D0;

import mm.C17296C;
import p013Ab.C0420b;
import p049Bm.InterfaceC1439n;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1071w0.InterfaceC20772r0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: D0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1772F extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f5057Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f5058o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1812k f5059p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C0420b f5060q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC20772r0 f5061r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772F(InterfaceC1812k interfaceC1812k, C0420b c0420b, InterfaceC20772r0 interfaceC20772r0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5059p0 = interfaceC1812k;
        this.f5060q0 = c0420b;
        this.f5061r0 = interfaceC20772r0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1772F c1772f = new C1772F(this.f5059p0, this.f5060q0, this.f5061r0, interfaceC18770c);
        c1772f.f5058o0 = obj;
        return c1772f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1772F) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C19748y c19748y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5057Z;
        if (i10 != 0) {
            if (i10 == 1) {
                c19748y = (C19748y) this.f5058o0;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c19748y = (C19748y) this.f5058o0;
        this.f5058o0 = c19748y;
        this.f5057Z = 1;
        obj = AbstractC1807h0.m2621j(c19748y, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C19729f c19729f = (C19729f) obj;
        if (AbstractC1807h0.m2608C(c19729f) && (c19729f.f62462c & 33) != 0) {
            ?? r6 = c19729f.f62460a;
            int size = r6.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    this.f5058o0 = null;
                    this.f5057Z = 2;
                    if (AbstractC1807h0.m2622k(c19748y, this.f5059p0, this.f5060q0, c19729f, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (((C19738o) r6.get(i11)).m20692b()) {
                        break;
                    }
                    i11++;
                }
            }
            if (!AbstractC1807h0.m2608C(c19729f)) {
                this.f5058o0 = null;
                this.f5057Z = 3;
                if (AbstractC1807h0.m2624m(c19748y, this.f5061r0, c19729f, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (!AbstractC1807h0.m2608C(c19729f)) {
            this.f5058o0 = null;
            this.f5057Z = 3;
            if (AbstractC1807h0.m2624m(c19748y, this.f5061r0, c19729f, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
