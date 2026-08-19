package androidx.datastore.preferences.protobuf;

import android.gov.nist.javax.sip.parser.TokenNames;
import p001A.AbstractC0010F;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10977p {

    /* JADX INFO: renamed from: Z */
    public static final EnumC10977p f33078Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10977p f33079o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10977p[] f33080p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC10977p[] f33081q0;

    /* JADX INFO: renamed from: Y */
    public final int f33082Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10977p EF6;

    static {
        EnumC10921A enumC10921A = EnumC10921A.DOUBLE;
        EnumC10977p enumC10977p = new EnumC10977p("DOUBLE", 0, 0, 1, enumC10921A);
        EnumC10921A enumC10921A2 = EnumC10921A.FLOAT;
        EnumC10977p enumC10977p2 = new EnumC10977p("FLOAT", 1, 1, 1, enumC10921A2);
        EnumC10921A enumC10921A3 = EnumC10921A.LONG;
        EnumC10977p enumC10977p3 = new EnumC10977p("INT64", 2, 2, 1, enumC10921A3);
        EnumC10977p enumC10977p4 = new EnumC10977p("UINT64", 3, 3, 1, enumC10921A3);
        EnumC10921A enumC10921A4 = EnumC10921A.INT;
        EnumC10977p enumC10977p5 = new EnumC10977p("INT32", 4, 4, 1, enumC10921A4);
        EnumC10977p enumC10977p6 = new EnumC10977p("FIXED64", 5, 5, 1, enumC10921A3);
        EnumC10977p enumC10977p7 = new EnumC10977p("FIXED32", 6, 6, 1, enumC10921A4);
        EnumC10921A enumC10921A5 = EnumC10921A.BOOLEAN;
        EnumC10977p enumC10977p8 = new EnumC10977p("BOOL", 7, 7, 1, enumC10921A5);
        EnumC10921A enumC10921A6 = EnumC10921A.STRING;
        EnumC10977p enumC10977p9 = new EnumC10977p("STRING", 8, 8, 1, enumC10921A6);
        EnumC10921A enumC10921A7 = EnumC10921A.MESSAGE;
        EnumC10977p enumC10977p10 = new EnumC10977p(TokenNames.MESSAGE, 9, 9, 1, enumC10921A7);
        EnumC10921A enumC10921A8 = EnumC10921A.BYTE_STRING;
        EnumC10977p enumC10977p11 = new EnumC10977p("BYTES", 10, 10, 1, enumC10921A8);
        EnumC10977p enumC10977p12 = new EnumC10977p("UINT32", 11, 11, 1, enumC10921A4);
        EnumC10921A enumC10921A9 = EnumC10921A.ENUM;
        EnumC10977p enumC10977p13 = new EnumC10977p("ENUM", 12, 12, 1, enumC10921A9);
        EnumC10977p enumC10977p14 = new EnumC10977p("SFIXED32", 13, 13, 1, enumC10921A4);
        EnumC10977p enumC10977p15 = new EnumC10977p("SFIXED64", 14, 14, 1, enumC10921A3);
        EnumC10977p enumC10977p16 = new EnumC10977p("SINT32", 15, 15, 1, enumC10921A4);
        EnumC10977p enumC10977p17 = new EnumC10977p("SINT64", 16, 16, 1, enumC10921A3);
        EnumC10977p enumC10977p18 = new EnumC10977p("GROUP", 17, 17, 1, enumC10921A7);
        EnumC10977p enumC10977p19 = new EnumC10977p("DOUBLE_LIST", 18, 18, 2, enumC10921A);
        EnumC10977p enumC10977p20 = new EnumC10977p("FLOAT_LIST", 19, 19, 2, enumC10921A2);
        EnumC10977p enumC10977p21 = new EnumC10977p("INT64_LIST", 20, 20, 2, enumC10921A3);
        EnumC10977p enumC10977p22 = new EnumC10977p("UINT64_LIST", 21, 21, 2, enumC10921A3);
        EnumC10977p enumC10977p23 = new EnumC10977p("INT32_LIST", 22, 22, 2, enumC10921A4);
        EnumC10977p enumC10977p24 = new EnumC10977p("FIXED64_LIST", 23, 23, 2, enumC10921A3);
        EnumC10977p enumC10977p25 = new EnumC10977p("FIXED32_LIST", 24, 24, 2, enumC10921A4);
        EnumC10977p enumC10977p26 = new EnumC10977p("BOOL_LIST", 25, 25, 2, enumC10921A5);
        EnumC10977p enumC10977p27 = new EnumC10977p("STRING_LIST", 26, 26, 2, enumC10921A6);
        EnumC10977p enumC10977p28 = new EnumC10977p("MESSAGE_LIST", 27, 27, 2, enumC10921A7);
        EnumC10977p enumC10977p29 = new EnumC10977p("BYTES_LIST", 28, 28, 2, enumC10921A8);
        EnumC10977p enumC10977p30 = new EnumC10977p("UINT32_LIST", 29, 29, 2, enumC10921A4);
        EnumC10977p enumC10977p31 = new EnumC10977p("ENUM_LIST", 30, 30, 2, enumC10921A9);
        EnumC10977p enumC10977p32 = new EnumC10977p("SFIXED32_LIST", 31, 31, 2, enumC10921A4);
        EnumC10977p enumC10977p33 = new EnumC10977p("SFIXED64_LIST", 32, 32, 2, enumC10921A3);
        EnumC10977p enumC10977p34 = new EnumC10977p("SINT32_LIST", 33, 33, 2, enumC10921A4);
        EnumC10977p enumC10977p35 = new EnumC10977p("SINT64_LIST", 34, 34, 2, enumC10921A3);
        EnumC10977p enumC10977p36 = new EnumC10977p("DOUBLE_LIST_PACKED", 35, 35, 3, enumC10921A);
        f33078Z = enumC10977p36;
        EnumC10977p enumC10977p37 = new EnumC10977p("FLOAT_LIST_PACKED", 36, 36, 3, enumC10921A2);
        EnumC10977p enumC10977p38 = new EnumC10977p("INT64_LIST_PACKED", 37, 37, 3, enumC10921A3);
        EnumC10977p enumC10977p39 = new EnumC10977p("UINT64_LIST_PACKED", 38, 38, 3, enumC10921A3);
        EnumC10977p enumC10977p40 = new EnumC10977p("INT32_LIST_PACKED", 39, 39, 3, enumC10921A4);
        EnumC10977p enumC10977p41 = new EnumC10977p("FIXED64_LIST_PACKED", 40, 40, 3, enumC10921A3);
        EnumC10977p enumC10977p42 = new EnumC10977p("FIXED32_LIST_PACKED", 41, 41, 3, enumC10921A4);
        EnumC10977p enumC10977p43 = new EnumC10977p("BOOL_LIST_PACKED", 42, 42, 3, enumC10921A5);
        EnumC10977p enumC10977p44 = new EnumC10977p("UINT32_LIST_PACKED", 43, 43, 3, enumC10921A4);
        EnumC10977p enumC10977p45 = new EnumC10977p("ENUM_LIST_PACKED", 44, 44, 3, enumC10921A9);
        EnumC10977p enumC10977p46 = new EnumC10977p("SFIXED32_LIST_PACKED", 45, 45, 3, enumC10921A4);
        EnumC10977p enumC10977p47 = new EnumC10977p("SFIXED64_LIST_PACKED", 46, 46, 3, enumC10921A3);
        EnumC10977p enumC10977p48 = new EnumC10977p("SINT32_LIST_PACKED", 47, 47, 3, enumC10921A4);
        EnumC10977p enumC10977p49 = new EnumC10977p("SINT64_LIST_PACKED", 48, 48, 3, enumC10921A3);
        f33079o0 = enumC10977p49;
        f33081q0 = new EnumC10977p[]{enumC10977p, enumC10977p2, enumC10977p3, enumC10977p4, enumC10977p5, enumC10977p6, enumC10977p7, enumC10977p8, enumC10977p9, enumC10977p10, enumC10977p11, enumC10977p12, enumC10977p13, enumC10977p14, enumC10977p15, enumC10977p16, enumC10977p17, enumC10977p18, enumC10977p19, enumC10977p20, enumC10977p21, enumC10977p22, enumC10977p23, enumC10977p24, enumC10977p25, enumC10977p26, enumC10977p27, enumC10977p28, enumC10977p29, enumC10977p30, enumC10977p31, enumC10977p32, enumC10977p33, enumC10977p34, enumC10977p35, enumC10977p36, enumC10977p37, enumC10977p38, enumC10977p39, enumC10977p40, enumC10977p41, enumC10977p42, enumC10977p43, enumC10977p44, enumC10977p45, enumC10977p46, enumC10977p47, enumC10977p48, enumC10977p49, new EnumC10977p("GROUP_LIST", 49, 49, 2, enumC10921A7), new EnumC10977p("MAP", 50, 50, 4, EnumC10921A.VOID)};
        EnumC10977p[] enumC10977pArrValues = values();
        f33080p0 = new EnumC10977p[enumC10977pArrValues.length];
        for (EnumC10977p enumC10977p50 : enumC10977pArrValues) {
            f33080p0[enumC10977p50.f33082Y] = enumC10977p50;
        }
    }

    public EnumC10977p(String str, int i10, int i11, int i12, EnumC10921A enumC10921A) {
        super(str, i10);
        this.f33082Y = i11;
        int iM24h = AbstractC0010F.m24h(i12);
        if (iM24h == 1 || iM24h == 3) {
            enumC10921A.getClass();
        }
        if (i12 == 1) {
            enumC10921A.ordinal();
        }
    }

    public static EnumC10977p valueOf(String str) {
        return (EnumC10977p) Enum.valueOf(EnumC10977p.class, str);
    }

    public static EnumC10977p[] values() {
        return (EnumC10977p[]) f33081q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m11682a() {
        return this.f33082Y;
    }
}
