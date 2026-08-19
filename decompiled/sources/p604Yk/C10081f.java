package p604Yk;

import android.gov.nist.core.Separators;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1442q;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p544W9.AbstractC8565U2;
import p544W9.AbstractC8645h4;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p582Xk.C9525b;
import p792hl.AbstractC14527b;
import p857kl.AbstractC16435B;
import p857kl.C16434A;
import p857kl.C16452T;
import p857kl.C16460h;
import p857kl.C16472t;
import p857kl.InterfaceC16476x;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Yk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10081f extends AbstractC19694j implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public int f29843Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ AbstractC14527b f29844Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ InterfaceC15088n f29845o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ C21296a f29846p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Set f29847q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ ArrayList f29848r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C9525b f29849s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10081f(C9525b c9525b, ArrayList arrayList, Set set, InterfaceC18770c interfaceC18770c) {
        super(5, interfaceC18770c);
        this.f29847q0 = set;
        this.f29848r0 = arrayList;
        this.f29849s0 = c9525b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Charset charsetForName;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f29843Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC14527b abstractC14527b = this.f29844Z;
            InterfaceC15088n interfaceC15088n = this.f29845o0;
            C21296a c21296a = this.f29846p0;
            C16460h c16460hM9325c = AbstractC8651i4.m9325c(abstractC14527b);
            if (c16460hM9325c == null) {
                return null;
            }
            InterfaceC16476x interfaceC16476xMo7301a = AbstractC8565U2.m9230e(abstractC14527b).mo7301a();
            Charset defaultCharset = C21307a.f67720a;
            AbstractC16544l.m18094g(interfaceC16476xMo7301a, "<this>");
            AbstractC16544l.m18094g(defaultCharset, "defaultCharset");
            List list = AbstractC16435B.f50983a;
            Iterator it = AbstractC17680n.m19370t0(AbstractC8645h4.m9313b(interfaceC16476xMo7301a.mo7982g("Accept-Charset")), new C16434A()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    charsetForName = null;
                    break;
                }
                String name = ((C16472t) it.next()).f51109a;
                if (AbstractC16544l.m18089b(name, Separators.STAR)) {
                    charsetForName = defaultCharset;
                    break;
                }
                Charset charset = C21307a.f67720a;
                AbstractC16544l.m18094g(name, "name");
                if (Charset.isSupported(name)) {
                    charsetForName = Charset.forName(name);
                    AbstractC16544l.m18093f(charsetForName, "forName(...)");
                    break;
                }
            }
            Charset charset2 = charsetForName == null ? defaultCharset : charsetForName;
            C16452T c16452tMo7300S = AbstractC8565U2.m9230e(abstractC14527b).mo7300S();
            this.f29844Z = null;
            this.f29845o0 = null;
            this.f29843Y = 1;
            obj = AbstractC10084i.m10677b(this.f29847q0, this.f29848r0, c16452tMo7300S, c21296a, interfaceC15088n, c16460hM9325c, charset2, this);
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

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList = this.f29848r0;
        Set set = this.f29847q0;
        C10081f c10081f = new C10081f(this.f29849s0, arrayList, set, (InterfaceC18770c) obj5);
        c10081f.f29844Z = (AbstractC14527b) obj2;
        c10081f.f29845o0 = (InterfaceC15088n) obj3;
        c10081f.f29846p0 = (C21296a) obj4;
        return c10081f.invokeSuspend(C17296C.f55119a);
    }
}
