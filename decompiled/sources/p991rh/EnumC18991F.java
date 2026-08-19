package p991rh;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rh.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC18991F {
    public static final C18990E Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f60563Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18991F f60564Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18991F f60565o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC18991F f60566p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC18991F f60567q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC18991F[] f60568r0;

    static {
        EnumC18991F enumC18991F = new EnumC18991F("AceUpload", 0);
        f60564Z = enumC18991F;
        EnumC18991F enumC18991F2 = new EnumC18991F("MyFiles", 1);
        f60565o0 = enumC18991F2;
        EnumC18991F enumC18991F3 = new EnumC18991F("Multimodal", 2);
        f60566p0 = enumC18991F3;
        EnumC18991F enumC18991F4 = new EnumC18991F("DalleAgent", 3);
        f60567q0 = enumC18991F4;
        EnumC18991F[] enumC18991FArr = {enumC18991F, enumC18991F2, enumC18991F3, enumC18991F4};
        f60568r0 = enumC18991FArr;
        AbstractC7877E4.m8156j(enumC18991FArr);
        Companion = new C18990E();
        f60563Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C19016y.f60597o0);
    }

    public static EnumC18991F valueOf(String str) {
        return (EnumC18991F) Enum.valueOf(EnumC18991F.class, str);
    }

    public static EnumC18991F[] values() {
        return (EnumC18991F[]) f60568r0.clone();
    }
}
