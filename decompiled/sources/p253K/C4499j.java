package p253K;

import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import p001A.AbstractC0010F;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: K.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4499j {

    /* JADX INFO: renamed from: c */
    public static final C4501l[] f14676c;

    /* JADX INFO: renamed from: d */
    public static final C4501l[][] f14677d;

    /* JADX INFO: renamed from: e */
    public static final HashSet f14678e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f14679a;

    /* JADX INFO: renamed from: b */
    public final ByteOrder f14680b;

    public C4499j(ByteOrder byteOrder, ArrayList arrayList) {
        AbstractC4941g.m5559R("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f14680b = byteOrder;
        this.f14679a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final Map m5237a(int i10) {
        AbstractC4941g.m5556O(AbstractC0010F.m19c(i10, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), i10, 0, 4);
        return (Map) this.f14679a.get(i10);
    }

    static {
        C4501l[] c4501lArr = {new C4501l("ImageWidth", 256, 3, 4), new C4501l("ImageLength", 257, 3, 4), new C4501l("Make", 271, 2), new C4501l("Model", 272, 2), new C4501l("Orientation", 274, 3), new C4501l("XResolution", 282, 5), new C4501l("YResolution", 283, 5), new C4501l("ResolutionUnit", 296, 3), new C4501l("Software", 305, 2), new C4501l("DateTime", 306, 2), new C4501l("YCbCrPositioning", 531, 3), new C4501l("SubIFDPointer", 330, 4), new C4501l("ExifIFDPointer", 34665, 4), new C4501l("GPSInfoIFDPointer", 34853, 4)};
        C4501l[] c4501lArr2 = {new C4501l("ExposureTime", 33434, 5), new C4501l("FNumber", 33437, 5), new C4501l("ExposureProgram", 34850, 3), new C4501l("PhotographicSensitivity", 34855, 3), new C4501l("SensitivityType", 34864, 3), new C4501l("ExifVersion", 36864, 2), new C4501l("DateTimeOriginal", 36867, 2), new C4501l("DateTimeDigitized", 36868, 2), new C4501l("ComponentsConfiguration", 37121, 7), new C4501l("ShutterSpeedValue", 37377, 10), new C4501l("ApertureValue", 37378, 5), new C4501l("BrightnessValue", 37379, 10), new C4501l("ExposureBiasValue", 37380, 10), new C4501l("MaxApertureValue", 37381, 5), new C4501l("MeteringMode", 37383, 3), new C4501l(YladLSetV.rQAVI, 37384, 3), new C4501l("Flash", 37385, 3), new C4501l("FocalLength", 37386, 5), new C4501l("SubSecTime", 37520, 2), new C4501l("SubSecTimeOriginal", 37521, 2), new C4501l("SubSecTimeDigitized", 37522, 2), new C4501l("FlashpixVersion", 40960, 7), new C4501l("ColorSpace", 40961, 3), new C4501l("PixelXDimension", 40962, 3, 4), new C4501l("PixelYDimension", 40963, 3, 4), new C4501l("InteroperabilityIFDPointer", 40965, 4), new C4501l("FocalPlaneResolutionUnit", 41488, 3), new C4501l("SensingMethod", 41495, 3), new C4501l("FileSource", 41728, 7), new C4501l("SceneType", 41729, 7), new C4501l("CustomRendered", 41985, 3), new C4501l("ExposureMode", 41986, 3), new C4501l("WhiteBalance", 41987, 3), new C4501l("SceneCaptureType", 41990, 3), new C4501l("Contrast", 41992, 3), new C4501l("Saturation", 41993, 3), new C4501l("Sharpness", 41994, 3)};
        C4501l[] c4501lArr3 = {new C4501l("GPSVersionID", 0, 1), new C4501l("GPSLatitudeRef", 1, 2), new C4501l("GPSLatitude", 2, 5, 10), new C4501l("GPSLongitudeRef", 3, 2), new C4501l("GPSLongitude", 4, 5, 10), new C4501l("GPSAltitudeRef", 5, 1), new C4501l("GPSAltitude", 6, 5), new C4501l("GPSTimeStamp", 7, 5), new C4501l("GPSSpeedRef", 12, 2), new C4501l("GPSTrackRef", 14, 2), new C4501l("GPSImgDirectionRef", 16, 2), new C4501l("GPSDestBearingRef", 23, 2), new C4501l("GPSDestDistanceRef", 25, 2)};
        f14676c = new C4501l[]{new C4501l("SubIFDPointer", 330, 4), new C4501l("ExifIFDPointer", 34665, 4), new C4501l("GPSInfoIFDPointer", 34853, 4), new C4501l("InteroperabilityIFDPointer", 40965, 4)};
        f14677d = new C4501l[][]{c4501lArr, c4501lArr2, c4501lArr3, new C4501l[]{new C4501l("InteroperabilityIndex", 1, 2)}};
        f14678e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }
}
