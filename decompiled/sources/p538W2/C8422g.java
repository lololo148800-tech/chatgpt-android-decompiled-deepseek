package p538W2;

import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p001A.AbstractC0010F;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p253K.C4492c;
import p279L1.VOxZ.sVoFrD;
import p315Me.Myis.CxcULo;
import p509Uk.lpqL.SfpOlmlMATQ;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p594Y9.AbstractC9936n3;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: renamed from: W2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8422g {

    /* JADX INFO: renamed from: U */
    public static final C8419d f26201U;

    /* JADX INFO: renamed from: V */
    public static final C8419d[][] f26202V;

    /* JADX INFO: renamed from: W */
    public static final C8419d[] f26203W;

    /* JADX INFO: renamed from: X */
    public static final HashMap[] f26204X;

    /* JADX INFO: renamed from: Y */
    public static final HashMap[] f26205Y;

    /* JADX INFO: renamed from: Z */
    public static final HashSet f26206Z;

    /* JADX INFO: renamed from: a0 */
    public static final HashMap f26207a0;

    /* JADX INFO: renamed from: b0 */
    public static final Charset f26208b0;

    /* JADX INFO: renamed from: c0 */
    public static final byte[] f26209c0;

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f26210d0;

    /* JADX INFO: renamed from: e0 */
    public static final Pattern f26211e0;

    /* JADX INFO: renamed from: f0 */
    public static final Pattern f26212f0;

    /* JADX INFO: renamed from: g0 */
    public static final Pattern f26213g0;

    /* JADX INFO: renamed from: a */
    public final String f26221a;

    /* JADX INFO: renamed from: b */
    public final FileDescriptor f26222b;

    /* JADX INFO: renamed from: c */
    public final AssetManager.AssetInputStream f26223c;

    /* JADX INFO: renamed from: d */
    public int f26224d;

    /* JADX INFO: renamed from: e */
    public final HashMap[] f26225e;

    /* JADX INFO: renamed from: f */
    public final HashSet f26226f;

    /* JADX INFO: renamed from: g */
    public ByteOrder f26227g;

    /* JADX INFO: renamed from: h */
    public boolean f26228h;

    /* JADX INFO: renamed from: i */
    public boolean f26229i;

    /* JADX INFO: renamed from: j */
    public boolean f26230j;

    /* JADX INFO: renamed from: k */
    public int f26231k;

    /* JADX INFO: renamed from: l */
    public int f26232l;

    /* JADX INFO: renamed from: m */
    public byte[] f26233m;

    /* JADX INFO: renamed from: n */
    public int f26234n;

    /* JADX INFO: renamed from: o */
    public int f26235o;

    /* JADX INFO: renamed from: p */
    public int f26236p;

    /* JADX INFO: renamed from: q */
    public int f26237q;

    /* JADX INFO: renamed from: r */
    public int f26238r;

    /* JADX INFO: renamed from: s */
    public boolean f26239s;

    /* JADX INFO: renamed from: t */
    public static final boolean f26214t = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: u */
    public static final List f26215u = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: v */
    public static final List f26216v = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: w */
    public static final int[] f26217w = {8, 8, 8};

    /* JADX INFO: renamed from: x */
    public static final int[] f26218x = {8};

    /* JADX INFO: renamed from: y */
    public static final byte[] f26219y = {-1, -40, -1};

    /* JADX INFO: renamed from: z */
    public static final byte[] f26220z = {102, 116, 121, 112};

    /* JADX INFO: renamed from: A */
    public static final byte[] f26181A = {109, 105, 102, 49};

    /* JADX INFO: renamed from: B */
    public static final byte[] f26182B = {104, 101, 105, 99};

    /* JADX INFO: renamed from: C */
    public static final byte[] f26183C = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: D */
    public static final byte[] f26184D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: E */
    public static final byte[] f26185E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: F */
    public static final byte[] f26186F = {101, 88, 73, 102};

    /* JADX INFO: renamed from: G */
    public static final byte[] f26187G = {73, 72, 68, 82};

    /* JADX INFO: renamed from: H */
    public static final byte[] f26188H = {73, 69, 78, 68};

    /* JADX INFO: renamed from: I */
    public static final byte[] f26189I = {82, 73, 70, 70};

    /* JADX INFO: renamed from: J */
    public static final byte[] f26190J = {87, 69, 66, 80};

    /* JADX INFO: renamed from: K */
    public static final byte[] f26191K = {69, 88, 73, 70};

    /* JADX INFO: renamed from: L */
    public static final byte[] f26192L = {-99, 1, 42};

    /* JADX INFO: renamed from: M */
    public static final byte[] f26193M = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: N */
    public static final byte[] f26194N = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: O */
    public static final byte[] f26195O = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P */
    public static final byte[] f26196P = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q */
    public static final byte[] f26197Q = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R */
    public static final String[] f26198R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: S */
    public static final int[] f26199S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: T */
    public static final byte[] f26200T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C8419d[] c8419dArr = {new C8419d("NewSubfileType", 254, 4), new C8419d("SubfileType", 255, 4), new C8419d("ImageWidth", 256, 3, 4), new C8419d("ImageLength", 257, 3, 4), new C8419d("BitsPerSample", 258, 3), new C8419d("Compression", 259, 3), new C8419d("PhotometricInterpretation", 262, 3), new C8419d("ImageDescription", 270, 2), new C8419d("Make", 271, 2), new C8419d("Model", 272, 2), new C8419d("StripOffsets", 273, 3, 4), new C8419d("Orientation", 274, 3), new C8419d("SamplesPerPixel", 277, 3), new C8419d("RowsPerStrip", 278, 3, 4), new C8419d("StripByteCounts", 279, 3, 4), new C8419d("XResolution", 282, 5), new C8419d("YResolution", 283, 5), new C8419d("PlanarConfiguration", 284, 3), new C8419d("ResolutionUnit", 296, 3), new C8419d("TransferFunction", 301, 3), new C8419d("Software", 305, 2), new C8419d("DateTime", 306, 2), new C8419d("Artist", 315, 2), new C8419d("WhitePoint", 318, 5), new C8419d("PrimaryChromaticities", 319, 5), new C8419d("SubIFDPointer", 330, 4), new C8419d("JPEGInterchangeFormat", 513, 4), new C8419d("JPEGInterchangeFormatLength", 514, 4), new C8419d("YCbCrCoefficients", 529, 5), new C8419d("YCbCrSubSampling", 530, 3), new C8419d("YCbCrPositioning", 531, 3), new C8419d("ReferenceBlackWhite", 532, 5), new C8419d("Copyright", 33432, 2), new C8419d("ExifIFDPointer", 34665, 4), new C8419d("GPSInfoIFDPointer", 34853, 4), new C8419d("SensorTopBorder", 4, 4), new C8419d("SensorLeftBorder", 5, 4), new C8419d("SensorBottomBorder", 6, 4), new C8419d("SensorRightBorder", 7, 4), new C8419d("ISO", 23, 3), new C8419d("JpgFromRaw", 46, 7), new C8419d("Xmp", 700, 1)};
        C8419d[] c8419dArr2 = {new C8419d("ExposureTime", 33434, 5), new C8419d("FNumber", 33437, 5), new C8419d("ExposureProgram", 34850, 3), new C8419d("SpectralSensitivity", 34852, 2), new C8419d("PhotographicSensitivity", 34855, 3), new C8419d("OECF", 34856, 7), new C8419d("SensitivityType", 34864, 3), new C8419d("StandardOutputSensitivity", 34865, 4), new C8419d("RecommendedExposureIndex", 34866, 4), new C8419d(QzvfuIgrngtl.fRwxzO, 34867, 4), new C8419d("ISOSpeedLatitudeyyy", 34868, 4), new C8419d("ISOSpeedLatitudezzz", 34869, 4), new C8419d("ExifVersion", 36864, 2), new C8419d("DateTimeOriginal", 36867, 2), new C8419d("DateTimeDigitized", 36868, 2), new C8419d("OffsetTime", 36880, 2), new C8419d("OffsetTimeOriginal", 36881, 2), new C8419d("OffsetTimeDigitized", 36882, 2), new C8419d("ComponentsConfiguration", 37121, 7), new C8419d("CompressedBitsPerPixel", 37122, 5), new C8419d("ShutterSpeedValue", 37377, 10), new C8419d("ApertureValue", 37378, 5), new C8419d("BrightnessValue", 37379, 10), new C8419d("ExposureBiasValue", 37380, 10), new C8419d("MaxApertureValue", 37381, 5), new C8419d("SubjectDistance", 37382, 5), new C8419d("MeteringMode", 37383, 3), new C8419d("LightSource", 37384, 3), new C8419d("Flash", 37385, 3), new C8419d("FocalLength", 37386, 5), new C8419d("SubjectArea", 37396, 3), new C8419d("MakerNote", 37500, 7), new C8419d("UserComment", 37510, 7), new C8419d("SubSecTime", 37520, 2), new C8419d("SubSecTimeOriginal", 37521, 2), new C8419d("SubSecTimeDigitized", 37522, 2), new C8419d("FlashpixVersion", 40960, 7), new C8419d("ColorSpace", 40961, 3), new C8419d("PixelXDimension", 40962, 3, 4), new C8419d("PixelYDimension", 40963, 3, 4), new C8419d("RelatedSoundFile", 40964, 2), new C8419d("InteroperabilityIFDPointer", 40965, 4), new C8419d("FlashEnergy", 41483, 5), new C8419d("SpatialFrequencyResponse", 41484, 7), new C8419d("FocalPlaneXResolution", 41486, 5), new C8419d("FocalPlaneYResolution", 41487, 5), new C8419d("FocalPlaneResolutionUnit", 41488, 3), new C8419d("SubjectLocation", 41492, 3), new C8419d("ExposureIndex", 41493, 5), new C8419d("SensingMethod", 41495, 3), new C8419d("FileSource", 41728, 7), new C8419d("SceneType", 41729, 7), new C8419d("CFAPattern", 41730, 7), new C8419d("CustomRendered", 41985, 3), new C8419d("ExposureMode", 41986, 3), new C8419d("WhiteBalance", 41987, 3), new C8419d("DigitalZoomRatio", 41988, 5), new C8419d("FocalLengthIn35mmFilm", 41989, 3), new C8419d("SceneCaptureType", 41990, 3), new C8419d("GainControl", 41991, 3), new C8419d("Contrast", 41992, 3), new C8419d("Saturation", 41993, 3), new C8419d("Sharpness", 41994, 3), new C8419d("DeviceSettingDescription", 41995, 7), new C8419d(sVoFrD.CnsqySXMG, 41996, 3), new C8419d("ImageUniqueID", 42016, 2), new C8419d("CameraOwnerName", 42032, 2), new C8419d("BodySerialNumber", 42033, 2), new C8419d("LensSpecification", 42034, 5), new C8419d("LensMake", 42035, 2), new C8419d("LensModel", 42036, 2), new C8419d("Gamma", 42240, 5), new C8419d("DNGVersion", 50706, 1), new C8419d("DefaultCropSize", 50720, 3, 4)};
        C8419d[] c8419dArr3 = {new C8419d("GPSVersionID", 0, 1), new C8419d("GPSLatitudeRef", 1, 2), new C8419d("GPSLatitude", 2, 5, 10), new C8419d("GPSLongitudeRef", 3, 2), new C8419d("GPSLongitude", 4, 5, 10), new C8419d("GPSAltitudeRef", 5, 1), new C8419d("GPSAltitude", 6, 5), new C8419d("GPSTimeStamp", 7, 5), new C8419d("GPSSatellites", 8, 2), new C8419d("GPSStatus", 9, 2), new C8419d("GPSMeasureMode", 10, 2), new C8419d("GPSDOP", 11, 5), new C8419d("GPSSpeedRef", 12, 2), new C8419d("GPSSpeed", 13, 5), new C8419d("GPSTrackRef", 14, 2), new C8419d("GPSTrack", 15, 5), new C8419d("GPSImgDirectionRef", 16, 2), new C8419d("GPSImgDirection", 17, 5), new C8419d("GPSMapDatum", 18, 2), new C8419d("GPSDestLatitudeRef", 19, 2), new C8419d("GPSDestLatitude", 20, 5), new C8419d("GPSDestLongitudeRef", 21, 2), new C8419d("GPSDestLongitude", 22, 5), new C8419d("GPSDestBearingRef", 23, 2), new C8419d("GPSDestBearing", 24, 5), new C8419d("GPSDestDistanceRef", 25, 2), new C8419d("GPSDestDistance", 26, 5), new C8419d("GPSProcessingMethod", 27, 7), new C8419d("GPSAreaInformation", 28, 7), new C8419d("GPSDateStamp", 29, 2), new C8419d("GPSDifferential", 30, 3), new C8419d("GPSHPositioningError", 31, 5)};
        C8419d[] c8419dArr4 = {new C8419d("InteroperabilityIndex", 1, 2)};
        C8419d[] c8419dArr5 = {new C8419d("NewSubfileType", 254, 4), new C8419d("SubfileType", 255, 4), new C8419d("ThumbnailImageWidth", 256, 3, 4), new C8419d("ThumbnailImageLength", 257, 3, 4), new C8419d("BitsPerSample", 258, 3), new C8419d("Compression", 259, 3), new C8419d("PhotometricInterpretation", 262, 3), new C8419d("ImageDescription", 270, 2), new C8419d("Make", 271, 2), new C8419d("Model", 272, 2), new C8419d("StripOffsets", 273, 3, 4), new C8419d("ThumbnailOrientation", 274, 3), new C8419d("SamplesPerPixel", 277, 3), new C8419d("RowsPerStrip", 278, 3, 4), new C8419d("StripByteCounts", 279, 3, 4), new C8419d("XResolution", 282, 5), new C8419d("YResolution", 283, 5), new C8419d("PlanarConfiguration", 284, 3), new C8419d("ResolutionUnit", 296, 3), new C8419d("TransferFunction", 301, 3), new C8419d("Software", 305, 2), new C8419d("DateTime", 306, 2), new C8419d("Artist", 315, 2), new C8419d("WhitePoint", 318, 5), new C8419d("PrimaryChromaticities", 319, 5), new C8419d("SubIFDPointer", 330, 4), new C8419d("JPEGInterchangeFormat", 513, 4), new C8419d("JPEGInterchangeFormatLength", 514, 4), new C8419d("YCbCrCoefficients", 529, 5), new C8419d("YCbCrSubSampling", 530, 3), new C8419d(SfpOlmlMATQ.FvFUBuwqee, 531, 3), new C8419d("ReferenceBlackWhite", 532, 5), new C8419d("Copyright", 33432, 2), new C8419d("ExifIFDPointer", 34665, 4), new C8419d("GPSInfoIFDPointer", 34853, 4), new C8419d("DNGVersion", 50706, 1), new C8419d("DefaultCropSize", 50720, 3, 4)};
        f26201U = new C8419d("StripOffsets", 273, 3);
        f26202V = new C8419d[][]{c8419dArr, c8419dArr2, c8419dArr3, c8419dArr4, c8419dArr5, c8419dArr, new C8419d[]{new C8419d("ThumbnailImage", 256, 7), new C8419d("CameraSettingsIFDPointer", 8224, 4), new C8419d("ImageProcessingIFDPointer", 8256, 4)}, new C8419d[]{new C8419d("PreviewImageStart", 257, 4), new C8419d("PreviewImageLength", 258, 4)}, new C8419d[]{new C8419d("AspectFrame", 4371, 3)}, new C8419d[]{new C8419d("ColorSpace", 55, 3)}};
        f26203W = new C8419d[]{new C8419d("SubIFDPointer", 330, 4), new C8419d("ExifIFDPointer", 34665, 4), new C8419d("GPSInfoIFDPointer", 34853, 4), new C8419d("InteroperabilityIFDPointer", 40965, 4), new C8419d("CameraSettingsIFDPointer", 8224, 1), new C8419d("ImageProcessingIFDPointer", 8256, 1)};
        f26204X = new HashMap[10];
        f26205Y = new HashMap[10];
        f26206Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f26207a0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f26208b0 = charsetForName;
        f26209c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f26210d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            C8419d[][] c8419dArr6 = f26202V;
            if (i10 >= c8419dArr6.length) {
                HashMap map = f26207a0;
                C8419d[] c8419dArr7 = f26203W;
                map.put(Integer.valueOf(c8419dArr7[0].f26175a), 5);
                map.put(Integer.valueOf(c8419dArr7[1].f26175a), 1);
                map.put(Integer.valueOf(c8419dArr7[2].f26175a), 2);
                map.put(Integer.valueOf(c8419dArr7[3].f26175a), 3);
                map.put(Integer.valueOf(c8419dArr7[4].f26175a), 7);
                map.put(Integer.valueOf(c8419dArr7[5].f26175a), 8);
                Pattern.compile(".*[1-9].*");
                f26211e0 = Pattern.compile(MMVKXkcLpuHFDi.qwCMYj);
                f26212f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f26213g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f26204X[i10] = new HashMap();
            f26205Y[i10] = new HashMap();
            for (C8419d c8419d : c8419dArr6[i10]) {
                f26204X[i10].put(Integer.valueOf(c8419d.f26175a), c8419d);
                f26205Y[i10].put(c8419d.f26176b, c8419d);
            }
            i10++;
        }
    }

    public C8422g(String str) throws Throwable {
        Throwable th2;
        C15378c c15378cM9494e;
        boolean z6;
        C8419d[][] c8419dArr = f26202V;
        this.f26225e = new HashMap[c8419dArr.length];
        this.f26226f = new HashSet(c8419dArr.length);
        this.f26227g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.f26223c = null;
        this.f26221a = str;
        try {
            c15378cM9494e = AbstractC8746y3.m9494e(new FileInputStream(str), str);
            try {
                try {
                    AbstractC8423h.m9025c(c15378cM9494e.getFD(), 0L, OsConstants.SEEK_CUR);
                    z6 = true;
                } catch (Exception unused) {
                    if (f26214t) {
                        Log.d(YladLSetV.aiy, "The file descriptor for the given input is not seekable");
                    }
                    z6 = false;
                }
                if (z6) {
                    this.f26222b = c15378cM9494e.getFD();
                } else {
                    this.f26222b = null;
                }
                m9017t(c15378cM9494e);
                AbstractC9936n3.m10593a(c15378cM9494e);
            } catch (Throwable th3) {
                th2 = th3;
                AbstractC9936n3.m10593a(c15378cM9494e);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            c15378cM9494e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static double m8986b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(Separators.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split(Separators.SLASH, -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(Separators.SLASH, -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(Separators.SLASH, -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals(TokenNames.f32018S) && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals(TokenNames.f32010E)) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: q */
    public static Pair m8987q(String str) {
        if (str.contains(Separators.COMMA)) {
            String[] strArrSplit = str.split(Separators.COMMA, -1);
            Pair pairM8987q = m8987q(strArrSplit[0]);
            if (((Integer) pairM8987q.first).intValue() == 2) {
                return pairM8987q;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair pairM8987q2 = m8987q(strArrSplit[i10]);
                int iIntValue = (((Integer) pairM8987q2.first).equals(pairM8987q.first) || ((Integer) pairM8987q2.second).equals(pairM8987q.first)) ? ((Integer) pairM8987q.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM8987q.second).intValue() == -1 || !(((Integer) pairM8987q2.first).equals(pairM8987q.second) || ((Integer) pairM8987q2.second).equals(pairM8987q.second))) ? -1 : ((Integer) pairM8987q.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM8987q = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM8987q = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM8987q;
        }
        if (!str.contains(Separators.SLASH)) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > 65535) {
                        return j10 < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(Separators.SLASH, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX INFO: renamed from: w */
    public static ByteOrder m8988w(C8417b c8417b) throws IOException {
        short s10 = c8417b.readShort();
        boolean z6 = f26214t;
        if (s10 == 18761) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    /* JADX INFO: renamed from: A */
    public final void m8989A(int i10, String str, String str2) {
        HashMap[] mapArr = this.f26225e;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0116 A[Catch: all -> 0x012a, Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:79:0x0109, B:81:0x0116, B:88:0x013a, B:87:0x012e), top: B:113:0x0109, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x012e A[Catch: all -> 0x012a, Exception -> 0x012c, TryCatch #1 {Exception -> 0x012c, blocks: (B:79:0x0109, B:81:0x0116, B:88:0x013a, B:87:0x012e), top: B:113:0x0109, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    /* JADX INFO: renamed from: B */
    public final void m8990B() throws Throwable {
        C15379d c15379dM9509d;
        InputStream inputStreamM9493d;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        C15379d c15379dM9510e;
        C15379d c15379dM9511f;
        int i10 = this.f26224d;
        if (i10 != 4 && i10 != 13 && i10 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f26222b == null && this.f26221a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f26228h && this.f26229i && !this.f26230j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i11 = this.f26234n;
        InputStream inputStreamM9492c = null;
        this.f26233m = (i11 == 6 || i11 == 7) ? m9013o() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.f26221a != null) {
                String str = this.f26221a;
                inputStreamM9493d = AbstractC8746y3.m9494e(new FileInputStream(str), str);
            } else {
                AbstractC8423h.m9025c(this.f26222b, 0L, OsConstants.SEEK_SET);
                FileDescriptor fileDescriptor = this.f26222b;
                inputStreamM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptor), fileDescriptor);
            }
            try {
                c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                try {
                    AbstractC9936n3.m10596d(inputStreamM9493d, c15379dM9509d);
                    AbstractC9936n3.m10593a(inputStreamM9493d);
                    AbstractC9936n3.m10593a(c15379dM9509d);
                    boolean z6 = false;
                    try {
                        try {
                            try {
                                InputStream inputStreamM9492c2 = AbstractC8746y3.m9492c(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                try {
                                    if (this.f26221a != null) {
                                        String str2 = this.f26221a;
                                        c15379dM9510e = AbstractC8752z3.m9511f(new FileOutputStream(str2), str2);
                                    } else {
                                        AbstractC8423h.m9025c(this.f26222b, 0L, OsConstants.SEEK_SET);
                                        FileDescriptor fileDescriptor2 = this.f26222b;
                                        c15379dM9510e = AbstractC8752z3.m9510e(new FileOutputStream(fileDescriptor2), fileDescriptor2);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(inputStreamM9492c2);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(c15379dM9510e);
                                            try {
                                                int i12 = this.f26224d;
                                                if (i12 == 4) {
                                                    m8991C(bufferedInputStream, bufferedOutputStream);
                                                } else if (i12 == 13) {
                                                    m8992D(bufferedInputStream, bufferedOutputStream);
                                                } else if (i12 == 14) {
                                                    m8993E(bufferedInputStream, bufferedOutputStream);
                                                }
                                                AbstractC9936n3.m10593a(bufferedInputStream);
                                                AbstractC9936n3.m10593a(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f26233m = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                inputStreamM9492c = inputStreamM9492c2;
                                                try {
                                                    try {
                                                        inputStreamM9492c = AbstractC8746y3.m9492c(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                                        if (this.f26221a == null) {
                                                            AbstractC8423h.m9025c(this.f26222b, 0L, OsConstants.SEEK_SET);
                                                            FileDescriptor fileDescriptor3 = this.f26222b;
                                                            c15379dM9511f = AbstractC8752z3.m9510e(new FileOutputStream(fileDescriptor3), fileDescriptor3);
                                                        } else {
                                                            String str3 = this.f26221a;
                                                            c15379dM9511f = AbstractC8752z3.m9511f(new FileOutputStream(str3), str3);
                                                        }
                                                        c15379dM9510e = c15379dM9511f;
                                                        AbstractC9936n3.m10596d(inputStreamM9492c, c15379dM9510e);
                                                        AbstractC9936n3.m10593a(inputStreamM9492c);
                                                        AbstractC9936n3.m10593a(c15379dM9510e);
                                                        throw new IOException("Failed to save new file", e);
                                                    } catch (Exception e11) {
                                                        z6 = true;
                                                        throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e11);
                                                    }
                                                } catch (Throwable th2) {
                                                    AbstractC9936n3.m10593a(inputStreamM9492c);
                                                    AbstractC9936n3.m10593a(c15379dM9510e);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            bufferedOutputStream = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedOutputStream = null;
                                            inputStreamM9492c = bufferedInputStream;
                                            AbstractC9936n3.m10593a(inputStreamM9492c);
                                            AbstractC9936n3.m10593a(bufferedOutputStream);
                                            if (!z6) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        bufferedInputStream = null;
                                        bufferedOutputStream = bufferedInputStream;
                                        inputStreamM9492c = inputStreamM9492c2;
                                        inputStreamM9492c = AbstractC8746y3.m9492c(fileCreateTempFile, new FileInputStream(fileCreateTempFile));
                                        if (this.f26221a == null) {
                                            AbstractC8423h.m9025c(this.f26222b, 0L, OsConstants.SEEK_SET);
                                            FileDescriptor fileDescriptor4 = this.f26222b;
                                            c15379dM9511f = AbstractC8752z3.m9510e(new FileOutputStream(fileDescriptor4), fileDescriptor4);
                                        } else {
                                            String str4 = this.f26221a;
                                            c15379dM9511f = AbstractC8752z3.m9511f(new FileOutputStream(str4), str4);
                                        }
                                        c15379dM9510e = c15379dM9511f;
                                        AbstractC9936n3.m10596d(inputStreamM9492c, c15379dM9510e);
                                        AbstractC9936n3.m10593a(inputStreamM9492c);
                                        AbstractC9936n3.m10593a(c15379dM9510e);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    c15379dM9510e = null;
                                    bufferedInputStream = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedOutputStream = null;
                                AbstractC9936n3.m10593a(inputStreamM9492c);
                                AbstractC9936n3.m10593a(bufferedOutputStream);
                                if (!z6) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            c15379dM9510e = null;
                            bufferedInputStream = null;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamM9492c = bufferedInputStream;
                        AbstractC9936n3.m10593a(inputStreamM9492c);
                        AbstractC9936n3.m10593a(bufferedOutputStream);
                        if (!z6) {
                            fileCreateTempFile.delete();
                        }
                        throw th;
                    }
                } catch (Exception e16) {
                    e = e16;
                    inputStreamM9492c = inputStreamM9493d;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th6) {
                        th = th6;
                        AbstractC9936n3.m10593a(inputStreamM9492c);
                        AbstractC9936n3.m10593a(c15379dM9509d);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStreamM9492c = inputStreamM9493d;
                    AbstractC9936n3.m10593a(inputStreamM9492c);
                    AbstractC9936n3.m10593a(c15379dM9509d);
                    throw th;
                }
            } catch (Exception e17) {
                e = e17;
                c15379dM9509d = null;
            } catch (Throwable th8) {
                th = th8;
                c15379dM9509d = null;
            }
        } catch (Exception e18) {
            e = e18;
            c15379dM9509d = null;
        } catch (Throwable th9) {
            th = th9;
            c15379dM9509d = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8991C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f26214t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + Separators.RPAREN);
        }
        C8417b c8417b = new C8417b(bufferedInputStream);
        C4492c c4492c = new C4492c(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (c8417b.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c4492c.m5223a(-1);
        if (c8417b.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c4492c.m5223a(-40);
        String strM9001c = m9001c("Xmp");
        HashMap[] mapArr = this.f26225e;
        C8418c c8418c = (strM9001c == null || !this.f26239s) ? null : (C8418c) mapArr[0].remove("Xmp");
        c4492c.m5223a(-1);
        c4492c.m5223a(-31);
        m8999K(c4492c);
        if (c8418c != null) {
            mapArr[0].put("Xmp", c8418c);
        }
        byte[] bArr = new byte[4096];
        while (c8417b.readByte() == -1) {
            byte b = c8417b.readByte();
            if (b == -39 || b == -38) {
                c4492c.m5223a(-1);
                c4492c.m5223a(b);
                AbstractC9936n3.m10596d(c8417b, c4492c);
                return;
            }
            if (b != -31) {
                c4492c.m5223a(-1);
                c4492c.m5223a(b);
                int unsignedShort = c8417b.readUnsignedShort();
                c4492c.m5222E(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = c8417b.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    c4492c.write(bArr, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = c8417b.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    c8417b.readFully(bArr2);
                    if (Arrays.equals(bArr2, f26209c0)) {
                        c8417b.m8974a(unsignedShort2 - 8);
                    }
                }
                c4492c.m5223a(-1);
                c4492c.m5223a(b);
                c4492c.m5222E(unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    c4492c.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = c8417b.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 < 0) {
                        break;
                    }
                    c4492c.write(bArr, 0, i13);
                    i12 -= i13;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* JADX INFO: renamed from: D */
    public final void m8992D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f26214t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + Separators.RPAREN);
        }
        C8417b c8417b = new C8417b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C4492c c4492c = new C4492c(bufferedOutputStream, byteOrder, 1);
        byte[] bArr = f26185E;
        AbstractC9936n3.m10595c(c8417b, c4492c, bArr.length);
        int i10 = this.f26235o;
        if (i10 == 0) {
            int i11 = c8417b.readInt();
            c4492c.m5224e(i11);
            AbstractC9936n3.m10595c(c8417b, c4492c, i11 + 8);
        } else {
            AbstractC9936n3.m10595c(c8417b, c4492c, (i10 - bArr.length) - 8);
            c8417b.m8974a(c8417b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C4492c c4492c2 = new C4492c(byteArrayOutputStream2, byteOrder, 1);
                m8999K(c4492c2);
                byte[] byteArray = ((ByteArrayOutputStream) c4492c2.f14652Z).toByteArray();
                c4492c.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                c4492c.m5224e((int) crc32.getValue());
                AbstractC9936n3.m10593a(byteArrayOutputStream2);
                AbstractC9936n3.m10596d(c8417b, c4492c);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                AbstractC9936n3.m10593a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8993E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        int i10;
        int i11;
        boolean z6;
        int i12;
        byte[] bArr;
        boolean z10;
        if (f26214t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + Separators.RPAREN);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C8417b c8417b = new C8417b(bufferedInputStream, byteOrder);
        C4492c c4492c = new C4492c(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = f26189I;
        AbstractC9936n3.m10595c(c8417b, c4492c, bArr2.length);
        byte[] bArr3 = f26190J;
        c8417b.m8974a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C4492c c4492c2 = new C4492c(byteArrayOutputStream2, byteOrder, 1);
                    int i13 = this.f26235o;
                    if (i13 != 0) {
                        AbstractC9936n3.m10595c(c8417b, c4492c2, (i13 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        c8417b.m8974a(4);
                        int i14 = c8417b.readInt();
                        if (i14 % 2 != 0) {
                            i14++;
                        }
                        c8417b.m8974a(i14);
                        m8999K(c4492c2);
                    } else {
                        byte[] bArr4 = new byte[4];
                        c8417b.readFully(bArr4);
                        byte[] bArr5 = f26193M;
                        boolean zEquals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = f26195O;
                        byte[] bArr7 = f26194N;
                        if (!zEquals) {
                            if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int i15 = c8417b.readInt();
                                int i16 = i15 % 2 == 1 ? i15 + 1 : i15;
                                byte[] bArr8 = new byte[3];
                                boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                byte[] bArr9 = f26192L;
                                if (zEquals2) {
                                    c8417b.readFully(bArr8);
                                    byte[] bArr10 = new byte[3];
                                    c8417b.readFully(bArr10);
                                    if (!Arrays.equals(bArr9, bArr10)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    i10 = c8417b.readInt();
                                    i16 -= 10;
                                    i11 = (i10 << 18) >> 18;
                                    i12 = (i10 << 2) >> 18;
                                    z6 = false;
                                } else if (!Arrays.equals(bArr4, bArr7)) {
                                    i10 = 0;
                                    i11 = 0;
                                    z6 = false;
                                    i12 = 0;
                                } else {
                                    if (c8417b.readByte() != 47) {
                                        throw new IOException("Error checking VP8L signature");
                                    }
                                    i10 = c8417b.readInt();
                                    z6 = true;
                                    i11 = (i10 & 16383) + 1;
                                    i12 = ((i10 & 268419072) >>> 14) + 1;
                                    if ((i10 & 268435456) == 0) {
                                        z6 = false;
                                    }
                                    i16 -= 5;
                                }
                                c4492c2.write(bArr5);
                                c4492c2.m5224e(10);
                                byte[] bArr11 = new byte[10];
                                if (z6) {
                                    bArr11[0] = (byte) (bArr11[0] | 16);
                                }
                                bArr11[0] = (byte) (bArr11[0] | 8);
                                int i17 = i11 - 1;
                                int i18 = i12 - 1;
                                bArr11[4] = (byte) i17;
                                bArr11[5] = (byte) (i17 >> 8);
                                bArr11[6] = (byte) (i17 >> 16);
                                bArr11[7] = (byte) i18;
                                bArr11[8] = (byte) (i18 >> 8);
                                bArr11[9] = (byte) (i18 >> 16);
                                c4492c2.write(bArr11);
                                c4492c2.write(bArr4);
                                c4492c2.m5224e(i15);
                                if (Arrays.equals(bArr4, bArr6)) {
                                    c4492c2.write(bArr8);
                                    c4492c2.write(bArr9);
                                    c4492c2.m5224e(i10);
                                } else if (Arrays.equals(bArr4, bArr7)) {
                                    c4492c2.write(47);
                                    c4492c2.m5224e(i10);
                                }
                                AbstractC9936n3.m10595c(c8417b, c4492c2, i16);
                                m8999K(c4492c2);
                            }
                            AbstractC9936n3.m10596d(c8417b, c4492c2);
                            C4492c c4492c3 = c4492c;
                            c4492c3.m5224e(byteArrayOutputStream2.size() + bArr3.length);
                            c4492c3.write(bArr3);
                            byteArrayOutputStream2.writeTo(c4492c3);
                            AbstractC9936n3.m10593a(byteArrayOutputStream2);
                        }
                        int i19 = c8417b.readInt();
                        byte[] bArr12 = new byte[i19 % 2 == 1 ? i19 + 1 : i19];
                        c8417b.readFully(bArr12);
                        byte b = (byte) (8 | bArr12[0]);
                        bArr12[0] = b;
                        boolean z11 = ((b >> 1) & 1) == 1;
                        c4492c2.write(bArr5);
                        c4492c2.m5224e(i19);
                        c4492c2.write(bArr12);
                        if (z11) {
                            byte[] bArr13 = f26196P;
                            do {
                                bArr = new byte[4];
                                c8417b.readFully(bArr);
                                int i20 = c8417b.readInt();
                                c4492c2.write(bArr);
                                c4492c2.m5224e(i20);
                                if (i20 % 2 == 1) {
                                    i20++;
                                }
                                AbstractC9936n3.m10595c(c8417b, c4492c2, i20);
                            } while (!Arrays.equals(bArr, bArr13));
                            while (true) {
                                byte[] bArr14 = new byte[4];
                                try {
                                    c8417b.readFully(bArr14);
                                    z10 = !Arrays.equals(bArr14, f26197Q);
                                } catch (EOFException unused) {
                                    z10 = true;
                                }
                                if (z10) {
                                    break;
                                }
                                int i21 = c8417b.readInt();
                                c4492c2.write(bArr14);
                                c4492c2.m5224e(i21);
                                if (i21 % 2 == 1) {
                                    i21++;
                                }
                                AbstractC9936n3.m10595c(c8417b, c4492c2, i21);
                            }
                            m8999K(c4492c2);
                        } else {
                            while (true) {
                                byte[] bArr15 = new byte[4];
                                c8417b.readFully(bArr15);
                                int i22 = c8417b.readInt();
                                c4492c2.write(bArr15);
                                c4492c2.m5224e(i22);
                                if (i22 % 2 == 1) {
                                    i22++;
                                }
                                AbstractC9936n3.m10595c(c8417b, c4492c2, i22);
                                if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                    break;
                                }
                            }
                            m8999K(c4492c2);
                        }
                    }
                    c4492c = c4492c;
                    AbstractC9936n3.m10596d(c8417b, c4492c2);
                    C4492c c4492c4 = c4492c;
                    c4492c4.m5224e(byteArrayOutputStream2.size() + bArr3.length);
                    c4492c4.write(bArr3);
                    byteArrayOutputStream2.writeTo(c4492c4);
                    AbstractC9936n3.m10593a(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    AbstractC9936n3.m10593a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b9 A[LOOP:4: B:100:0x02b7->B:101:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x02da  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ea A[LOOP:5: B:105:0x02e7->B:107:0x02ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x030a A[LOOP:6: B:109:0x0308->B:110:0x030a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x031f  */
    /* JADX WARN: Code duplicated, block: B:115:0x032f A[LOOP:7: B:113:0x032c->B:115:0x032f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x035c  */
    /* JADX WARN: Code duplicated, block: B:120:0x036c A[LOOP:8: B:118:0x0369->B:120:0x036c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0384  */
    /* JADX WARN: Code duplicated, block: B:125:0x0394 A[LOOP:9: B:123:0x0391->B:125:0x0394, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0215  */
    /* JADX WARN: Code duplicated, block: B:87:0x0228  */
    /* JADX WARN: Code duplicated, block: B:90:0x0233 A[LOOP:1: B:88:0x0230->B:90:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0252 A[LOOP:2: B:92:0x0250->B:93:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x026b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276 A[LOOP:3: B:96:0x0273->B:98:0x0276, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0215, please report this as an issue */
    /* JADX INFO: renamed from: F */
    public final void m8994F(String str, String str2) {
        C8419d c8419d;
        int[] iArr;
        String str3;
        boolean z6;
        int i10;
        int i11;
        C8418c c8418c;
        String[] strArrSplit;
        int[] iArr2;
        int i12;
        String[] strArrSplit2;
        long[] jArr;
        int i13;
        int i14;
        String[] strArrSplit3;
        C8420e[] c8420eArr;
        int i15;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i16;
        ByteBuffer byteBufferWrap;
        int i17;
        String[] strArrSplit5;
        int length2;
        C8420e[] c8420eArr2;
        int i18;
        ByteBuffer byteBufferWrap2;
        int i19;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i20;
        ByteBuffer byteBufferWrap3;
        int i21;
        String str4 = str;
        String strReplaceAll = str2;
        int i22 = 0;
        int i23 = 1;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        String str5 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
            boolean zFind = f26212f0.matcher(strReplaceAll).find();
            boolean zFind2 = f26213g0.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                AbstractC15256t.m16482t("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        boolean zEquals = "ISOSpeedRatings".equals(str4);
        boolean z10 = f26214t;
        if (zEquals) {
            if (z10) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i24 = 2;
        if (strReplaceAll != null && f26206Z.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f26211e0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    long j10 = (long) (Double.parseDouble(strReplaceAll) * 10000.0d);
                    long j11 = 10000;
                    if (10000 == 0) {
                        j11 = 1;
                        j10 = 0;
                    }
                    strReplaceAll = j10 + Separators.SLASH + j11;
                } catch (NumberFormatException unused) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i25 = 0;
        while (i25 < f26202V.length) {
            if ((i25 != 4 || this.f26228h) && (c8419d = (C8419d) f26205Y[i25].get(str4)) != null) {
                HashMap[] mapArr = this.f26225e;
                if (strReplaceAll != null) {
                    Pair pairM8987q = m8987q(strReplaceAll);
                    int iIntValue = ((Integer) pairM8987q.first).intValue();
                    int i26 = -1;
                    int i27 = c8419d.f26177c;
                    if (i27 != iIntValue && i27 != ((Integer) pairM8987q.second).intValue()) {
                        int i28 = c8419d.f26178d;
                        if (i28 != -1 && (i28 == ((Integer) pairM8987q.first).intValue() || i28 == ((Integer) pairM8987q.second).intValue())) {
                            i27 = i28;
                        } else if (i27 != i23 && i27 != 7 && i27 != i24) {
                            if (z10) {
                                StringBuilder sbM11058p = AbstractC10763a.m11058p("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                String[] strArr = f26198R;
                                sbM11058p.append(strArr[i27]);
                                sbM11058p.append(i28 == -1 ? "" : ", " + strArr[i28]);
                                sbM11058p.append(" (guess: ");
                                sbM11058p.append(strArr[((Integer) pairM8987q.first).intValue()]);
                                sbM11058p.append(((Integer) pairM8987q.second).intValue() != -1 ? ", " + strArr[((Integer) pairM8987q.second).intValue()] : "");
                                sbM11058p.append(Separators.RPAREN);
                                Log.d(str5, sbM11058p.toString());
                            }
                        }
                        iArr = f26199S;
                        switch (i27) {
                            case 1:
                                str3 = str5;
                                z6 = z10;
                                HashMap map = mapArr[i25];
                                i10 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i11 = 0;
                                    if (strReplaceAll.charAt(0) < '0') {
                                    }
                                    map.put(str4, c8418c);
                                } else {
                                    i11 = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(f26208b0);
                                c8418c = new C8418c(bytes, 1, bytes.length);
                                map.put(str4, c8418c);
                                break;
                            case 2:
                            case 7:
                                str3 = str5;
                                z6 = z10;
                                mapArr[i25].put(str4, C8418c.m8975a(strReplaceAll));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 3:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i12 = 0; i12 < strArrSplit.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit[i12]);
                                }
                                mapArr[i25].put(str4, C8418c.m8980f(iArr2, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 4:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                jArr = new long[strArrSplit2.length];
                                for (i13 = 0; i13 < strArrSplit2.length; i13++) {
                                    jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                                }
                                mapArr[i25].put(str4, C8418c.m8977c(jArr, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 5:
                                str3 = str5;
                                z6 = z10;
                                i14 = -1;
                                strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                c8420eArr = new C8420e[strArrSplit3.length];
                                i15 = 0;
                                while (i15 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i15].split(Separators.SLASH, i14);
                                    c8420eArr[i15] = new C8420e((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i15++;
                                    i14 = -1;
                                }
                                mapArr[i25].put(str4, C8418c.m8978d(c8420eArr, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z10) {
                                    Log.d(str5, "Data format isn't one of expected formats: " + i27);
                                }
                                break;
                            case 9:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i16 = 0; i16 < strArrSplit4.length; i16++) {
                                    iArr3[i16] = Integer.parseInt(strArrSplit4[i16]);
                                }
                                HashMap map2 = mapArr[i25];
                                ByteOrder byteOrder = this.f26227g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (i17 = 0; i17 < length; i17++) {
                                    byteBufferWrap.putInt(iArr3[i17]);
                                }
                                map2.put(str4, new C8418c(byteBufferWrap.array(), 9, length));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                length2 = strArrSplit5.length;
                                c8420eArr2 = new C8420e[length2];
                                i18 = i22;
                                while (i18 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i18].split(Separators.SLASH, i26);
                                    c8420eArr2[i18] = new C8420e((long) Double.parseDouble(strArrSplit8[i22]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i18++;
                                    str5 = str5;
                                    z10 = z10;
                                    i22 = 0;
                                    i26 = -1;
                                }
                                str3 = str5;
                                z6 = z10;
                                HashMap map3 = mapArr[i25];
                                ByteOrder byteOrder2 = this.f26227g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                for (i19 = 0; i19 < length2; i19++) {
                                    C8420e c8420e = c8420eArr2[i19];
                                    byteBufferWrap2.putInt((int) c8420e.f26179a);
                                    byteBufferWrap2.putInt((int) c8420e.f26180b);
                                }
                                map3.put(str4, new C8418c(byteBufferWrap2.array(), 10, length2));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i20 = i22; i20 < strArrSplit6.length; i20 += i23) {
                                    dArr[i20] = Double.parseDouble(strArrSplit6[i20]);
                                }
                                HashMap map4 = mapArr[i25];
                                ByteOrder byteOrder3 = this.f26227g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                for (i21 = i22; i21 < length3; i21 += i23) {
                                    byteBufferWrap3.putDouble(dArr[i21]);
                                }
                                map4.put(str4, new C8418c(byteBufferWrap3.array(), 12, length3));
                                break;
                        }
                    } else {
                        iArr = f26199S;
                        switch (i27) {
                            case 1:
                                str3 = str5;
                                z6 = z10;
                                HashMap map5 = mapArr[i25];
                                i10 = 1;
                                if (strReplaceAll.length() == 1) {
                                    i11 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        c8418c = new C8418c(new byte[]{(byte) (strReplaceAll.charAt(0) - '0')}, 1, 1);
                                    }
                                    map5.put(str4, c8418c);
                                } else {
                                    i11 = 0;
                                }
                                byte[] bytes2 = strReplaceAll.getBytes(f26208b0);
                                c8418c = new C8418c(bytes2, 1, bytes2.length);
                                map5.put(str4, c8418c);
                                break;
                            case 2:
                            case 7:
                                str3 = str5;
                                z6 = z10;
                                mapArr[i25].put(str4, C8418c.m8975a(strReplaceAll));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 3:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i12 < strArrSplit.length) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit[i12]);
                                }
                                mapArr[i25].put(str4, C8418c.m8980f(iArr2, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 4:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                jArr = new long[strArrSplit2.length];
                                while (i13 < strArrSplit2.length) {
                                    jArr[i13] = Long.parseLong(strArrSplit2[i13]);
                                }
                                mapArr[i25].put(str4, C8418c.m8977c(jArr, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 5:
                                str3 = str5;
                                z6 = z10;
                                i14 = -1;
                                strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                c8420eArr = new C8420e[strArrSplit3.length];
                                i15 = 0;
                                while (i15 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i15].split(Separators.SLASH, i14);
                                    c8420eArr[i15] = new C8420e((long) Double.parseDouble(strArrSplit9[0]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i15++;
                                    i14 = -1;
                                }
                                mapArr[i25].put(str4, C8418c.m8978d(c8420eArr, this.f26227g));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z10) {
                                    Log.d(str5, "Data format isn't one of expected formats: " + i27);
                                }
                                break;
                            case 9:
                                str3 = str5;
                                z6 = z10;
                                strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i16 < strArrSplit4.length) {
                                    iArr3[i16] = Integer.parseInt(strArrSplit4[i16]);
                                }
                                HashMap map6 = mapArr[i25];
                                ByteOrder byteOrder4 = this.f26227g;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder4);
                                while (i17 < length) {
                                    byteBufferWrap.putInt(iArr3[i17]);
                                }
                                map6.put(str4, new C8418c(byteBufferWrap.array(), 9, length));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                length2 = strArrSplit5.length;
                                c8420eArr2 = new C8420e[length2];
                                i18 = i22;
                                while (i18 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i18].split(Separators.SLASH, i26);
                                    c8420eArr2[i18] = new C8420e((long) Double.parseDouble(strArrSplit10[i22]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i18++;
                                    str5 = str5;
                                    z10 = z10;
                                    i22 = 0;
                                    i26 = -1;
                                }
                                str3 = str5;
                                z6 = z10;
                                HashMap map7 = mapArr[i25];
                                ByteOrder byteOrder5 = this.f26227g;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                while (i19 < length2) {
                                    C8420e c8420e2 = c8420eArr2[i19];
                                    byteBufferWrap2.putInt((int) c8420e2.f26179a);
                                    byteBufferWrap2.putInt((int) c8420e2.f26180b);
                                }
                                map7.put(str4, new C8418c(byteBufferWrap2.array(), 10, length2));
                                i11 = 0;
                                i10 = 1;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i20 < strArrSplit6.length) {
                                    dArr[i20] = Double.parseDouble(strArrSplit6[i20]);
                                }
                                HashMap map8 = mapArr[i25];
                                ByteOrder byteOrder6 = this.f26227g;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                while (i21 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i21]);
                                }
                                map8.put(str4, new C8418c(byteBufferWrap3.array(), 12, length3));
                                break;
                        }
                    }
                } else {
                    mapArr[i25].remove(str4);
                }
                i10 = i23;
                str3 = str5;
                z6 = z10;
                i11 = i22;
            } else {
                i10 = i23;
                str3 = str5;
                z6 = z10;
                i11 = i22;
            }
            i25 += i10;
            i22 = i11;
            i23 = i10;
            str5 = str3;
            z10 = z6;
            i24 = 2;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m8995G(C8417b c8417b) throws Throwable {
        String str;
        C8418c c8418c;
        int iM8982h;
        HashMap map = this.f26225e[4];
        C8418c c8418c2 = (C8418c) map.get("Compression");
        if (c8418c2 == null) {
            this.f26234n = 6;
            m9015r(c8417b, map);
            return;
        }
        int iM8982h2 = c8418c2.m8982h(this.f26227g);
        this.f26234n = iM8982h2;
        int i10 = 1;
        if (iM8982h2 != 1) {
            if (iM8982h2 == 6) {
                m9015r(c8417b, map);
                return;
            } else if (iM8982h2 != 7) {
                return;
            }
        }
        C8418c c8418c3 = (C8418c) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (c8418c3 != null) {
            int[] iArr = (int[]) c8418c3.m8984j(this.f26227g);
            int[] iArr2 = f26217w;
            if (Arrays.equals(iArr2, iArr) || (this.f26224d == 3 && (c8418c = (C8418c) map.get("PhotometricInterpretation")) != null && (((iM8982h = c8418c.m8982h(this.f26227g)) == 1 && Arrays.equals(iArr, f26218x)) || (iM8982h == 6 && Arrays.equals(iArr, iArr2))))) {
                C8418c c8418c4 = (C8418c) map.get("StripOffsets");
                C8418c c8418c5 = (C8418c) map.get("StripByteCounts");
                if (c8418c4 == null || c8418c5 == null) {
                    return;
                }
                long[] jArrM10594b = AbstractC9936n3.m10594b(c8418c4.m8984j(this.f26227g));
                long[] jArrM10594b2 = AbstractC9936n3.m10594b(c8418c5.m8984j(this.f26227g));
                if (jArrM10594b == null || jArrM10594b.length == 0) {
                    AbstractC15256t.m16482t("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM10594b2 == null || jArrM10594b2.length == 0) {
                    AbstractC15256t.m16482t("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM10594b.length != jArrM10594b2.length) {
                    AbstractC15256t.m16482t("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrM10594b2) {
                    j10 += j11;
                }
                int i11 = (int) j10;
                byte[] bArr = new byte[i11];
                this.f26230j = true;
                this.f26229i = true;
                this.f26228h = true;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < jArrM10594b.length) {
                    int i15 = (int) jArrM10594b[i12];
                    int i16 = (int) jArrM10594b2[i12];
                    if (i12 < jArrM10594b.length - i10) {
                        str = str2;
                        if (i15 + i16 != jArrM10594b[i12 + 1]) {
                            this.f26230j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i17 = i15 - i13;
                    if (i17 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        c8417b.m8974a(i17);
                        int i18 = i13 + i17;
                        byte[] bArr2 = new byte[i16];
                        try {
                            c8417b.readFully(bArr2);
                            i13 = i18 + i16;
                            System.arraycopy(bArr2, 0, bArr, i14, i16);
                            i14 += i16;
                            i12++;
                            str2 = str3;
                            i10 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i16 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                }
                this.f26233m = bArr;
                if (this.f26230j) {
                    this.f26231k = (int) jArrM10594b[0];
                    this.f26232l = i11;
                    return;
                }
                return;
            }
        }
        if (f26214t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8996H(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f26225e;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z6 = f26214t;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z6) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C8418c c8418c = (C8418c) mapArr[i10].get("ImageLength");
        C8418c c8418c2 = (C8418c) mapArr[i10].get("ImageWidth");
        C8418c c8418c3 = (C8418c) mapArr[i11].get("ImageLength");
        C8418c c8418c4 = (C8418c) mapArr[i11].get("ImageWidth");
        if (c8418c == null || c8418c2 == null) {
            if (z6) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c8418c3 == null || c8418c4 == null) {
            if (z6) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM8982h = c8418c.m8982h(this.f26227g);
        int iM8982h2 = c8418c2.m8982h(this.f26227g);
        int iM8982h3 = c8418c3.m8982h(this.f26227g);
        int iM8982h4 = c8418c4.m8982h(this.f26227g);
        if (iM8982h >= iM8982h3 || iM8982h2 >= iM8982h4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    /* JADX INFO: renamed from: I */
    public final void m8997I(C8421f c8421f, int i10) throws Throwable {
        C8418c c8418cM8979e;
        C8418c c8418cM8979e2;
        HashMap[] mapArr = this.f26225e;
        C8418c c8418c = (C8418c) mapArr[i10].get("DefaultCropSize");
        C8418c c8418c2 = (C8418c) mapArr[i10].get("SensorTopBorder");
        C8418c c8418c3 = (C8418c) mapArr[i10].get("SensorLeftBorder");
        C8418c c8418c4 = (C8418c) mapArr[i10].get("SensorBottomBorder");
        C8418c c8418c5 = (C8418c) mapArr[i10].get("SensorRightBorder");
        if (c8418c != null) {
            if (c8418c.f26171a == 5) {
                C8420e[] c8420eArr = (C8420e[]) c8418c.m8984j(this.f26227g);
                if (c8420eArr == null || c8420eArr.length != 2) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c8420eArr));
                    return;
                } else {
                    c8418cM8979e = C8418c.m8978d(new C8420e[]{c8420eArr[0]}, this.f26227g);
                    c8418cM8979e2 = C8418c.m8978d(new C8420e[]{c8420eArr[1]}, this.f26227g);
                }
            } else {
                int[] iArr = (int[]) c8418c.m8984j(this.f26227g);
                if (iArr == null || iArr.length != 2) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c8418cM8979e = C8418c.m8979e(iArr[0], this.f26227g);
                c8418cM8979e2 = C8418c.m8979e(iArr[1], this.f26227g);
            }
            mapArr[i10].put("ImageWidth", c8418cM8979e);
            mapArr[i10].put("ImageLength", c8418cM8979e2);
            return;
        }
        if (c8418c2 != null && c8418c3 != null && c8418c4 != null && c8418c5 != null) {
            int iM8982h = c8418c2.m8982h(this.f26227g);
            int iM8982h2 = c8418c4.m8982h(this.f26227g);
            int iM8982h3 = c8418c5.m8982h(this.f26227g);
            int iM8982h4 = c8418c3.m8982h(this.f26227g);
            if (iM8982h2 <= iM8982h || iM8982h3 <= iM8982h4) {
                return;
            }
            C8418c c8418cM8979e3 = C8418c.m8979e(iM8982h2 - iM8982h, this.f26227g);
            C8418c c8418cM8979e4 = C8418c.m8979e(iM8982h3 - iM8982h4, this.f26227g);
            mapArr[i10].put("ImageLength", c8418cM8979e3);
            mapArr[i10].put("ImageWidth", c8418cM8979e4);
            return;
        }
        C8418c c8418c6 = (C8418c) mapArr[i10].get("ImageLength");
        C8418c c8418c7 = (C8418c) mapArr[i10].get("ImageWidth");
        if (c8418c6 == null || c8418c7 == null) {
            C8418c c8418c8 = (C8418c) mapArr[i10].get("JPEGInterchangeFormat");
            C8418c c8418c9 = (C8418c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (c8418c8 == null || c8418c9 == null) {
                return;
            }
            int iM8982h5 = c8418c8.m8982h(this.f26227g);
            int iM8982h6 = c8418c8.m8982h(this.f26227g);
            c8421f.m8985e(iM8982h5);
            byte[] bArr = new byte[iM8982h6];
            c8421f.readFully(bArr);
            m9005g(new C8417b(bArr), iM8982h5, i10);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8998J() throws Throwable {
        m8996H(0, 5);
        m8996H(0, 4);
        m8996H(5, 4);
        HashMap[] mapArr = this.f26225e;
        C8418c c8418c = (C8418c) mapArr[1].get("PixelXDimension");
        C8418c c8418c2 = (C8418c) mapArr[1].get("PixelYDimension");
        if (c8418c != null && c8418c2 != null) {
            mapArr[0].put("ImageWidth", c8418c);
            mapArr[0].put("ImageLength", c8418c2);
        }
        if (mapArr[4].isEmpty() && m9016s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m9016s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m8989A(0, "ThumbnailOrientation", "Orientation");
        m8989A(0, "ThumbnailImageLength", "ImageLength");
        m8989A(0, "ThumbnailImageWidth", "ImageWidth");
        m8989A(5, "ThumbnailOrientation", "Orientation");
        m8989A(5, "ThumbnailImageLength", "ImageLength");
        m8989A(5, "ThumbnailImageWidth", "ImageWidth");
        m8989A(4, "Orientation", "ThumbnailOrientation");
        m8989A(4, "ImageLength", "ThumbnailImageLength");
        m8989A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: K */
    public final void m8999K(C4492c c4492c) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        HashMap[] mapArr2;
        HashMap[] mapArr3;
        int i10;
        int i11 = 1;
        C8419d[][] c8419dArr = f26202V;
        int[] iArr2 = new int[c8419dArr.length];
        int[] iArr3 = new int[c8419dArr.length];
        C8419d[] c8419dArr2 = f26203W;
        for (C8419d c8419d : c8419dArr2) {
            m9022z(c8419d.f26176b);
        }
        if (this.f26228h) {
            if (this.f26229i) {
                m9022z("StripOffsets");
                m9022z("StripByteCounts");
            } else {
                m9022z("JPEGInterchangeFormat");
                m9022z("JPEGInterchangeFormatLength");
            }
        }
        int i12 = 0;
        while (true) {
            int length = c8419dArr.length;
            mapArr = this.f26225e;
            if (i12 >= length) {
                break;
            }
            Object[] array = mapArr[i12].entrySet().toArray();
            int length2 = array.length;
            int i13 = 0;
            while (i13 < length2) {
                Map.Entry entry = (Map.Entry) array[i13];
                if (entry.getValue() == null) {
                    mapArr[i12].remove(entry.getKey());
                    i10 = 1;
                } else {
                    i10 = i11;
                }
                i13 += i10;
                i11 = i10;
                array = array;
            }
            i12 += i11;
        }
        int i14 = i11;
        if (!mapArr[i14].isEmpty()) {
            mapArr[0].put(c8419dArr2[i14].f26176b, C8418c.m8976b(0L, this.f26227g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c8419dArr2[2].f26176b, C8418c.m8976b(0L, this.f26227g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c8419dArr2[3].f26176b, C8418c.m8976b(0L, this.f26227g));
        }
        if (this.f26228h) {
            if (this.f26229i) {
                mapArr[4].put("StripOffsets", C8418c.m8979e(0, this.f26227g));
                mapArr[4].put("StripByteCounts", C8418c.m8979e(this.f26232l, this.f26227g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C8418c.m8976b(0L, this.f26227g));
                mapArr[4].put("JPEGInterchangeFormatLength", C8418c.m8976b(this.f26232l, this.f26227g));
            }
        }
        int i15 = 0;
        while (true) {
            int length3 = c8419dArr.length;
            iArr = f26199S;
            if (i15 >= length3) {
                break;
            }
            Iterator it = mapArr[i15].entrySet().iterator();
            int i16 = 0;
            while (it.hasNext()) {
                C8418c c8418c = (C8418c) ((Map.Entry) it.next()).getValue();
                c8418c.getClass();
                int i17 = iArr[c8418c.f26171a] * c8418c.f26172b;
                if (i17 > 4) {
                    i16 += i17;
                }
            }
            iArr3[i15] = iArr3[i15] + i16;
            i15++;
        }
        int size = 8;
        for (int i18 = 0; i18 < c8419dArr.length; i18++) {
            if (!mapArr[i18].isEmpty()) {
                iArr2[i18] = size;
                size += (mapArr[i18].size() * 12) + 6 + iArr3[i18];
            }
        }
        if (this.f26228h) {
            if (this.f26229i) {
                mapArr[4].put("StripOffsets", C8418c.m8979e(size, this.f26227g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C8418c.m8976b(size, this.f26227g));
            }
            this.f26231k = size;
            size += this.f26232l;
        }
        if (this.f26224d == 4) {
            size += 8;
        }
        if (f26214t) {
            for (int i19 = 0; i19 < c8419dArr.length; i19++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i19), Integer.valueOf(iArr2[i19]), Integer.valueOf(mapArr[i19].size()), Integer.valueOf(iArr3[i19]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(c8419dArr2[1].f26176b, C8418c.m8976b(iArr2[1], this.f26227g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c8419dArr2[2].f26176b, C8418c.m8976b(iArr2[2], this.f26227g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c8419dArr2[3].f26176b, C8418c.m8976b(iArr2[3], this.f26227g));
        }
        int i20 = this.f26224d;
        if (i20 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(AbstractC0010F.m19c(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            c4492c.m5222E(size);
            c4492c.write(f26209c0);
        } else if (i20 == 13) {
            c4492c.m5224e(size);
            c4492c.write(f26186F);
        } else if (i20 == 14) {
            c4492c.write(f26191K);
            c4492c.m5224e(size);
        }
        c4492c.m5225k(this.f26227g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c4492c.f14653o0 = this.f26227g;
        c4492c.m5222E(42);
        c4492c.m5226m(8L);
        int i21 = 0;
        while (i21 < c8419dArr.length) {
            if (mapArr[i21].isEmpty()) {
                mapArr2 = mapArr;
            } else {
                c4492c.m5222E(mapArr[i21].size());
                int size2 = (mapArr[i21].size() * 12) + iArr2[i21] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i21].entrySet()) {
                    int i22 = ((C8419d) f26205Y[i21].get(entry2.getKey())).f26175a;
                    C8418c c8418c2 = (C8418c) entry2.getValue();
                    c8418c2.getClass();
                    int i23 = c8418c2.f26171a;
                    int i24 = iArr[i23];
                    int i25 = c8418c2.f26172b;
                    int i26 = i24 * i25;
                    c4492c.m5222E(i22);
                    c4492c.m5222E(i23);
                    c4492c.m5224e(i25);
                    if (i26 > 4) {
                        mapArr3 = mapArr;
                        c4492c.m5226m(size2);
                        size2 += i26;
                    } else {
                        mapArr3 = mapArr;
                        c4492c.write(c8418c2.f26174d);
                        if (i26 < 4) {
                            while (i26 < 4) {
                                c4492c.m5223a(0);
                                i26++;
                            }
                        }
                    }
                    mapArr = mapArr3;
                }
                mapArr2 = mapArr;
                if (i21 != 0 || mapArr2[4].isEmpty()) {
                    c4492c.m5226m(0L);
                } else {
                    c4492c.m5226m(iArr2[4]);
                }
                Iterator it2 = mapArr2[i21].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((C8418c) ((Map.Entry) it2.next()).getValue()).f26174d;
                    if (bArr.length > 4) {
                        c4492c.write(bArr, 0, bArr.length);
                    }
                }
            }
            i21++;
            mapArr = mapArr2;
        }
        if (this.f26228h) {
            c4492c.write(m9013o());
        }
        if (this.f26224d == 14 && size % 2 == 1) {
            c4492c.m5223a(0);
        }
        c4492c.f14653o0 = ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public final void m9000a() {
        String strM9001c = m9001c("DateTimeOriginal");
        HashMap[] mapArr = this.f26225e;
        if (strM9001c != null && m9001c("DateTime") == null) {
            mapArr[0].put("DateTime", C8418c.m8975a(strM9001c));
        }
        if (m9001c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C8418c.m8976b(0L, this.f26227g));
        }
        if (m9001c("ImageLength") == null) {
            mapArr[0].put("ImageLength", C8418c.m8976b(0L, this.f26227g));
        }
        if (m9001c("Orientation") == null) {
            mapArr[0].put("Orientation", C8418c.m8976b(0L, this.f26227g));
        }
        if (m9001c("LightSource") == null) {
            mapArr[1].put("LightSource", C8418c.m8976b(0L, this.f26227g));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m9001c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C8418c c8418cM9003e = m9003e(str);
        if (c8418cM9003e != null) {
            if (!f26206Z.contains(str)) {
                return c8418cM9003e.m8983i(this.f26227g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = c8418cM9003e.f26171a;
                if (i10 != 5 && i10 != 10) {
                    AbstractC15256t.m16482t("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                C8420e[] c8420eArr = (C8420e[]) c8418cM9003e.m8984j(this.f26227g);
                if (c8420eArr == null || c8420eArr.length != 3) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c8420eArr));
                    return null;
                }
                C8420e c8420e = c8420eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c8420e.f26179a / c8420e.f26180b));
                C8420e c8420e2 = c8420eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c8420e2.f26179a / c8420e2.f26180b));
                C8420e c8420e3 = c8420eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c8420e3.f26179a / c8420e3.f26180b)));
            }
            try {
                return Double.toString(c8418cM9003e.m8981g(this.f26227g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m9002d(int i10, String str) {
        C8418c c8418cM9003e = m9003e(str);
        if (c8418cM9003e == null) {
            return i10;
        }
        try {
            return c8418cM9003e.m8982h(this.f26227g);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C8418c m9003e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f26214t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f26202V.length; i10++) {
            C8418c c8418c = (C8418c) this.f26225e[i10].get(str);
            if (c8418c != null) {
                return c8418c;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e A[LOOP:2: B:65:0x0124->B:70:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179 A[LOOP:0: B:10:0x0033->B:78:0x0179, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a3. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: g */
    public final void m9005g(p538W2.C8417b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p538W2.C8422g.m9005g(W2.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0134  */
    /* JADX WARN: Code duplicated, block: B:112:0x013c A[LOOP:2: B:107:0x012f->B:112:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0145  */
    /* JADX WARN: Code duplicated, block: B:120:0x014b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0153 A[LOOP:3: B:118:0x0146->B:123:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x015c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0166 A[LOOP:4: B:125:0x0157->B:130:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0151 A[EDGE_INSN: B:167:0x0151->B:122:0x0151 BREAK  A[LOOP:3: B:118:0x0146->B:123:0x0153], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0151 A[EDGE_INSN: B:168:0x0151->B:122:0x0151 BREAK  A[LOOP:3: B:118:0x0146->B:123:0x0153], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX INFO: renamed from: h */
    public final int m9006h(BufferedInputStream bufferedInputStream) throws Throwable {
        ?? r6;
        C8417b c8417b;
        C8417b c8417b2;
        C8417b c8417b3;
        boolean z6;
        C8417b c8417b4;
        C8417b c8417b5;
        boolean z10;
        int i10;
        byte[] bArr;
        boolean z11;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        boolean z12;
        C8417b c8417b6;
        short s10;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = f26219y;
            if (i13 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i13] != bArr5[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    byte b = bArr4[i14];
                    ?? r10 = bytes[i14];
                    try {
                        if (b != r10) {
                            try {
                                c8417b = new C8417b(bArr4);
                                try {
                                    long j11 = c8417b.readInt();
                                    byte[] bArr6 = new byte[4];
                                    c8417b.readFully(bArr6);
                                    if (Arrays.equals(bArr6, f26220z)) {
                                        if (j11 == 1) {
                                            j11 = c8417b.readLong();
                                            j10 = 16;
                                            if (j11 < 16) {
                                            }
                                        } else {
                                            j10 = 8;
                                        }
                                        long j12 = 5000;
                                        if (j11 > j12) {
                                            j11 = j12;
                                        }
                                        long j13 = j11 - j10;
                                        if (j13 >= 8) {
                                            byte[] bArr7 = new byte[4];
                                            boolean z13 = false;
                                            boolean z14 = false;
                                            for (long j14 = 0; j14 < j13 / 4; j14++) {
                                                try {
                                                    c8417b.readFully(bArr7);
                                                    if (j14 != 1) {
                                                        if (Arrays.equals(bArr7, f26181A)) {
                                                            z13 = true;
                                                        } else if (Arrays.equals(bArr7, f26182B)) {
                                                            z14 = true;
                                                        }
                                                        if (z13 && z14) {
                                                            c8417b.close();
                                                            return 12;
                                                        }
                                                    }
                                                } catch (EOFException unused) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (f26214t) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (c8417b != null) {
                                    }
                                    c8417b3 = new C8417b(bArr4);
                                    ByteOrder byteOrderM8988w = m8988w(c8417b3);
                                    this.f26227g = byteOrderM8988w;
                                    c8417b3.f26168o0 = byteOrderM8988w;
                                    s10 = c8417b3.readShort();
                                    if (s10 != 20306) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    c8417b3.close();
                                    if (z6) {
                                        return 7;
                                    }
                                    try {
                                        c8417b6 = new C8417b(bArr4);
                                        try {
                                            ByteOrder byteOrderM8988w2 = m8988w(c8417b6);
                                            this.f26227g = byteOrderM8988w2;
                                            c8417b6.f26168o0 = byteOrderM8988w2;
                                            if (c8417b6.readShort() == 85) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            c8417b6.close();
                                        } catch (Exception unused2) {
                                            c8417b5 = c8417b6;
                                            if (c8417b5 != null) {
                                                c8417b5.close();
                                            }
                                            z10 = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c8417b4 = c8417b6;
                                            if (c8417b4 != null) {
                                                c8417b4.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused3) {
                                        c8417b5 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c8417b4 = null;
                                    }
                                    if (z10) {
                                        return 10;
                                    }
                                    i10 = 0;
                                    while (true) {
                                        bArr = f26185E;
                                        if (i10 < bArr.length) {
                                            z11 = true;
                                            break;
                                        }
                                        if (bArr4[i10] != bArr[i10]) {
                                            z11 = false;
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (z11) {
                                        return 13;
                                    }
                                    i11 = 0;
                                    while (true) {
                                        bArr2 = f26189I;
                                        if (i11 < bArr2.length) {
                                            i12 = 0;
                                            while (true) {
                                                bArr3 = f26190J;
                                                if (i12 < bArr3.length) {
                                                    z12 = true;
                                                } else {
                                                    if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                if (z12) {
                                                    return 14;
                                                }
                                                return 0;
                                            }
                                        }
                                        if (bArr4[i11] != bArr2[i11]) {
                                            break;
                                        }
                                        i11++;
                                    }
                                    z12 = false;
                                    if (z12) {
                                        return 14;
                                    }
                                    return 0;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                c8417b = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r6 = 0;
                                if (r6 != 0) {
                                    r6.close();
                                }
                                throw th;
                            }
                            c8417b.close();
                            try {
                                c8417b3 = new C8417b(bArr4);
                                try {
                                    ByteOrder byteOrderM8988w3 = m8988w(c8417b3);
                                    this.f26227g = byteOrderM8988w3;
                                    c8417b3.f26168o0 = byteOrderM8988w3;
                                    s10 = c8417b3.readShort();
                                    if (s10 != 20306 || s10 == 21330) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    c8417b3.close();
                                } catch (Exception unused4) {
                                    if (c8417b3 != null) {
                                        c8417b3.close();
                                    }
                                    z6 = false;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c8417b2 = c8417b3;
                                    if (c8417b2 != null) {
                                        c8417b2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                c8417b3 = null;
                            } catch (Throwable th6) {
                                th = th6;
                                c8417b2 = null;
                            }
                            if (z6) {
                                return 7;
                            }
                            c8417b6 = new C8417b(bArr4);
                            ByteOrder byteOrderM8988w4 = m8988w(c8417b6);
                            this.f26227g = byteOrderM8988w4;
                            c8417b6.f26168o0 = byteOrderM8988w4;
                            if (c8417b6.readShort() == 85) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c8417b6.close();
                            if (z10) {
                                return 10;
                            }
                            i10 = 0;
                            while (true) {
                                bArr = f26185E;
                                if (i10 < bArr.length) {
                                    z11 = true;
                                    break;
                                }
                                if (bArr4[i10] != bArr[i10]) {
                                    z11 = false;
                                    break;
                                }
                                i10++;
                            }
                            if (z11) {
                                return 13;
                            }
                            i11 = 0;
                            while (true) {
                                bArr2 = f26189I;
                                if (i11 < bArr2.length) {
                                    i12 = 0;
                                    while (true) {
                                        bArr3 = f26190J;
                                        if (i12 < bArr3.length) {
                                            z12 = true;
                                        } else {
                                            if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                break;
                                                break;
                                            }
                                            i12++;
                                        }
                                        if (z12) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                }
                                if (bArr4[i11] != bArr2[i11]) {
                                    break;
                                    break;
                                }
                                i11++;
                            }
                            z12 = false;
                            if (z12) {
                                return 14;
                            }
                            return 0;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r6 = r10;
                    }
                }
                return 9;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9007i(C8421f c8421f) throws Throwable {
        int i10;
        int i11;
        m9010l(c8421f);
        HashMap[] mapArr = this.f26225e;
        C8418c c8418c = (C8418c) mapArr[1].get("MakerNote");
        if (c8418c != null) {
            C8421f c8421f2 = new C8421f(c8418c.f26174d);
            c8421f2.f26168o0 = this.f26227g;
            byte[] bArr = f26183C;
            byte[] bArr2 = new byte[bArr.length];
            c8421f2.readFully(bArr2);
            c8421f2.m8985e(0L);
            byte[] bArr3 = f26184D;
            byte[] bArr4 = new byte[bArr3.length];
            c8421f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c8421f2.m8985e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c8421f2.m8985e(12L);
            }
            m9021y(c8421f2, 6);
            C8418c c8418c2 = (C8418c) mapArr[7].get("PreviewImageStart");
            C8418c c8418c3 = (C8418c) mapArr[7].get("PreviewImageLength");
            if (c8418c2 != null && c8418c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c8418c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c8418c3);
            }
            C8418c c8418c4 = (C8418c) mapArr[8].get("AspectFrame");
            if (c8418c4 != null) {
                int[] iArr = (int[]) c8418c4.m8984j(this.f26227g);
                if (iArr == null || iArr.length != 4) {
                    AbstractC15256t.m16482t("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                C8418c c8418cM8979e = C8418c.m8979e(i14, this.f26227g);
                C8418c c8418cM8979e2 = C8418c.m8979e(i15, this.f26227g);
                mapArr[0].put("ImageWidth", c8418cM8979e);
                mapArr[0].put("ImageLength", c8418cM8979e2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9008j(C8417b c8417b) throws Throwable {
        if (f26214t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c8417b);
        }
        c8417b.f26168o0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f26185E;
        c8417b.m8974a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = c8417b.readInt();
                byte[] bArr2 = new byte[4];
                c8417b.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f26187G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f26188H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f26186F)) {
                    byte[] bArr3 = new byte[i10];
                    c8417b.readFully(bArr3);
                    int i12 = c8417b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f26235o = i11;
                        m9020x(0, bArr3);
                        m8998J();
                        m8995G(new C8417b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                c8417b.m8974a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9009k(C8417b c8417b) throws Throwable {
        boolean z6 = f26214t;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c8417b);
        }
        c8417b.m8974a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c8417b.readFully(bArr);
        c8417b.readFully(bArr2);
        c8417b.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        c8417b.m8974a(i10 - c8417b.f26167Z);
        c8417b.readFully(bArr4);
        m9005g(new C8417b(bArr4), i10, 5);
        c8417b.m8974a(i12 - c8417b.f26167Z);
        c8417b.f26168o0 = ByteOrder.BIG_ENDIAN;
        int i13 = c8417b.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = c8417b.readUnsignedShort();
            int unsignedShort2 = c8417b.readUnsignedShort();
            if (unsignedShort == f26201U.f26175a) {
                short s10 = c8417b.readShort();
                short s11 = c8417b.readShort();
                C8418c c8418cM8979e = C8418c.m8979e(s10, this.f26227g);
                C8418c c8418cM8979e2 = C8418c.m8979e(s11, this.f26227g);
                HashMap[] mapArr = this.f26225e;
                mapArr[0].put("ImageLength", c8418cM8979e);
                mapArr[0].put("ImageWidth", c8418cM8979e2);
                if (z6) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            c8417b.m8974a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9010l(C8421f c8421f) throws Throwable {
        m9018u(c8421f);
        m9021y(c8421f, 0);
        m8997I(c8421f, 0);
        m8997I(c8421f, 5);
        m8997I(c8421f, 4);
        m8998J();
        if (this.f26224d == 8) {
            HashMap[] mapArr = this.f26225e;
            C8418c c8418c = (C8418c) mapArr[1].get("MakerNote");
            if (c8418c != null) {
                C8421f c8421f2 = new C8421f(c8418c.f26174d);
                c8421f2.f26168o0 = this.f26227g;
                c8421f2.m8974a(6);
                m9021y(c8421f2, 9);
                C8418c c8418c2 = (C8418c) mapArr[9].get("ColorSpace");
                if (c8418c2 != null) {
                    mapArr[1].put("ColorSpace", c8418c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m9011m() {
        switch (m9002d(1, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9012n(C8421f c8421f) throws Throwable {
        if (f26214t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c8421f);
        }
        m9010l(c8421f);
        HashMap[] mapArr = this.f26225e;
        C8418c c8418c = (C8418c) mapArr[0].get("JpgFromRaw");
        if (c8418c != null) {
            m9005g(new C8417b(c8418c.f26174d), (int) c8418c.f26173c, 5);
        }
        C8418c c8418c2 = (C8418c) mapArr[0].get("ISO");
        C8418c c8418c3 = (C8418c) mapArr[1].get("PhotographicSensitivity");
        if (c8418c2 == null || c8418c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c8418c2);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public final byte[] m9013o() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream inputStreamM9493d;
        Exception e10;
        InputStream inputStream = null;
        if (!this.f26228h) {
            return null;
        }
        byte[] bArr = this.f26233m;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStreamM9493d = this.f26223c;
            if (inputStreamM9493d != null) {
                try {
                    if (!inputStreamM9493d.markSupported()) {
                        Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                        AbstractC9936n3.m10593a(inputStreamM9493d);
                        return null;
                    }
                    inputStreamM9493d.reset();
                    fileDescriptor = null;
                } catch (Exception e11) {
                    e10 = e11;
                    fileDescriptor = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    AbstractC9936n3.m10593a(inputStreamM9493d);
                    if (fileDescriptor != null) {
                        try {
                            AbstractC8423h.m9023a(fileDescriptor);
                        } catch (Exception unused) {
                            AbstractC15256t.m16465c("ExifInterfaceUtils", "Error closing fd.");
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                    inputStream = inputStreamM9493d;
                    AbstractC9936n3.m10593a(inputStream);
                    if (fileDescriptor != null) {
                        try {
                            AbstractC8423h.m9023a(fileDescriptor);
                        } catch (Exception unused2) {
                            AbstractC15256t.m16465c("ExifInterfaceUtils", "Error closing fd.");
                        }
                    }
                    throw th;
                }
            } else if (this.f26221a != null) {
                String str = this.f26221a;
                inputStreamM9493d = AbstractC8746y3.m9494e(new FileInputStream(str), str);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorM9024b = AbstractC8423h.m9024b(this.f26222b);
                try {
                    AbstractC8423h.m9025c(fileDescriptorM9024b, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorM9024b;
                    inputStreamM9493d = AbstractC8746y3.m9493d(new FileInputStream(fileDescriptorM9024b), fileDescriptorM9024b);
                } catch (Exception e12) {
                    e10 = e12;
                    fileDescriptor = fileDescriptorM9024b;
                    inputStreamM9493d = null;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    AbstractC9936n3.m10593a(inputStreamM9493d);
                    if (fileDescriptor != null) {
                        AbstractC8423h.m9023a(fileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileDescriptor = fileDescriptorM9024b;
                    AbstractC9936n3.m10593a(inputStream);
                    if (fileDescriptor != null) {
                        AbstractC8423h.m9023a(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                try {
                    C8417b c8417b = new C8417b(inputStreamM9493d);
                    c8417b.m8974a(this.f26231k + this.f26235o);
                    byte[] bArr2 = new byte[this.f26232l];
                    c8417b.readFully(bArr2);
                    this.f26233m = bArr2;
                    AbstractC9936n3.m10593a(inputStreamM9493d);
                    if (fileDescriptor != null) {
                        try {
                            AbstractC8423h.m9023a(fileDescriptor);
                        } catch (Exception unused3) {
                            AbstractC15256t.m16465c("ExifInterfaceUtils", "Error closing fd.");
                        }
                    }
                    return bArr2;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
                    AbstractC9936n3.m10593a(inputStreamM9493d);
                    if (fileDescriptor != null) {
                        AbstractC8423h.m9023a(fileDescriptor);
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = inputStreamM9493d;
                AbstractC9936n3.m10593a(inputStream);
                if (fileDescriptor != null) {
                    AbstractC8423h.m9023a(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception e14) {
            inputStreamM9493d = null;
            e10 = e14;
            fileDescriptor = null;
        } catch (Throwable th5) {
            th = th5;
            fileDescriptor = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9014p(C8417b c8417b) throws Throwable {
        if (f26214t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c8417b);
        }
        c8417b.f26168o0 = ByteOrder.LITTLE_ENDIAN;
        c8417b.m8974a(f26189I.length);
        int i10 = c8417b.readInt() + 8;
        byte[] bArr = f26190J;
        c8417b.m8974a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c8417b.readFully(bArr2);
                int i11 = c8417b.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f26191K, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    c8417b.readFully(bArr3);
                    this.f26235o = i12;
                    m9020x(0, bArr3);
                    m8995G(new C8417b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c8417b.m8974a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9015r(C8417b c8417b, HashMap map) throws Throwable {
        C8418c c8418c = (C8418c) map.get("JPEGInterchangeFormat");
        C8418c c8418c2 = (C8418c) map.get("JPEGInterchangeFormatLength");
        if (c8418c == null || c8418c2 == null) {
            return;
        }
        int iM8982h = c8418c.m8982h(this.f26227g);
        int iM8982h2 = c8418c2.m8982h(this.f26227g);
        if (this.f26224d == 7) {
            iM8982h += this.f26236p;
        }
        if (iM8982h > 0 && iM8982h2 > 0) {
            this.f26228h = true;
            if (this.f26221a == null && this.f26223c == null && this.f26222b == null) {
                byte[] bArr = new byte[iM8982h2];
                c8417b.m8974a(iM8982h);
                c8417b.readFully(bArr);
                this.f26233m = bArr;
            }
            this.f26231k = iM8982h;
            this.f26232l = iM8982h2;
        }
        if (f26214t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM8982h + ", length: " + iM8982h2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9016s(HashMap map) {
        C8418c c8418c = (C8418c) map.get("ImageLength");
        C8418c c8418c2 = (C8418c) map.get("ImageWidth");
        if (c8418c == null || c8418c2 == null) {
            return false;
        }
        return c8418c.m8982h(this.f26227g) <= 512 && c8418c2.m8982h(this.f26227g) <= 512;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:42:0x008f), top: B:52:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final void m9017t(InputStream inputStream) {
        boolean z6 = f26214t;
        for (int i10 = 0; i10 < f26202V.length; i10++) {
            try {
                try {
                    this.f26225e[i10] = new HashMap();
                } catch (Throwable th2) {
                    m9000a();
                    if (z6) {
                        m9019v();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                if (z6) {
                    AbstractC15256t.m16483u("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m9000a();
                if (!z6) {
                    return;
                }
            } catch (UnsupportedOperationException e11) {
                e = e11;
                if (z6) {
                    AbstractC15256t.m16483u("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m9000a();
                if (!z6) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM9006h = m9006h(bufferedInputStream);
        this.f26224d = iM9006h;
        if (iM9006h == 4 || iM9006h == 9 || iM9006h == 13 || iM9006h == 14) {
            C8417b c8417b = new C8417b(bufferedInputStream);
            int i11 = this.f26224d;
            if (i11 == 4) {
                m9005g(c8417b, 0, 0);
            } else if (i11 == 13) {
                m9008j(c8417b);
            } else if (i11 == 9) {
                m9009k(c8417b);
            } else if (i11 == 14) {
                m9014p(c8417b);
            }
        } else {
            C8421f c8421f = new C8421f(bufferedInputStream);
            int i12 = this.f26224d;
            if (i12 == 12) {
                m9004f(c8421f);
            } else if (i12 == 7) {
                m9007i(c8421f);
            } else if (i12 == 10) {
                m9012n(c8421f);
            } else {
                m9010l(c8421f);
            }
            c8421f.m8985e(this.f26235o);
            m8995G(c8421f);
        }
        m9000a();
        if (!z6) {
            return;
        }
        m9019v();
    }

    /* JADX INFO: renamed from: u */
    public final void m9018u(C8421f c8421f) throws IOException {
        ByteOrder byteOrderM8988w = m8988w(c8421f);
        this.f26227g = byteOrderM8988w;
        c8421f.f26168o0 = byteOrderM8988w;
        int unsignedShort = c8421f.readUnsignedShort();
        int i10 = this.f26224d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = c8421f.readInt();
        if (i11 < 8) {
            throw new IOException(AbstractC10763a.m11048f(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            c8421f.m8974a(i12);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m9019v() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f26225e;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "The size of tag group[", "]: ");
            sbM11057o.append(mapArr[i10].size());
            Log.d("ExifInterface", sbM11057o.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                C8418c c8418c = (C8418c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c8418c.toString() + ", tagValue: '" + c8418c.m8983i(this.f26227g) + Separators.QUOTE);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9020x(int i10, byte[] bArr) throws IOException {
        C8421f c8421f = new C8421f(bArr);
        m9018u(c8421f);
        m9021y(c8421f, i10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x0220  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:109:0x0231  */
    /* JADX WARN: Code duplicated, block: B:111:0x0238  */
    /* JADX WARN: Code duplicated, block: B:113:0x0255  */
    /* JADX WARN: Code duplicated, block: B:116:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0268  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x0301  */
    /* JADX WARN: Code duplicated, block: B:138:0x030b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0313  */
    /* JADX WARN: Code duplicated, block: B:149:0x033d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x02ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0167, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01ea, please report this as an issue */
    /* JADX INFO: renamed from: y */
    public final void m9021y(C8421f c8421f, int i10) throws IOException {
        HashMap[] mapArr;
        HashMap[] mapArr2;
        int i11;
        long j10;
        boolean z6;
        int i12;
        C8419d c8419d;
        Integer num;
        HashSet hashSet;
        String str;
        int unsignedShort;
        long j11;
        int i13;
        String strM11049g;
        int i14;
        Integer numValueOf = Integer.valueOf(c8421f.f26167Z);
        HashSet hashSet2 = this.f26226f;
        hashSet2.add(numValueOf);
        short s10 = c8421f.readShort();
        boolean z10 = f26214t;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s10));
        }
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            mapArr = this.f26225e;
            if (s11 >= s10) {
                break;
            }
            int unsignedShort2 = c8421f.readUnsignedShort();
            int unsignedShort3 = c8421f.readUnsignedShort();
            int i15 = c8421f.readInt();
            short s12 = s10;
            long j12 = ((long) c8421f.f26167Z) + 4;
            C8419d c8419d2 = (C8419d) f26204X[i10].get(Integer.valueOf(unsignedShort2));
            if (z10) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), c8419d2 != null ? c8419d2.f26176b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i15)));
            }
            if (c8419d2 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f26199S;
                    if (unsignedShort3 < iArr.length) {
                        int i16 = c8419d2.f26177c;
                        if (i16 == 7 || unsignedShort3 == 7 || i16 == unsignedShort3 || (i12 = c8419d2.f26178d) == unsignedShort3 || (((i16 == 4 || i12 == 4) && unsignedShort3 == 3) || (((i16 == 9 || i12 == 9) && unsignedShort3 == 8) || ((i16 == 12 || i12 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i16;
                            }
                            mapArr2 = mapArr;
                            i11 = unsignedShort3;
                            j10 = ((long) iArr[unsignedShort3]) * ((long) i15);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z10) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i15);
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f26198R[unsignedShort3] + ") is unexpected for tag: " + c8419d2.f26176b);
                        }
                    }
                    if (z6) {
                        if (j10 > 4) {
                            i14 = c8421f.readInt();
                            if (z10) {
                                Log.d("ExifInterface", "seek to data offset: " + i14);
                            }
                            if (this.f26224d != 7) {
                                c8419d = c8419d2;
                            } else {
                                if ("MakerNote".equals(c8419d2.f26176b)) {
                                    this.f26236p = i14;
                                } else if (i10 != 6 && "ThumbnailImage".equals(c8419d2.f26176b)) {
                                    this.f26237q = i14;
                                    this.f26238r = i15;
                                    C8418c c8418cM8979e = C8418c.m8979e(6, this.f26227g);
                                    C8418c c8418cM8976b = C8418c.m8976b(this.f26237q, this.f26227g);
                                    c8419d = c8419d2;
                                    C8418c c8418cM8976b2 = C8418c.m8976b(this.f26238r, this.f26227g);
                                    mapArr2[4].put("Compression", c8418cM8979e);
                                    mapArr2[4].put("JPEGInterchangeFormat", c8418cM8976b);
                                    mapArr2[4].put("JPEGInterchangeFormatLength", c8418cM8976b2);
                                }
                                c8419d = c8419d2;
                            }
                            c8421f.m8985e(i14);
                        } else {
                            i15 = i15;
                            c8419d = c8419d2;
                        }
                        num = (Integer) f26207a0.get(Integer.valueOf(unsignedShort2));
                        if (z10) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    j11 = ((long) c8421f.readInt()) & 4294967295L;
                                } else if (i11 == 8) {
                                    unsignedShort = c8421f.readShort();
                                } else if (i11 != 9 || i11 == 13) {
                                    unsignedShort = c8421f.readInt();
                                } else {
                                    j11 = -1;
                                }
                                if (z10) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                                }
                                i13 = c8421f.f26170q0;
                                if (j11 > 0 || (i13 != -1 && j11 >= i13)) {
                                    hashSet = hashSet2;
                                    if (z10) {
                                        strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i13 != -1) {
                                            strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                        }
                                        Log.d("ExifInterface", strM11049g);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                        c8421f.m8985e(j11);
                                        m9021y(c8421f, num.intValue());
                                    } else if (z10) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + Separators.RPAREN);
                                    }
                                }
                                c8421f.m8985e(j12);
                            } else {
                                unsignedShort = c8421f.readUnsignedShort();
                            }
                            j11 = unsignedShort;
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                            }
                            i13 = c8421f.f26170q0;
                            if (j11 > 0) {
                                hashSet = hashSet2;
                                if (z10) {
                                    strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strM11049g);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z10) {
                                    strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strM11049g);
                                }
                            }
                            c8421f.m8985e(j12);
                        } else {
                            hashSet = hashSet2;
                            C8419d c8419d3 = c8419d;
                            int i17 = c8421f.f26167Z + this.f26235o;
                            byte[] bArr = new byte[(int) j10];
                            c8421f.readFully(bArr);
                            C8418c c8418c = new C8418c(i17, bArr, i11, i15);
                            mapArr2[i10].put(c8419d3.f26176b, c8418c);
                            str = c8419d3.f26176b;
                            if ("DNGVersion".equals(str)) {
                                this.f26224d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c8418c.m8983i(this.f26227g).contains("PENTAX")) || ("Compression".equals(str) && c8418c.m8982h(this.f26227g) == 65535)) {
                                this.f26224d = 8;
                            }
                            if (c8421f.f26167Z != j12) {
                                c8421f.m8985e(j12);
                            }
                        }
                        hashSet2 = hashSet;
                        s10 = s12;
                        s11 = (short) (s11 + 1);
                    } else {
                        c8421f.m8985e(j12);
                        hashSet = hashSet2;
                    }
                    hashSet2 = hashSet;
                    s10 = s12;
                    s11 = (short) (s11 + 1);
                }
                mapArr2 = mapArr;
                if (z10) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                i11 = unsignedShort3;
                j10 = 0;
                z6 = false;
                if (z6) {
                    c8421f.m8985e(j12);
                    hashSet = hashSet2;
                } else {
                    if (j10 > 4) {
                        i14 = c8421f.readInt();
                        if (z10) {
                            Log.d("ExifInterface", "seek to data offset: " + i14);
                        }
                        if (this.f26224d != 7) {
                            c8419d = c8419d2;
                        } else {
                            if ("MakerNote".equals(c8419d2.f26176b)) {
                                this.f26236p = i14;
                            } else if (i10 != 6) {
                            }
                            c8419d = c8419d2;
                        }
                        c8421f.m8985e(i14);
                    } else {
                        i15 = i15;
                        c8419d = c8419d2;
                    }
                    num = (Integer) f26207a0.get(Integer.valueOf(unsignedShort2));
                    if (z10) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                j11 = ((long) c8421f.readInt()) & 4294967295L;
                            } else if (i11 == 8) {
                                if (i11 != 9) {
                                }
                                unsignedShort = c8421f.readInt();
                            } else {
                                unsignedShort = c8421f.readShort();
                            }
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                            }
                            i13 = c8421f.f26170q0;
                            if (j11 > 0) {
                                hashSet = hashSet2;
                                if (z10) {
                                    strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strM11049g);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z10) {
                                    strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i13 != -1) {
                                        strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strM11049g);
                                }
                            }
                            c8421f.m8985e(j12);
                        } else {
                            unsignedShort = c8421f.readUnsignedShort();
                        }
                        j11 = unsignedShort;
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                        }
                        i13 = c8421f.f26170q0;
                        if (j11 > 0) {
                            hashSet = hashSet2;
                            if (z10) {
                                strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strM11049g);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z10) {
                                strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strM11049g);
                            }
                        }
                        c8421f.m8985e(j12);
                    } else {
                        hashSet = hashSet2;
                        C8419d c8419d4 = c8419d;
                        int i18 = c8421f.f26167Z + this.f26235o;
                        byte[] bArr2 = new byte[(int) j10];
                        c8421f.readFully(bArr2);
                        C8418c c8418c2 = new C8418c(i18, bArr2, i11, i15);
                        mapArr2[i10].put(c8419d4.f26176b, c8418c2);
                        str = c8419d4.f26176b;
                        if ("DNGVersion".equals(str)) {
                            this.f26224d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f26224d = 8;
                        if (c8421f.f26167Z != j12) {
                            c8421f.m8985e(j12);
                        }
                    }
                    hashSet2 = hashSet;
                    s10 = s12;
                    s11 = (short) (s11 + 1);
                }
                hashSet2 = hashSet;
                s10 = s12;
                s11 = (short) (s11 + 1);
            } else if (z10) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            mapArr2 = mapArr;
            i11 = unsignedShort3;
            j10 = 0;
            z6 = false;
            if (z6) {
                c8421f.m8985e(j12);
                hashSet = hashSet2;
            } else {
                if (j10 > 4) {
                    i14 = c8421f.readInt();
                    if (z10) {
                        Log.d("ExifInterface", "seek to data offset: " + i14);
                    }
                    if (this.f26224d != 7) {
                        c8419d = c8419d2;
                    } else {
                        if ("MakerNote".equals(c8419d2.f26176b)) {
                            this.f26236p = i14;
                        } else if (i10 != 6) {
                        }
                        c8419d = c8419d2;
                    }
                    c8421f.m8985e(i14);
                } else {
                    i15 = i15;
                    c8419d = c8419d2;
                }
                num = (Integer) f26207a0.get(Integer.valueOf(unsignedShort2));
                if (z10) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            j11 = ((long) c8421f.readInt()) & 4294967295L;
                        } else if (i11 == 8) {
                            if (i11 != 9) {
                            }
                            unsignedShort = c8421f.readInt();
                        } else {
                            unsignedShort = c8421f.readShort();
                        }
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                        }
                        i13 = c8421f.f26170q0;
                        if (j11 > 0) {
                            hashSet = hashSet2;
                            if (z10) {
                                strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strM11049g);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z10) {
                                strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i13 != -1) {
                                    strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strM11049g);
                            }
                        }
                        c8421f.m8985e(j12);
                    } else {
                        unsignedShort = c8421f.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z10) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), c8419d.f26176b));
                    }
                    i13 = c8421f.f26170q0;
                    if (j11 > 0) {
                        hashSet = hashSet2;
                        if (z10) {
                            strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i13 != -1) {
                                strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                            }
                            Log.d("ExifInterface", strM11049g);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z10) {
                            strM11049g = AbstractC10763a.m11049g(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i13 != -1) {
                                strM11049g = strM11049g + " (total length: " + i13 + Separators.RPAREN;
                            }
                            Log.d("ExifInterface", strM11049g);
                        }
                    }
                    c8421f.m8985e(j12);
                } else {
                    hashSet = hashSet2;
                    C8419d c8419d5 = c8419d;
                    int i19 = c8421f.f26167Z + this.f26235o;
                    byte[] bArr3 = new byte[(int) j10];
                    c8421f.readFully(bArr3);
                    C8418c c8418c3 = new C8418c(i19, bArr3, i11, i15);
                    mapArr2[i10].put(c8419d5.f26176b, c8418c3);
                    str = c8419d5.f26176b;
                    if ("DNGVersion".equals(str)) {
                        this.f26224d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f26224d = 8;
                    if (c8421f.f26167Z != j12) {
                        c8421f.m8985e(j12);
                    }
                }
                hashSet2 = hashSet;
                s10 = s12;
                s11 = (short) (s11 + 1);
            }
            hashSet2 = hashSet;
            s10 = s12;
            s11 = (short) (s11 + 1);
        }
        HashSet hashSet3 = hashSet2;
        int i20 = c8421f.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i20)));
        }
        long j13 = i20;
        if (j13 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i20))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        c8421f.m8985e(j13);
        if (mapArr[4].isEmpty()) {
            m9021y(c8421f, 4);
        } else if (mapArr[5].isEmpty()) {
            m9021y(c8421f, 5);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9022z(String str) {
        for (int i10 = 0; i10 < f26202V.length; i10++) {
            this.f26225e[i10].remove(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9004f(C8421f c8421f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC8424i.m9026a(mediaMetadataRetriever, new C8416a(c8421f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if (AuthorizationHeaderIms.YES.equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if (AuthorizationHeaderIms.YES.equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f26225e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C8418c.m8979e(Integer.parseInt(strExtractMetadata), this.f26227g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C8418c.m8979e(Integer.parseInt(strExtractMetadata2), this.f26227g));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", C8418c.m8979e(i10, this.f26227g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException(CxcULo.BOyo);
                    }
                    c8421f.m8985e(i12);
                    byte[] bArr = new byte[6];
                    c8421f.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f26209c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    c8421f.readFully(bArr2);
                    this.f26235o = i14;
                    m9020x(0, bArr2);
                }
                if (f26214t) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    public C8422g(InputStream inputStream) throws IOException {
        C8419d[][] c8419dArr = f26202V;
        this.f26225e = new HashMap[c8419dArr.length];
        this.f26226f = new HashSet(c8419dArr.length);
        this.f26227g = ByteOrder.BIG_ENDIAN;
        this.f26221a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f26223c = (AssetManager.AssetInputStream) inputStream;
            this.f26222b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC8423h.m9025c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f26223c = null;
                this.f26222b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f26214t) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f26223c = null;
                this.f26222b = null;
            }
        } else {
            this.f26223c = null;
            this.f26222b = null;
        }
        m9017t(inputStream);
    }
}
