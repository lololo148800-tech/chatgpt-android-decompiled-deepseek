package p040Bd;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Bd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1124m {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC1124m[] f3037Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1124m EF12;

    static {
        EnumC1124m[] enumC1124mArr = {new EnumC1124m("Text", 0), new EnumC1124m("ExecutionOutput", 1), new EnumC1124m("Code", 2), new EnumC1124m("MultimodalText", 3), new EnumC1124m("TetherBrowsingCode", 4), new EnumC1124m("SystemError", 5), new EnumC1124m("ModelEditableContext", 6), new EnumC1124m(SIPHeaderNames.UNSUPPORTED, 7)};
        f3037Y = enumC1124mArr;
        AbstractC7877E4.m8156j(enumC1124mArr);
    }

    public static EnumC1124m valueOf(String str) {
        return (EnumC1124m) Enum.valueOf(EnumC1124m.class, str);
    }

    public static EnumC1124m[] values() {
        return (EnumC1124m[]) f3037Y.clone();
    }
}
