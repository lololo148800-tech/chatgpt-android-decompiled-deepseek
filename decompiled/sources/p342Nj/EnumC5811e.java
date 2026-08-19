package p342Nj;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse$GpsPrecisionRequirement$Companion;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5811e {
    private static final /* synthetic */ InterfaceC20006a $ENTRIES;
    private static final /* synthetic */ EnumC5811e[] $VALUES;
    public static final CreateInquirySessionResponse$GpsPrecisionRequirement$Companion Companion;
    public static final EnumC5811e PRECISE;
    public static final EnumC5811e ROUGH;

    static {
        EnumC5811e enumC5811e = new EnumC5811e("ROUGH", 0);
        ROUGH = enumC5811e;
        EnumC5811e enumC5811e2 = new EnumC5811e("PRECISE", 1);
        PRECISE = enumC5811e2;
        EnumC5811e[] enumC5811eArr = {enumC5811e, enumC5811e2};
        $VALUES = enumC5811eArr;
        $ENTRIES = AbstractC7877E4.m8156j(enumC5811eArr);
        Companion = new CreateInquirySessionResponse$GpsPrecisionRequirement$Companion();
    }

    public static EnumC5811e valueOf(String str) {
        return (EnumC5811e) Enum.valueOf(EnumC5811e.class, str);
    }

    public static EnumC5811e[] values() {
        return (EnumC5811e[]) $VALUES.clone();
    }
}
