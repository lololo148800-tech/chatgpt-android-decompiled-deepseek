package p1083we;

import androidx.work.impl.utils.p651oZ.HhJS;
import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: we.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC20938x {
    public static final C20937w Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f66702Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC20938x[] f66703Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC20938x EF7;

    static {
        EnumC20938x[] enumC20938xArr = {new EnumC20938x(HhJS.IOHPbGbILHS, 0), new EnumC20938x("AboutModelMessage", 1)};
        f66703Z = enumC20938xArr;
        AbstractC7877E4.m8156j(enumC20938xArr);
        Companion = new C20937w();
        f66702Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C20936v.f66699Z);
    }

    public static EnumC20938x valueOf(String str) {
        return (EnumC20938x) Enum.valueOf(EnumC20938x.class, str);
    }

    public static EnumC20938x[] values() {
        return (EnumC20938x[]) f66703Z.clone();
    }
}
