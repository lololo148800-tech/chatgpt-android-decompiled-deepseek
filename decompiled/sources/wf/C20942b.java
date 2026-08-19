package wf;

import java.io.IOException;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1039ud.C20198o;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21907E;
import p1155zi.C21929J1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p504Ue.C7634d;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20942b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f66707Y;

    /* JADX INFO: renamed from: Z */
    public int f66708Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f66709o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C20945e f66710p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f66711q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20942b(String str, C20945e c20945e, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66709o0 = str;
        this.f66710p0 = c20945e;
        this.f66711q0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20942b(this.f66709o0, this.f66710p0, this.f66711q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20942b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strConcat;
        byte[] bArr;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66708Z;
        C20945e c20945e = this.f66710p0;
        String str = this.f66711q0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    strConcat = this.f66707Y;
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
            }
            AbstractC9233X.m9807c(obj);
            String strM22337a = C21907E.m22337a(this.f66709o0);
            EnumC20941a[] enumC20941aArr = EnumC20941a.f66706Y;
            strConcat = strM22337a.concat(".webp");
            C7634d c7634d = c20945e.f66721c;
            this.f66707Y = strConcat;
            this.f66708Z = 1;
            obj = c7634d.m7969b(str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            if (abstractC21955Q1 instanceof C21952P1) {
                bArr = (byte[]) ((C21952P1) abstractC21955Q1).f69511a;
            } else {
                if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    return (AbstractC21933K1) abstractC21955Q1;
                }
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                bArr = null;
            }
            C20198o c20198o = new C20198o(bArr, 11);
            this.f66707Y = null;
            this.f66708Z = 2;
            C3516e c3516e = AbstractC0593T.f1824a;
            obj = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C20944d(c20945e, strConcat, c20198o, null), this);
            return obj == enumC19250a ? enumC19250a : obj;
        } catch (IOException e10) {
            AbstractC8160o6.m8727b(c20945e.f66722d, "Failed to download C2PA image " + str, e10, 4);
            return new C21945N1(e10);
        }
    }
}
