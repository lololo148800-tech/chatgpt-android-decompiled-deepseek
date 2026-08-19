package com.revenuecat.purchases.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1113xn.C21307a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0004H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u0011"}, m18067d2 = {"MICROS_MULTIPLIER", "", "playServicesVersionName", "", "Landroid/content/Context;", "getPlayServicesVersionName", "(Landroid/content/Context;)Ljava/lang/String;", "playStoreVersionName", "getPlayStoreVersionName", "versionName", "getVersionName", "getLocale", "Ljava/util/Locale;", "packageVersionName", "packageName", "sha1", SigningManager.POST_PARAMS_ALGORITHM, "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UtilsKt {
    public static final int MICROS_MULTIPLIER = 1000000;

    public static final Locale getLocale(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0) : context.getResources().getConfiguration().locale;
    }

    public static final String getPlayServicesVersionName(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final String getVersionName(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String sha1(String str) throws NoSuchAlgorithmException {
        AbstractC16544l.m18094g(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = C21307a.f67720a;
        byte[] bytes = str.getBytes(charset);
        AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC16544l.m18093f(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }

    public static final String sha256(String str) throws NoSuchAlgorithmException {
        AbstractC16544l.m18094g(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = C21307a.f67720a;
        byte[] bytes = str.getBytes(charset);
        AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC16544l.m18093f(bArrEncode, "encode(it, Base64.NO_WRAP)");
        return new String(bArrEncode, charset);
    }
}
