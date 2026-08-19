package p1150zd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21867c {
    public static final C21866b Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f69339Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21867c f69340Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21867c f69341o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21867c[] f69342p0;

    static {
        EnumC21867c enumC21867c = new EnumC21867c("ThumbsUp", 0);
        f69340Z = enumC21867c;
        EnumC21867c enumC21867c2 = new EnumC21867c("ThumbsDown", 1);
        f69341o0 = enumC21867c2;
        EnumC21867c[] enumC21867cArr = {enumC21867c, enumC21867c2};
        f69342p0 = enumC21867cArr;
        AbstractC7877E4.m8156j(enumC21867cArr);
        Companion = new C21866b();
        f69339Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21865a.f69336Z);
    }

    public static EnumC21867c valueOf(String str) {
        return (EnumC21867c) Enum.valueOf(EnumC21867c.class, str);
    }

    public static EnumC21867c[] values() {
        return (EnumC21867c[]) f69342p0.clone();
    }
}
