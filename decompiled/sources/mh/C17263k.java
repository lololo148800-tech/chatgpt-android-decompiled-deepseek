package mh;

import android.content.Context;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.C1699d;
import p171Gh.EnumC3058a;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8160o6;

/* JADX INFO: renamed from: mh.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C17263k {
    /* JADX INFO: renamed from: a */
    public static EnumC17264l m18970a(C1699d settings, Context context) {
        Object next;
        AbstractC16544l.m18094g(settings, "settings");
        AbstractC16544l.m18094g(context, "context");
        String str = settings.f4833g;
        if (str != null) {
            EnumC17264l.f55058o0.getClass();
            Iterator it = EnumC17264l.f55063t0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((EnumC17264l) next).f55064Y.equals(str));
            EnumC17264l enumC17264l = (EnumC17264l) next;
            if (enumC17264l == null) {
                AbstractC8160o6.m8731f(EnumC17264l.f55059p0, "Unknown language code: ".concat(str), null, null, 6);
            }
            if (enumC17264l != null) {
                return enumC17264l;
            }
        }
        return AbstractC16544l.m18089b(AbstractC8012V5.m8334g(context).toLanguageTag(), EnumC3058a.EN_SG.f9226Y.toLanguageTag()) ? EnumC17264l.English : EnumC17264l.Auto;
    }
}
