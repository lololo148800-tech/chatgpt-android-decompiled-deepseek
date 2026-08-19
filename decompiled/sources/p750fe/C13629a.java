package p750fe;

import android.app.Application;
import gd.C13913Z1;
import gd.C13993t2;
import p1113xn.AbstractC21323q;
import p314Md.C5320b;
import p314Md.InterfaceC5319a;
import p523V9.AbstractC8012V5;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: fe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13629a implements InterfaceC5319a {

    /* JADX INFO: renamed from: a */
    public final Application f43063a;

    /* JADX INFO: renamed from: b */
    public final C13993t2 f43064b;

    public C13629a(Application application, C13993t2 c13993t2) {
        this.f43063a = application;
        this.f43064b = c13993t2;
    }

    @Override // p314Md.InterfaceC5319a
    /* JADX INFO: renamed from: b */
    public final C5320b mo4412b(C5320b c5320b, boolean z6) {
        if (!z6) {
            return c5320b;
        }
        String str = (String) this.f43064b.m15479a(C13913Z1.f43962d);
        String strM9889h = "";
        if (!str.equals("variant_control")) {
            strM9889h = AbstractC9306j0.m9889h("", AbstractC21323q.m21717d("\n                *** Locale in BCP-47 of the user you're chatting with:\n                - Locale : " + AbstractC8012V5.m8334g(this.f43063a).toLanguageTag() + "\n                \n                " + str + "\n            "));
        }
        return strM9889h.length() > 0 ? C5320b.m5878a(c5320b, "Below is the context for this conversation, do not reply to this message:\n\n".concat(strM9889h), false, 6) : c5320b;
    }
}
