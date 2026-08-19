package p793ho;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14871y1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14871y1 f46352Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14871y1 f46353Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14871y1 f46354o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14871y1[] f46355p0;

    static {
        EnumC14871y1 enumC14871y1 = new EnumC14871y1("PRESET", 0);
        f46352Y = enumC14871y1;
        EnumC14871y1 enumC14871y2 = new EnumC14871y1(TokenNames.OPTIONS, 1);
        f46353Z = enumC14871y2;
        EnumC14871y1 enumC14871y3 = new EnumC14871y1("ENCODINGOPTIONS_NOT_SET", 2);
        f46354o0 = enumC14871y3;
        f46355p0 = new EnumC14871y1[]{enumC14871y1, enumC14871y2, enumC14871y3};
    }

    public static EnumC14871y1 valueOf(String str) {
        return (EnumC14871y1) Enum.valueOf(EnumC14871y1.class, str);
    }

    public static EnumC14871y1[] values() {
        return (EnumC14871y1[]) f46355p0.clone();
    }
}
