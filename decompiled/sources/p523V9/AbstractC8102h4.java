package p523V9;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import p001A.C0072l;
import p028B.C0703j;
import p079D.AbstractC1762b;
import p672c3.C11571E0;

/* JADX INFO: renamed from: V9.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8102h4 {
    /* JADX INFO: renamed from: a */
    public static final int m8578a(RemoteViews remoteViews, C11571E0 c11571e0, int i10, int i11, Integer num) {
        if (i10 == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : c11571e0.f34979g.incrementAndGet();
        if (iIntValue != -1) {
            remoteViews.setInt(i10, "setInflatedId", iIntValue);
        }
        if (i11 != 0) {
            remoteViews.setInt(i10, "setLayoutResource", i11);
        }
        remoteViews.setViewVisibility(i10, 0);
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8579b(C0072l c0072l) {
        Boolean bool;
        try {
            bool = (Boolean) ((C0703j) c0072l.f310Z).m1476a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (AbstractC1762b.f5032a.m4579f(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                AbstractC8072d6.m8486c("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                AbstractC8072d6.m8488e("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC8072d6.m8492i("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
