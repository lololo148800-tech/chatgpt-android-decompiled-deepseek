package bo;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: bo.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C11531s {
    /* JADX INFO: renamed from: a */
    public final String m12924a(SerialDescriptor descriptor, String serialName) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serialName, "serialName");
        StringBuilder sb2 = new StringBuilder(serialName.length() * 2);
        Character chValueOf = null;
        int i10 = 0;
        for (int i11 = 0; i11 < serialName.length(); i11++) {
            char cCharAt = serialName.charAt(i11);
            if (Character.isUpperCase(cCharAt)) {
                if (i10 == 0 && sb2.length() > 0 && AbstractC21322p.m21682P(sb2) != '_') {
                    sb2.append('_');
                }
                if (chValueOf != null) {
                    sb2.append(chValueOf.charValue());
                }
                i10++;
                chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
            } else {
                if (chValueOf != null) {
                    if (i10 > 1 && Character.isLetter(cCharAt)) {
                        sb2.append('_');
                    }
                    sb2.append(chValueOf.charValue());
                    chValueOf = null;
                    i10 = 0;
                }
                sb2.append(cCharAt);
            }
        }
        if (chValueOf != null) {
            sb2.append(chValueOf.charValue());
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
    }
}
