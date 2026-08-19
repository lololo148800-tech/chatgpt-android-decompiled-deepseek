package p102Dm;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.WebrtcBuildVersion;
import p1009s9.C19506i;
import p105E.C2222a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p155G.C2953e;
import p228J.AbstractC3810L;
import p228J.C3799E;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.InterfaceC3854p;
import p324Mn.AbstractC5546p;
import p324Mn.AbstractC5555y;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5531a;
import p324Mn.C5543m;
import p324Mn.C5551u;
import p324Mn.C5554x;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8519M3;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Dm.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2119a {
    /* JADX INFO: renamed from: a */
    public static void m3187a(CaptureRequest.Builder builder, C3835f0 c3835f0) {
        C19506i c19506iM3779b = C2953e.m3777c(c3835f0).m3779b();
        for (C3828c c3828c : c19506iM3779b.getConfig().mo44k()) {
            CaptureRequest.Key key = c3828c.f11595c;
            try {
                builder.set(key, c19506iM3779b.getConfig().mo39b(c3828c));
            } catch (IllegalArgumentException unused) {
                AbstractC8072d6.m8487d("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3188b(CaptureRequest.Builder builder, int i10, C2222a c2222a) {
        Map mapEmptyMap;
        if (i10 == 3 && c2222a.f6805a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapEmptyMap = DesugarCollections.unmodifiableMap(map);
        } else {
            if (i10 != 4) {
                c2222a.getClass();
            } else if (c2222a.f6806b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapEmptyMap = DesugarCollections.unmodifiableMap(map2);
            }
            mapEmptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public static CaptureRequest m3189c(C3799E c3799e, CameraDevice cameraDevice, HashMap map, boolean z6, C2222a c2222a) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        InterfaceC3854p interfaceC3854p;
        if (cameraDevice == null) {
            return null;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(c3799e.f11482a);
        ArrayList arrayList = new ArrayList();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC3810L) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i10 = c3799e.f11484c;
        if (i10 == 5 && (interfaceC3854p = c3799e.f11489h) != null && (interfaceC3854p.mo4351u() instanceof TotalCaptureResult)) {
            AbstractC8072d6.m8486c("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) interfaceC3854p.mo4351u());
        } else {
            AbstractC8072d6.m8486c("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i10 == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z6 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i10);
            }
        }
        m3188b(builderCreateCaptureRequest, i10, c2222a);
        C3828c c3828c = C3799E.f11481k;
        Object objMo39b = C3836g.f11605f;
        C3835f0 c3835f0 = c3799e.f11483b;
        try {
            objMo39b = c3835f0.mo39b(c3828c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objMo39b;
        Objects.requireNonNull(range);
        Object objMo39b2 = C3836g.f11605f;
        if (!range.equals(objMo39b2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                objMo39b2 = c3835f0.mo39b(C3799E.f11481k);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) objMo39b2;
            Objects.requireNonNull(range2);
            builderCreateCaptureRequest.set(key, range2);
        }
        if (c3799e.m4504b() == 1 || c3799e.m4505c() == 1) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (c3799e.m4504b() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (c3799e.m4505c() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C3828c c3828c2 = C3799E.f11479i;
        TreeMap treeMap = c3835f0.f11604Y;
        if (treeMap.containsKey(c3828c2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c3835f0.mo39b(c3828c2));
        }
        C3828c c3828c3 = C3799E.f11480j;
        if (treeMap.containsKey(c3828c3)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c3835f0.mo39b(c3828c3)).byteValue()));
        }
        m3187a(builderCreateCaptureRequest, c3835f0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it2.next());
        }
        builderCreateCaptureRequest.setTag(c3799e.f11488g);
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: d */
    public static CaptureRequest m3190d(C3799E c3799e, CameraDevice cameraDevice, C2222a c2222a) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("template type = ");
        int i10 = c3799e.f11484c;
        sb2.append(i10);
        AbstractC8072d6.m8486c("Camera2CaptureRequestBuilder", sb2.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i10);
        m3188b(builderCreateCaptureRequest, i10, c2222a);
        m3187a(builderCreateCaptureRequest, c3799e.f11483b);
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: e */
    public static Date m3191e(String str) {
        if (str == null) {
            return null;
        }
        Pattern patternCompile = Pattern.compile(TokenNames.f32012I);
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("1");
        AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile(TokenNames.f32014L);
        AbstractC16544l.m18093f(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("1");
        AbstractC16544l.m18093f(strReplaceAll2, "replaceAll(...)");
        Pattern patternCompile3 = Pattern.compile("D");
        AbstractC16544l.m18093f(patternCompile3, "compile(...)");
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(WebrtcBuildVersion.maint_version);
        AbstractC16544l.m18093f(strReplaceAll3, "replaceAll(...)");
        Pattern patternCompile4 = Pattern.compile(TokenNames.f32016O);
        AbstractC16544l.m18093f(patternCompile4, "compile(...)");
        String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll(WebrtcBuildVersion.maint_version);
        AbstractC16544l.m18093f(strReplaceAll4, "replaceAll(...)");
        Pattern patternCompile5 = Pattern.compile(TokenNames.f32018S);
        AbstractC16544l.m18093f(patternCompile5, "compile(...)");
        String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll("5");
        AbstractC16544l.m18093f(strReplaceAll5, "replaceAll(...)");
        Pattern patternCompile6 = Pattern.compile("G");
        AbstractC16544l.m18093f(patternCompile6, "compile(...)");
        String strReplaceAll6 = patternCompile6.matcher(strReplaceAll5).replaceAll("6");
        AbstractC16544l.m18093f(strReplaceAll6, "replaceAll(...)");
        try {
            return new SimpleDateFormat("yyMMdd", Locale.US).parse(strReplaceAll6);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m3192f(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC21322p.m21711s0(AbstractC21329w.m21731r(str, Separators.LESS_THAN, Separators.f31991SP)).toString();
    }

    /* JADX INFO: renamed from: g */
    public static C5554x m3193g() {
        C5551u c5551uM5929a = C5531a.f17986a.m5929a();
        C5525F.Companion.getClass();
        C5554x c5554xM5923a = AbstractC8519M3.m9187a(c5551uM5929a, C5524E.m5924a()).m5923a();
        AbstractC5546p.Companion.getClass();
        C5543m unit = AbstractC5546p.f17998b;
        int i10 = AbstractC5555y.f18009c;
        AbstractC16544l.m18094g(unit, "unit");
        return AbstractC5555y.m5948a(c5554xM5923a, -13, unit);
    }

    /* JADX INFO: renamed from: h */
    public static int m3194h(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    /* JADX INFO: renamed from: i */
    public static int m3195i(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    /* JADX INFO: renamed from: j */
    public static long m3196j(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }
}
