package com.google.android.renderscript;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p001A.AbstractC0010F;
import p594Y9.AbstractC9734G4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m18067d2 = {"Lcom/google/android/renderscript/Toolkit;", "", "", "createNative", "()J", "nativeHandle", "Landroid/graphics/Bitmap;", "inputBitmap", "outputBitmap", "", "coefficients", "Lcom/google/android/renderscript/Range2d;", "restriction", "Lmm/C;", "nativeConvolveBitmap", "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V", "renderscript-toolkit_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Toolkit {

    /* JADX INFO: renamed from: a */
    public static final Toolkit f36840a;

    /* JADX INFO: renamed from: b */
    public static final long f36841b;

    static {
        Toolkit toolkit = new Toolkit();
        f36840a = toolkit;
        try {
            System.loadLibrary("renderscript-toolkit");
            f36841b = toolkit.createNative();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m13698a(Bitmap bitmap, float[] fArr) {
        Toolkit toolkit = f36840a;
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException(("RenderScript Toolkit. convolve supports only ARGB_8888 and ALPHA_8 bitmaps. " + bitmap.getConfig() + " provided.").toString());
        }
        if (AbstractC9734G4.m10325d(bitmap) * bitmap.getWidth() != bitmap.getRowBytes()) {
            throw new IllegalArgumentException(AbstractC10763a.m11056n(AbstractC0010F.m21e("RenderScript Toolkit convolve. Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=", bitmap.getRowBytes(), ", width={", bitmap.getWidth(), ", and vectorSize="), AbstractC9734G4.m10325d(bitmap), Separators.DOT).toString());
        }
        if (fArr.length != 9 && fArr.length != 25) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(fArr.length, "RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. ", " coefficients provided.").toString());
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(...)");
        toolkit.nativeConvolveBitmap(f36841b, bitmap, bitmapCreateBitmap, fArr, null);
        return bitmapCreateBitmap;
    }

    private final native long createNative();

    private final native void nativeConvolveBitmap(long nativeHandle, Bitmap inputBitmap, Bitmap outputBitmap, float[] coefficients, Range2d restriction);
}
