package p079D;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import livekit.org.webrtc.CameraXSession;
import p004A2.InterfaceC0310a;
import p178H.AbstractC3166q0;
import p228J.C3841i0;
import p228J.C3847l0;
import p228J.C3871x0;
import p348O.AbstractC5939a;
import p523V9.AbstractC8072d6;
import p608Z.AbstractC10131a;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1761a implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5031a;

    public /* synthetic */ C1761a(int i10) {
        this.f5031a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x031f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:186:0x038d  */
    /* JADX WARN: Code duplicated, block: B:250:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04df  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:266:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:268:0x050a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x050c  */
    /* JADX WARN: Code duplicated, block: B:270:0x050e  */
    /* JADX WARN: Code duplicated, block: B:274:0x0514  */
    @Override // p004A2.InterfaceC0310a
    public final void accept(Object obj) {
        boolean z6;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zContains;
        boolean z14;
        boolean z15;
        switch (this.f5031a) {
            case 0:
                C3841i0 c3841i0 = (C3841i0) obj;
                ArrayList arrayList = new ArrayList();
                List list = ImageCapturePixelHDRPlusQuirk.f32324a;
                String str2 = Build.MODEL;
                if (c3841i0.m4572a(ImageCapturePixelHDRPlusQuirk.class, list.contains(str2) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26)) {
                    arrayList.add(new ImageCapturePixelHDRPlusQuirk());
                }
                if (c3841i0.m4572a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.m11179c())) {
                    arrayList.add(new ExtraCroppingQuirk());
                }
                List list2 = Nexus4AndroidLTargetAspectRatioQuirk.f32332a;
                String str3 = Build.BRAND;
                "GOOGLE".equalsIgnoreCase(str3);
                if (c3841i0.m4572a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                if (c3841i0.m4572a(ExcludedSupportedSizesQuirk.class, ("OnePlus".equalsIgnoreCase(str3) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) || ("OnePlus".equalsIgnoreCase(str3) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) || (("HUAWEI".equalsIgnoreCase(str3) && "HWANE".equalsIgnoreCase(Build.DEVICE)) || ExcludedSupportedSizesQuirk.m11177c() || ExcludedSupportedSizesQuirk.m11176b() || ("REDMI".equalsIgnoreCase(str3) && "joyeuse".equalsIgnoreCase(Build.DEVICE))))) {
                    arrayList.add(new ExcludedSupportedSizesQuirk());
                }
                List list3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f32312a;
                Locale locale = Locale.US;
                if (c3841i0.m4572a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f32312a.contains(str2.toUpperCase(locale)))) {
                    arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                List list4 = PreviewPixelHDRnetQuirk.f32333a;
                String str4 = Build.MANUFACTURER;
                if ("Google".equals(str4)) {
                    if (PreviewPixelHDRnetQuirk.f32333a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (c3841i0.m4572a(PreviewPixelHDRnetQuirk.class, z6)) {
                    arrayList.add(new PreviewPixelHDRnetQuirk());
                }
                if (c3841i0.m4572a(StillCaptureFlashStopRepeatingQuirk.class, "SAMSUNG".equals(str4.toUpperCase(locale)) && str2.toUpperCase(locale).startsWith("SM-A716"))) {
                    arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                C3871x0 c3871x0 = ExtraSupportedSurfaceCombinationsQuirk.f32314a;
                String str5 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str5) || "heroqltetmo".equalsIgnoreCase(str5)) {
                    z10 = true;
                } else {
                    if ("google".equalsIgnoreCase(str3)) {
                        zContains = ExtraSupportedSurfaceCombinationsQuirk.f32316c.contains(str2.toUpperCase(locale));
                    } else {
                        zContains = false;
                    }
                    if (zContains || ExtraSupportedSurfaceCombinationsQuirk.m11180b()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c3841i0.m4572a(ExtraSupportedSurfaceCombinationsQuirk.class, z10)) {
                    arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                if (c3841i0.m4572a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.f32318a.contains(new Pair(str4.toLowerCase(locale), str2.toLowerCase(locale))))) {
                    arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (c3841i0.m4572a(RepeatingStreamConstraintForVideoRecordingQuirk.class, "Huawei".equalsIgnoreCase(str3) && "mha-l29".equalsIgnoreCase(str2))) {
                    arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                int i10 = Build.VERSION.SDK_INT;
                if (c3841i0.m4572a(TextureViewIsClosedQuirk.class, i10 <= 23)) {
                    arrayList.add(new TextureViewIsClosedQuirk());
                }
                if (c3841i0.m4572a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list5 = TorchIsClosedAfterImageCapturingQuirk.f32337a;
                if (c3841i0.m4572a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.f32337a.contains(str2.toLowerCase(locale)))) {
                    arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list6 = ZslDisablerQuirk.f32338a;
                if (c3841i0.m4572a(ZslDisablerQuirk.class, ("samsung".equalsIgnoreCase(str3) && ZslDisablerQuirk.m11181b(ZslDisablerQuirk.f32338a)) || ("xiaomi".equalsIgnoreCase(str3) && ZslDisablerQuirk.m11181b(ZslDisablerQuirk.f32339b)))) {
                    arrayList.add(new ZslDisablerQuirk());
                }
                if (c3841i0.m4572a(ExtraSupportedOutputSizeQuirk.class, "motorola".equalsIgnoreCase(str3) && "moto e5 play".equalsIgnoreCase(str2))) {
                    arrayList.add(new ExtraSupportedOutputSizeQuirk());
                }
                List list7 = InvalidVideoProfilesQuirk.f32327a;
                if (!"samsung".equalsIgnoreCase(str3) || !Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a")) {
                    Locale locale2 = Locale.ROOT;
                    if (InvalidVideoProfilesQuirk.f32327a.contains(str2.toLowerCase(locale2))) {
                        String str6 = Build.ID;
                        if (!str6.toLowerCase(locale2).startsWith("tp1a") && !str6.toLowerCase(locale2).startsWith("td1a")) {
                            if (!"redmi".equalsIgnoreCase(str3) || "xiaomi".equalsIgnoreCase(str3)) {
                                str = Build.ID;
                                if (str.toLowerCase(locale2).startsWith("tkq1") && !str.toLowerCase(locale2).startsWith("tp1a")) {
                                    if (InvalidVideoProfilesQuirk.f32328b.contains(str2.toLowerCase(locale2))) {
                                        if (i10 == 33) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            if (InvalidVideoProfilesQuirk.f32329c.contains(str2.toLowerCase(locale2))) {
                                                if (i10 == 33) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                }
                                            }
                                        }
                                    } else {
                                        if (InvalidVideoProfilesQuirk.f32329c.contains(str2.toLowerCase(locale2))) {
                                            if (i10 == 33) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z13 = z11;
                                        }
                                    }
                                }
                            } else {
                                if (InvalidVideoProfilesQuirk.f32328b.contains(str2.toLowerCase(locale2))) {
                                    if (InvalidVideoProfilesQuirk.f32329c.contains(str2.toLowerCase(locale2))) {
                                        if (i10 == 33) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                        }
                                    }
                                } else {
                                    if (i10 == 33) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        if (InvalidVideoProfilesQuirk.f32329c.contains(str2.toLowerCase(locale2))) {
                                            if (i10 == 33) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ("redmi".equalsIgnoreCase(str3)) {
                            str = Build.ID;
                            if (str.toLowerCase(locale2).startsWith("tkq1")) {
                            }
                        } else {
                            str = Build.ID;
                            if (str.toLowerCase(locale2).startsWith("tkq1")) {
                            }
                        }
                    }
                }
                if (c3841i0.m4572a(InvalidVideoProfilesQuirk.class, z13)) {
                    arrayList.add(new InvalidVideoProfilesQuirk());
                }
                if (c3841i0.m4572a(Preview3AThreadCrashQuirk.class, "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE))) {
                    arrayList.add(new Preview3AThreadCrashQuirk());
                }
                if (c3841i0.m4572a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.f32334a.containsKey(str2.toUpperCase(locale)))) {
                    arrayList.add(new SmallDisplaySizeQuirk());
                }
                if (c3841i0.m4572a(CaptureSessionShouldUseMrirQuirk.class, "google".equalsIgnoreCase(str3) && i10 >= 35)) {
                    arrayList.add(new CaptureSessionShouldUseMrirQuirk());
                }
                AbstractC1762b.f5032a = new C3847l0(arrayList);
                AbstractC8072d6.m8486c("DeviceQuirks", "camera2 DeviceQuirks = " + C3847l0.m4573j(AbstractC1762b.f5032a));
                break;
            case 1:
                C3841i0 c3841i1 = (C3841i0) obj;
                ArrayList arrayList2 = new ArrayList();
                String str7 = Build.BRAND;
                if (("HUAWEI".equalsIgnoreCase(str7) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str7) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                    z14 = true;
                } else {
                    String str8 = Build.FINGERPRINT;
                    if (!str8.startsWith("generic") && !str8.startsWith("unknown")) {
                        String str9 = Build.MODEL;
                        if (!str9.contains("google_sdk") && !str9.contains("Emulator") && !str9.contains("Cuttlefish") && !str9.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str7.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                            Build.HARDWARE.contains("ranchu");
                        }
                    }
                    z14 = false;
                }
                if (c3841i1.m4572a(ImageCaptureRotationOptionQuirk.class, z14)) {
                    arrayList2.add(new ImageCaptureRotationOptionQuirk());
                }
                if (c3841i1.m4572a(SurfaceOrderQuirk.class, true)) {
                    arrayList2.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.f32341a;
                Locale locale3 = Locale.US;
                String upperCase = str7.toUpperCase(locale3);
                String str10 = Build.MODEL;
                if (c3841i1.m4572a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.f32341a.contains(Pair.create(upperCase, str10.toUpperCase(locale3))))) {
                    arrayList2.add(new CaptureFailedRetryQuirk());
                }
                if (c3841i1.m4572a(LowMemoryQuirk.class, LowMemoryQuirk.f32345a.contains(str10.toUpperCase(locale3)))) {
                    arrayList2.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.f32343a;
                if (c3841i1.m4572a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str7) || LargeJpegImageQuirk.m11192b())) {
                    arrayList2.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.f32342a;
                if (c3841i1.m4572a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str7) && IncorrectJpegMetadataQuirk.f32342a.contains(Build.DEVICE.toUpperCase(locale3)))) {
                    arrayList2.add(new IncorrectJpegMetadataQuirk());
                }
                AbstractC5939a.f19323a = new C3847l0(arrayList2);
                AbstractC8072d6.m8486c("DeviceQuirks", "core DeviceQuirks = " + C3847l0.m4573j(AbstractC5939a.f19323a));
                break;
            case 2:
                C3841i0 c3841i2 = (C3841i0) obj;
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str11 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str11)) {
                        String str12 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str12) && !"Q2Q".equalsIgnoreCase(str12)) {
                            if (("OPPO".equalsIgnoreCase(str11) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str11) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                                z15 = false;
                            }
                        }
                        z15 = true;
                    } else if ("OPPO".equalsIgnoreCase(str11)) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                if (c3841i2.m4572a(SurfaceViewStretchedQuirk.class, z15)) {
                    arrayList3.add(new SurfaceViewStretchedQuirk());
                }
                if (c3841i2.m4572a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                AbstractC10131a.f30036a = new C3847l0(arrayList3);
                AbstractC8072d6.m8486c("DeviceQuirks", "view DeviceQuirks = " + C3847l0.m4573j(AbstractC10131a.f30036a));
                break;
            default:
                CameraXSession.openCamera$lambda$12$lambda$6$lambda$5$lambda$4((AbstractC3166q0) obj);
                break;
        }
    }
}
