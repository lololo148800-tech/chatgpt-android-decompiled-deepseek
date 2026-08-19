package p001A;

import android.content.pm.ShortcutInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import p028B.C0703j;
import p053C.AbstractC1467b;
import p178H.C3175v;

/* JADX INFO: renamed from: A.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0091u0 {
    /* JADX INFO: renamed from: a */
    public static Object m323a(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    /* JADX INFO: renamed from: b */
    public static C3175v m324b(C0703j c0703j) {
        Long l4 = (Long) c0703j.m1476a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l4 != null) {
            return (C3175v) AbstractC1467b.f3876a.get(l4);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m325c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m326d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: e */
    public static void m327e(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
