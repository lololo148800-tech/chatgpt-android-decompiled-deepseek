package p793ho;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.p1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14808p1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14808p1 f46266Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14808p1 f46267Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14808p1 f46268o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14808p1[] f46269p0;

    static {
        EnumC14808p1 enumC14808p1 = new EnumC14808p1("PRESET", 0);
        f46266Y = enumC14808p1;
        EnumC14808p1 enumC14808p2 = new EnumC14808p1(TokenNames.OPTIONS, 1);
        f46267Z = enumC14808p2;
        EnumC14808p1 enumC14808p3 = new EnumC14808p1("ENCODINGOPTIONS_NOT_SET", 2);
        f46268o0 = enumC14808p3;
        f46269p0 = new EnumC14808p1[]{enumC14808p1, enumC14808p2, enumC14808p3};
    }

    public static EnumC14808p1 valueOf(String str) {
        return (EnumC14808p1) Enum.valueOf(EnumC14808p1.class, str);
    }

    public static EnumC14808p1[] values() {
        return (EnumC14808p1[]) f46269p0.clone();
    }
}
