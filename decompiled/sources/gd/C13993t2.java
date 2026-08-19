package gd;

import com.statsig.androidsdk.Layer;
import com.statsig.androidsdk.StatsigClient;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p038Ba.AbstractC0865o;
import p103Dn.AbstractC2124C;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.t2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13993t2 {

    /* JADX INFO: renamed from: a */
    public final C13985r2 f44060a;

    /* JADX INFO: renamed from: b */
    public final Set f44061b;

    /* JADX INFO: renamed from: c */
    public final C3430e f44062c = AbstractC8168p6.m8749b("StatsigLayerManager", "Experimentation");

    public C13993t2(C13985r2 c13985r2, Set set) {
        this.f44060a = c13985r2;
        this.f44061b = set;
    }

    /* JADX INFO: renamed from: a */
    public final Object m15479a(AbstractC0865o key) {
        Object objM15476s;
        C3430e c3430e = this.f44062c;
        AbstractC16544l.m18094g(key, "key");
        String str = (String) key.f2431a;
        try {
            Layer layer$default = StatsigClient.getLayer$default(this.f44060a.f44049e, ((EnumC13884P1) key.f2433c).f43932Y, false, 2, null);
            if (key instanceof AbstractC13892S1) {
                objM15476s = Boolean.valueOf(layer$default.getBoolean(str, ((Boolean) ((AbstractC13892S1) key).f2432b).booleanValue()));
            } else if (key instanceof AbstractC13910Y1) {
                objM15476s = Integer.valueOf(layer$default.getInt(str, ((Number) ((AbstractC13910Y1) key).f2432b).intValue()));
            } else if (key instanceof AbstractC13957k2) {
                objM15476s = layer$default.getString(str, (String) ((AbstractC13957k2) key).f2432b);
            } else {
                if (!(key instanceof AbstractC13901V1)) {
                    throw new C0644w();
                }
                objM15476s = ((AbstractC13901V1) key).m15476s(layer$default.getString(str, ((AbstractC13901V1) key).f43951e));
            }
        } catch (IllegalStateException e10) {
            AbstractC8160o6.m8731f(c3430e, "Statsig not initialized", e10, null, 4);
            objM15476s = key.f2432b;
        }
        AbstractC16544l.m18092e(objM15476s, "null cannot be cast to non-null type T of com.openai.experiment.StatsigLayerManager.get");
        AbstractC8168p6.m8748a(this.f44061b, str, objM15476s, c3430e);
        return objM15476s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m15480b(AbstractC13892S1 abstractC13892S1, AbstractC19687c abstractC19687c) {
        C13989s2 c13989s2;
        C13993t2 c13993t2;
        AbstractC0865o abstractC0865o;
        if (abstractC19687c instanceof C13989s2) {
            c13989s2 = (C13989s2) abstractC19687c;
            int i10 = c13989s2.f44057q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13989s2.f44057q0 = i10 - Integer.MIN_VALUE;
            } else {
                c13989s2 = new C13989s2(this, abstractC19687c);
            }
        } else {
            c13989s2 = new C13989s2(this, abstractC19687c);
        }
        Object obj = c13989s2.f44055o0;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c13989s2.f44057q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c13989s2.f44053Y = this;
            c13989s2.f44054Z = abstractC13892S1;
            c13989s2.f44057q0 = 1;
            C13985r2 c13985r2 = this.f44060a;
            Object objM3220s = AbstractC2124C.m3220s(c13985r2.f44046b, new C13973o2(2, null), c13989s2);
            if (objM3220s != obj2) {
                objM3220s = C17296C.f55119a;
            }
            if (objM3220s == obj2) {
                return obj2;
            }
            c13993t2 = this;
            abstractC0865o = abstractC13892S1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0865o abstractC0865o2 = c13989s2.f44054Z;
            C13993t2 c13993t3 = c13989s2.f44053Y;
            AbstractC9233X.m9807c(obj);
            c13993t2 = c13993t3;
            abstractC0865o = abstractC0865o2;
        }
        return c13993t2.m15479a(abstractC0865o);
    }
}
