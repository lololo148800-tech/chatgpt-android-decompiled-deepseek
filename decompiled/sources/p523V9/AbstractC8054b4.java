package p523V9;

import android.content.BroadcastReceiver;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p028B.C0703j;
import p049Bm.InterfaceC1439n;
import p1008s8.C19492u;
import p1008s8.C19493v;
import p1008s8.C19494w;
import p1008s8.C19496y;
import p153Fn.C2925c;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p228J.C3841i0;
import p228J.C3843j0;
import p228J.C3847l0;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p334Na.AbstractC5695b;
import p672c3.C11562A;
import p909nm.AbstractC17678l;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: V9.b4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8054b4 {
    /* JADX INFO: renamed from: a */
    public static C19496y m8445a(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("device");
            C19492u c19492uM8365c = abstractC3673pM4395w != null ? AbstractC8024X3.m8365c(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("os");
            C19494w c19494wM8394c = abstractC3673pM4395w2 != null ? AbstractC8038Z3.m8394c(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("type");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            String strMo4384r2 = c3676s.m4395w("status").mo4384r();
            String message = c3676s.m4395w("message").mo4384r();
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("error");
            C19493v c19493vM8378b = abstractC3673pM4395w4 != null ? AbstractC8031Y3.m8378b(abstractC3673pM4395w4.m4390m()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C19496y.f61929f)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            if (strMo4384r != null && !strMo4384r.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!AbstractC16544l.m18089b(strMo4384r2, "error")) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC16544l.m18093f(message, "message");
            return new C19496y(c19492uM8365c, c19494wM8394c, message, c19493vM8378b, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Telemetry", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Telemetry", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Telemetry", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:299:0x050d  */
    /* JADX INFO: renamed from: b */
    public static C3847l0 m8446b(C0703j c0703j) {
        boolean z6;
        boolean z10;
        boolean z11;
        Integer num;
        C3843j0 c3843j0 = C3843j0.f11626c;
        c3843j0.getClass();
        try {
            C3841i0 c3841i0 = (C3841i0) c3843j0.f11627a.m4564f().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num2 = (Integer) c0703j.m1476a(key);
            boolean z12 = true;
            if (c3841i0.m4572a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(c0703j));
            }
            if (c3841i0.m4572a(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet = JpegHalCorruptImageQuirk.f32331a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (c3841i0.m4572a(JpegHalCorruptImageQuirk.class, hashSet.contains(str.toLowerCase(locale)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet2 = JpegCaptureDownsizingQuirk.f32330a;
            String str2 = Build.MODEL;
            if (c3841i0.m4572a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str2.toLowerCase(locale)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num3 = (Integer) c0703j.m1476a(key);
            if (c3841i0.m4572a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
                CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = new CamcorderProfileResolutionQuirk();
                c0703j.m1477b();
                arrayList.add(camcorderProfileResolutionQuirk);
            }
            String str3 = Build.HARDWARE;
            if (c3841i0.m4572a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str3) || "universal7420".equalsIgnoreCase(str3)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num4 = (Integer) c0703j.m1476a(key);
            int i10 = Build.VERSION.SDK_INT;
            if (c3841i0.m4572a(LegacyCameraOutputConfigNullPointerQuirk.class, i10 > 23 && num4 != null && num4.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (c3841i0.m4572a(LegacyCameraSurfaceCleanupQuirk.class, i10 > 23 && i10 < 29 && (num = (Integer) c0703j.m1476a(key)) != null && num.intValue() == 2)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            List list = ImageCaptureWashedOutImageQuirk.f32325a;
            if (c3841i0.m4572a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f32325a.contains(str2.toUpperCase(locale)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            List list2 = CameraNoResponseWhenEnablingFlashQuirk.f32311a;
            if (c3841i0.m4572a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f32311a.contains(str2.toUpperCase(locale)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str4 = Build.BRAND;
            if (c3841i0.m4572a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str4) && "MotoG3".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str4) && "SM-G532F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J700F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-A920F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J415F".equalsIgnoreCase(str2)) || ("xiaomi".equalsIgnoreCase(str4) && "Mi A1".equalsIgnoreCase(str2))))))) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator it = FlashTooSlowQuirk.f32319a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                        if (((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            z6 = true;
                            break;
                        }
                    }
                }
                z6 = false;
                break;
            }
            if (c3841i0.m4572a(FlashTooSlowQuirk.class, z6)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (c3841i0.m4572a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) c0703j.m1476a(key2);
            if (c3841i0.m4572a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) c0703j.m1476a(key2);
            if (c3841i0.m4572a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) c0703j.m1476a(key2);
            if (c3841i0.m4572a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List list3 = ImageCaptureFlashNotFireQuirk.f32322a;
            String str5 = Build.MODEL;
            Locale locale2 = Locale.US;
            if (c3841i0.m4572a(ImageCaptureFlashNotFireQuirk.class, (ImageCaptureFlashNotFireQuirk.f32323b.contains(str5.toLowerCase(locale2)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.f32322a.contains(str5.toLowerCase(locale2)))) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            List list4 = ImageCaptureWithFlashUnderexposureQuirk.f32326a;
            if (c3841i0.m4572a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f32326a.contains(str5.toLowerCase(locale2)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            List list5 = ImageCaptureFailWithAutoFlashQuirk.f32320a;
            if (c3841i0.m4572a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f32320a.contains(str5.toLowerCase(locale2)) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) c0703j.m1476a(key2);
            if (c3841i0.m4572a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.f32335b.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
                        if (((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                break;
            }
            if (c3841i0.m4572a(TorchFlashRequiredFor3aUpdateQuirk.class, z10)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c0703j));
            }
            String str6 = Build.MANUFACTURER;
            if (c3841i0.m4572a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str6) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str6) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (c3841i0.m4572a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str6))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            String str7 = Build.BRAND;
            if (("blu".equalsIgnoreCase(str7) && "studio x10".equalsIgnoreCase(Build.MODEL)) || (("itel".equalsIgnoreCase(str7) && "itel w6004".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str7) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) || ("positivo".equalsIgnoreCase(str7) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))))) {
                z11 = true;
            } else {
                String str8 = Build.MODEL;
                if (("pixel 4 xl".equalsIgnoreCase(str8) && Build.VERSION.SDK_INT == 29) || ("motorola".equalsIgnoreCase(str7) && "moto e13".equalsIgnoreCase(str8))) {
                    z11 = true;
                } else {
                    if ("samsung".equalsIgnoreCase(str7)) {
                        String str9 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str9) || "gta8wifi".equalsIgnoreCase(str9)) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
            }
            if (c3841i0.m4572a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z11)) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            String str10 = Build.MODEL;
            if (c3841i0.m4572a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str10) && ((Integer) c0703j.m1476a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            HashSet hashSet3 = ImageCaptureFailedForVideoSnapshotQuirk.f32321a;
            Locale locale3 = Locale.US;
            if (!hashSet3.contains(str10.toLowerCase(locale3)) && (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
                String str11 = Build.HARDWARE;
                if (!str11.toLowerCase(locale3).startsWith("ums") && ((!"itel".equalsIgnoreCase(str7) || !str11.toLowerCase(locale3).startsWith("sp")) && (!"HUAWEI".equalsIgnoreCase(str7) || !"FIG-LX1".equalsIgnoreCase(str10)))) {
                    z12 = false;
                }
            }
            if (c3841i0.m4572a(ImageCaptureFailedForVideoSnapshotQuirk.class, z12)) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            C3847l0 c3847l0 = new C3847l0(arrayList);
            AbstractC8072d6.m8486c("CameraQuirks", "camera2 CameraQuirks = " + C3847l0.m4573j(c3847l0));
            return c3847l0;
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8447c(BroadcastReceiver broadcastReceiver, InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n) {
        C2925c c2925cM1174c = AbstractC0575H.m1174c(AbstractC5695b.m6138e(AbstractC0575H.m1176e(), interfaceC18776i));
        AbstractC0575H.m1156D(c2925cM1174c, null, null, new C11562A(interfaceC1439n, c2925cM1174c, broadcastReceiver.goAsync(), null), 3);
    }
}
