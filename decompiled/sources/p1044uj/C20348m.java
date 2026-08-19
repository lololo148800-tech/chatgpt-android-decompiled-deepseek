package p1044uj;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import hk.C14524b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p046Bk.ViewOnClickListenerC1344P;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p571X9.AbstractC9215U;
import p769gj.C14183y;
import pk.C18496a;

/* JADX INFO: renamed from: uj.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20348m extends AbstractC16541i implements InterfaceC1441p {
    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C14524b p10 = (C14524b) obj;
        C20350n p11 = (C20350n) obj2;
        C14183y p12 = (C14183y) obj3;
        Map p13 = (Map) obj4;
        AbstractC16544l.m18094g(p10, "p0");
        AbstractC16544l.m18094g(p11, "p1");
        AbstractC16544l.m18094g(p12, "p2");
        AbstractC16544l.m18094g(p13, "p3");
        for (C17309l c17309l : ((C20350n) this.receiver).f64346Z) {
            String str = (String) c17309l.f55136Y;
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309l.f55137Z;
            C18496a c18496a = (C18496a) p13.get(str);
            if (c18496a != null) {
                c18496a.f58959b.setOnClickListener(new ViewOnClickListenerC1344P(interfaceC1436k, c18496a, 1));
            }
        }
        C20342j c20342j = new C20342j(p11, 0);
        C20342j c20342j2 = new C20342j(p11, 1);
        Pi2NavigationBar pi2NavigationBar = p10.f45775e;
        ConstraintLayout constraintLayout = p10.f45771a;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        AbstractC9215U.m9783a(p11.f64347o0, c20342j, c20342j2, pi2NavigationBar, constraintLayout);
        return C17296C.f55119a;
    }
}
