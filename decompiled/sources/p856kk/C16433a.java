package p856kk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p102Dm.AbstractC2119a;
import p138F8.vJO.vRJidSveZHcTw;
import p523V9.AbstractC7942M5;
import p538W2.C8422g;
import p544W9.AbstractC8746y3;
import p544W9.AbstractC8752z3;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: renamed from: kk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16433a {
    /* JADX INFO: renamed from: a */
    public static void m18019a(File file) {
        Map linkedHashMap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int iMin = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        try {
            try {
                List listM19382k = AbstractC17681o.m19382k("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", vRJidSveZHcTw.zrcbzhQMqNCs, "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance");
                C15378c c15378cM9492c = AbstractC8746y3.m9492c(file, new FileInputStream(file));
                try {
                    C8422g c8422g = new C8422g(c15378cM9492c);
                    List list = listM19382k;
                    int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
                    if (iM19257b < 16) {
                        iM19257b = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM19257b);
                    for (Object obj : list) {
                        linkedHashMap.put(obj, c8422g.m9001c((String) obj));
                    }
                    AbstractC7942M5.m8232a(c15378cM9492c, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(c15378cM9492c, th2);
                        throw th3;
                    }
                }
            } catch (IOException unused) {
                linkedHashMap = C17690x.f56481Y;
            }
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int i10 = options.outHeight;
            int i11 = options.outWidth;
            if (i10 > 2000 || i11 > 2000) {
                float f10 = i10;
                float f11 = 2000;
                iMin = Math.min(AbstractC2119a.m3195i(f10 / f11), AbstractC2119a.m3195i(i11 / f11));
            }
            options2.inSampleSize = iMin;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
            if (bitmapDecodeFile != null) {
                try {
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, c15379dM9509d);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC7942M5.m8232a(c15379dM9509d, th4);
                        throw th5;
                    }
                }
            }
            AbstractC7942M5.m8232a(c15379dM9509d, null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
        } catch (IllegalArgumentException unused2) {
        }
        try {
            C8422g c8422g2 = new C8422g(file.getAbsolutePath());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    c8422g2.m8994F(str, str2);
                }
            }
            c8422g2.m8990B();
        } catch (IOException unused3) {
        }
    }
}
