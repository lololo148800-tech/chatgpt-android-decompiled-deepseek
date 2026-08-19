package p1087wj;

import android.webkit.MimeTypeMap;
import com.withpersona.sdk2.inquiry.document.network.C12859b;
import fk.C13686g;
import java.io.File;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17352s;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2173c0;
import p103Dn.C2176e;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1044uj.C20336g;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p787he.C14462S;
import p909nm.AbstractC17678l;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: wj.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C21000u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f66841Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f66842Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C21001v f66843o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21000u(C21001v c21001v, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f66843o0 = c21001v;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21000u c21000u = new C21000u(this.f66843o0, interfaceC18770c);
        c21000u.f66842Z = obj;
        return c21000u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21000u) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String mimeTypeFromExtension;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f66841Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f66842Z;
            C21001v c21001v = this.f66843o0;
            C13686g c13686g = c21001v.f66848f;
            C20336g c20336g = c21001v.f66847e;
            c13686g.getClass();
            String path = c20336g.f64301Y;
            AbstractC16544l.m18094g(path, "path");
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
            if (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
                mimeTypeFromExtension = "image/*";
            }
            File file = new File(c20336g.f64301Y);
            Pattern pattern = C17352s.f55296e;
            C20979J c20979j = new C20979J(file, AbstractC9282f0.m9858d(mimeTypeFromExtension));
            C3516e c3516e = AbstractC0593T.f1824a;
            InterfaceC2184i[] interfaceC2184iArr = {new C2219z0(new C12859b(AbstractC0575H.m1177f(c21001v.f66849g, ExecutorC3515d.f10633Z, new C20999t(c21001v, c20979j, null), 2), c21001v, null)), new C2219z0(new C20997r(c20979j, null))};
            int i11 = AbstractC2173c0.f6659a;
            C2176e c2176e = new C2176e(AbstractC17678l.m19295b(interfaceC2184iArr), C18777j.f59682Y, -2, EnumC1733a.f4961Y);
            C14462S c14462s = new C14462S(interfaceC2186j, 13);
            this.f66841Y = 1;
            if (c2176e.mo3141d(c14462s, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
