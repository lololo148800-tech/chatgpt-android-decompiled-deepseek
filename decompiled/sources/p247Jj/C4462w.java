package p247Jj;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.internal.NfcErrorLog;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import dj.AbstractC13178c;
import fk.C13682c;
import fk.C13683d;
import fk.C13684e;
import fk.EnumC13681b;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p342Nj.EnumC5812f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C4462w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f14595Y;

    /* JADX INFO: renamed from: Z */
    public int f14596Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4466y f14597o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f14598p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4462w(C4466y c4466y, String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14597o0 = c4466y;
        this.f14598p0 = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4462w(this.f14597o0, this.f14598p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4462w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        ErrorRequest errorRequest;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14596Z;
        C17296C c17296c = C17296C.f55119a;
        C4466y c4466y = this.f14597o0;
        C13684e c13684e = c4466y.f14606c;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                str = this.f14595Y;
                AbstractC9233X.m9807c(obj);
                EnumC5812f enumC5812f = EnumC5812f.Nfc;
                C11447L c11447l = c4466y.f14605b;
                c11447l.getClass();
                errorRequest = new ErrorRequest(enumC5812f, c11447l.m12850b(NfcErrorLog.class, AbstractC13178c.f41820a, null).toJsonValue(new NfcErrorLog(str)));
                this.f14595Y = null;
                this.f14596Z = 3;
                if (c4466y.f14604a.m6214g(this.f14598p0, errorRequest, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
        this.f14596Z = 1;
        c13684e.getClass();
        obj = AbstractC0575H.m1168P(c13684e.f43180b, new C13683d(c13684e, null), this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        str = (String) obj;
        if (str == null) {
            return c17296c;
        }
        this.f14595Y = str;
        this.f14596Z = 2;
        c13684e.getClass();
        Object objM1168P = AbstractC0575H.m1168P(c13684e.f43180b, new C13682c(c13684e, null), this);
        if (objM1168P != enumC19250a) {
            objM1168P = c17296c;
        }
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        EnumC5812f enumC5812f2 = EnumC5812f.Nfc;
        C11447L c11447l2 = c4466y.f14605b;
        c11447l2.getClass();
        errorRequest = new ErrorRequest(enumC5812f2, c11447l2.m12850b(NfcErrorLog.class, AbstractC13178c.f41820a, null).toJsonValue(new NfcErrorLog(str)));
        this.f14595Y = null;
        this.f14596Z = 3;
        if (c4466y.f14604a.m6214g(this.f14598p0, errorRequest, this) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
