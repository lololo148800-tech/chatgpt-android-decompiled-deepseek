package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0 */
/* JADX INFO: loaded from: classes.dex */
public class EnumC10998z0 {

    /* JADX INFO: renamed from: o0 */
    public static final C10990v0 f33101o0;

    /* JADX INFO: renamed from: p0 */
    public static final C10992w0 f33102p0;

    /* JADX INFO: renamed from: q0 */
    public static final C10994x0 f33103q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC10998z0[] f33104r0;

    /* JADX INFO: renamed from: Y */
    public final EnumC10922A0 f33105Y;

    /* JADX INFO: renamed from: Z */
    public final int f33106Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10998z0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10998z0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10998z0 EF12;

    static {
        EnumC10998z0 enumC10998z0 = new EnumC10998z0("DOUBLE", 0, EnumC10922A0.DOUBLE, 1);
        EnumC10998z0 enumC10998z1 = new EnumC10998z0("FLOAT", 1, EnumC10922A0.FLOAT, 5);
        EnumC10922A0 enumC10922A0 = EnumC10922A0.LONG;
        EnumC10998z0 enumC10998z2 = new EnumC10998z0("INT64", 2, enumC10922A0, 0);
        EnumC10998z0 enumC10998z3 = new EnumC10998z0("UINT64", 3, enumC10922A0, 0);
        EnumC10922A0 enumC10922A1 = EnumC10922A0.INT;
        EnumC10998z0 enumC10998z4 = new EnumC10998z0("INT32", 4, enumC10922A1, 0);
        EnumC10998z0 enumC10998z5 = new EnumC10998z0("FIXED64", 5, enumC10922A0, 1);
        EnumC10998z0 enumC10998z6 = new EnumC10998z0("FIXED32", 6, enumC10922A1, 5);
        EnumC10998z0 enumC10998z7 = new EnumC10998z0("BOOL", 7, EnumC10922A0.BOOLEAN, 0);
        C10990v0 c10990v0 = new C10990v0("STRING", 8, EnumC10922A0.STRING, 2);
        f33101o0 = c10990v0;
        EnumC10922A0 enumC10922A2 = EnumC10922A0.MESSAGE;
        C10992w0 c10992w0 = new C10992w0("GROUP", 9, enumC10922A2, 3);
        f33102p0 = c10992w0;
        C10994x0 c10994x0 = new C10994x0(TokenNames.MESSAGE, 10, enumC10922A2, 2);
        f33103q0 = c10994x0;
        f33104r0 = new EnumC10998z0[]{enumC10998z0, enumC10998z1, enumC10998z2, enumC10998z3, enumC10998z4, enumC10998z5, enumC10998z6, enumC10998z7, c10990v0, c10992w0, c10994x0, new C10996y0("BYTES", 11, EnumC10922A0.BYTE_STRING, 2), new EnumC10998z0("UINT32", 12, enumC10922A1, 0), new EnumC10998z0("ENUM", 13, EnumC10922A0.f32961u0, 0), new EnumC10998z0("SFIXED32", 14, enumC10922A1, 5), new EnumC10998z0("SFIXED64", 15, enumC10922A0, 1), new EnumC10998z0("SINT32", 16, enumC10922A1, 0), new EnumC10998z0("SINT64", 17, enumC10922A0, 0)};
    }

    public EnumC10998z0(String str, int i10, EnumC10922A0 enumC10922A0, int i11) {
        super(str, i10);
        this.f33105Y = enumC10922A0;
        this.f33106Z = i11;
    }

    public static EnumC10998z0 valueOf(String str) {
        return (EnumC10998z0) Enum.valueOf(EnumC10998z0.class, str);
    }

    public static EnumC10998z0[] values() {
        return (EnumC10998z0[]) f33104r0.clone();
    }
}
