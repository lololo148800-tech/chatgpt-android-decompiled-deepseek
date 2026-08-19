package p332N8;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import p006A4.C0349j;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p1091wn.C21022c;
import p1091wn.C21026g;
import p1091wn.InterfaceC21029j;
import p197Hj.C3457c;

/* JADX INFO: renamed from: N8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5679c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C5679c f18443Y = new C5679c(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws IOException {
        String str;
        InterfaceC21029j interfaceC21029jM21495s;
        C5678b open = (C5678b) obj;
        AbstractC16544l.m18094g(open, "$this$open");
        C16525B c16525b = new C16525B();
        List listM6111a = open.m6111a();
        if (listM6111a == null) {
            interfaceC21029jM21495s = C21026g.f66901a;
        } else {
            c16525b.f51262Y = listM6111a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listM6111a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it.next();
                if (linkedHashSet.contains(str)) {
                    break;
                }
                linkedHashSet.add(str);
            }
            if (str != null) {
                throw new C0644w(AbstractC10763a.m11054l("header '", str, "' is duplicated. please consider to use 'autoRenameDuplicateHeaders' option."), 8);
            }
            Integer numValueOf = Integer.valueOf(((List) c16525b.f51262Y).size());
            C16525B c16525b2 = new C16525B();
            c16525b2.f51262Y = numValueOf;
            interfaceC21029jM21495s = AbstractC21031l.m21495s(AbstractC21031l.m21488l(new C21022c(AbstractC21031l.m21491o(new C3457c(open, 19)), new C0349j(c16525b2, 23, open), 3)), new C5677a(c16525b, 0));
        }
        return AbstractC21031l.m21499w(interfaceC21029jM21495s);
    }
}
