package p344Nl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5829a {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC5829a[] f19046Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5829a EF10;

    static {
        EnumC5829a[] enumC5829aArr = {new EnumC5829a("TELEPHONE", 0), new EnumC5829a("SPEECH", 1), new EnumC5829a("MUSIC", 2), new EnumC5829a("MUSIC_STEREO", 3), new EnumC5829a("MUSIC_HIGH_QUALITY", 4), new EnumC5829a("MUSIC_HIGH_QUALITY_STEREO", 5)};
        f19046Y = enumC5829aArr;
        AbstractC7877E4.m8156j(enumC5829aArr);
    }

    public static EnumC5829a valueOf(String str) {
        return (EnumC5829a) Enum.valueOf(EnumC5829a.class, str);
    }

    public static EnumC5829a[] values() {
        return (EnumC5829a[]) f19046Y.clone();
    }
}
