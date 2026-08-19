package p594Y9;

import java.util.List;
import p003A1.AbstractC0168G;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p328N1.C5578E;
import p919o8.C17945W0;

/* JADX INFO: renamed from: Y9.k3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9918k3 {
    /* JADX INFO: renamed from: a */
    public static String m10573a(List list, String str, C5578E c5578e, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 32) != 0) {
            c5578e = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (c5578e != null) {
                AbstractC0168G.m507B(obj);
                throw null;
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C17945W0 m10574b(C3676s c3676s) {
        try {
            return new C17945W0(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dns", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dns", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dns", e12);
        }
    }
}
