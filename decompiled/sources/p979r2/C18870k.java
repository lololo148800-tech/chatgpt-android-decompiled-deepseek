package p979r2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p1096x2.C21113h;
import p523V9.AbstractC8020X;
import p955q2.C18613e;
import p955q2.C18614f;

/* JADX INFO: renamed from: r2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C18870k extends AbstractC8020X {
    /* JADX INFO: renamed from: m */
    public static Font m20190m(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : RCHTTPStatusCodes.BAD_REQUEST, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM20192o = m20192o(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM20192o2 = m20192o(fontStyle, font2.getStyle());
            if (iM20192o2 < iM20192o) {
                font = font2;
                iM20192o = iM20192o2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: n */
    public static FontFamily m20191n(C21113h[] c21113hArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (C21113h c21113h : c21113hArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c21113h.f67063a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c21113h.f67065c).setSlant(c21113h.f67066d ? 1 : 0).setTtcIndex(c21113h.f67064b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e10) {
                AbstractC15256t.m16483u("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: o */
    public static int m20192o(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: g */
    public final Typeface mo8357g(Context context, C18613e c18613e, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (C18614f c18614f : c18613e.f59282a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c18614f.f59288f).setWeight(c18614f.f59284b).setSlant(c18614f.f59285c ? 1 : 0).setTtcIndex(c18614f.f59287e).setFontVariationSettings(c18614f.f59286d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m20190m(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            AbstractC15256t.m16483u("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: h */
    public final Typeface mo8358h(Context context, C21113h[] c21113hArr, int i10) {
        try {
            FontFamily fontFamilyM20191n = m20191n(c21113hArr, context.getContentResolver());
            if (fontFamilyM20191n == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM20191n).setStyle(m20190m(fontFamilyM20191n, i10).getStyle()).build();
        } catch (Exception e10) {
            AbstractC15256t.m16483u("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: i */
    public final Typeface mo8359i(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM20191n = m20191n((C21113h[]) list.get(0), contentResolver);
            if (fontFamilyM20191n == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM20191n);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyM20191n2 = m20191n((C21113h[]) list.get(i11), contentResolver);
                if (fontFamilyM20191n2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM20191n2);
                }
            }
            return customFallbackBuilder.setStyle(m20190m(fontFamilyM20191n, i10).getStyle()).build();
        } catch (Exception e10) {
            AbstractC15256t.m16483u("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: j */
    public final Typeface mo8360j(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: k */
    public final Typeface mo8361k(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            AbstractC15256t.m16483u("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // p523V9.AbstractC8020X
    /* JADX INFO: renamed from: l */
    public final C21113h mo8362l(C21113h[] c21113hArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
