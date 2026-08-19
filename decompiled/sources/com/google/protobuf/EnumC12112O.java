package com.google.protobuf;

import android.gov.nist.javax.sip.parser.TokenNames;
import p001A.AbstractC0010F;
import p658b5.p659zh.MMVKXkcLpuHFDi;

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
/* JADX INFO: renamed from: com.google.protobuf.O */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12112O {

    /* JADX INFO: renamed from: Z */
    public static final EnumC12112O f36964Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC12112O f36965o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC12112O[] f36966p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC12112O[] f36967q0;

    /* JADX INFO: renamed from: Y */
    public final int f36968Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12112O EF6;

    public EnumC12112O(String str, int i10, int i11, int i12, EnumC12184q0 enumC12184q0) {
        super(str, i10);
        this.f36968Y = i11;
        int iM24h = AbstractC0010F.m24h(i12);
        if (iM24h == 1 || iM24h == 3) {
            enumC12184q0.getClass();
        }
        if (i12 == 1) {
            enumC12184q0.ordinal();
        }
    }

    public static EnumC12112O valueOf(String str) {
        return (EnumC12112O) java.lang.Enum.valueOf(EnumC12112O.class, str);
    }

    public static EnumC12112O[] values() {
        return (EnumC12112O[]) f36967q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m13854a() {
        return this.f36968Y;
    }

    static {
        EnumC12184q0 enumC12184q0 = EnumC12184q0.DOUBLE;
        EnumC12112O enumC12112O = new EnumC12112O("DOUBLE", 0, 0, 1, enumC12184q0);
        EnumC12184q0 enumC12184q1 = EnumC12184q0.FLOAT;
        EnumC12112O enumC12112O2 = new EnumC12112O("FLOAT", 1, 1, 1, enumC12184q1);
        EnumC12184q0 enumC12184q2 = EnumC12184q0.LONG;
        EnumC12112O enumC12112O3 = new EnumC12112O("INT64", 2, 2, 1, enumC12184q2);
        EnumC12112O enumC12112O4 = new EnumC12112O("UINT64", 3, 3, 1, enumC12184q2);
        EnumC12184q0 enumC12184q3 = EnumC12184q0.INT;
        EnumC12112O enumC12112O5 = new EnumC12112O("INT32", 4, 4, 1, enumC12184q3);
        EnumC12112O enumC12112O6 = new EnumC12112O("FIXED64", 5, 5, 1, enumC12184q2);
        EnumC12112O enumC12112O7 = new EnumC12112O("FIXED32", 6, 6, 1, enumC12184q3);
        EnumC12184q0 enumC12184q4 = EnumC12184q0.f37087s0;
        EnumC12112O enumC12112O8 = new EnumC12112O("BOOL", 7, 7, 1, enumC12184q4);
        EnumC12184q0 enumC12184q5 = EnumC12184q0.STRING;
        EnumC12112O enumC12112O9 = new EnumC12112O("STRING", 8, 8, 1, enumC12184q5);
        EnumC12184q0 enumC12184q6 = EnumC12184q0.MESSAGE;
        EnumC12112O enumC12112O10 = new EnumC12112O(TokenNames.MESSAGE, 9, 9, 1, enumC12184q6);
        EnumC12184q0 enumC12184q7 = EnumC12184q0.BYTE_STRING;
        EnumC12112O enumC12112O11 = new EnumC12112O("BYTES", 10, 10, 1, enumC12184q7);
        EnumC12112O enumC12112O12 = new EnumC12112O("UINT32", 11, 11, 1, enumC12184q3);
        EnumC12184q0 enumC12184q8 = EnumC12184q0.ENUM;
        EnumC12112O enumC12112O13 = new EnumC12112O("ENUM", 12, 12, 1, enumC12184q8);
        EnumC12112O enumC12112O14 = new EnumC12112O("SFIXED32", 13, 13, 1, enumC12184q3);
        EnumC12112O enumC12112O15 = new EnumC12112O("SFIXED64", 14, 14, 1, enumC12184q2);
        EnumC12112O enumC12112O16 = new EnumC12112O("SINT32", 15, 15, 1, enumC12184q3);
        EnumC12112O enumC12112O17 = new EnumC12112O("SINT64", 16, 16, 1, enumC12184q2);
        EnumC12112O enumC12112O18 = new EnumC12112O("GROUP", 17, 17, 1, enumC12184q6);
        EnumC12112O enumC12112O19 = new EnumC12112O("DOUBLE_LIST", 18, 18, 2, enumC12184q0);
        EnumC12112O enumC12112O20 = new EnumC12112O("FLOAT_LIST", 19, 19, 2, enumC12184q1);
        EnumC12112O enumC12112O21 = new EnumC12112O("INT64_LIST", 20, 20, 2, enumC12184q2);
        EnumC12112O enumC12112O22 = new EnumC12112O("UINT64_LIST", 21, 21, 2, enumC12184q2);
        EnumC12112O enumC12112O23 = new EnumC12112O("INT32_LIST", 22, 22, 2, enumC12184q3);
        EnumC12112O enumC12112O24 = new EnumC12112O("FIXED64_LIST", 23, 23, 2, enumC12184q2);
        EnumC12112O enumC12112O25 = new EnumC12112O("FIXED32_LIST", 24, 24, 2, enumC12184q3);
        EnumC12112O enumC12112O26 = new EnumC12112O("BOOL_LIST", 25, 25, 2, enumC12184q4);
        EnumC12112O enumC12112O27 = new EnumC12112O("STRING_LIST", 26, 26, 2, enumC12184q5);
        EnumC12112O enumC12112O28 = new EnumC12112O("MESSAGE_LIST", 27, 27, 2, enumC12184q6);
        EnumC12112O enumC12112O29 = new EnumC12112O("BYTES_LIST", 28, 28, 2, enumC12184q7);
        EnumC12112O enumC12112O30 = new EnumC12112O("UINT32_LIST", 29, 29, 2, enumC12184q3);
        EnumC12112O enumC12112O31 = new EnumC12112O("ENUM_LIST", 30, 30, 2, enumC12184q8);
        EnumC12112O enumC12112O32 = new EnumC12112O("SFIXED32_LIST", 31, 31, 2, enumC12184q3);
        EnumC12112O enumC12112O33 = new EnumC12112O("SFIXED64_LIST", 32, 32, 2, enumC12184q2);
        EnumC12112O enumC12112O34 = new EnumC12112O("SINT32_LIST", 33, 33, 2, enumC12184q3);
        EnumC12112O enumC12112O35 = new EnumC12112O("SINT64_LIST", 34, 34, 2, enumC12184q2);
        EnumC12112O enumC12112O36 = new EnumC12112O("DOUBLE_LIST_PACKED", 35, 35, 3, enumC12184q0);
        f36964Z = enumC12112O36;
        EnumC12112O enumC12112O37 = new EnumC12112O("FLOAT_LIST_PACKED", 36, 36, 3, enumC12184q1);
        EnumC12112O enumC12112O38 = new EnumC12112O("INT64_LIST_PACKED", 37, 37, 3, enumC12184q2);
        EnumC12112O enumC12112O39 = new EnumC12112O("UINT64_LIST_PACKED", 38, 38, 3, enumC12184q2);
        EnumC12112O enumC12112O40 = new EnumC12112O("INT32_LIST_PACKED", 39, 39, 3, enumC12184q3);
        EnumC12112O enumC12112O41 = new EnumC12112O("FIXED64_LIST_PACKED", 40, 40, 3, enumC12184q2);
        EnumC12112O enumC12112O42 = new EnumC12112O("FIXED32_LIST_PACKED", 41, 41, 3, enumC12184q3);
        EnumC12112O enumC12112O43 = new EnumC12112O("BOOL_LIST_PACKED", 42, 42, 3, enumC12184q4);
        EnumC12112O enumC12112O44 = new EnumC12112O("UINT32_LIST_PACKED", 43, 43, 3, enumC12184q3);
        EnumC12112O enumC12112O45 = new EnumC12112O(MMVKXkcLpuHFDi.arwfs, 44, 44, 3, enumC12184q8);
        EnumC12112O enumC12112O46 = new EnumC12112O("SFIXED32_LIST_PACKED", 45, 45, 3, enumC12184q3);
        EnumC12112O enumC12112O47 = new EnumC12112O("SFIXED64_LIST_PACKED", 46, 46, 3, enumC12184q2);
        EnumC12112O enumC12112O48 = new EnumC12112O("SINT32_LIST_PACKED", 47, 47, 3, enumC12184q3);
        EnumC12112O enumC12112O49 = new EnumC12112O("SINT64_LIST_PACKED", 48, 48, 3, enumC12184q2);
        f36965o0 = enumC12112O49;
        f36967q0 = new EnumC12112O[]{enumC12112O, enumC12112O2, enumC12112O3, enumC12112O4, enumC12112O5, enumC12112O6, enumC12112O7, enumC12112O8, enumC12112O9, enumC12112O10, enumC12112O11, enumC12112O12, enumC12112O13, enumC12112O14, enumC12112O15, enumC12112O16, enumC12112O17, enumC12112O18, enumC12112O19, enumC12112O20, enumC12112O21, enumC12112O22, enumC12112O23, enumC12112O24, enumC12112O25, enumC12112O26, enumC12112O27, enumC12112O28, enumC12112O29, enumC12112O30, enumC12112O31, enumC12112O32, enumC12112O33, enumC12112O34, enumC12112O35, enumC12112O36, enumC12112O37, enumC12112O38, enumC12112O39, enumC12112O40, enumC12112O41, enumC12112O42, enumC12112O43, enumC12112O44, enumC12112O45, enumC12112O46, enumC12112O47, enumC12112O48, enumC12112O49, new EnumC12112O("GROUP_LIST", 49, 49, 2, enumC12184q6), new EnumC12112O("MAP", 50, 50, 4, EnumC12184q0.VOID)};
        EnumC12112O[] enumC12112OArrValues = values();
        f36966p0 = new EnumC12112O[enumC12112OArrValues.length];
        for (EnumC12112O enumC12112O50 : enumC12112OArrValues) {
            f36966p0[enumC12112O50.f36968Y] = enumC12112O50;
        }
    }
}
