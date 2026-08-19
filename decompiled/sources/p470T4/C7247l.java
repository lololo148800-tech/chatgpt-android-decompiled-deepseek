package p470T4;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p444S4.C7013s;
import p444S4.InterfaceC7017w;
import p571X9.AbstractC9387w3;
import p658b5.C11232c;
import p674c5.RunnableC11650c;

/* JADX INFO: renamed from: T4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7247l extends AbstractC9387w3 {

    /* JADX INFO: renamed from: i */
    public static final String f22980i = C7011q.m7409f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final C7253r f22981a;

    /* JADX INFO: renamed from: b */
    public final String f22982b;

    /* JADX INFO: renamed from: c */
    public final int f22983c;

    /* JADX INFO: renamed from: d */
    public final List f22984d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f22985e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f22986f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f22987g;

    /* JADX INFO: renamed from: h */
    public C11232c f22988h;

    public C7247l(C7253r c7253r, String str, int i10, List list) {
        this.f22981a = c7253r;
        this.f22982b = str;
        this.f22983c = i10;
        this.f22984d = list;
        this.f22985e = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == 1 && ((C7013s) list.get(i11)).f22425b.f34061u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((C7013s) list.get(i11)).f22424a.toString();
            AbstractC16544l.m18093f(string, "id.toString()");
            this.f22985e.add(string);
            this.f22986f.add(string);
        }
    }

    /* JADX INFO: renamed from: c */
    public static HashSet m7656c(C7247l c7247l) {
        HashSet hashSet = new HashSet();
        c7247l.getClass();
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7017w m7657b() {
        if (this.f22987g) {
            C7011q.m7408d().m7414g(f22980i, "Already enqueued work ids (" + TextUtils.join(", ", this.f22985e) + Separators.RPAREN);
        } else {
            RunnableC11650c runnableC11650c = new RunnableC11650c(this);
            this.f22981a.f22999d.m14897a(runnableC11650c);
            this.f22988h = runnableC11650c.f35293Z;
        }
        return this.f22988h;
    }
}
