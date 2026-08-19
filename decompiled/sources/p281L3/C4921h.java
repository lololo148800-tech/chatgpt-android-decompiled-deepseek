package p281L3;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import bb.AbstractC11278C;
import java.util.Locale;
import p1016t3.C19767Q;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: L3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4921h extends C19767Q {

    /* JADX INFO: renamed from: r */
    public boolean f16037r;

    /* JADX INFO: renamed from: s */
    public boolean f16038s;

    /* JADX INFO: renamed from: t */
    public boolean f16039t;

    /* JADX INFO: renamed from: u */
    public boolean f16040u;

    /* JADX INFO: renamed from: v */
    public boolean f16041v;

    /* JADX INFO: renamed from: w */
    public boolean f16042w;

    /* JADX INFO: renamed from: x */
    public boolean f16043x;

    /* JADX INFO: renamed from: y */
    public final SparseArray f16044y;

    /* JADX INFO: renamed from: z */
    public final SparseBooleanArray f16045z;

    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    public C4921h(Context context) {
        CaptioningManager captioningManager;
        Point point;
        int i10 = AbstractC20817s.f66106a;
        if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f62622o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f62621n = AbstractC11278C.m12695y(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC20817s.m21389C(context)) {
            String strM21422w = i10 < 28 ? AbstractC20817s.m21422w("sys.display-size") : AbstractC20817s.m21422w("vendor.display-size");
            if (!TextUtils.isEmpty(strM21422w)) {
                try {
                    String[] strArrSplit = strM21422w.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i12 > 0) {
                            point = new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC20800b.m21324l("Util", "Invalid display size: " + strM21422w);
                if (!"Sony".equals(AbstractC20817s.f66108c) && AbstractC20817s.f66109d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    point = new Point();
                    if (i10 >= 23) {
                        Display.Mode mode = display.getMode();
                        point.x = mode.getPhysicalWidth();
                        point.y = mode.getPhysicalHeight();
                    } else {
                        display.getRealSize(point);
                    }
                }
            } else if (!"Sony".equals(AbstractC20817s.f66108c)) {
                point = new Point();
                if (i10 >= 23) {
                    Display.Mode mode2 = display.getMode();
                    point.x = mode2.getPhysicalWidth();
                    point.y = mode2.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            } else {
                point = new Point();
                if (i10 >= 23) {
                    Display.Mode mode3 = display.getMode();
                    point.x = mode3.getPhysicalWidth();
                    point.y = mode3.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            }
        } else {
            point = new Point();
            if (i10 >= 23) {
                Display.Mode mode4 = display.getMode();
                point.x = mode4.getPhysicalWidth();
                point.y = mode4.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
        }
        mo5530a(point.x, point.y);
        this.f16044y = new SparseArray();
        this.f16045z = new SparseBooleanArray();
        m5531b();
    }

    @Override // p1016t3.C19767Q
    /* JADX INFO: renamed from: a */
    public final C19767Q mo5530a(int i10, int i11) {
        super.mo5530a(i10, i11);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m5531b() {
        this.f16037r = true;
        this.f16038s = true;
        this.f16039t = true;
        this.f16040u = true;
        this.f16041v = true;
        this.f16042w = true;
        this.f16043x = true;
    }

    public C4921h() {
        this.f16044y = new SparseArray();
        this.f16045z = new SparseBooleanArray();
        m5531b();
    }
}
