package p318Mh;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p228J.AbstractC3812N;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Mh.F0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5362F0 {

    /* JADX INFO: renamed from: f */
    public static final C21319m f17596f = new C21319m("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a */
    public final C17314q f17597a = AbstractC9227W.m9800c(new C5389b(this, 1));

    /* JADX INFO: renamed from: b */
    public final C17314q f17598b;

    /* JADX INFO: renamed from: c */
    public final C17314q f17599c;

    /* JADX INFO: renamed from: d */
    public final C17314q f17600d;

    /* JADX INFO: renamed from: e */
    public final String f17601e;

    public AbstractC5362F0(String str) {
        AbstractC9227W.m9800c(new C5389b(this, 4));
        this.f17598b = AbstractC9227W.m9800c(new C5389b(this, 3));
        this.f17599c = AbstractC9227W.m9800c(new C5389b(this, 2));
        this.f17600d = AbstractC9227W.m9800c(new C5389b(this, 0));
        this.f17601e = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5885a(InterfaceC1436k builder) {
        String str;
        Object next;
        AbstractC16544l.m18094g(builder, "builder");
        C5387a c5387a = new C5387a(this);
        builder.invoke(c5387a);
        Iterator it = mo5883c().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList<C17309l> arrayList = c5387a.f17641a;
            if (!zHasNext) {
                String internalRoute = this.f17601e;
                boolean z6 = true;
                for (C17309l c17309l : arrayList) {
                    C5370J0 c5370j0 = (C5370J0) c17309l.f55136Y;
                    String str2 = (String) c17309l.f55137Z;
                    if (!mo5883c().contains(c5370j0)) {
                        throw new IllegalArgumentException(AbstractC10763a.m11054l("Arg ", c5370j0.f17614a, " was not listed in navArguments.").toString());
                    }
                    boolean zM21667A = AbstractC21322p.m21667A(internalRoute, "{" + c5370j0.f17614a, false);
                    String str3 = c5370j0.f17614a;
                    if (zM21667A) {
                        internalRoute = AbstractC21329w.m21731r(internalRoute, "{" + str3 + "}", str2);
                    } else {
                        internalRoute = ((Object) (((Object) internalRoute) + (z6 ? Separators.QUESTION : Separators.AND))) + str3 + Separators.EQUALS + str2;
                        z6 = false;
                    }
                }
                AbstractC16544l.m18094g(internalRoute, "internalRoute");
                return internalRoute;
            }
            C5370J0 c5370j1 = (C5370J0) it.next();
            if (c5370j1.f17616c && c5370j1.f17617d == null) {
                Iterator it2 = arrayList.iterator();
                do {
                    boolean zHasNext2 = it2.hasNext();
                    str = c5370j1.f17614a;
                    if (!zHasNext2) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!AbstractC16544l.m18089b(((C5370J0) ((C17309l) next).f55136Y).f17614a, str));
                if (next == null) {
                    throw new IllegalArgumentException(AbstractC10763a.m11054l("Required argument ", str, " is not provided").toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC3812N mo5884b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract List mo5883c();
}
