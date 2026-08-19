package com.google.protobuf;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.protobuf.J1 */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC12101J1 {

    /* JADX INFO: renamed from: o0 */
    public static final EnumC12101J1 f36915o0;

    /* JADX INFO: renamed from: p0 */
    public static final C12089F1 f36916p0;

    /* JADX INFO: renamed from: q0 */
    public static final C12092G1 f36917q0;

    /* JADX INFO: renamed from: r0 */
    public static final C12095H1 f36918r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC12101J1 f36919s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC12101J1 f36920t0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ EnumC12101J1[] f36921u0;

    /* JADX INFO: renamed from: Y */
    public final EnumC12104K1 f36922Y;

    /* JADX INFO: renamed from: Z */
    public final int f36923Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12101J1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12101J1 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC12101J1 EF12;

    static {
        EnumC12101J1 enumC12101J1 = new EnumC12101J1("DOUBLE", 0, EnumC12104K1.DOUBLE, 1);
        EnumC12101J1 enumC12101J2 = new EnumC12101J1("FLOAT", 1, EnumC12104K1.FLOAT, 5);
        EnumC12104K1 enumC12104K1 = EnumC12104K1.LONG;
        EnumC12101J1 enumC12101J3 = new EnumC12101J1("INT64", 2, enumC12104K1, 0);
        EnumC12101J1 enumC12101J4 = new EnumC12101J1("UINT64", 3, enumC12104K1, 0);
        EnumC12104K1 enumC12104K2 = EnumC12104K1.INT;
        EnumC12101J1 enumC12101J5 = new EnumC12101J1("INT32", 4, enumC12104K2, 0);
        f36915o0 = enumC12101J5;
        EnumC12101J1 enumC12101J6 = new EnumC12101J1("FIXED64", 5, enumC12104K1, 1);
        EnumC12101J1 enumC12101J7 = new EnumC12101J1("FIXED32", 6, enumC12104K2, 5);
        EnumC12101J1 enumC12101J8 = new EnumC12101J1("BOOL", 7, EnumC12104K1.BOOLEAN, 0);
        C12089F1 c12089f1 = new C12089F1("STRING", 8, EnumC12104K1.STRING, 2);
        f36916p0 = c12089f1;
        EnumC12104K1 enumC12104K3 = EnumC12104K1.MESSAGE;
        C12092G1 c12092g1 = new C12092G1("GROUP", 9, enumC12104K3, 3);
        f36917q0 = c12092g1;
        C12095H1 c12095h1 = new C12095H1(TokenNames.MESSAGE, 10, enumC12104K3, 2);
        f36918r0 = c12095h1;
        C12098I1 c12098i1 = new C12098I1("BYTES", 11, EnumC12104K1.BYTE_STRING, 2);
        EnumC12101J1 enumC12101J9 = new EnumC12101J1("UINT32", 12, enumC12104K2, 0);
        f36919s0 = enumC12101J9;
        EnumC12101J1 enumC12101J10 = new EnumC12101J1("ENUM", 13, EnumC12104K1.ENUM, 0);
        f36920t0 = enumC12101J10;
        f36921u0 = new EnumC12101J1[]{enumC12101J1, enumC12101J2, enumC12101J3, enumC12101J4, enumC12101J5, enumC12101J6, enumC12101J7, enumC12101J8, c12089f1, c12092g1, c12095h1, c12098i1, enumC12101J9, enumC12101J10, new EnumC12101J1("SFIXED32", 14, enumC12104K2, 5), new EnumC12101J1("SFIXED64", 15, enumC12104K1, 1), new EnumC12101J1("SINT32", 16, enumC12104K2, 0), new EnumC12101J1("SINT64", 17, enumC12104K1, 0)};
    }

    public EnumC12101J1(String str, int i10, EnumC12104K1 enumC12104K1, int i11) {
        super(str, i10);
        this.f36922Y = enumC12104K1;
        this.f36923Z = i11;
    }

    public static EnumC12101J1 valueOf(String str) {
        return (EnumC12101J1) java.lang.Enum.valueOf(EnumC12101J1.class, str);
    }

    public static EnumC12101J1[] values() {
        return (EnumC12101J1[]) f36921u0.clone();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo13747a() {
        return !(this instanceof C12089F1);
    }
}
