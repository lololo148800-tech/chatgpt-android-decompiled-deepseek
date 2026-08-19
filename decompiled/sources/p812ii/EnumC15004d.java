package p812ii;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ii.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC15004d {
    public static final C15003c Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f46693Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC15004d[] f46694Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ C20007b f46695o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC15004d EF10;

    static {
        EnumC15004d[] enumC15004dArr = {new EnumC15004d("ADD", 0), new EnumC15004d("REMOVE", 1), new EnumC15004d("REPLACE", 2), new EnumC15004d("APPEND", 3), new EnumC15004d("TRUNCATE", 4), new EnumC15004d("PATCH", 5)};
        f46694Z = enumC15004dArr;
        f46695o0 = AbstractC7877E4.m8156j(enumC15004dArr);
        Companion = new C15003c();
        f46693Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C15002b.f46692Y);
    }

    public static EnumC15004d valueOf(String str) {
        return (EnumC15004d) Enum.valueOf(EnumC15004d.class, str);
    }

    public static EnumC15004d[] values() {
        return (EnumC15004d[]) f46694Z.clone();
    }
}
