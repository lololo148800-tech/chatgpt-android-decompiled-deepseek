package p217Ie;

import android.app.Application;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ke.C16382j;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import mm.C17309l;
import p098Di.InterfaceC2061j;
import p1025te.C19864O;
import p1025te.C19874e;
import p1025te.C19876g;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1040ue.InterfaceC20204b;
import p1040ue.InterfaceC20207e;
import p1155zi.C21965U0;
import p1155zi.C21984a1;
import p216Id.EnumC3703k;
import p314Md.C5320b;
import p314Md.InterfaceC5319a;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.C7373x;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p991rh.EnumC18991F;

/* JADX INFO: renamed from: Ie.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3708d implements InterfaceC5319a, InterfaceC20207e {

    /* JADX INFO: renamed from: a */
    public final Application f11246a;

    /* JADX INFO: renamed from: b */
    public final C19864O f11247b;

    /* JADX INFO: renamed from: c */
    public final C17238a f11248c;

    /* JADX INFO: renamed from: d */
    public final C16382j f11249d;

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f11250e;

    /* JADX INFO: renamed from: f */
    public final C2217y0 f11251f;

    public C3708d(Application application, C19864O c19864o, C17238a c17238a, C16382j c16382j) {
        this.f11246a = application;
        this.f11247b = c19864o;
        this.f11248c = c17238a;
        this.f11249d = c16382j;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(null);
        this.f11250e = c2153q0M3204c;
        this.f11251f = new C2217y0(c2153q0M3204c);
    }

    /* JADX INFO: renamed from: c */
    public static List m4409c(AbstractC7343b0 abstractC7343b0) {
        ArrayList arrayList;
        if (abstractC7343b0 instanceof C7373x) {
            C7373x c7373x = (C7373x) abstractC7343b0;
            return AbstractC9393x3.m9974d(new C17309l(Uri.parse(c7373x.f23373c.f69534a), new C19874e(EnumC18991F.f60566p0, null, new C19876g(c7373x.f23373c))));
        }
        if (abstractC7343b0 instanceof C7315A) {
            List<C21965U0> list = ((C7315A) abstractC7343b0).f23212c;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            for (C21965U0 c21965u0 : list) {
                arrayList.add(new C17309l(Uri.parse(c21965u0.f69534a), new C19874e(EnumC18991F.f60566p0, null, new C19876g(c21965u0))));
            }
        } else {
            boolean z6 = abstractC7343b0 instanceof C7320F;
            C17689w c17689w = C17689w.f56480Y;
            if (z6 || !(abstractC7343b0 instanceof C7323I)) {
                return c17689w;
            }
            List listM7779c = ((C7323I) abstractC7343b0).m7779c();
            arrayList = new ArrayList();
            Iterator it = listM7779c.iterator();
            while (it.hasNext()) {
                AbstractC17686t.m19398v(m4409c((AbstractC7343b0) it.next()), arrayList);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static String m4410d(AbstractC7343b0 abstractC7343b0) {
        if (abstractC7343b0 instanceof C7326L) {
            return ((C7326L) abstractC7343b0).f23233c;
        }
        if (abstractC7343b0 instanceof C7320F) {
            return ((C7320F) abstractC7343b0).f23219c;
        }
        if (!(abstractC7343b0 instanceof C7323I)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = ((C7323I) abstractC7343b0).m7779c().iterator();
        while (it.hasNext()) {
            String strM4410d = m4410d((AbstractC7343b0) it.next());
            if (strM4410d != null) {
                sb2.append(strM4410d);
            }
        }
        return sb2.toString();
    }

    @Override // p1040ue.InterfaceC20207e
    /* JADX INFO: renamed from: a */
    public final InterfaceC2061j mo4411a(InterfaceC20204b action) {
        AbstractC16544l.m18094g(action, "action");
        if (action.equals(C3705a.f11242a)) {
            this.f11250e.setValue(null);
            this.f11248c.m18967b("edit_message");
            this.f11247b.m20781a(C3706b.f11243Y);
        }
        return null;
    }

    @Override // p314Md.InterfaceC5319a
    /* JADX INFO: renamed from: b */
    public final C5320b mo4412b(C5320b c5320b, boolean z6) {
        String str;
        C7351f0 c7351f0;
        C6394e c6394e;
        C6397h c6397h;
        C21984a1 c21984a1;
        this.f11248c.m18967b("edit_message");
        C7351f0 c7351f1 = (C7351f0) this.f11251f.f6797Y.getValue();
        if (c7351f1 == null) {
            return c5320b;
        }
        C6397h c6397hM7033a = null;
        String str2 = c7351f1.f23287b;
        if (str2 != null) {
            str = str2;
        } else {
            C6397h c6397hM7029e = c5320b.f17508d.m7029e(new C3707c(0, c7351f1));
            if (c6397hM7029e == null || (c21984a1 = (C21984a1) c6397hM7029e.f20820b) == null) {
                str = null;
            } else {
                str2 = c21984a1.f69607Y;
                str = str2;
            }
        }
        this.f11250e.setValue(null);
        List list = c5320b.f17506b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c7351f0 = c5320b.f17505a;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (AbstractC16544l.m18089b(((C7351f0) next).f23286a, c7351f0.f23286a)) {
                break;
            }
            arrayList.add(next);
        }
        C21984a1 c21984a2 = new C21984a1(c7351f1.f23286a);
        C6394e c6394e2 = c5320b.f17508d;
        Map map = c6394e2.f20814b;
        C6397h c6397h2 = (C6397h) map.get(c21984a2);
        if (c6397h2 == null) {
            c6394e = c6394e2;
        } else {
            List listM7027a = c6394e2.m7027a(c21984a2, new ArrayList());
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM7027a, 10));
            Iterator it2 = listM7027a.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C6397h) it2.next()).f20819a);
            }
            Object obj = c6397h2.f20820b;
            if (obj != null && (c6397h = (C6397h) map.get(obj)) != null) {
                List list2 = c6397h.f20821c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!AbstractC16544l.m18089b(obj2, c21984a2)) {
                        arrayList3.add(obj2);
                    }
                }
                c6397hM7033a = C6397h.m7033a(c6397h, null, null, arrayList3, null, 11);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!arrayList2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map mapM19256r = AbstractC17659D.m19256r(linkedHashMap);
            if (c6397hM7033a != null) {
                mapM19256r = AbstractC17659D.m19249k(mapM19256r, new C17309l(obj, c6397hM7033a));
            }
            c6394e = new C6394e(mapM19256r, c6394e2.f20813a);
        }
        return new C5320b(c7351f0, arrayList, str, c6394e, EnumC3703k.Edit);
    }
}
