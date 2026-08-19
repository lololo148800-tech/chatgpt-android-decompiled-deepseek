package p571X9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p919o8.C17932S;

/* JADX INFO: renamed from: X9.E4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9125E4 {
    /* JADX INFO: renamed from: a */
    public static final long m9659a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static C17932S m9660b(C3676s c3676s) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                Object key = c4621nM5364a.getKey();
                AbstractC16544l.m18093f(key, "entry.key");
                linkedHashMap.put(key, c4621nM5364a.getValue());
            }
            return new C17932S(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Context", e12);
        }
    }
}
