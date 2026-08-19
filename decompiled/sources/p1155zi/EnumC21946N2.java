package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zi.N2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21946N2 {
    public static final C21942M2 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f69496Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21946N2 f69497Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21946N2 f69498o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21946N2 f69499p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC21946N2[] f69500q0;

    static {
        EnumC21946N2 enumC21946N2 = new EnumC21946N2("Audio", 0);
        f69497Z = enumC21946N2;
        EnumC21946N2 enumC21946N3 = new EnumC21946N2("Video", 1);
        f69498o0 = enumC21946N3;
        EnumC21946N2 enumC21946N4 = new EnumC21946N2("AudioAndVideo", 2);
        f69499p0 = enumC21946N4;
        EnumC21946N2[] enumC21946N2Arr = {enumC21946N2, enumC21946N3, enumC21946N4};
        f69500q0 = enumC21946N2Arr;
        AbstractC7877E4.m8156j(enumC21946N2Arr);
        Companion = new C21942M2();
        f69496Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69592F0);
    }

    public static EnumC21946N2 valueOf(String str) {
        return (EnumC21946N2) Enum.valueOf(EnumC21946N2.class, str);
    }

    public static EnumC21946N2[] values() {
        return (EnumC21946N2[]) f69500q0.clone();
    }
}
