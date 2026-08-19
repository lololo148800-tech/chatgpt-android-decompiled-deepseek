package gd;

import bo.AbstractC11516d;
import com.statsig.androidsdk.DynamicConfig;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import org.json.JSONObject;
import p025An.C0644w;
import p038Ba.AbstractC0865o;
import p103Dn.AbstractC2124C;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p582Xk.HXHG.bQBnquXS;
import p909nm.C17689w;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.n2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13969n2 {

    /* JADX INFO: renamed from: a */
    public final C13985r2 f44025a;

    /* JADX INFO: renamed from: b */
    public final Set f44026b;

    /* JADX INFO: renamed from: c */
    public final C3430e f44027c = AbstractC8168p6.m8749b(bQBnquXS.jhMXP, "Experimentation");

    /* JADX INFO: renamed from: a */
    public final Object m15477a(AbstractC0865o key) {
        Object objM12903b;
        ArrayList arrayList;
        C3430e c3430e = this.f44027c;
        AbstractC16544l.m18094g(key, "key");
        Object obj = key.f2432b;
        String str = (String) key.f2431a;
        try {
            DynamicConfig config = this.f44025a.f44049e.getConfig((String) key.f2433c);
            if (key instanceof AbstractC13962m) {
                objM12903b = Integer.valueOf(config.getInt(str, ((Number) ((AbstractC13962m) key).f2432b).intValue()));
            } else if (key instanceof C13946i) {
                objM12903b = Long.valueOf(config.getLong(str, ((Number) ((C13946i) key).f2432b).longValue()));
            } else if (key instanceof AbstractC14012z) {
                objM12903b = config.getString(str, (String) ((AbstractC14012z) key).f2432b);
            } else if (key instanceof AbstractC13837A) {
                Object[] array = config.getArray(str, null);
                if (array != null) {
                    arrayList = new ArrayList(array.length);
                    for (Object obj2 : array) {
                        arrayList.add(String.valueOf(obj2));
                    }
                } else {
                    arrayList = null;
                }
                objM12903b = arrayList == null ? C17689w.f56480Y : arrayList;
            } else {
                if (!(key instanceof AbstractC13998v)) {
                    throw new C0644w();
                }
                try {
                    String string = new JSONObject(config.getValue()).toString();
                    AbstractC16544l.m18093f(string, "toString(...)");
                    objM12903b = AbstractC11516d.f34842d.m12903b(string, ((AbstractC13998v) key).f44071d);
                } catch (Exception e10) {
                    AbstractC8160o6.m8731f(c3430e, "Failed to parse config key " + str + " with value " + config.getValue(), e10, null, 4);
                    objM12903b = obj;
                }
            }
        } catch (IllegalStateException e11) {
            AbstractC8160o6.m8731f(c3430e, "Statsig not initialized", e11, null, 4);
            objM12903b = obj;
        }
        if (objM12903b != null) {
            obj = objM12903b;
        }
        AbstractC8168p6.m8748a(this.f44026b, str, obj, c3430e);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m15478b(AbstractC0865o abstractC0865o, AbstractC19687c abstractC19687c) {
        C13965m2 c13965m2;
        C13969n2 c13969n2;
        if (abstractC19687c instanceof C13965m2) {
            c13965m2 = (C13965m2) abstractC19687c;
            int i10 = c13965m2.f44021q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13965m2.f44021q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13965m2 = new C13965m2(this, abstractC19687c);
            }
        } else {
            c13965m2 = new C13965m2(this, abstractC19687c);
        }
        Object obj = c13965m2.f44019o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c13965m2.f44021q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c13965m2.f44017Y = this;
            c13965m2.f44018Z = abstractC0865o;
            c13965m2.f44021q0 = 1;
            C13985r2 c13985r2 = this.f44025a;
            Object objM3220s = AbstractC2124C.m3220s(c13985r2.f44046b, new C13973o2(2, null), c13965m2);
            if (objM3220s != obj2) {
                objM3220s = C17296C.f55119a;
            }
            if (objM3220s == obj2) {
                return obj2;
            }
            c13969n2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC0865o = c13965m2.f44018Z;
            c13969n2 = c13965m2.f44017Y;
            AbstractC9233X.m9807c(obj);
        }
        return c13969n2.m15477a(abstractC0865o);
    }

    public C13969n2(C13985r2 c13985r2, Set set) {
        this.f44025a = c13985r2;
        this.f44026b = set;
    }
}
