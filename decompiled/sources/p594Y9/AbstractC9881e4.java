package p594Y9;

import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17926P1;

/* JADX INFO: renamed from: Y9.e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9881e4 {
    /* JADX INFO: renamed from: a */
    public static C17926P1 m10534a(C3676s c3676s) {
        try {
            return new C17926P1(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Resource", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Resource", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Resource", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10535b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
