package p105E;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import p079D.AbstractC1762b;
import p228J.C3847l0;
import p228J.InterfaceC3839h0;

/* JADX INFO: renamed from: E.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2222a {

    /* JADX INFO: renamed from: a */
    public boolean f6805a;

    /* JADX INFO: renamed from: b */
    public boolean f6806b;

    public /* synthetic */ C2222a(boolean z6, boolean z10) {
        this.f6805a = z6;
        this.f6806b = z10;
    }

    public C2222a(int i10, C3847l0 c3847l0) {
        boolean z6;
        switch (i10) {
            case 1:
                this.f6806b = false;
                this.f6805a = c3847l0.m4579f(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 2:
                c3847l0.getClass();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC3839h0 interfaceC3839h0 : c3847l0.f11629a) {
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(interfaceC3839h0.getClass())) {
                        arrayList.add(interfaceC3839h0);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((CaptureIntentPreviewQuirk) it.next()).mo11175a()) {
                        z6 = true;
                        this.f6805a = z6;
                        this.f6806b = c3847l0.m4578e(ImageCaptureFailedForVideoSnapshotQuirk.class);
                        break;
                    }
                }
                z6 = false;
                this.f6805a = z6;
                this.f6806b = c3847l0.m4578e(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.f6805a = c3847l0.m4578e(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f6806b = AbstractC1762b.f5032a.m4579f(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }
}
