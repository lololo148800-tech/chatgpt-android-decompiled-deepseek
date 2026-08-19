package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p228J.C3838h;
import p228J.C3871x0;
import p228J.EnumC3873y0;
import p228J.InterfaceC3839h0;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements InterfaceC3839h0 {

    /* JADX INFO: renamed from: a */
    public static final C3871x0 f32314a;

    /* JADX INFO: renamed from: b */
    public static final C3871x0 f32315b;

    /* JADX INFO: renamed from: c */
    public static final HashSet f32316c;

    /* JADX INFO: renamed from: d */
    public static final HashSet f32317d;

    static {
        C3871x0 c3871x0 = new C3871x0();
        EnumC3873y0 enumC3873y0 = EnumC3873y0.VGA;
        AbstractC0010F.m22f(2, enumC3873y0, 0L, c3871x0);
        EnumC3873y0 enumC3873y1 = EnumC3873y0.PREVIEW;
        AbstractC0010F.m22f(1, enumC3873y1, 0L, c3871x0);
        EnumC3873y0 enumC3873y2 = EnumC3873y0.MAXIMUM;
        AbstractC0010F.m22f(2, enumC3873y2, 0L, c3871x0);
        f32314a = c3871x0;
        C3871x0 c3871x1 = new C3871x0();
        c3871x1.m4594a(new C3838h(1, enumC3873y1, 0L));
        c3871x1.m4594a(new C3838h(1, enumC3873y0, 0L));
        AbstractC0010F.m22f(2, enumC3873y2, 0L, c3871x1);
        f32315b = c3871x1;
        f32316c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f32317d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11180b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f32317d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
