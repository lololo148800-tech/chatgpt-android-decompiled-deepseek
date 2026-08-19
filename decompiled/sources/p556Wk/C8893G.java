package p556Wk;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import np.InterfaceC17710b;
import p049Bm.InterfaceC1442q;
import p1111xl.C21296a;
import p434Rk.C6911c;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8651i4;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p857kl.C16460h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wk.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8893G extends AbstractC19694j implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public int f27217Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ AbstractC14527b f27218Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ InterfaceC15088n f27219o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ C21296a f27220p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Charset f27221q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8893G(Charset charset, InterfaceC18770c interfaceC18770c) {
        super(5, interfaceC18770c);
        this.f27221q0 = charset;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC14527b abstractC14527b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27217Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC14527b abstractC14527b2 = this.f27218Z;
            InterfaceC15088n interfaceC15088n = this.f27219o0;
            if (!AbstractC16544l.m18089b(this.f27220p0.f67700a, AbstractC16526C.f51263a.mo5693b(String.class))) {
                return null;
            }
            this.f27218Z = abstractC14527b2;
            this.f27219o0 = null;
            this.f27217Y = 1;
            Object objM16186n = AbstractC15070F.m16186n(interfaceC15088n, this);
            if (objM16186n == enumC19250a) {
                return enumC19250a;
            }
            abstractC14527b = abstractC14527b2;
            obj = objM16186n;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC14527b = this.f27218Z;
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC7526i interfaceC7526i = (InterfaceC7526i) obj;
        C6911c c6911cMo7303b = abstractC14527b.mo7303b();
        InterfaceC17710b interfaceC17710b = AbstractC8895I.f27223a;
        C16460h c16460hM9325c = AbstractC8651i4.m9325c(c6911cMo7303b.m7297d());
        Charset charsetM9277a = c16460hM9325c != null ? AbstractC8627e4.m9277a(c16460hM9325c) : null;
        if (charsetM9277a == null) {
            charsetM9277a = this.f27221q0;
        }
        AbstractC8895I.f27223a.mo19442g("Reading response body for " + c6911cMo7303b.m7296c().mo7300S() + " as String with charset " + charsetM9277a);
        return AbstractC8700r.m9407c(interfaceC7526i, charsetM9277a, 2);
    }

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C8893G c8893g = new C8893G(this.f27221q0, (InterfaceC18770c) obj5);
        c8893g.f27218Z = (AbstractC14527b) obj2;
        c8893g.f27219o0 = (InterfaceC15088n) obj3;
        c8893g.f27220p0 = (C21296a) obj4;
        return c8893g.invokeSuspend(C17296C.f55119a);
    }
}
