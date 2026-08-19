package p594Y9;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p470T4.C7248m;
import p720e6.C13287b;
import p720e6.C13288c;
import p919o8.C18011t0;

/* JADX INFO: renamed from: Y9.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9884f0 {

    /* JADX INFO: renamed from: a */
    public static volatile C13288c f29391a;

    /* JADX INFO: renamed from: b */
    public static volatile C13287b f29392b;

    /* JADX INFO: renamed from: a */
    public static C18011t0 m10536a(C3676s c3676s) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                Object key = c4621nM5364a.getKey();
                AbstractC16544l.m18093f(key, "entry.key");
                linkedHashMap.put(key, c4621nM5364a.getValue());
            }
            return new C18011t0(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Context", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C13287b m10537b(Context context) {
        Context applicationContext = context.getApplicationContext();
        C13287b c13287b = f29392b;
        if (c13287b == null) {
            synchronized (C13287b.class) {
                try {
                    c13287b = f29392b;
                    if (c13287b == null) {
                        c13287b = new C13287b(new C7248m(applicationContext), 0);
                        f29392b = c13287b;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c13287b;
    }
}
