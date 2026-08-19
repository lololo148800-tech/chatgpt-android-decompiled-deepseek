package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.vRJidSveZHcTw;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17929Q1;

/* JADX INFO: renamed from: Y9.f4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9888f4 {
    /* JADX INFO: renamed from: a */
    public static void m10538a(int i10, int i11) {
        String strM10582a;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10582a = AbstractC9925l4.m10582a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM10582a = AbstractC9925l4.m10582a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10582a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10540c(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC9925l4.m10582a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC9925l4.m10582a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }

    /* JADX INFO: renamed from: d */
    public static C17929Q1 m10541d(C3676s c3676s) {
        try {
            Number maxDepth = c3676s.m4395w("max_depth").mo4383q();
            Number maxDepthScrollTop = c3676s.m4395w("max_depth_scroll_top").mo4383q();
            Number maxScrollHeight = c3676s.m4395w("max_scroll_height").mo4383q();
            Number maxScrollHeightTime = c3676s.m4395w("max_scroll_height_time").mo4383q();
            AbstractC16544l.m18093f(maxDepth, "maxDepth");
            AbstractC16544l.m18093f(maxDepthScrollTop, "maxDepthScrollTop");
            AbstractC16544l.m18093f(maxScrollHeight, "maxScrollHeight");
            AbstractC16544l.m18093f(maxScrollHeightTime, "maxScrollHeightTime");
            return new C17929Q1(maxDepth, maxDepthScrollTop, maxScrollHeight, maxScrollHeightTime);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Scroll", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Scroll", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Scroll", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10539b(int i10, int i11, int i12) {
        String strM10540c;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM10540c = m10540c(i10, i12, "start index");
            } else {
                strM10540c = (i11 < 0 || i11 > i12) ? m10540c(i11, i12, vRJidSveZHcTw.lYRHmaUOmKHjQH) : AbstractC9925l4.m10582a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM10540c);
        }
    }
}
