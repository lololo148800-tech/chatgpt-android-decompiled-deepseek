package p228J;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.C15358g1;
import java.util.LinkedHashSet;
import p030B2.AbstractC0718B;
import p178H.C3163p;
import p523V9.AbstractC8072d6;

/* JADX INFO: renamed from: J.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3797D {

    /* JADX INFO: renamed from: a */
    public static final C3163p f11478a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C3821X(2));
        f11478a = new C3163p(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    public static void m4502a(Context context, C15358g1 c15358g1, C3163p c3163p) throws C3795C {
        Integer numM3994b;
        int i10 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC0718B.m1495f(context) != 0) {
            LinkedHashSet linkedHashSetM16584l = c15358g1.m16584l();
            if (linkedHashSetM16584l.isEmpty()) {
                throw new C3795C("No cameras available", 0, null);
            }
            AbstractC8072d6.m8486c("CameraValidator", "Virtual device with ID: " + AbstractC0718B.m1495f(context) + " has " + linkedHashSetM16584l.size() + " cameras. Skipping validation.");
            return;
        }
        if (c3163p != null) {
            try {
                numM3994b = c3163p.m3994b();
                if (numM3994b == null) {
                    AbstractC8072d6.m8492i("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                AbstractC8072d6.m8488e("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            numM3994b = null;
        }
        AbstractC8072d6.m8486c("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numM3994b);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c3163p == null || numM3994b.intValue() == 1)) {
                C3163p.f9512c.m3995c(c15358g1.m16584l());
                i10 = 1;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            AbstractC8072d6.m8493j("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c3163p == null || numM3994b.intValue() == 0)) {
                C3163p.f9511b.m3995c(c15358g1.m16584l());
                i10++;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            AbstractC8072d6.m8493j("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f11478a.m3995c(c15358g1.m16584l());
            AbstractC8072d6.m8486c("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        AbstractC8072d6.m8487d("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c15358g1.m16584l());
        throw new C3795C("Expected camera missing from device.", i10, illegalArgumentException);
    }
}
