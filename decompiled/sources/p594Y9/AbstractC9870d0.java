package p594Y9;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p911o0.AbstractC17792x;
import p919o8.AbstractC17962d;
import p919o8.C18005r0;
import p919o8.C18008s0;

/* JADX INFO: renamed from: Y9.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9870d0 {
    /* JADX INFO: renamed from: a */
    public static final void m10523a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10524b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, i11, ", size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10525c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM21e = AbstractC0010F.m21e("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbM21e.append(i12);
            throw new IndexOutOfBoundsException(sbM21e.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("fromIndex: ", i10, i11, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: d */
    public static C18005r0 m10526d(C3676s c3676s) {
        try {
            C18008s0 c18008s0M10532a = AbstractC9877e0.m10532a(c3676s.m4395w("view").m4390m());
            String strMo4384r = c3676s.m4395w("source").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"source\").asString");
            for (int i10 : AbstractC0010F.m27k(8)) {
                if (AbstractC17962d.m19655p(i10).equals(strMo4384r)) {
                    return new C18005r0(c18008s0M10532a, i10);
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
}
