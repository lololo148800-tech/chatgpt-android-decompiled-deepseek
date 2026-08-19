package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strings) {
        AbstractC16544l.m18094g(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i11 = 0;
            while (i11 < length2) {
                bArr[i10] = (byte) str2.charAt(i11);
                i11++;
                i10++;
            }
        }
        return bArr;
    }
}
