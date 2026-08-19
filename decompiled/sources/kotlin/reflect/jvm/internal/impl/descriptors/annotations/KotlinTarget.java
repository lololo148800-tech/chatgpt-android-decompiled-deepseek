package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mm.C17309l;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import tm.C20007b;
import tm.InterfaceC20006a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v33 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[], still in use, count: 1, list:
  (r10v33 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]) from 0x02b8: INVOKE (r10v33 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:697)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTarget {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    EXPRESSION(false),
    FILE(false),
    TYPEALIAS(false),
    TYPE_PROJECTION(false),
    STAR_PROJECTION(false),
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    LOCAL_FUNCTION(false),
    MEMBER_FUNCTION(false),
    TOP_LEVEL_FUNCTION(false),
    MEMBER_PROPERTY(false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    TOP_LEVEL_PROPERTY(false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    BACKING_FIELD(true),
    INITIALIZER(false),
    DESTRUCTURING_DECLARATION(false),
    LAMBDA_EXPRESSION(false),
    ANONYMOUS_FUNCTION(false),
    OBJECT_LITERAL(false);


    /* JADX INFO: renamed from: A0 */
    public static final Object f51447A0;

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ C20007b f51449C0;

    /* JADX INFO: renamed from: o0 */
    public static final List f51451o0;

    /* JADX INFO: renamed from: p0 */
    public static final List f51452p0;

    /* JADX INFO: renamed from: q0 */
    public static final List f51453q0;

    /* JADX INFO: renamed from: r0 */
    public static final List f51454r0;

    /* JADX INFO: renamed from: s0 */
    public static final List f51455s0;

    /* JADX INFO: renamed from: t0 */
    public static final List f51456t0;

    /* JADX INFO: renamed from: u0 */
    public static final List f51457u0;

    /* JADX INFO: renamed from: v0 */
    public static final List f51458v0;

    /* JADX INFO: renamed from: w0 */
    public static final List f51459w0;

    /* JADX INFO: renamed from: x0 */
    public static final List f51460x0;

    /* JADX INFO: renamed from: y0 */
    public static final List f51461y0;

    /* JADX INFO: renamed from: z0 */
    public static final List f51462z0;

    /* JADX INFO: renamed from: Y */
    public final boolean f51463Y;
    public static final Companion Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.Companion
    };

    /* JADX INFO: renamed from: Z */
    public static final HashMap f51450Z = new HashMap();

    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget$Companion] */
    static {
        f51449C0 = AbstractC7877E4.m8156j(new KotlinTarget[]{r6, r7, r8, r9, r3, r2, r1, r0, r15, r14, r13, r12, r11, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r10, r4, r5, r10, r5, r10, r5});
        for (KotlinTarget kotlinTarget : getEntries()) {
            f51450Z.put(kotlinTarget.name(), kotlinTarget);
        }
        InterfaceC20006a entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((KotlinTarget) obj).f51463Y) {
                arrayList.add(obj);
            }
        }
        AbstractC17680n.m19328G0(arrayList);
        AbstractC17680n.m19328G0(getEntries());
        KotlinTarget kotlinTarget2 = CLASS;
        f51451o0 = AbstractC17681o.m19382k(ANNOTATION_CLASS, kotlinTarget2);
        f51452p0 = AbstractC17681o.m19382k(LOCAL_CLASS, kotlinTarget2);
        f51453q0 = AbstractC17681o.m19382k(CLASS_ONLY, kotlinTarget2);
        KotlinTarget kotlinTarget3 = OBJECT;
        f51454r0 = AbstractC17681o.m19382k(COMPANION_OBJECT, kotlinTarget3, kotlinTarget2);
        f51455s0 = AbstractC17681o.m19382k(STANDALONE_OBJECT, kotlinTarget3, kotlinTarget2);
        f51456t0 = AbstractC17681o.m19382k(INTERFACE, kotlinTarget2);
        f51457u0 = AbstractC17681o.m19382k(ENUM_CLASS, kotlinTarget2);
        KotlinTarget kotlinTarget4 = PROPERTY;
        KotlinTarget kotlinTarget5 = FIELD;
        f51458v0 = AbstractC17681o.m19382k(ENUM_ENTRY, kotlinTarget4, kotlinTarget5);
        KotlinTarget kotlinTarget6 = PROPERTY_SETTER;
        f51459w0 = AbstractC9393x3.m9974d(kotlinTarget6);
        KotlinTarget kotlinTarget7 = PROPERTY_GETTER;
        f51460x0 = AbstractC9393x3.m9974d(kotlinTarget7);
        f51461y0 = AbstractC9393x3.m9974d(FUNCTION);
        KotlinTarget kotlinTarget8 = FILE;
        f51462z0 = AbstractC9393x3.m9974d(kotlinTarget8);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget9 = VALUE_PARAMETER;
        f51447A0 = AbstractC17659D.m19244f(new C17309l(annotationUseSiteTarget, kotlinTarget9), new C17309l(AnnotationUseSiteTarget.FIELD, kotlinTarget5), new C17309l(AnnotationUseSiteTarget.PROPERTY, kotlinTarget4), new C17309l(AnnotationUseSiteTarget.FILE, kotlinTarget8), new C17309l(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget7), new C17309l(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget6), new C17309l(AnnotationUseSiteTarget.RECEIVER, kotlinTarget9), new C17309l(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget9), new C17309l(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget5));
    }

    public KotlinTarget(boolean z6) {
        super(str, i);
        this.f51463Y = z6;
    }

    public static InterfaceC20006a getEntries() {
        return f51449C0;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) f51448B0.clone();
    }
}
