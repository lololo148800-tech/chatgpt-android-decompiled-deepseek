package p992ri;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ri.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19019b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19019b f60599Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19019b f60600Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC19019b[] f60601o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f60602p0;

    static {
        EnumC19019b enumC19019b = new EnumC19019b("Sentry", 0);
        f60599Y = enumC19019b;
        EnumC19019b enumC19019b2 = new EnumC19019b("ForegroundDetector", 1);
        f60600Z = enumC19019b2;
        EnumC19019b[] enumC19019bArr = {enumC19019b, enumC19019b2};
        f60601o0 = enumC19019bArr;
        f60602p0 = AbstractC7877E4.m8156j(enumC19019bArr);
    }

    public static EnumC19019b valueOf(String str) {
        return (EnumC19019b) Enum.valueOf(EnumC19019b.class, str);
    }

    public static EnumC19019b[] values() {
        return (EnumC19019b[]) f60601o0.clone();
    }
}
