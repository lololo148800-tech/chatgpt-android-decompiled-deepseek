package p817j$.util.stream;

import java.util.EnumMap;
import p817j$.util.Map;
import p817j$.util.Spliterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.e3 */
/* JADX INFO: loaded from: classes4.dex */
final class EnumC15904e3 {
    public static final EnumC15904e3 DISTINCT;
    public static final EnumC15904e3 ORDERED;
    public static final EnumC15904e3 SHORT_CIRCUIT;
    public static final EnumC15904e3 SIZED;
    public static final EnumC15904e3 SORTED;

    /* JADX INFO: renamed from: f */
    static final int f49265f;

    /* JADX INFO: renamed from: g */
    static final int f49266g;

    /* JADX INFO: renamed from: h */
    static final int f49267h;

    /* JADX INFO: renamed from: i */
    private static final int f49268i;

    /* JADX INFO: renamed from: j */
    private static final int f49269j;

    /* JADX INFO: renamed from: k */
    private static final int f49270k;

    /* JADX INFO: renamed from: l */
    static final int f49271l;

    /* JADX INFO: renamed from: m */
    static final int f49272m;

    /* JADX INFO: renamed from: n */
    static final int f49273n;

    /* JADX INFO: renamed from: o */
    static final int f49274o;

    /* JADX INFO: renamed from: p */
    static final int f49275p;

    /* JADX INFO: renamed from: q */
    static final int f49276q;

    /* JADX INFO: renamed from: r */
    static final int f49277r;

    /* JADX INFO: renamed from: s */
    static final int f49278s;

    /* JADX INFO: renamed from: t */
    static final int f49279t;

    /* JADX INFO: renamed from: u */
    static final int f49280u;

    /* JADX INFO: renamed from: v */
    private static final /* synthetic */ EnumC15904e3[] f49281v;

    /* JADX INFO: renamed from: a */
    private final EnumMap f49282a;

    /* JADX INFO: renamed from: b */
    private final int f49283b;

    /* JADX INFO: renamed from: c */
    private final int f49284c;

    /* JADX INFO: renamed from: d */
    private final int f49285d;

    /* JADX INFO: renamed from: e */
    private final int f49286e;

    public static EnumC15904e3 valueOf(String str) {
        return (EnumC15904e3) Enum.valueOf(EnumC15904e3.class, str);
    }

    public static EnumC15904e3[] values() {
        return (EnumC15904e3[]) f49281v.clone();
    }

