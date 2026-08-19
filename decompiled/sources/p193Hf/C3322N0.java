package p193Hf;

import android.webkit.CookieManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p857kl.AbstractC16467o;
import p857kl.C16464l;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3322N0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f10129Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3324O0 f10130Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10131o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10132p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f10133q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322N0(String str, C3324O0 c3324o0, String str2, String str3, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10129Y = str;
        this.f10130Z = c3324o0;
        this.f10131o0 = str2;
        this.f10132p0 = str3;
        this.f10133q0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C3322N0(this.f10129Y, this.f10130Z, this.f10131o0, this.f10132p0, this.f10133q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) throws UnsupportedEncodingException {
        C3322N0 c3322n0 = (C3322N0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3322n0.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        String strEncode = URLEncoder.encode(this.f10129Y, "UTF-8");
        StringBuilder sb2 = new StringBuilder();
        String str = this.f10131o0;
        sb2.append(str);
        sb2.append("load-page-with-auth?accountId=");
        sb2.append(this.f10132p0);
        sb2.append("&toUrl=");
        sb2.append(strEncode);
        String string = sb2.toString();
        C3324O0 c3324o0 = this.f10130Z;
        c3324o0.f10139r0 = string;
        c3324o0.getClass();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        Iterator it = this.f10133q0.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(str, AbstractC16467o.m18043e((C16464l) it.next()));
        }
        cookieManager.flush();
        return C17296C.f55119a;
    }
}
