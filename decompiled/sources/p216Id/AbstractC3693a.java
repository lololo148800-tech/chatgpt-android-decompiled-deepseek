package p216Id;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1113xn.AbstractC21322p;
import p1155zi.C21984a1;
import p228J.AbstractC3794B0;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.AbstractC6661w;
import p403Qd.C6597C;
import p403Qd.C6600F;
import p403Qd.C6636i;
import p403Qd.C6650p;
import p403Qd.C6656s;
import p403Qd.C6664z;
import p428Rd.C6864c;
import p428Rd.InterfaceC6866e;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7329O;
import p479Td.C7330P;
import p479Td.C7331Q;
import p479Td.C7341a0;
import p479Td.C7344c;
import p479Td.C7351f0;
import p479Td.C7356i;
import p479Td.C7362m;
import p479Td.C7370u;
import p479Td.C7373x;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Id.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3693a {

    /* JADX INFO: renamed from: a */
    public static final String f11214a;

    /* JADX INFO: renamed from: b */
    public static final String f11215b;

    static {
        C21984a1.Companion.getClass();
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        String value = AbstractC21322p.m21692Z(string, 0, 5, "bbb23").toString();
        AbstractC16544l.m18094g(value, "value");
        f11214a = value;
        f11215b = AbstractC3794B0.m4498w("toString(...)");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4401a(AbstractC6601G abstractC6601G) {
        if (abstractC6601G instanceof C6597C) {
            if (((C6597C) abstractC6601G).f21307c.f23306u != null) {
                return true;
            }
        } else if (abstractC6601G instanceof C6600F) {
            List list = ((C6600F) abstractC6601G).f21312d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C7351f0) it.next()).f23306u != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4402b(ArrayList arrayList) {
        AbstractC6659u abstractC6659uM4404d = m4404d(arrayList);
        if (abstractC6659uM4404d == null) {
            return true;
        }
        EnumC7359j0 enumC7359j0 = EnumC7359j0.f23343Z;
        EnumC7359j0 enumC7359j1 = EnumC7359j0.f23346q0;
        if (AbstractC17681o.m19382k(enumC7359j0, enumC7359j1).contains(abstractC6659uM4404d.m7174f())) {
            return true;
        }
        C7351f0 c7351f0M7172d = abstractC6659uM4404d.m7172d();
        AbstractC16544l.m18094g(c7351f0M7172d, "<this>");
        return AbstractC17681o.m19382k(enumC7359j0, enumC7359j1).contains(c7351f0M7172d.f23290e) || (c7351f0M7172d.f23291f instanceof C7331Q);
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m4403c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AbstractC6601G abstractC6601G = (AbstractC6601G) obj;
            if (abstractC6601G instanceof C6597C) {
                C7351f0 c7351f0 = ((C6597C) abstractC6601G).f21307c;
                EnumC7359j0 enumC7359j0 = c7351f0.f23290e;
                if (enumC7359j0 == EnumC7359j0.f23343Z || enumC7359j0 == EnumC7359j0.f23344o0) {
                    AbstractC7343b0 abstractC7343b0 = c7351f0.f23291f;
                    if ((abstractC7343b0 instanceof C7326L) || (abstractC7343b0 instanceof C7320F) || (abstractC7343b0 instanceof C7323I)) {
                        if (c7351f0.f23293h != EnumC7355h0.f23328v0) {
                        }
                    } else if (!(abstractC7343b0 instanceof C7344c) && !(abstractC7343b0 instanceof C7356i) && !(abstractC7343b0 instanceof C7373x) && !(abstractC7343b0 instanceof C7315A) && !(abstractC7343b0 instanceof C7329O) && !AbstractC16544l.m18089b(abstractC7343b0, C7330P.INSTANCE) && !AbstractC16544l.m18089b(abstractC7343b0, C7331Q.INSTANCE) && !(abstractC7343b0 instanceof C7370u) && !(abstractC7343b0 instanceof C7341a0) && !(abstractC7343b0 instanceof C7362m)) {
                        throw new C0644w();
                    }
                }
            } else if (!(abstractC6601G instanceof C6600F) && !(abstractC6601G instanceof C6664z) && !(abstractC6601G instanceof AbstractC6661w) && !(abstractC6601G instanceof C6656s)) {
                throw new C0644w();
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC6659u m4404d(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        return (AbstractC6659u) AbstractC17680n.m19353c0(m4405e(list));
    }

    /* JADX INFO: renamed from: e */
    public static final ArrayList m4405e(List list) {
        AbstractC16544l.m18094g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC6659u) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4406f(List list) {
        boolean z6;
        boolean z10;
        AbstractC16544l.m18094g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C6597C) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C6597C) obj2).m7174f() == EnumC7359j0.f23343Z) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC7343b0 abstractC7343b0 = ((C6597C) it.next()).f21307c.f23291f;
            C7323I c7323i = abstractC7343b0 instanceof C7323I ? (C7323I) abstractC7343b0 : null;
            if (c7323i != null) {
                List listM7779c = c7323i.m7779c();
                if (!(listM7779c instanceof Collection) || !listM7779c.isEmpty()) {
                    Iterator it2 = listM7779c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z6 = false;
                            break;
                        }
                        AbstractC7343b0 abstractC7343b1 = (AbstractC7343b0) it2.next();
                        if ((abstractC7343b1 instanceof C7320F) && ((C7320F) abstractC7343b1).f23220d) {
                            z6 = true;
                            break;
                        }
                    }
                } else {
                    z6 = false;
                    break;
                }
                List listM7779c2 = c7323i.m7779c();
                if (!(listM7779c2 instanceof Collection) || !listM7779c2.isEmpty()) {
                    Iterator it3 = listM7779c2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z10 = false;
                            break;
                        }
                        if (((AbstractC7343b0) it3.next()) instanceof C7344c) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (!z6 || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final ArrayList m4407g(ArrayList arrayList, C6636i conversation) {
        AbstractC16544l.m18094g(conversation, "conversation");
        List<InterfaceC6866e> list = conversation.f21395q;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (InterfaceC6866e interfaceC6866e : list) {
            if (!(interfaceC6866e instanceof C6864c)) {
                throw new C0644w();
            }
            arrayList2.add(new C6650p(((C6864c) interfaceC6866e).f22031a));
        }
        return AbstractC17680n.m19361k0(arrayList2, arrayList);
    }
}