    static {
        EnumC15898d3 enumC15898d3 = EnumC15898d3.SPLITERATOR;
        C15892c3 c15892c3M17474y = m17474y(enumC15898d3);
        EnumC15898d3 enumC15898d4 = EnumC15898d3.STREAM;
        c15892c3M17474y.m17464a(enumC15898d4);
        EnumC15898d3 enumC15898d5 = EnumC15898d3.f49253OP;
        c15892c3M17474y.f49247a.put(enumC15898d5, 3);
        EnumC15904e3 enumC15904e3 = new EnumC15904e3("DISTINCT", 0, 0, c15892c3M17474y);
        DISTINCT = enumC15904e3;
        C15892c3 c15892c3M17474y2 = m17474y(enumC15898d3);
        c15892c3M17474y2.m17464a(enumC15898d4);
        c15892c3M17474y2.f49247a.put(enumC15898d5, 3);
        EnumC15904e3 enumC15904e4 = new EnumC15904e3("SORTED", 1, 1, c15892c3M17474y2);
        SORTED = enumC15904e4;
        C15892c3 c15892c3M17474y3 = m17474y(enumC15898d3);
        c15892c3M17474y3.m17464a(enumC15898d4);
        EnumMap enumMap = c15892c3M17474y3.f49247a;
        enumMap.put(enumC15898d5, 3);
        EnumC15898d3 enumC15898d6 = EnumC15898d3.TERMINAL_OP;
        enumMap.put(enumC15898d6, 2);
        EnumC15898d3 enumC15898d7 = EnumC15898d3.UPSTREAM_TERMINAL_OP;
        enumMap.put(enumC15898d7, 2);
        EnumC15904e3 enumC15904e5 = new EnumC15904e3("ORDERED", 2, 2, c15892c3M17474y3);
        ORDERED = enumC15904e5;
        C15892c3 c15892c3M17474y4 = m17474y(enumC15898d3);
        c15892c3M17474y4.m17464a(enumC15898d4);
        c15892c3M17474y4.f49247a.put(enumC15898d5, 2);
        EnumC15904e3 enumC15904e6 = new EnumC15904e3("SIZED", 3, 3, c15892c3M17474y4);
        SIZED = enumC15904e6;
        C15892c3 c15892c3M17474y5 = m17474y(enumC15898d5);
        c15892c3M17474y5.m17464a(enumC15898d6);
        EnumC15904e3 enumC15904e7 = new EnumC15904e3("SHORT_CIRCUIT", 4, 12, c15892c3M17474y5);
        SHORT_CIRCUIT = enumC15904e7;
        f49281v = new EnumC15904e3[]{enumC15904e3, enumC15904e4, enumC15904e5, enumC15904e6, enumC15904e7};
        f49265f = m17472o(enumC15898d3);
        f49266g = m17472o(enumC15898d4);
        f49267h = m17472o(enumC15898d5);
        m17472o(enumC15898d6);
        m17472o(enumC15898d7);
        int i10 = 0;
        for (EnumC15904e3 enumC15904e8 : values()) {
            i10 |= enumC15904e8.f49286e;
        }
        f49268i = i10;
        int i11 = f49266g;
        f49269j = i11;
        int i12 = i11 << 1;
        f49270k = i12;
        f49271l = i11 | i12;
        EnumC15904e3 enumC15904e9 = DISTINCT;
        f49272m = enumC15904e9.f49284c;
        f49273n = enumC15904e9.f49285d;
        EnumC15904e3 enumC15904e10 = SORTED;
        f49274o = enumC15904e10.f49284c;
        f49275p = enumC15904e10.f49285d;
        EnumC15904e3 enumC15904e11 = ORDERED;
        f49276q = enumC15904e11.f49284c;
        f49277r = enumC15904e11.f49285d;
        EnumC15904e3 enumC15904e12 = SIZED;
        f49278s = enumC15904e12.f49284c;
        f49279t = enumC15904e12.f49285d;
        f49280u = SHORT_CIRCUIT.f49284c;
    }

    /* JADX INFO: renamed from: y */
    private static C15892c3 m17474y(EnumC15898d3 enumC15898d3) {
        C15892c3 c15892c3 = new C15892c3(new EnumMap(EnumC15898d3.class));
        c15892c3.m17464a(enumC15898d3);
        return c15892c3;
    }

    private EnumC15904e3(String str, int i10, int i11, C15892c3 c15892c3) {
        super(str, i10);
        EnumC15898d3[] enumC15898d3ArrValues = EnumC15898d3.values();
        int length = enumC15898d3ArrValues.length;
        int i12 = 0;
        while (true) {
            EnumMap enumMap = c15892c3.f49247a;
            if (i12 < length) {
                Map.EL.putIfAbsent(enumMap, enumC15898d3ArrValues[i12], 0);
                i12++;
            } else {
                this.f49282a = enumMap;
                int i13 = i11 * 2;
                this.f49283b = i13;
                this.f49284c = 1 << i13;
                this.f49285d = 2 << i13;
                this.f49286e = 3 << i13;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    final boolean m17475r(int i10) {
        return (i10 & this.f49286e) == this.f49284c;
    }

    /* JADX INFO: renamed from: u */
    final boolean m17476u(int i10) {
        int i11 = this.f49286e;
        return (i10 & i11) == i11;
    }

    /* JADX INFO: renamed from: o */
    private static int m17472o(EnumC15898d3 enumC15898d3) {
        int iIntValue = 0;
        for (EnumC15904e3 enumC15904e3 : values()) {
            iIntValue |= ((Integer) enumC15904e3.f49282a.get(enumC15898d3)).intValue() << enumC15904e3.f49283b;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: m */
    static int m17471m(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = f49268i;
        } else {
            i12 = ~(((f49269j & i10) << 1) | i10 | ((f49270k & i10) >> 1));
        }
        return i10 | (i11 & i12);
    }

    /* JADX INFO: renamed from: A */
    static int m17470A(int i10) {
        return i10 & ((~i10) >> 1) & f49269j;
    }

    /* JADX INFO: renamed from: q */
    static int m17473q(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i10 = iCharacteristics & 4;
        int i11 = f49265f;
        return (i10 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i11 : iCharacteristics & i11 & (-5);
    }
}
