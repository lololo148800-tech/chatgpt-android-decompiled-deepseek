package p571X9;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p478Tc.AbstractC7301e;
import p919o8.C17989m;

/* JADX INFO: renamed from: X9.a4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9256a4 {
    /* JADX INFO: renamed from: b */
    public static C17989m m9829b(C3676s c3676s) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                Object key = c4621nM5364a.getKey();
                AbstractC16544l.m18093f(key, "entry.key");
                linkedHashMap.put(key, c4621nM5364a.getValue());
            }
            return new C17989m(linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Context", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Context", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Context", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m9830c(String str) {
        if (str == null) {
            return R.drawable.file_blank;
        }
        if (AbstractC21329w.m21734u(str, "video/", false)) {
            return R.drawable.file_video;
        }
        if (AbstractC21329w.m21734u(str, "audio/", false)) {
            return R.drawable.file_audio;
        }
        if (AbstractC21329w.m21734u(str, "text/plain", false) || AbstractC21329w.m21734u(str, "text/markdown", false)) {
            return R.drawable.file_blank;
        }
        boolean zM21734u = AbstractC21329w.m21734u(str, "text/csv", false);
        int i10 = R.drawable.file_spreedsheet;
        if (!zM21734u) {
            if (AbstractC21329w.m21734u(str, "text/", false)) {
                return R.drawable.file_code;
            }
            if (AbstractC21329w.m21734u(str, "application/pdf", false)) {
                return R.drawable.file_document;
            }
            if (!AbstractC21329w.m21734u(str, "application/vnd.ms-excel", false) && !AbstractC21329w.m21734u(str, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", false)) {
                boolean zM21734u2 = AbstractC21329w.m21734u(str, "application/vnd.ms-powerpoint", false);
                i10 = R.drawable.file_presentation;
                if (!zM21734u2 && !AbstractC21329w.m21734u(str, "application/vnd.openxmlformats-officedocument.presentationml.presentation", false)) {
                    return R.drawable.file_blank;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: a */
    public static long m9828a(String str) {
        long j10 = AbstractC7301e.f23123e;
        if (str == null || AbstractC21322p.m21681O(str)) {
            return j10;
        }
        if (AbstractC21329w.m21734u(str, "image/", false)) {
            return AbstractC7301e.f23124f;
        }
        if (AbstractC21329w.m21734u(str, "video/", false)) {
            return AbstractC7301e.f23124f;
        }
        if (AbstractC21329w.m21734u(str, "text/plain", false) || AbstractC21329w.m21734u(str, "text/markdown", false)) {
            return j10;
        }
        if (AbstractC21329w.m21734u(str, "text/csv", false)) {
            return AbstractC7301e.f23122d;
        }
        if (AbstractC21329w.m21734u(str, "text/", false)) {
            return AbstractC7301e.f23119a;
        }
        if (AbstractC21329w.m21734u(str, qffLJgOYizGmMj.nopvPn, false)) {
            return AbstractC7301e.f23120b;
        }
        if (AbstractC21329w.m21734u(str, "application/vnd.ms-excel", false)) {
            return AbstractC7301e.f23122d;
        }
        return AbstractC21329w.m21734u(str, "application/vnd.ms-powerpoint", false) ? AbstractC7301e.f23121c : j10;
    }
}
