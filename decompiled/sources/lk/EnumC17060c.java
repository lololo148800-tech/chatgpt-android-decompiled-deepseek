package lk;

import p279L1.VOxZ.sVoFrD;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC17060c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17060c f54527Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17060c f54528Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC17060c[] f54529o0;

    static {
        EnumC17060c enumC17060c = new EnumC17060c("ROUGH", 0);
        f54527Y = enumC17060c;
        EnumC17060c enumC17060c2 = new EnumC17060c(sVoFrD.iqy, 1);
        f54528Z = enumC17060c2;
        EnumC17060c[] enumC17060cArr = {enumC17060c, enumC17060c2};
        f54529o0 = enumC17060cArr;
        AbstractC7877E4.m8156j(enumC17060cArr);
    }

    public static EnumC17060c valueOf(String str) {
        return (EnumC17060c) Enum.valueOf(EnumC17060c.class, str);
    }

    public static EnumC17060c[] values() {
        return (EnumC17060c[]) f54529o0.clone();
    }
}
