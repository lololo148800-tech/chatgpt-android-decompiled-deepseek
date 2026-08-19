package bn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC11510b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11510b f34830Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11510b f34831Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11510b f34832o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC11510b[] f34833p0;

    static {
        EnumC11510b enumC11510b = new EnumC11510b("PROPERTY", 0);
        f34830Y = enumC11510b;
        EnumC11510b enumC11510b2 = new EnumC11510b("BACKING_FIELD", 1);
        f34831Z = enumC11510b2;
        EnumC11510b enumC11510b3 = new EnumC11510b("DELEGATE_FIELD", 2);
        f34832o0 = enumC11510b3;
        EnumC11510b[] enumC11510bArr = {enumC11510b, enumC11510b2, enumC11510b3};
        f34833p0 = enumC11510bArr;
        AbstractC7877E4.m8156j(enumC11510bArr);
    }

    public static EnumC11510b valueOf(String str) {
        return (EnumC11510b) Enum.valueOf(EnumC11510b.class, str);
    }

    public static EnumC11510b[] values() {
        return (EnumC11510b[]) f34833p0.clone();
    }
}
