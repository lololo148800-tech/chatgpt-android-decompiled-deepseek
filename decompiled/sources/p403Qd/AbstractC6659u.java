package p403Qd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p025An.C0644w;
import p040Bd.C0937I1;
import p1091wn.AbstractC21031l;
import p1091wn.InterfaceC21029j;
import p243Jf.C4331a;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Qd.u */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public abstract class AbstractC6659u extends AbstractC6601G {
    public static final C6658t Companion = new C6658t();

    /* JADX INFO: renamed from: b */
    public static final Object f21429b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C6620a.f21348p0);

    @Override // p403Qd.AbstractC6601G
    /* JADX INFO: renamed from: a */
    public final String mo7159a() {
        Iterator it = m7177i().iterator();
        if (it.hasNext()) {
            return ((C7351f0) it.next()).f23286a;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m7171c() {
        List list = m7172d().f23307v;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C0937I1) {
                arrayList.add(obj);
            }
        }
        AbstractC7343b0 abstractC7343b0 = m7172d().f23291f;
        List listM19322C0 = null;
        C7320F c7320f = abstractC7343b0 instanceof C7320F ? (C7320F) abstractC7343b0 : null;
        if (c7320f != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c7320f.m7778d().mo14588a(new C4331a(linkedHashSet, 1));
            listM19322C0 = AbstractC17680n.m19322C0(linkedHashSet);
        }
        if (listM19322C0 == null) {
            listM19322C0 = C17689w.f56480Y;
        }
        List list2 = listM19322C0;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0937I1(null, null, (String) it.next(), null, null, 248));
        }
        return AbstractC17680n.m19361k0(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final C7351f0 m7172d() {
        return (C7351f0) AbstractC21031l.m21494r(m7177i());
    }

    /* JADX INFO: renamed from: e */
    public final C7351f0 m7173e() {
        Object next;
        if (this instanceof C6597C) {
            return ((C6597C) this).f21307c;
        }
        if (!(this instanceof C6600F)) {
            if (this instanceof C6664z) {
                return ((C6664z) this).f21432c;
            }
            if (this instanceof C6656s) {
                return ((C6656s) this).f21421c;
            }
            throw new C0644w();
        }
        List list = ((C6600F) this).f21312d;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C7351f0) next).f23290e != EnumC7359j0.f23344o0);
        C7351f0 c7351f0 = (C7351f0) next;
        return c7351f0 == null ? (C7351f0) AbstractC17680n.m19341Q(list) : c7351f0;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC7359j0 m7174f() {
        Object next;
        EnumC7359j0 enumC7359j0;
        if (this instanceof C6597C) {
            return ((C6597C) this).f21307c.f23290e;
        }
        if (!(this instanceof C6600F)) {
            if (this instanceof C6664z) {
                return ((C6664z) this).f21432c.f23290e;
            }
            if (this instanceof C6656s) {
                return EnumC7359j0.f23339D0;
            }
            throw new C0644w();
        }
        List list = ((C6600F) this).f21312d;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C7351f0) next).f23290e != EnumC7359j0.f23344o0);
        C7351f0 c7351f0 = (C7351f0) next;
        return (c7351f0 == null || (enumC7359j0 = c7351f0.f23290e) == null) ? ((C7351f0) AbstractC17680n.m19341Q(list)).f23290e : enumC7359j0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7175g() {
        if (this instanceof C6597C) {
            return ((C6597C) this).f21307c.f23280P;
        }
        if (this instanceof C6600F) {
            C6600F c6600f = (C6600F) this;
            if (c6600f.f21311c.m7161a()) {
                List list = c6600f.f21312d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((C7351f0) it.next()).f23280P) {
                        }
                    }
                }
                return true;
            }
        } else if (!(this instanceof C6664z) && !(this instanceof C6656s)) {
            throw new C0644w();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final C7351f0 m7176h(String id2) {
        C7351f0 c7351f0;
        AbstractC16544l.m18094g(id2, "id");
        Object obj = null;
        if (this instanceof C6597C) {
            c7351f0 = ((C6597C) this).f21307c;
            if (!AbstractC16544l.m18089b(c7351f0.f23286a, id2)) {
                return null;
            }
        } else {
            if (this instanceof C6600F) {
                for (Object obj2 : ((C6600F) this).f21312d) {
                    if (AbstractC16544l.m18089b(((C7351f0) obj2).f23286a, id2)) {
                        obj = obj2;
                        break;
                    }
                }
                return (C7351f0) obj;
            }
            if (this instanceof C6664z) {
                c7351f0 = ((C6664z) this).f21432c;
                if (!AbstractC16544l.m18089b(c7351f0.f23286a, id2)) {
                    return null;
                }
            } else {
                if (!(this instanceof C6656s)) {
                    throw new C0644w();
                }
                c7351f0 = ((C6656s) this).f21421c;
                if (!AbstractC16544l.m18089b(c7351f0.f23286a, id2)) {
                    return null;
                }
            }
        }
        return c7351f0;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC21029j m7177i() {
        if (this instanceof C6597C) {
            return AbstractC17678l.m19297d(new C7351f0[]{((C6597C) this).f21307c});
        }
        if (this instanceof C6600F) {
            return AbstractC17680n.m19329H(((C6600F) this).f21312d);
        }
        if (this instanceof C6664z) {
            return AbstractC17678l.m19297d(new C7351f0[]{((C6664z) this).f21432c});
        }
        if (this instanceof C6656s) {
            return AbstractC17678l.m19297d(new C7351f0[]{((C6656s) this).f21421c});
        }
        throw new C0644w();
    }
}
