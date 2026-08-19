package p575Xd;

import io.sentry.hints.C15370i;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Xd.n */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9455n {

    /* JADX INFO: renamed from: Y */
    public static final C15370i f28464Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9455n f28465Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9455n f28466o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC9455n[] f28467p0;

    static {
        EnumC9455n enumC9455n = new EnumC9455n("Decline", 0);
        f28465Z = enumC9455n;
        EnumC9455n enumC9455n2 = new EnumC9455n("Deny", 1);
        f28466o0 = enumC9455n2;
        EnumC9455n[] enumC9455nArr = {enumC9455n, enumC9455n2};
        f28467p0 = enumC9455nArr;
        AbstractC7877E4.m8156j(enumC9455nArr);
        f28464Y = new C15370i(19);
    }

    public static EnumC9455n valueOf(String str) {
        return (EnumC9455n) Enum.valueOf(EnumC9455n.class, str);
    }

    public static EnumC9455n[] values() {
        return (EnumC9455n[]) f28467p0.clone();
    }
}
