package p001A;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayDeque;
import p028B.C0703j;
import p079D.AbstractC1762b;
import p178H.C3131Y;
import p178H.C3150i0;
import p178H.C3162o0;
import p658b5.C11242m;

/* JADX INFO: renamed from: A.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0048Y0 {

    /* JADX INFO: renamed from: a */
    public final C0703j f230a;

    /* JADX INFO: renamed from: b */
    public final C11242m f231b;

    /* JADX INFO: renamed from: c */
    public boolean f232c = false;

    /* JADX INFO: renamed from: d */
    public boolean f233d = false;

    /* JADX INFO: renamed from: e */
    public final boolean f234e;

    /* JADX INFO: renamed from: f */
    public final boolean f235f;

    /* JADX INFO: renamed from: g */
    public C3150i0 f236g;

    /* JADX INFO: renamed from: h */
    public C3131Y f237h;

    /* JADX INFO: renamed from: i */
    public C3162o0 f238i;

    /* JADX INFO: renamed from: j */
    public ImageWriter f239j;

    public C0048Y0(C0703j c0703j) {
        boolean z6;
        this.f234e = false;
        this.f235f = false;
        this.f230a = c0703j;
        int[] iArr = (int[]) c0703j.m1476a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z6 = false;
            break;
        }
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z6 = false;
                break;
            } else {
                if (iArr[i10] == 4) {
                    z6 = true;
                    break;
                }
                i10++;
            }
        }
        this.f234e = z6;
        this.f235f = AbstractC1762b.f5032a.m4579f(ZslDisablerQuirk.class) != null;
        C0030P c0030p = new C0030P(8);
        C11242m c11242m = new C11242m();
        c11242m.f34019Z = new Object();
        c11242m.f34018Y = new ArrayDeque(3);
        c11242m.f34020o0 = c0030p;
        this.f231b = c11242m;
    }
}
