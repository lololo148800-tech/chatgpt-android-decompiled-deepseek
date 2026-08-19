package p018Ag;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ag.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC0498c {
    public static final C0497b Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f1625Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC0498c[] f1626Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0498c EF7;

    static {
        EnumC0498c[] enumC0498cArr = {new EnumC0498c("PartialOutage", 0), new EnumC0498c("FullOutage", 1), new EnumC0498c("Normal", 2)};
        f1626Z = enumC0498cArr;
        AbstractC7877E4.m8156j(enumC0498cArr);
        Companion = new C0497b();
        f1625Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C0496a.f1624Y);
    }

    public static EnumC0498c valueOf(String str) {
        return (EnumC0498c) Enum.valueOf(EnumC0498c.class, str);
    }

    public static EnumC0498c[] values() {
        return (EnumC0498c[]) f1626Z.clone();
    }
}
