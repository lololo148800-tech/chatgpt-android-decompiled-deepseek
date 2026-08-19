package p416R1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p003A1.AbstractC0224Z;
import p1027tp.AbstractC20064h;
import p371P1.C6305a;
import p371P1.C6306b;
import p393Q1.C6553e;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: R1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6788a {

    /* JADX INFO: renamed from: a */
    public static final C6788a f21793a = new C6788a();

    /* JADX INFO: renamed from: a */
    public final Object m7231a(C6306b c6306b) {
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c6306b, 10));
        Iterator it = c6306b.f20438Y.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6305a) it.next()).f20436a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return AbstractC0224Z.m708j(AbstractC20064h.m20900d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* JADX INFO: renamed from: b */
    public final void m7232b(C6553e c6553e, C6306b c6306b) {
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c6306b, 10));
        Iterator it = c6306b.f20438Y.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6305a) it.next()).f20436a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c6553e.setTextLocales(AbstractC20064h.m20900d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
