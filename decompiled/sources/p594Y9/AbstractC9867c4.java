package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.AbstractC17976h1;
import p919o8.C17920N1;

/* JADX INFO: renamed from: Y9.c4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9867c4 {
    /* JADX INFO: renamed from: a */
    public static C17920N1 m10521a(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("replay_level").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"replay_level\").asString");
            for (int i10 : AbstractC0010F.m27k(3)) {
                if (AbstractC17976h1.m19678m(i10).equals(strMo4384r)) {
                    return new C17920N1(i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Privacy", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Privacy", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Privacy", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10522b(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
