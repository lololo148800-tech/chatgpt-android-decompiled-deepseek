package p808ic;

import java.util.HashMap;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: ic.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14959c {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(20, sVoFrD.EgMazpQt),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(26, "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: o0 */
    public static final HashMap f46591o0 = new HashMap();

    /* JADX INFO: renamed from: p0 */
    public static final HashMap f46592p0 = new HashMap();

    /* JADX INFO: renamed from: Y */
    public final int[] f46594Y;

    /* JADX INFO: renamed from: Z */
    public final String[] f46595Z;

    EnumC14959c(int i10, String... strArr) {
        this.f46594Y = new int[]{i10};
        this.f46595Z = strArr;
    }

    static {
        for (EnumC14959c enumC14959c : values()) {
            for (int i10 : enumC14959c.f46594Y) {
                f46591o0.put(Integer.valueOf(i10), enumC14959c);
            }
            f46592p0.put(enumC14959c.name(), enumC14959c);
            for (String str : enumC14959c.f46595Z) {
                f46592p0.put(str, enumC14959c);
            }
        }
    }

    EnumC14959c(int[] iArr, String... strArr) {
        this.f46594Y = iArr;
        this.f46595Z = strArr;
    }
}
