package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sip.parser.TokenNames;
import p011A9.p012Ra.ahZQMZ;
import sj.hJY.CsqksqyPE;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11949e1 {

    /* JADX INFO: renamed from: Z */
    public static final EnumC11949e1 f36255Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11949e1 f36256o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11949e1[] f36257p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC11949e1[] f36258q0;

    /* JADX INFO: renamed from: Y */
    public final int f36259Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11949e1 EF6;

    public EnumC11949e1(String str, int i10, int i11, int i12, EnumC12001r1 enumC12001r1) {
        super(str, i10);
        this.f36259Y = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            enumC12001r1.getClass();
        }
        if (i12 == 1) {
            EnumC12001r1 enumC12001r2 = EnumC12001r1.f36315Y;
            enumC12001r1.ordinal();
        }
    }

    public static EnumC11949e1[] values() {
        return (EnumC11949e1[]) f36258q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m13415a() {
        return this.f36259Y;
    }

    static {
        EnumC12001r1 enumC12001r1 = EnumC12001r1.f36319q0;
        EnumC11949e1 enumC11949e1 = new EnumC11949e1("DOUBLE", 0, 0, 1, enumC12001r1);
        EnumC12001r1 enumC12001r2 = EnumC12001r1.f36318p0;
        EnumC11949e1 enumC11949e2 = new EnumC11949e1("FLOAT", 1, 1, 1, enumC12001r2);
        EnumC12001r1 enumC12001r3 = EnumC12001r1.f36317o0;
        EnumC11949e1 enumC11949e3 = new EnumC11949e1("INT64", 2, 2, 1, enumC12001r3);
        EnumC11949e1 enumC11949e4 = new EnumC11949e1("UINT64", 3, 3, 1, enumC12001r3);
        EnumC12001r1 enumC12001r4 = EnumC12001r1.f36316Z;
        EnumC11949e1 enumC11949e5 = new EnumC11949e1("INT32", 4, 4, 1, enumC12001r4);
        EnumC11949e1 enumC11949e6 = new EnumC11949e1("FIXED64", 5, 5, 1, enumC12001r3);
        EnumC11949e1 enumC11949e7 = new EnumC11949e1("FIXED32", 6, 6, 1, enumC12001r4);
        EnumC12001r1 enumC12001r5 = EnumC12001r1.f36320r0;
        EnumC11949e1 enumC11949e8 = new EnumC11949e1("BOOL", 7, 7, 1, enumC12001r5);
        EnumC12001r1 enumC12001r6 = EnumC12001r1.f36321s0;
        EnumC11949e1 enumC11949e9 = new EnumC11949e1("STRING", 8, 8, 1, enumC12001r6);
        EnumC12001r1 enumC12001r7 = EnumC12001r1.f36324v0;
        EnumC11949e1 enumC11949e10 = new EnumC11949e1(TokenNames.MESSAGE, 9, 9, 1, enumC12001r7);
        EnumC12001r1 enumC12001r8 = EnumC12001r1.f36322t0;
        EnumC11949e1 enumC11949e11 = new EnumC11949e1("BYTES", 10, 10, 1, enumC12001r8);
        EnumC11949e1 enumC11949e12 = new EnumC11949e1("UINT32", 11, 11, 1, enumC12001r4);
        EnumC12001r1 enumC12001r9 = EnumC12001r1.f36323u0;
        EnumC11949e1 enumC11949e13 = new EnumC11949e1("ENUM", 12, 12, 1, enumC12001r9);
        EnumC11949e1 enumC11949e14 = new EnumC11949e1("SFIXED32", 13, 13, 1, enumC12001r4);
        EnumC11949e1 enumC11949e15 = new EnumC11949e1("SFIXED64", 14, 14, 1, enumC12001r3);
        EnumC11949e1 enumC11949e16 = new EnumC11949e1("SINT32", 15, 15, 1, enumC12001r4);
        EnumC11949e1 enumC11949e17 = new EnumC11949e1("SINT64", 16, 16, 1, enumC12001r3);
        EnumC11949e1 enumC11949e18 = new EnumC11949e1(CsqksqyPE.SsiSbxAIcj, 17, 17, 1, enumC12001r7);
        EnumC11949e1 enumC11949e19 = new EnumC11949e1("DOUBLE_LIST", 18, 18, 2, enumC12001r1);
        EnumC11949e1 enumC11949e20 = new EnumC11949e1("FLOAT_LIST", 19, 19, 2, enumC12001r2);
        EnumC11949e1 enumC11949e21 = new EnumC11949e1("INT64_LIST", 20, 20, 2, enumC12001r3);
        EnumC11949e1 enumC11949e22 = new EnumC11949e1("UINT64_LIST", 21, 21, 2, enumC12001r3);
        EnumC11949e1 enumC11949e23 = new EnumC11949e1("INT32_LIST", 22, 22, 2, enumC12001r4);
        EnumC11949e1 enumC11949e24 = new EnumC11949e1("FIXED64_LIST", 23, 23, 2, enumC12001r3);
        EnumC11949e1 enumC11949e25 = new EnumC11949e1("FIXED32_LIST", 24, 24, 2, enumC12001r4);
        EnumC11949e1 enumC11949e26 = new EnumC11949e1("BOOL_LIST", 25, 25, 2, enumC12001r5);
        EnumC11949e1 enumC11949e27 = new EnumC11949e1(ahZQMZ.NemDhTMsNAoiOk, 26, 26, 2, enumC12001r6);
        EnumC11949e1 enumC11949e28 = new EnumC11949e1("MESSAGE_LIST", 27, 27, 2, enumC12001r7);
        EnumC11949e1 enumC11949e29 = new EnumC11949e1("BYTES_LIST", 28, 28, 2, enumC12001r8);
        EnumC11949e1 enumC11949e30 = new EnumC11949e1("UINT32_LIST", 29, 29, 2, enumC12001r4);
        EnumC11949e1 enumC11949e31 = new EnumC11949e1("ENUM_LIST", 30, 30, 2, enumC12001r9);
        EnumC11949e1 enumC11949e32 = new EnumC11949e1("SFIXED32_LIST", 31, 31, 2, enumC12001r4);
        EnumC11949e1 enumC11949e33 = new EnumC11949e1("SFIXED64_LIST", 32, 32, 2, enumC12001r3);
        EnumC11949e1 enumC11949e34 = new EnumC11949e1("SINT32_LIST", 33, 33, 2, enumC12001r4);
        EnumC11949e1 enumC11949e35 = new EnumC11949e1("SINT64_LIST", 34, 34, 2, enumC12001r3);
        EnumC11949e1 enumC11949e36 = new EnumC11949e1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC12001r1);
        f36255Z = enumC11949e36;
        EnumC11949e1 enumC11949e37 = new EnumC11949e1("FLOAT_LIST_PACKED", 36, 36, 3, enumC12001r2);
        EnumC11949e1 enumC11949e38 = new EnumC11949e1("INT64_LIST_PACKED", 37, 37, 3, enumC12001r3);
        EnumC11949e1 enumC11949e39 = new EnumC11949e1("UINT64_LIST_PACKED", 38, 38, 3, enumC12001r3);
        EnumC11949e1 enumC11949e40 = new EnumC11949e1("INT32_LIST_PACKED", 39, 39, 3, enumC12001r4);
        EnumC11949e1 enumC11949e41 = new EnumC11949e1("FIXED64_LIST_PACKED", 40, 40, 3, enumC12001r3);
        EnumC11949e1 enumC11949e42 = new EnumC11949e1("FIXED32_LIST_PACKED", 41, 41, 3, enumC12001r4);
        EnumC11949e1 enumC11949e43 = new EnumC11949e1("BOOL_LIST_PACKED", 42, 42, 3, enumC12001r5);
        EnumC11949e1 enumC11949e44 = new EnumC11949e1("UINT32_LIST_PACKED", 43, 43, 3, enumC12001r4);
        EnumC11949e1 enumC11949e45 = new EnumC11949e1("ENUM_LIST_PACKED", 44, 44, 3, enumC12001r9);
        EnumC11949e1 enumC11949e46 = new EnumC11949e1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC12001r4);
        EnumC11949e1 enumC11949e47 = new EnumC11949e1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC12001r3);
        EnumC11949e1 enumC11949e48 = new EnumC11949e1("SINT32_LIST_PACKED", 47, 47, 3, enumC12001r4);
        EnumC11949e1 enumC11949e49 = new EnumC11949e1("SINT64_LIST_PACKED", 48, 48, 3, enumC12001r3);
        f36256o0 = enumC11949e49;
        f36258q0 = new EnumC11949e1[]{enumC11949e1, enumC11949e2, enumC11949e3, enumC11949e4, enumC11949e5, enumC11949e6, enumC11949e7, enumC11949e8, enumC11949e9, enumC11949e10, enumC11949e11, enumC11949e12, enumC11949e13, enumC11949e14, enumC11949e15, enumC11949e16, enumC11949e17, enumC11949e18, enumC11949e19, enumC11949e20, enumC11949e21, enumC11949e22, enumC11949e23, enumC11949e24, enumC11949e25, enumC11949e26, enumC11949e27, enumC11949e28, enumC11949e29, enumC11949e30, enumC11949e31, enumC11949e32, enumC11949e33, enumC11949e34, enumC11949e35, enumC11949e36, enumC11949e37, enumC11949e38, enumC11949e39, enumC11949e40, enumC11949e41, enumC11949e42, enumC11949e43, enumC11949e44, enumC11949e45, enumC11949e46, enumC11949e47, enumC11949e48, enumC11949e49, new EnumC11949e1("GROUP_LIST", 49, 49, 2, enumC12001r7), new EnumC11949e1("MAP", 50, 50, 4, EnumC12001r1.f36315Y)};
        EnumC11949e1[] enumC11949e1ArrValues = values();
        f36257p0 = new EnumC11949e1[enumC11949e1ArrValues.length];
        for (EnumC11949e1 enumC11949e50 : enumC11949e1ArrValues) {
            f36257p0[enumC11949e50.f36259Y] = enumC11949e50;
        }
    }
}
