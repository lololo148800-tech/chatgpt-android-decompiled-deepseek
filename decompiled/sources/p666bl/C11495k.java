package p666bl;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p009A7.FlM.nkFZpTrMPpn;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C11495k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Charset f34790Y;

    /* JADX INFO: renamed from: Z */
    public int f34791Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15085k f34792o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Charset f34793p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ StringBuilder f34794q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C11488d f34795r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11495k(C15085k c15085k, Charset charset, StringBuilder sb2, C11488d c11488d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34792o0 = c15085k;
        this.f34793p0 = charset;
        this.f34794q0 = sb2;
        this.f34795r0 = c11488d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11495k(this.f34792o0, this.f34793p0, this.f34794q0, this.f34795r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11495k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String strM9407c;
        Charset charset;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34791Z;
        C11488d c11488d = this.f34795r0;
        StringBuilder sb2 = this.f34794q0;
        String str = nkFZpTrMPpn.oVMePBCUjsmcz;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                try {
                    C15085k c15085k = this.f34792o0;
                    Charset charset2 = this.f34793p0;
                    this.f34790Y = charset2;
                    this.f34791Z = 1;
                    obj = AbstractC15070F.m16186n(c15085k, this);
                    if (obj == enumC19250a) {
                        return enumC19250a;
                    }
                    charset = charset2;
                } catch (Throwable th2) {
                    String string = sb2.toString();
                    AbstractC16544l.m18093f(string, str);
                    c11488d.m12890c(string);
                    c11488d.m12888a();
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = this.f34790Y;
                AbstractC9233X.m9807c(obj);
            }
            strM9407c = AbstractC8700r.m9407c((InterfaceC7526i) obj, charset, 2);
        } catch (Throwable unused) {
            strM9407c = null;
        }
        if (strM9407c == null) {
            strM9407c = "[request body omitted]";
        }
        sb2.append("BODY START");
        sb2.append('\n');
        sb2.append(strM9407c);
        sb2.append('\n');
        sb2.append("BODY END");
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, str);
        c11488d.m12890c(string2);
        c11488d.m12888a();
        return C17296C.f55119a;
    }
}
