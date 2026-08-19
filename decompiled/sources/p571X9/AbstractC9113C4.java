package p571X9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p523V9.AbstractC8112i6;
import p919o8.AbstractC17962d;
import p919o8.C17924P;
import p919o8.C17927Q;

/* JADX INFO: renamed from: X9.C4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9113C4 {
    /* JADX INFO: renamed from: a */
    public static final long m9643a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static C17924P m9644b(C3676s c3676s) {
        try {
            C17927Q c17927qM9648a = AbstractC9119D4.m9648a(c3676s.m4395w("view").m4390m());
            String strMo4384r = c3676s.m4395w("source").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"source\").asString");
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19638b(i10).equals(strMo4384r)) {
                    return new C17924P(c17927qM9648a, i10);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Container", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Container", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Container", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m9645c(long j10) {
        return AbstractC8112i6.m8603a((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }
}
