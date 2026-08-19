package p1063vf;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.auth0.android.result.Credentials;
import java.util.LinkedHashMap;
import java.util.List;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p071Ch.C1692w;
import p1149zc.AbstractC21864z;
import p1155zi.C22038o;
import p364Oh.C6226E;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p857kl.AbstractC16435B;
import p905nd.C17589q;
import p909nm.AbstractC17659D;
import p948pi.C18418a;
import p948pi.C18426i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C20607o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f65386Y;

    /* JADX INFO: renamed from: Z */
    public C17309l[] f65387Z;

    /* JADX INFO: renamed from: o0 */
    public C17309l[] f65388o0;

    /* JADX INFO: renamed from: p0 */
    public String f65389p0;

    /* JADX INFO: renamed from: q0 */
    public int f65390q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C20608p f65391r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C18418a f65392s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C6226E f65393t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20607o(C20608p c20608p, C18418a c18418a, C6226E c6226e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65391r0 = c20608p;
        this.f65392s0 = c18418a;
        this.f65393t0 = c6226e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20607o(this.f65391r0, this.f65392s0, this.f65393t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20607o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2510d;
        C17309l[] c17309lArr;
        String str;
        String str2;
        C17309l[] c17309lArr2;
        LinkedHashMap linkedHashMapM19246h;
        C18418a c18418a;
        C22038o c22038o;
        String str3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65390q0;
        C20608p c20608p = this.f65391r0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                C18426i c18426i = (C18426i) obj;
                objM2510d = c18426i != null ? c18426i.f58788a : null;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.f65389p0;
                c17309lArr = this.f65388o0;
                c17309lArr2 = this.f65387Z;
                str = this.f65386Y;
                AbstractC9233X.m9807c(obj);
            }
            Credentials credentials = (Credentials) obj;
            c17309lArr[0] = new C17309l(str2, AbstractC9306j0.m9889h("Bearer ", credentials != null ? credentials.getAccessToken() : null));
            List list = AbstractC16435B.f50983a;
            c17309lArr2[1] = new C17309l("Cookie", AbstractC9306j0.m9889h("_playintegrity=", str));
            linkedHashMapM19246h = AbstractC17659D.m19246h(c17309lArr2);
            c18418a = this.f65392s0;
            if (c18418a.f58779g) {
                linkedHashMapM19246h.put("ChatGPT-Account-ID", c18418a.f58775c);
                c22038o = c18418a.f58774b.f69415a;
                if (c22038o != null && (str3 = c22038o.f69713c) != null) {
                    linkedHashMapM19246h.put("ChatGPT-Residency-Region", str3);
                }
            }
            return AbstractC17659D.m19248j(AbstractC17659D.m19254p(linkedHashMapM19246h), this.f65393t0.f20271c);
        }
        AbstractC9233X.m9807c(obj);
        C1692w c1692w = c20608p.f65395Z;
        this.f65390q0 = 1;
        objM2510d = c1692w.m2510d(false, this);
        if (objM2510d == enumC19250a) {
            return enumC19250a;
        }
        String str4 = (String) objM2510d;
        if (str4 == null) {
            str4 = null;
        }
        if (str4 == null) {
            throw new IllegalArgumentException("Must be authenticated");
        }
        c17309lArr = new C17309l[2];
        List list2 = AbstractC16435B.f50983a;
        AbstractC21864z abstractC21864z = c20608p.f65394Y;
        this.f65386Y = str4;
        this.f65387Z = c17309lArr;
        this.f65388o0 = c17309lArr;
        this.f65389p0 = SIPHeaderNames.AUTHORIZATION;
        this.f65390q0 = 2;
        Object objM19219e = ((C17589q) abstractC21864z).m19219e(this);
        if (objM19219e == enumC19250a) {
            return enumC19250a;
        }
        str = str4;
        obj = objM19219e;
        str2 = SIPHeaderNames.AUTHORIZATION;
        c17309lArr2 = c17309lArr;
        Credentials credentials2 = (Credentials) obj;
        c17309lArr[0] = new C17309l(str2, AbstractC9306j0.m9889h("Bearer ", credentials2 != null ? credentials2.getAccessToken() : null));
        List list3 = AbstractC16435B.f50983a;
        c17309lArr2[1] = new C17309l("Cookie", AbstractC9306j0.m9889h("_playintegrity=", str));
        linkedHashMapM19246h = AbstractC17659D.m19246h(c17309lArr2);
        c18418a = this.f65392s0;
        if (c18418a.f58779g) {
            linkedHashMapM19246h.put("ChatGPT-Account-ID", c18418a.f58775c);
            c22038o = c18418a.f58774b.f69415a;
            if (c22038o != null) {
                linkedHashMapM19246h.put("ChatGPT-Residency-Region", str3);
            }
        }
        return AbstractC17659D.m19248j(AbstractC17659D.m19254p(linkedHashMapM19246h), this.f65393t0.f20271c);
    }
}
