package p028B;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0694a extends Exception {

    /* JADX INFO: renamed from: Z */
    public static final Set f2016Z = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: Y */
    public final int f2017Y;

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public C0694a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f2017Y = 10001;
        if (f2016Z.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C0694a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f2017Y = cameraAccessException.getReason();
    }

    public C0694a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f2017Y = 10002;
        if (f2016Z.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
