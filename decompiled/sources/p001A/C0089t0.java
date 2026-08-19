package p001A;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;
import p391Q.AbstractC6542b;
import p477Tb.C7296c;
import p960q9.C18655i;

/* JADX INFO: renamed from: A.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0089t0 {

    /* JADX INFO: renamed from: e */
    public static final Size f382e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f */
    public static final Size f383f = new Size(320, 240);

    /* JADX INFO: renamed from: g */
    public static final Size f384g = new Size(640, 480);

    /* JADX INFO: renamed from: h */
    public static final Object f385h = new Object();

    /* JADX INFO: renamed from: i */
    public static volatile C0089t0 f386i;

    /* JADX INFO: renamed from: a */
    public final DisplayManager f387a;

    /* JADX INFO: renamed from: b */
    public volatile Size f388b = null;

    /* JADX INFO: renamed from: c */
    public final C18655i f389c = new C18655i(7);

    /* JADX INFO: renamed from: d */
    public final C7296c f390d = new C7296c(7);

    public C0089t0(Context context) {
        this.f387a = (DisplayManager) context.getSystemService("display");
    }

    /* JADX INFO: renamed from: b */
    public static C0089t0 m316b(Context context) {
        if (f386i == null) {
            synchronized (f385h) {
                try {
                    if (f386i == null) {
                        f386i = new C0089t0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f386i;
    }

    /* JADX INFO: renamed from: d */
    public static Display m317d(Display[] displayArr, boolean z6) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z6 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x * point.y;
                if (i11 > i10) {
                    display = display2;
                    i10 = i11;
                }
            }
        }
        return display;
    }

    /* JADX INFO: renamed from: a */
    public final Size m318a() {
        Size sizeM11178b;
        Point point = new Point();
        m319c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = AbstractC6542b.f21170a;
        if (size.getHeight() * size.getWidth() < AbstractC6542b.m7097a(f383f)) {
            size = ((SmallDisplaySizeQuirk) this.f390d.f23104Z) != null ? (Size) SmallDisplaySizeQuirk.f32334a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f384g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f382e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.f389c.f59414Z) == null || (sizeM11178b = ExtraCroppingQuirk.m11178b(1)) == null) {
            return size;
        }
        return sizeM11178b.getHeight() * sizeM11178b.getWidth() > size.getHeight() * size.getWidth() ? sizeM11178b : size;
    }

    /* JADX INFO: renamed from: c */
    public final Display m319c(boolean z6) {
        Display[] displays = this.f387a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM317d = m317d(displays, z6);
        if (displayM317d == null && z6) {
            displayM317d = m317d(displays, false);
        }
        if (displayM317d != null) {
            return displayM317d;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* JADX INFO: renamed from: e */
    public final Size m320e() {
        if (this.f388b != null) {
            return this.f388b;
        }
        this.f388b = m318a();
        return this.f388b;
    }
}
