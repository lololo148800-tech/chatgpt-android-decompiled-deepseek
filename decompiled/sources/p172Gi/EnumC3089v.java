package p172Gi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Gi.v */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC3089v {
    public static final C3088u Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f9297Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3089v f9298Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3089v f9299o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3089v[] f9300p0;

    static {
        EnumC3089v enumC3089v = new EnumC3089v("ThumbsUp", 0);
        f9298Z = enumC3089v;
        EnumC3089v enumC3089v2 = new EnumC3089v("ThumbsDown", 1);
        f9299o0 = enumC3089v2;
        EnumC3089v[] enumC3089vArr = {enumC3089v, enumC3089v2};
        f9300p0 = enumC3089vArr;
        AbstractC7877E4.m8156j(enumC3089vArr);
        Companion = new C3088u();
        f9297Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C3087t.f9294Z);
    }

    public static EnumC3089v valueOf(String str) {
        return (EnumC3089v) Enum.valueOf(EnumC3089v.class, str);
    }

    public static EnumC3089v[] values() {
        return (EnumC3089v[]) f9300p0.clone();
    }
}
