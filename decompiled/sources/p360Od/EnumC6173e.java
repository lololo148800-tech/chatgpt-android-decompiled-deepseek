package p360Od;

import java.util.List;
import p451Sb.C7102a;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Od.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6173e {

    /* JADX INFO: renamed from: A0 */
    public static final EnumC6173e f20096A0;

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ EnumC6173e[] f20097B0;

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ C20007b f20098C0;

    /* JADX INFO: renamed from: o0 */
    public static final C7102a f20099o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6173e f20100p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC6173e f20101q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC6173e f20102r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC6173e f20103s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC6173e f20104t0;

    /* JADX INFO: renamed from: u0 */
    public static final EnumC6173e f20105u0;

    /* JADX INFO: renamed from: v0 */
    public static final EnumC6173e f20106v0;

    /* JADX INFO: renamed from: w0 */
    public static final EnumC6173e f20107w0;

    /* JADX INFO: renamed from: x0 */
    public static final EnumC6173e f20108x0;

    /* JADX INFO: renamed from: y0 */
    public static final EnumC6173e f20109y0;

    /* JADX INFO: renamed from: z0 */
    public static final EnumC6173e f20110z0;

    /* JADX INFO: renamed from: Y */
    public final String f20111Y;

    /* JADX INFO: renamed from: Z */
    public final List f20112Z;

    static {
        EnumC6173e enumC6173e = new EnumC6173e(0, "GetCalendarEvents", "getCalendarEvents", AbstractC9393x3.m9974d("android.permission.READ_CALENDAR"));
        f20100p0 = enumC6173e;
        EnumC6173e enumC6173e2 = new EnumC6173e(1, "GetLocation", "getLocation", AbstractC9393x3.m9974d("android.permission.ACCESS_COARSE_LOCATION"));
        f20101q0 = enumC6173e2;
        EnumC6173e enumC6173e3 = new EnumC6173e(2, "SendMessage", "sendMessage", AbstractC9393x3.m9974d("android.permission.READ_CONTACTS"));
        f20102r0 = enumC6173e3;
        EnumC6173e enumC6173e4 = new EnumC6173e(3, "MakeCall", "makeCall", AbstractC9393x3.m9974d("android.permission.READ_CONTACTS"));
        f20103s0 = enumC6173e4;
        C17689w c17689w = C17689w.f56480Y;
        EnumC6173e enumC6173e5 = new EnumC6173e(4, "StartNavigation", "startNavigation", c17689w);
        f20104t0 = enumC6173e5;
        EnumC6173e enumC6173e6 = new EnumC6173e(5, "LaunchMapWithQuery", "launchMapWithQuery", c17689w);
        f20105u0 = enumC6173e6;
        EnumC6173e enumC6173e7 = new EnumC6173e(6, "PlayMusic", "playMusic", c17689w);
        f20106v0 = enumC6173e7;
        EnumC6173e enumC6173e8 = new EnumC6173e(7, "SetAlarm", "setAlarm", c17689w);
        f20107w0 = enumC6173e8;
        EnumC6173e enumC6173e9 = new EnumC6173e(8, "OpenApp", "openApp", c17689w);
        f20108x0 = enumC6173e9;
        EnumC6173e enumC6173e10 = new EnumC6173e(9, "SetTimer", "setTimer", c17689w);
        f20109y0 = enumC6173e10;
        EnumC6173e enumC6173e11 = new EnumC6173e(10, "AddEvent", "addEvent", c17689w);
        f20110z0 = enumC6173e11;
        EnumC6173e enumC6173e12 = new EnumC6173e(11, "GetScreenshot", "getCurrentScreenshot", c17689w);
        f20096A0 = enumC6173e12;
        EnumC6173e[] enumC6173eArr = {enumC6173e, enumC6173e2, enumC6173e3, enumC6173e4, enumC6173e5, enumC6173e6, enumC6173e7, enumC6173e8, enumC6173e9, enumC6173e10, enumC6173e11, enumC6173e12};
        f20097B0 = enumC6173eArr;
        f20098C0 = AbstractC7877E4.m8156j(enumC6173eArr);
        f20099o0 = new C7102a(13);
    }

    public EnumC6173e(int i10, String str, String str2, List list) {
        super(str, i10);
        this.f20111Y = str2;
        this.f20112Z = list;
    }

    public static EnumC6173e valueOf(String str) {
        return (EnumC6173e) Enum.valueOf(EnumC6173e.class, str);
    }

    public static EnumC6173e[] values() {
        return (EnumC6173e[]) f20097B0.clone();
    }
}
