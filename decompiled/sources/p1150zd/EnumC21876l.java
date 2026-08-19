package p1150zd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zd.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21876l {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21876l f69362Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21876l f69363Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC21876l[] f69364o0;

    static {
        EnumC21876l enumC21876l = new EnumC21876l("AssistantFeedback", 0);
        f69362Y = enumC21876l;
        EnumC21876l enumC21876l2 = new EnumC21876l("UserAudioTranscription", 1);
        f69363Z = enumC21876l2;
        EnumC21876l[] enumC21876lArr = {enumC21876l, enumC21876l2};
        f69364o0 = enumC21876lArr;
        AbstractC7877E4.m8156j(enumC21876lArr);
    }

    public static EnumC21876l valueOf(String str) {
        return (EnumC21876l) Enum.valueOf(EnumC21876l.class, str);
    }

    public static EnumC21876l[] values() {
        return (EnumC21876l[]) f69364o0.clone();
    }
}
