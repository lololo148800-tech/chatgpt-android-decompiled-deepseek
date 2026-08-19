package com.statsig.androidsdk;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1113xn.C21307a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\n"}, m18067d2 = {"Lcom/statsig/androidsdk/Hashing;", "", "()V", "getDJB2HashString", "", "input", "getHashedString", "algorithm", "Lcom/statsig/androidsdk/HashAlgorithm;", "getSHA256HashString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Hashing {
    public static final Hashing INSTANCE = new Hashing();

    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HashAlgorithm.valuesCustom().length];
            iArr[HashAlgorithm.DJB2.ordinal()] = 1;
            iArr[HashAlgorithm.SHA256.ordinal()] = 2;
            iArr[HashAlgorithm.NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Hashing() {
    }

    private final String getDJB2HashString(String input) {
        if (input == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = input.toCharArray();
        AbstractC16544l.m18093f(charArray, "(this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c9 = charArray[i10];
            i10++;
            i11 = ((i11 << 5) - i11) + c9;
        }
        return Long.toString(((long) i11) & 4294967295L, 10);
    }

    private final String getSHA256HashString(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = C21307a.f67720a;
        if (input == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = input.getBytes(charset);
        AbstractC16544l.m18093f(bytes, "(this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 2);
        AbstractC16544l.m18093f(strEncodeToString, "encodeToString(bytes, android.util.Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final String getHashedString(String input, HashAlgorithm algorithm) {
        AbstractC16544l.m18094g(input, "input");
        int i10 = algorithm == null ? -1 : WhenMappings.$EnumSwitchMapping$0[algorithm.ordinal()];
        if (i10 == 1) {
            return getDJB2HashString(input);
        }
        if (i10 != 2) {
            return i10 != 3 ? getSHA256HashString(input) : input;
        }
        return getSHA256HashString(input);
    }
}
