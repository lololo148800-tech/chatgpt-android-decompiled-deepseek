package p081D1;

import android.view.ViewStructure;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* JADX INFO: renamed from: D1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1847d {
    /* JADX INFO: renamed from: a */
    public static void m2701a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }
}
