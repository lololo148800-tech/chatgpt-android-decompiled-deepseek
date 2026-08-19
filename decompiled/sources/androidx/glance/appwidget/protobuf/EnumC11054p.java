package androidx.glance.appwidget.protobuf;

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
/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.p */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11054p {

    /* JADX INFO: renamed from: Z */
    public static final EnumC11054p f33334Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11054p f33335o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11054p[] f33336p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC11054p[] f33337q0;

    /* JADX INFO: renamed from: Y */
    public final int f33338Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11054p EF6;

    static {
        EnumC11006B enumC11006B = EnumC11006B.DOUBLE;
        EnumC11054p enumC11054p = new EnumC11054p("DOUBLE", 0, 0, 1, enumC11006B);
        EnumC11006B enumC11006B2 = EnumC11006B.FLOAT;
        EnumC11054p enumC11054p2 = new EnumC11054p("FLOAT", 1, 1, 1, enumC11006B2);
        EnumC11006B enumC11006B3 = EnumC11006B.LONG;
        EnumC11054p enumC11054p3 = new EnumC11054p("INT64", 2, 2, 1, enumC11006B3);
        EnumC11054p enumC11054p4 = new EnumC11054p("UINT64", 3, 3, 1, enumC11006B3);
        EnumC11006B enumC11006B4 = EnumC11006B.INT;
        EnumC11054p enumC11054p5 = new EnumC11054p("INT32", 4, 4, 1, enumC11006B4);
        EnumC11054p enumC11054p6 = new EnumC11054p("FIXED64", 5, 5, 1, enumC11006B3);
        EnumC11054p enumC11054p7 = new EnumC11054p("FIXED32", 6, 6, 1, enumC11006B4);
        EnumC11006B enumC11006B5 = EnumC11006B.BOOLEAN;
        EnumC11054p enumC11054p8 = new EnumC11054p("BOOL", 7, 7, 1, enumC11006B5);
        EnumC11006B enumC11006B6 = EnumC11006B.STRING;
        EnumC11054p enumC11054p9 = new EnumC11054p("STRING", 8, 8, 1, enumC11006B6);
        EnumC11006B enumC11006B7 = EnumC11006B.MESSAGE;
        EnumC11054p enumC11054p10 = new EnumC11054p(TokenNames.MESSAGE, 9, 9, 1, enumC11006B7);
        EnumC11006B enumC11006B8 = EnumC11006B.BYTE_STRING;
        EnumC11054p enumC11054p11 = new EnumC11054p("BYTES", 10, 10, 1, enumC11006B8);
        EnumC11054p enumC11054p12 = new EnumC11054p("UINT32", 11, 11, 1, enumC11006B4);
        EnumC11006B enumC11006B9 = EnumC11006B.ENUM;
        EnumC11054p enumC11054p13 = new EnumC11054p("ENUM", 12, 12, 1, enumC11006B9);
        EnumC11054p enumC11054p14 = new EnumC11054p("SFIXED32", 13, 13, 1, enumC11006B4);
        EnumC11054p enumC11054p15 = new EnumC11054p("SFIXED64", 14, 14, 1, enumC11006B3);
        EnumC11054p enumC11054p16 = new EnumC11054p("SINT32", 15, 15, 1, enumC11006B4);
        EnumC11054p enumC11054p17 = new EnumC11054p("SINT64", 16, 16, 1, enumC11006B3);
        EnumC11054p enumC11054p18 = new EnumC11054p("GROUP", 17, 17, 1, enumC11006B7);
        EnumC11054p enumC11054p19 = new EnumC11054p("DOUBLE_LIST", 18, 18, 2, enumC11006B);
        EnumC11054p enumC11054p20 = new EnumC11054p("FLOAT_LIST", 19, 19, 2, enumC11006B2);
        EnumC11054p enumC11054p21 = new EnumC11054p("INT64_LIST", 20, 20, 2, enumC11006B3);
        EnumC11054p enumC11054p22 = new EnumC11054p("UINT64_LIST", 21, 21, 2, enumC11006B3);
        EnumC11054p enumC11054p23 = new EnumC11054p("INT32_LIST", 22, 22, 2, enumC11006B4);
        EnumC11054p enumC11054p24 = new EnumC11054p("FIXED64_LIST", 23, 23, 2, enumC11006B3);
        EnumC11054p enumC11054p25 = new EnumC11054p("FIXED32_LIST", 24, 24, 2, enumC11006B4);
        EnumC11054p enumC11054p26 = new EnumC11054p("BOOL_LIST", 25, 25, 2, enumC11006B5);
        EnumC11054p enumC11054p27 = new EnumC11054p("STRING_LIST", 26, 26, 2, enumC11006B6);
        EnumC11054p enumC11054p28 = new EnumC11054p("MESSAGE_LIST", 27, 27, 2, enumC11006B7);
        EnumC11054p enumC11054p29 = new EnumC11054p("BYTES_LIST", 28, 28, 2, enumC11006B8);
        EnumC11054p enumC11054p30 = new EnumC11054p("UINT32_LIST", 29, 29, 2, enumC11006B4);
        EnumC11054p enumC11054p31 = new EnumC11054p("ENUM_LIST", 30, 30, 2, enumC11006B9);
        EnumC11054p enumC11054p32 = new EnumC11054p("SFIXED32_LIST", 31, 31, 2, enumC11006B4);
        EnumC11054p enumC11054p33 = new EnumC11054p("SFIXED64_LIST", 32, 32, 2, enumC11006B3);
        EnumC11054p enumC11054p34 = new EnumC11054p("SINT32_LIST", 33, 33, 2, enumC11006B4);
        EnumC11054p enumC11054p35 = new EnumC11054p("SINT64_LIST", 34, 34, 2, enumC11006B3);
        EnumC11054p enumC11054p36 = new EnumC11054p("DOUBLE_LIST_PACKED", 35, 35, 3, enumC11006B);
        f33334Z = enumC11054p36;
        EnumC11054p enumC11054p37 = new EnumC11054p("FLOAT_LIST_PACKED", 36, 36, 3, enumC11006B2);
        EnumC11054p enumC11054p38 = new EnumC11054p("INT64_LIST_PACKED", 37, 37, 3, enumC11006B3);
        EnumC11054p enumC11054p39 = new EnumC11054p("UINT64_LIST_PACKED", 38, 38, 3, enumC11006B3);
        EnumC11054p enumC11054p40 = new EnumC11054p("INT32_LIST_PACKED", 39, 39, 3, enumC11006B4);
        EnumC11054p enumC11054p41 = new EnumC11054p("FIXED64_LIST_PACKED", 40, 40, 3, enumC11006B3);
        EnumC11054p enumC11054p42 = new EnumC11054p("FIXED32_LIST_PACKED", 41, 41, 3, enumC11006B4);
        EnumC11054p enumC11054p43 = new EnumC11054p("BOOL_LIST_PACKED", 42, 42, 3, enumC11006B5);
        EnumC11054p enumC11054p44 = new EnumC11054p("UINT32_LIST_PACKED", 43, 43, 3, enumC11006B4);
        EnumC11054p enumC11054p45 = new EnumC11054p("ENUM_LIST_PACKED", 44, 44, 3, enumC11006B9);
        EnumC11054p enumC11054p46 = new EnumC11054p("SFIXED32_LIST_PACKED", 45, 45, 3, enumC11006B4);
        EnumC11054p enumC11054p47 = new EnumC11054p("SFIXED64_LIST_PACKED", 46, 46, 3, enumC11006B3);
        EnumC11054p enumC11054p48 = new EnumC11054p("SINT32_LIST_PACKED", 47, 47, 3, enumC11006B4);
        EnumC11054p enumC11054p49 = new EnumC11054p("SINT64_LIST_PACKED", 48, 48, 3, enumC11006B3);
        f33335o0 = enumC11054p49;
        f33337q0 = new EnumC11054p[]{enumC11054p, enumC11054p2, enumC11054p3, enumC11054p4, enumC11054p5, enumC11054p6, enumC11054p7, enumC11054p8, enumC11054p9, enumC11054p10, enumC11054p11, enumC11054p12, enumC11054p13, enumC11054p14, enumC11054p15, enumC11054p16, enumC11054p17, enumC11054p18, enumC11054p19, enumC11054p20, enumC11054p21, enumC11054p22, enumC11054p23, enumC11054p24, enumC11054p25, enumC11054p26, enumC11054p27, enumC11054p28, enumC11054p29, enumC11054p30, enumC11054p31, enumC11054p32, enumC11054p33, enumC11054p34, enumC11054p35, enumC11054p36, enumC11054p37, enumC11054p38, enumC11054p39, enumC11054p40, enumC11054p41, enumC11054p42, enumC11054p43, enumC11054p44, enumC11054p45, enumC11054p46, enumC11054p47, enumC11054p48, enumC11054p49, new EnumC11054p("GROUP_LIST", 49, 49, 2, enumC11006B7), new EnumC11054p("MAP", 50, 50, 4, EnumC11006B.VOID)};
        EnumC11054p[] enumC11054pArrValues = values();
        f33336p0 = new EnumC11054p[enumC11054pArrValues.length];
        for (EnumC11054p enumC11054p50 : enumC11054pArrValues) {
            f33336p0[enumC11054p50.f33338Y] = enumC11054p50;
        }
    }

    public EnumC11054p(String str, int i10, int i11, int i12, EnumC11006B enumC11006B) {
        super(str, i10);
        this.f33338Y = i11;
        int iM24h = AbstractC0010F.m24h(i12);
        if (iM24h == 1 || iM24h == 3) {
            enumC11006B.getClass();
        }
        if (i12 == 1) {
            enumC11006B.ordinal();
        }
    }

    public static EnumC11054p valueOf(String str) {
        return (EnumC11054p) Enum.valueOf(EnumC11054p.class, str);
    }

    public static EnumC11054p[] values() {
        return (EnumC11054p[]) f33337q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m12090a() {
        return this.f33338Y;
    }
}
