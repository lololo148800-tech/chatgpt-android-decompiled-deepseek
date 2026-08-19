package p544W9;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import io.sentry.C15114C1;
import io.sentry.EnumC15111B1;
import io.sentry.android.replay.C15304r;
import kotlin.jvm.internal.AbstractC16544l;
import p102Dm.AbstractC2119a;

/* JADX INFO: renamed from: W9.r3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8704r3 {
    /* JADX INFO: renamed from: b */
    public static C15304r m9410b(Context context, C15114C1 sessionReplay) {
        Rect rect;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sessionReplay, "sessionReplay");
        Object systemService = context.getSystemService("window");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        AbstractC16544l.m18093f(rect, "if (VERSION.SDK_INT >= V…enBounds.y)\n            }");
        float fHeight = rect.height() / context.getResources().getDisplayMetrics().density;
        EnumC15111B1 enumC15111B1 = sessionReplay.f47053e;
        int iM3195i = AbstractC2119a.m3195i(fHeight * enumC15111B1.sizeScale);
        int i10 = iM3195i % 16;
        Integer numValueOf = Integer.valueOf(i10 <= 8 ? iM3195i - i10 : iM3195i + (16 - i10));
        int iM3195i2 = AbstractC2119a.m3195i((rect.width() / context.getResources().getDisplayMetrics().density) * enumC15111B1.sizeScale);
        int i11 = iM3195i2 % 16;
        Integer numValueOf2 = Integer.valueOf(i11 <= 8 ? iM3195i2 - i11 : iM3195i2 + (16 - i11));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return new C15304r(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), sessionReplay.f47054f, enumC15111B1.bitRate);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo5750a();
}
