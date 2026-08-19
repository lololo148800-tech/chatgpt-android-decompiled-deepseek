package ai;

import com.openai.serialization.Fallback;
import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p817j$.time.DayOfWeek;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF10' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ai.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC10612c {
    public static final C10611b Companion;

    @Fallback
    public static final EnumC10612c Unknown;

    /* JADX INFO: renamed from: o0 */
    public static final Object f31488o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10612c f31489p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC10612c[] f31490q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f31491r0;

    /* JADX INFO: renamed from: Y */
    public final String f31492Y;

    /* JADX INFO: renamed from: Z */
    public final DayOfWeek f31493Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF4;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF8;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10612c EF10;

    static {
        EnumC10612c enumC10612c = new EnumC10612c("Monday", 0, "MO", DayOfWeek.MONDAY);
        EnumC10612c enumC10612c2 = new EnumC10612c("Tuesday", 1, "TU", DayOfWeek.TUESDAY);
        EnumC10612c enumC10612c3 = new EnumC10612c("Wednesday", 2, "WE", DayOfWeek.WEDNESDAY);
        EnumC10612c enumC10612c4 = new EnumC10612c("Thursday", 3, "TH", DayOfWeek.THURSDAY);
        EnumC10612c enumC10612c5 = new EnumC10612c("Friday", 4, "FR", DayOfWeek.FRIDAY);
        f31489p0 = enumC10612c5;
        EnumC10612c enumC10612c6 = new EnumC10612c("Saturday", 5, "SA", DayOfWeek.SATURDAY);
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        EnumC10612c enumC10612c7 = new EnumC10612c("Sunday", 6, "SU", dayOfWeek);
        EnumC10612c enumC10612c8 = new EnumC10612c("Unknown", 7, "unknown", dayOfWeek);
        Unknown = enumC10612c8;
        EnumC10612c[] enumC10612cArr = {enumC10612c, enumC10612c2, enumC10612c3, enumC10612c4, enumC10612c5, enumC10612c6, enumC10612c7, enumC10612c8};
        f31490q0 = enumC10612cArr;
        f31491r0 = AbstractC7877E4.m8156j(enumC10612cArr);
        Companion = new C10611b();
        f31488o0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C10610a.f31485Z);
    }

    public EnumC10612c(String str, int i10, String str2, DayOfWeek dayOfWeek) {
        super(str, i10);
        this.f31492Y = str2;
        this.f31493Z = dayOfWeek;
    }

    public static EnumC10612c valueOf(String str) {
        return (EnumC10612c) Enum.valueOf(EnumC10612c.class, str);
    }

    public static EnumC10612c[] values() {
        return (EnumC10612c[]) f31490q0.clone();
    }
}
