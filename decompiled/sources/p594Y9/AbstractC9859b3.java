package p594Y9;

import com.segment.analytics.kotlin.core.Settings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p1114xp.C21346q;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3756d;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p482Tg.C7448e;
import p530Vi.C8295C;
import p530Vi.C8296D;
import p530Vi.C8297E;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p530Vi.C8324t;
import p530Vi.C8326v;
import p530Vi.C8328x;
import p571X9.AbstractC9233X;
import p919o8.C17930R0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Y9.b3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9859b3 {
    /* JADX WARN: Code duplicated, block: B:30:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m10509a(C8312h c8312h, AbstractC19687c abstractC19687c) {
        C8324t c8324t;
        String str;
        String str2;
        Object objM21739a;
        C8312h c8312h2;
        String str3;
        C0611f0 c0611f0;
        C8326v c8326v;
        if (abstractC19687c instanceof C8324t) {
            c8324t = (C8324t) abstractC19687c;
            int i10 = c8324t.f25952q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8324t.f25952q0 = i10 - Integer.MIN_VALUE;
            } else {
                c8324t = new C8324t(abstractC19687c);
            }
        } else {
            c8324t = new C8324t(abstractC19687c);
        }
        Object obj = c8324t.f25951p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8324t.f25952q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                String str4 = c8324t.f25950o0;
                str = c8324t.f25949Z;
                C8312h c8312h3 = c8324t.f25948Y;
                AbstractC9233X.m9807c(obj);
                str2 = str4;
                c8312h = c8312h3;
                objM21739a = obj;
            } else if (i11 == 2) {
                str3 = c8324t.f25950o0;
                str = c8324t.f25949Z;
                c8312h2 = c8324t.f25948Y;
                AbstractC9233X.m9807c(obj);
                c0611f0 = (C0611f0) c8312h2.f25903Z.f7439q0;
                c8326v = new C8326v(c8312h2, str, str3, null);
                c8324t.f25948Y = null;
                c8324t.f25949Z = null;
                c8324t.f25950o0 = null;
                c8324t.f25952q0 = 3;
                if (AbstractC0575H.m1168P(c0611f0, c8326v, c8324t) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C8317m c8317m = c8312h.f25902Y;
        str = c8317m.f25915a;
        str2 = c8317m.f25928n;
        C21346q c21346q = (C21346q) c8312h.f25903Z.f7436Z;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        c8324t.f25948Y = c8312h;
        c8324t.f25949Z = str;
        c8324t.f25950o0 = str2;
        c8324t.f25952q0 = 1;
        objM21739a = c21346q.m21739a(interfaceC3756dMo5693b, c8324t);
        if (objM21739a == enumC19250a) {
            return enumC19250a;
        }
        if (((C8297E) objM21739a) == null) {
            return c17296c;
        }
        C21346q c21346q2 = (C21346q) c8312h.f25903Z.f7436Z;
        C8296D c8296d = new C8296D(false, 1);
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        c8324t.f25948Y = c8312h;
        c8324t.f25949Z = str;
        c8324t.f25950o0 = str2;
        c8324t.f25952q0 = 2;
        if (c21346q2.m21740b(c8296d, interfaceC3756dMo5693b2, c8324t) == enumC19250a) {
            return enumC19250a;
        }
        c8312h2 = c8312h;
        str3 = str2;
        c0611f0 = (C0611f0) c8312h2.f25903Z.f7439q0;
        c8326v = new C8326v(c8312h2, str, str3, null);
        c8324t.f25948Y = null;
        c8324t.f25949Z = null;
        c8324t.f25950o0 = null;
        c8324t.f25952q0 = 3;
        if (AbstractC0575H.m1168P(c0611f0, c8326v, c8324t) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: b */
    public static C17930R0 m10510b(C3676s c3676s) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                Object key = c4621nM5364a.getKey();
                AbstractC16544l.m18093f(key, "entry.key");
                linkedHashMap.put(key, c4621nM5364a.getValue());
            }
            return new C17930R0(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Context", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m10511c(C8312h c8312h, Settings settings, AbstractC19687c abstractC19687c) {
        C8328x c8328x;
        if (abstractC19687c instanceof C8328x) {
            c8328x = (C8328x) abstractC19687c;
            int i10 = c8328x.f25968p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c8328x.f25968p0 = i10 - Integer.MIN_VALUE;
            } else {
                c8328x = new C8328x(abstractC19687c);
            }
        } else {
            c8328x = new C8328x(abstractC19687c);
        }
        Object objM21739a = c8328x.f25967o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c8328x.f25968p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                settings = c8328x.f25966Z;
                c8312h = c8328x.f25965Y;
                AbstractC9233X.m9807c(objM21739a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM21739a);
            }
        }
        AbstractC9233X.m9807c(objM21739a);
        C21346q c21346q = (C21346q) c8312h.f25903Z.f7436Z;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        c8328x.f25965Y = c8312h;
        c8328x.f25966Z = settings;
        c8328x.f25968p0 = 1;
        objM21739a = c21346q.m21739a(interfaceC3756dMo5693b, c8328x);
        if (objM21739a == enumC19250a) {
            return enumC19250a;
        }
        C8297E c8297e = (C8297E) objM21739a;
        if (c8297e == null) {
            return c17296c;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c8312h.m8933c().m9555b(new C7448e(c8297e, linkedHashSet, settings, 2));
        C21346q c21346q2 = (C21346q) c8312h.f25903Z.f7436Z;
        C8295C c8295c = new C8295C(1);
        c8295c.f25850b = linkedHashSet;
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        c8328x.f25965Y = null;
        c8328x.f25966Z = null;
        c8328x.f25968p0 = 2;
        return c21346q2.m21740b(c8295c, interfaceC3756dMo5693b2, c8328x) == enumC19250a ? enumC19250a : c17296c;
    }
}
