package p059C5;

import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import mm.C17296C;
import p025An.C0644w;
import p033B5.C0840x;
import p033B5.InterfaceC0829m;
import p049Bm.InterfaceC1439n;
import p374P5.C6350c;
import p374P5.C6354g;
import p374P5.C6363p;
import p374P5.InterfaceC6357j;
import p523V9.AbstractC7897H0;
import p571X9.AbstractC9233X;
import p882m1.AbstractC17140a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: C5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1590h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4458Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f4459Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AsyncImagePainter f4460o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590h(AsyncImagePainter asyncImagePainter, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4460o0 = asyncImagePainter;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1590h c1590h = new C1590h(this.f4460o0, interfaceC18770c);
        c1590h.f4459Z = obj;
        return c1590h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1590h) create((C1587e) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AsyncImagePainter asyncImagePainter;
        InterfaceC6357j interfaceC6357j;
        Object asyncImagePainter$State$Error;
        C6350c c6350c;
        InterfaceC0829m interfaceC0829m;
        AbstractC17140a abstractC17140aM8193a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4458Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                return (InterfaceC1589g) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            asyncImagePainter = (AsyncImagePainter) this.f4459Z;
            AbstractC9233X.m9807c(obj);
            interfaceC6357j = (InterfaceC6357j) obj;
            asyncImagePainter.getClass();
            if (interfaceC6357j instanceof C6363p) {
                C6363p c6363p = (C6363p) interfaceC6357j;
                asyncImagePainter$State$Error = new AsyncImagePainter$State$Success(AbstractC7897H0.m8193a(c6363p.f20707a, c6363p.f20708b.f20661a, asyncImagePainter.f35902B0), c6363p);
            } else {
                if (interfaceC6357j instanceof C6350c) {
                    throw new C0644w();
                }
                c6350c = (C6350c) interfaceC6357j;
                interfaceC0829m = c6350c.f20618a;
                if (interfaceC0829m != null) {
                    abstractC17140aM8193a = AbstractC7897H0.m8193a(interfaceC0829m, c6350c.f20619b.f20661a, asyncImagePainter.f35902B0);
                } else {
                    abstractC17140aM8193a = null;
                }
                asyncImagePainter$State$Error = new AsyncImagePainter$State$Error(abstractC17140aM8193a, c6350c);
            }
            return asyncImagePainter$State$Error;
        }
        AbstractC9233X.m9807c(obj);
        C1587e c1587e = (C1587e) this.f4459Z;
        AsyncImagePainter asyncImagePainter2 = this.f4460o0;
        C1596n c1596n = asyncImagePainter2.f35903C0;
        if (c1596n != null) {
            C6354g c6354gM13134j = AsyncImagePainter.m13134j(asyncImagePainter2, c1587e.f4455b, true);
            this.f4458Y = 1;
            obj = c1596n.m2444a(c1587e.f4454a, c6354gM13134j, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            return (InterfaceC1589g) obj;
        }
        C6354g c6354gM13134j2 = AsyncImagePainter.m13134j(asyncImagePainter2, c1587e.f4455b, false);
        this.f4459Z = asyncImagePainter2;
        this.f4458Y = 2;
        obj = ((C0840x) c1587e.f4454a).m1898b(c6354gM13134j2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        asyncImagePainter = asyncImagePainter2;
        interfaceC6357j = (InterfaceC6357j) obj;
        asyncImagePainter.getClass();
        if (interfaceC6357j instanceof C6363p) {
            C6363p c6363p2 = (C6363p) interfaceC6357j;
            asyncImagePainter$State$Error = new AsyncImagePainter$State$Success(AbstractC7897H0.m8193a(c6363p2.f20707a, c6363p2.f20708b.f20661a, asyncImagePainter.f35902B0), c6363p2);
        } else {
            if (interfaceC6357j instanceof C6350c) {
                throw new C0644w();
            }
            c6350c = (C6350c) interfaceC6357j;
            interfaceC0829m = c6350c.f20618a;
            if (interfaceC0829m != null) {
                abstractC17140aM8193a = AbstractC7897H0.m8193a(interfaceC0829m, c6350c.f20619b.f20661a, asyncImagePainter.f35902B0);
            } else {
                abstractC17140aM8193a = null;
            }
            asyncImagePainter$State$Error = new AsyncImagePainter$State$Error(abstractC17140aM8193a, c6350c);
        }
        return asyncImagePainter$State$Error;
    }
}
