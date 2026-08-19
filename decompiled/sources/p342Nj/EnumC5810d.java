package p342Nj;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse$GpsCollectionRequirement$Companion;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5810d {
    private static final /* synthetic */ InterfaceC20006a $ENTRIES;
    private static final /* synthetic */ EnumC5810d[] $VALUES;
    public static final CreateInquirySessionResponse$GpsCollectionRequirement$Companion Companion;
    public static final EnumC5810d NONE;
    public static final EnumC5810d OPTIONAL;
    public static final EnumC5810d REQUIRE;

    static {
        EnumC5810d enumC5810d = new EnumC5810d("REQUIRE", 0);
        REQUIRE = enumC5810d;
        EnumC5810d enumC5810d2 = new EnumC5810d("OPTIONAL", 1);
        OPTIONAL = enumC5810d2;
        EnumC5810d enumC5810d3 = new EnumC5810d("NONE", 2);
        NONE = enumC5810d3;
        EnumC5810d[] enumC5810dArr = {enumC5810d, enumC5810d2, enumC5810d3};
        $VALUES = enumC5810dArr;
        $ENTRIES = AbstractC7877E4.m8156j(enumC5810dArr);
        Companion = new CreateInquirySessionResponse$GpsCollectionRequirement$Companion();
    }

    public static EnumC5810d valueOf(String str) {
        return (EnumC5810d) Enum.valueOf(EnumC5810d.class, str);
    }

    public static EnumC5810d[] values() {
        return (EnumC5810d[]) $VALUES.clone();
    }
}
