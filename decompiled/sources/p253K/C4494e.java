package p253K;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.location.Location;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.sentry.android.core.AbstractC15256t;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p003A1.C0284r0;
import p523V9.AbstractC8072d6;
import p538W2.C8418c;
import p538W2.C8422g;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: renamed from: K.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4494e {

    /* JADX INFO: renamed from: b */
    public static final C0284r0 f14655b = new C0284r0(3);

    /* JADX INFO: renamed from: c */
    public static final C0284r0 f14656c = new C0284r0(4);

    /* JADX INFO: renamed from: d */
    public static final C0284r0 f14657d = new C0284r0(5);

    /* JADX INFO: renamed from: e */
    public static final List f14658e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", bQBnquXS.RAetnAGatbBMeju, "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", lZYtIbClQJm.rqsxYbLulpZAnX, "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", YladLSetV.rNPPNLHBM, "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f */
    public static final List f14659f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a */
    public final C8422g f14660a;

    public C4494e(C8422g c8422g) {
        this.f14660a = c8422g;
    }

    /* JADX INFO: renamed from: a */
    public final void m5227a(C4494e c4494e) {
        ArrayList<String> arrayList = new ArrayList(f14658e);
        arrayList.removeAll(f14659f);
        for (String str : arrayList) {
            String strM9001c = this.f14660a.m9001c(str);
            C8422g c8422g = c4494e.f14660a;
            String strM9001c2 = c8422g.m9001c(str);
            if (strM9001c != null && !strM9001c.equals(strM9001c2)) {
                c8422g.m8994F(str, strM9001c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5228b() {
        switch (this.f14660a.m9002d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5229c(int i10) {
        int i11 = i10 % 90;
        C8422g c8422g = this.f14660a;
        if (i11 != 0) {
            Locale locale = Locale.US;
            AbstractC8072d6.m8492i("e", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i10 + " is unsupported.");
            c8422g.m8994F("Orientation", String.valueOf(0));
            return;
        }
        int i12 = i10 % 360;
        int iM9002d = c8422g.m9002d(0, "Orientation");
        while (i12 < 0) {
            i12 += 90;
            switch (iM9002d) {
                case 2:
                    iM9002d = 5;
                    break;
                case 3:
                case 8:
                    iM9002d = 6;
                    break;
                case 4:
                    iM9002d = 7;
                    break;
                case 5:
                    iM9002d = 4;
                    break;
                case 6:
                    iM9002d = 1;
                    break;
                case 7:
                    iM9002d = 2;
                    break;
                default:
                    iM9002d = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (iM9002d) {
                case 2:
                    iM9002d = 7;
                    break;
                case 3:
                    iM9002d = 8;
                    break;
                case 4:
                    iM9002d = 5;
                    break;
                case 5:
                    iM9002d = 2;
                    break;
                case 6:
                    iM9002d = 3;
                    break;
                case 7:
                    iM9002d = 4;
                    break;
                case 8:
                    iM9002d = 1;
                    break;
                default:
                    iM9002d = 6;
                    break;
            }
        }
        c8422g.m8994F("Orientation", String.valueOf(iM9002d));
    }

    /* JADX INFO: renamed from: d */
    public final void m5230d() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0284r0 c0284r0 = f14657d;
        String str = ((SimpleDateFormat) c0284r0.get()).format(new Date(jCurrentTimeMillis));
        C8422g c8422g = this.f14660a;
        c8422g.m8994F("DateTime", str);
        try {
            c8422g.m8994F("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) c0284r0.get()).parse(str).getTime()));
        } catch (ParseException unused) {
        }
        c8422g.m8990B();
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    public final String toString() throws Throwable {
        double[] dArr;
        double d10;
        double dM8981g;
        Boolean bool;
        long time;
        Location location;
        Integer num;
        Integer num2;
        Boolean bool2;
        byte b;
        long time2;
        Locale locale = Locale.ENGLISH;
        C8422g c8422g = this.f14660a;
        Integer numValueOf = Integer.valueOf(c8422g.m9002d(0, "ImageWidth"));
        Integer numValueOf2 = Integer.valueOf(c8422g.m9002d(0, "ImageLength"));
        Integer numValueOf3 = Integer.valueOf(m5228b());
        int iM9002d = c8422g.m9002d(0, "Orientation");
        Boolean boolValueOf = Boolean.valueOf(iM9002d == 4 || iM9002d == 5 || iM9002d == 7);
        Boolean boolValueOf2 = Boolean.valueOf(c8422g.m9002d(0, "Orientation") == 2);
        String strM9001c = c8422g.m9001c("GPSProcessingMethod");
        String strM9001c2 = c8422g.m9001c("GPSLatitude");
        String strM9001c3 = c8422g.m9001c("GPSLatitudeRef");
        String strM9001c4 = c8422g.m9001c("GPSLongitude");
        String strM9001c5 = c8422g.m9001c("GPSLongitudeRef");
        if (strM9001c2 == null || strM9001c3 == null || strM9001c4 == null || strM9001c5 == null) {
            dArr = null;
        } else {
            try {
                dArr = new double[]{C8422g.m8986b(strM9001c2, strM9001c3), C8422g.m8986b(strM9001c4, strM9001c5)};
            } catch (IllegalArgumentException unused) {
                StringBuilder sbM9896o = AbstractC9306j0.m9896o("latValue=", strM9001c2, ", latRef=", strM9001c3, ", lngValue=");
                sbM9896o.append(strM9001c4);
                sbM9896o.append(", lngRef=");
                sbM9896o.append(strM9001c5);
                AbstractC15256t.m16482t("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbM9896o.toString()));
                dArr = null;
            }
        }
        C8418c c8418cM9003e = c8422g.m9003e("GPSAltitude");
        double dM8981g2 = -1.0d;
        if (c8418cM9003e != null) {
            try {
                dM8981g2 = c8418cM9003e.m8981g(c8422g.f26227g);
            } catch (NumberFormatException unused2) {
            }
        }
        int iM9002d2 = c8422g.m9002d(-1, "GPSAltitudeRef");
        if (dM8981g2 < 0.0d || iM9002d2 < 0) {
            dArr = dArr;
            d10 = 0.0d;
        } else {
            d10 = dM8981g2 * ((double) (iM9002d2 == 1 ? -1 : 1));
        }
        C8418c c8418cM9003e2 = c8422g.m9003e("GPSSpeed");
        if (c8418cM9003e2 == null) {
            dM8981g = 0.0d;
        } else {
            try {
                dM8981g = c8418cM9003e2.m8981g(c8422g.f26227g);
            } catch (NumberFormatException unused3) {
                dM8981g = 0.0d;
            }
        }
        String strM9001c6 = c8422g.m9001c("GPSSpeedRef");
        if (strM9001c6 == null) {
            strM9001c6 = TokenNames.f32013K;
        }
        String strM9001c7 = c8422g.m9001c("GPSDateStamp");
        String strM9001c8 = c8422g.m9001c("GPSTimeStamp");
        C0284r0 c0284r0 = f14657d;
        long j10 = -1;
        if (strM9001c7 == null && strM9001c8 == null) {
            bool = boolValueOf2;
            time = -1;
        } else {
            try {
                if (strM9001c8 == null) {
                    time = ((SimpleDateFormat) f14655b.get()).parse(strM9001c7).getTime();
                } else if (strM9001c7 == null) {
                    time = ((SimpleDateFormat) f14656c.get()).parse(strM9001c8).getTime();
                } else {
                    bool = boolValueOf2;
                    String strM9890i = AbstractC9306j0.m9890i(strM9001c7, Separators.f31991SP, strM9001c8);
                    if (strM9890i == null) {
                        time = -1;
                    } else {
                        try {
                            time = ((SimpleDateFormat) c0284r0.get()).parse(strM9890i).getTime();
                        } catch (ParseException unused4) {
                            time = -1;
                        }
                    }
                }
                bool = boolValueOf2;
            } catch (ParseException unused5) {
                bool = boolValueOf2;
            }
        }
        if (dArr == null) {
            num2 = numValueOf3;
            bool2 = boolValueOf;
            location = null;
            num = numValueOf2;
        } else {
            if (strM9001c == null) {
                strM9001c = "e";
            }
            location = new Location(strM9001c);
            num = numValueOf2;
            num2 = numValueOf3;
            location.setLatitude(dArr[0]);
            bool2 = boolValueOf;
            location.setLongitude(dArr[1]);
            if (d10 != 0.0d) {
                location.setAltitude(d10);
            }
            if (dM8981g != 0.0d) {
                int iHashCode = strM9001c6.hashCode();
                if (iHashCode != 75) {
                    if (iHashCode != 77) {
                        if (iHashCode == 78 && strM9001c6.equals("N")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strM9001c6.equals(TokenNames.f32015M)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strM9001c6.equals(TokenNames.f32013K)) {
                    b = 2;
                } else {
                    b = -1;
                }
                if (b != 0) {
                    dM8981g *= b != 1 ? 0.621371d : 1.15078d;
                }
                location.setSpeed((float) (dM8981g / 2.23694d));
            }
            if (time != -1) {
                location.setTime(time);
            }
        }
        String strM9001c9 = c8422g.m9001c("DateTimeOriginal");
        if (strM9001c9 == null) {
            time2 = -1;
        } else {
            try {
                time2 = ((SimpleDateFormat) c0284r0.get()).parse(strM9001c9).getTime();
            } catch (ParseException unused6) {
                time2 = -1;
            }
        }
        if (time2 != -1) {
            String strM9001c10 = c8422g.m9001c("SubSecTimeOriginal");
            if (strM9001c10 != null) {
                try {
                    long j11 = Long.parseLong(strM9001c10);
                    while (j11 > 1000) {
                        j11 /= 10;
                    }
                    time2 += j11;
                } catch (NumberFormatException unused7) {
                }
            }
            j10 = time2;
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", numValueOf, num, num2, bool2, bool, location, Long.valueOf(j10), c8422g.m9001c("ImageDescription"));
    }
}
